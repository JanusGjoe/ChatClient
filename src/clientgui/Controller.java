
package clientgui;

import chatclient.ChatClient;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements java.util.Observer
{
    ChatClientGUI gui;
    ChatClient client = new ChatClient();
    private String username;
    
    Controller(ChatClientGUI ecgui)
    {
        this.gui = ecgui;
        client.addObserver(this);
    }
    
    // (Observer) Receieves the incoming message from EchoClient
    @Override
    public void update(Observable o, Object arg)
    {
        String text = (String) arg;
        handleMessage(text);
    }
    
    // Tells EchoClient to connect to server with specified ip-address and port,
    // and starts EchoClient-Thread that handles incoming messages
    public boolean connect(String serverAddress, int port, String userName)
    {
        try
        {
            client.connect(serverAddress, port);
            Thread t = new Thread(client);
            t.start();
        } catch (IOException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, "Connect() - Error trying to connect to", ex);
            return false;
        }
        this.username = userName;
        client.send("USER#" + userName);
        return true;
    }
    
    // Tells EchoClient to disconnect from server
    public void disconnect()
    {
        client.send("STOP#");
        gui.updateChat("--- Disconnected ---");
    }
    
    // Tells EchoClient to send the specified message to server
    public void sendMessage(String msg, List<String> users)
    {
        String sendMSG;
        if(users.size() > 0)
        {
            String usersToString = users.get(0);
            for(int i = 1; i < users.size(); i++)
            {
                usersToString = usersToString + "," + users.get(i);
            }
            sendMSG = "MSG#" + usersToString + "#" + msg;
        } else
        {
            sendMSG = "MSG#*#" + msg;
        }
        client.send(sendMSG);
    }
    
    // Handles the incoming message depending on its command-type (USERLIST# or MSG#)
    private void handleMessage(String data)
    {
        String splitter = "[#]";
        String[] tokens = data.split(splitter);
        
        if(tokens.length > 1)
        {
            String command = tokens[0].toUpperCase();
            switch (command)
            {
                case "USERLIST":
                    String users = "";
                    try
                    {
                        users = tokens[1];
                    } catch (Exception a)
                    {
                        System.out.println("handleMessage() - Error converting USERLIST to String");
                    }
                    updateUserList(users);
                    break;
                case "MSG":
                    String sender = "";
                    String msg = "";
                    try
                    {
                        sender = tokens[1];
                        msg = tokens[2];
                    } catch (Exception a)
                    {
                        System.out.println("handleMessage() - Error converting MSG to String");
                    }
                    updateChat(sender, msg);
                    break;
                default:
                    break;
            }
        }
    }
    
    // Updates chat in GUI (ChatClientGUI)
    private void updateChat(String sender, String msg)
    {
        String updateMessage = "<" + sender + "> " + msg;
        gui.updateChat(updateMessage);
    }
    
    // Updates list of users in GUI (ChatClientGUI)
    private void updateUserList(String users)
    {
        String splitter = "[,]";
        String[] tokens = users.split(splitter);
        Arrays.sort(tokens);
        
        gui.updateUserList(tokens);
    }
}
