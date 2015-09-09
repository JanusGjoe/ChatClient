/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientgui;

import javax.swing.DefaultListModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Janus
 */
public class ChatClientGUITest {
    
    public ChatClientGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ChatClientGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ChatClientGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateChat method, of class ChatClientGUI.
     */
    @Test
    public void testUpdateChat() {
        System.out.println("updateChat");
        String text = "";
        ChatClientGUI instance = new ChatClientGUI();
        instance.updateChat(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserList method, of class ChatClientGUI.
     */
    @Test
    public void testUpdateUserList() {
        System.out.println("updateUserList");
        DefaultListModel<String> userlist = null;
        ChatClientGUI instance = new ChatClientGUI();
        instance.updateUserList(userlist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
