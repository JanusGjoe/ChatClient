
package clientgui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class InfoRunner extends Thread
{
    private int port;
    private String ip;
    private String user;
    private JLabel infoMessage1;
    private JLabel infoMessage2;
    private boolean continueThread = true;
    private boolean messageSwitch = true;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    
    public InfoRunner(int port, String ip, String username, JLabel jL1, JLabel jL2)
    {
        this.port = port;
        this.ip = ip;
        this.user = username;
        this.infoMessage1 = jL1;
        this.infoMessage2 = jL2;
    }
    
    // Thread that, when a connection is started from GUI, continuesly prints the two info-labels in GUI with updated connection-info and time
    @Override
    public void run()
    {
        continueThread = true;
        while (continueThread)
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(InfoRunner.class.getName()).log(Level.SEVERE, "ThreadClass - Error in Thread.sleep:", ex);
            }
            String text = getInfoMessageString();
            printJLabel(text);
            printTime();
        }
        infoMessage1.setText("");
        infoMessage2.setText("");
    }
    
    // Stops this thread. Run by GUI when a connection is closed
    public void stopThread()
    {
        continueThread = false;
    }
    
    // Switches between two different Strings with connection-info
    // 1: "Connected to chat as: {USERNAME}"
    // 2: "Port: {PORTNUMBER} Ip-address: {IP-ADDRESS}"
    private String getInfoMessageString()
    {
        if(messageSwitch)
        {
            messageSwitch = false;
            return "<html>Connected to chat as: " + user + "</html>";
        } else
        {
            messageSwitch = true;
            return "<html>Port: " + port + "<br>Ip-address: " + ip + "</html>";
        }
    }
    
    // Prints the label with connection-info
    private void printJLabel(String text)
    {
        infoMessage1.setText(text);
    }
    
    // Prints the labell with time
    private void printTime()
    {
        Calendar cal = Calendar.getInstance();
        String time = sdf.format(cal.getTime());
        infoMessage2.setText("Time: " + time);
    }
}
