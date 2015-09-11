package chatclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import shared.ProtocolStrings;

public class ChatClient extends java.util.Observable implements Runnable
{
    Socket socket;
    private int port;
    private InetAddress serverAddress;
    private Scanner input;
    private PrintWriter output;
    private boolean continueClient;
    
    // Connects to server with the given information (Port and InetAddress)
    public void connect(String a, int p) throws UnknownHostException, IOException
    {
        this.port = p;
        this.serverAddress = InetAddress.getByName(a);
        this.socket = new Socket(serverAddress, port);
        this.input = new Scanner(socket.getInputStream());
        this.output = new PrintWriter(socket.getOutputStream(), true);  //Set to true, to get auto flush behaviour
    }
    
    // Sends the given message to server (ClientHandler)
    public void send(String msg)
    {
        Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, "Sending message: \"" + msg + "\"", "");
        output.println(msg);
    }
    
    // Sends a STOP-message to server (ClientHandler) and closes input, output and socket
    public void stop() throws IOException
    {
        output.println(ProtocolStrings.STOP);
        input.close();
        output.close();
        socket.close();
        String stopCommand = "STOPCLIENTCON#STOPCLIENTCON";
        setChanged();
        notifyObservers(stopCommand);
    }
    
    // Thread that continuesly waits for messages from server to this client. When a message is received, it notifies listeners (Controller)
    @Override
    public void run()
    {
        continueClient = true;
        while (continueClient)
        {
            String msg = "";
            try
            {
                msg = input.nextLine();
            } catch (NoSuchElementException no)
            {
                break;
            }
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, "Received message: \"" + msg + "\"", "");
            setChanged();
            notifyObservers(msg);
            if (msg.equals(ProtocolStrings.STOP))
            {
                continueClient = false;
            }
        }
        try {
            stop();
        } catch (IOException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
