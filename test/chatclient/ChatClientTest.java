/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

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
public class ChatClientTest {
    
    public ChatClientTest() {
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
     * Test of connect method, of class ChatClient.
     */
    @Test
    public void testConnect() throws Exception {
        System.out.println("connect");
        String a = "";
        int p = 0;
        ChatClient instance = new ChatClient();
        instance.connect(a, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of send method, of class ChatClient.
     */
    @Test
    public void testSend() {
        System.out.println("send");
        String msg = "";
        ChatClient instance = new ChatClient();
        instance.send(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class ChatClient.
     */
    @Test
    public void testStop() throws Exception {
        System.out.println("stop");
        ChatClient instance = new ChatClient();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class ChatClient.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        ChatClient instance = new ChatClient();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
