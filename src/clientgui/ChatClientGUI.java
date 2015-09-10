
package clientgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultCaret;

public class ChatClientGUI extends javax.swing.JFrame
{
    private InfoRunner ir;
    private boolean online = false;
    Controller con = new Controller(this);
    
    public ChatClientGUI()
    {
        initComponents();
        
        jTextFieldMessage.addActionListener(sendMessageAction);
        
//        jTextFieldMessage.addActionListener(new SubmitButton(textBoxToEnterName));
//        jTextFieldMessage.addKeyListener(new SubmitButton(textBoxToEnterName));
//        
//        SubmitButton listener = new SubmitButton(jTextFieldMessage);
//        jTextFieldMessage.addActionListener(listener);
//        jButtonSendMessage.addKeyListener(listener);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogNewConnection = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        newConnectionUsername = new javax.swing.JTextField();
        newConnectionPort = new javax.swing.JTextField();
        newConnectionIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newConnectionConnect = new javax.swing.JButton();
        newConnectionInfoMessage = new javax.swing.JLabel();
        jDialogTest = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonStartConnection = new javax.swing.JButton();
        jTextFieldMessage = new javax.swing.JTextField();
        jButtonSendMessage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListUsers = new javax.swing.JList();
        jToggleButtonPrivateMessage = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelInfo1 = new javax.swing.JLabel();
        jLabelInfo2 = new javax.swing.JLabel();

        jDialogNewConnection.setAlwaysOnTop(true);
        jDialogNewConnection.setMinimumSize(new java.awt.Dimension(345, 399));
        jDialogNewConnection.setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(240, 324));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 368));

        newConnectionUsername.setText("Anonymous");
        newConnectionUsername.setMargin(new java.awt.Insets(2, 10, 2, 10));
        newConnectionUsername.setPreferredSize(new java.awt.Dimension(300, 40));

        newConnectionPort.setText("9090");
        newConnectionPort.setMargin(new java.awt.Insets(2, 10, 2, 10));
        newConnectionPort.setPreferredSize(new java.awt.Dimension(300, 40));

        newConnectionIP.setText("JKGVM.cloudapp.net");
        newConnectionIP.setMargin(new java.awt.Insets(2, 10, 2, 10));
        newConnectionIP.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel2.setText("Username:");

        jLabel3.setText("Port:");

        jLabel4.setText("IP-Address:");

        newConnectionConnect.setText("Start Connection");
        newConnectionConnect.setPreferredSize(new java.awt.Dimension(300, 40));
        newConnectionConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newConnectionConnectActionPerformed(evt);
            }
        });

        newConnectionInfoMessage.setText("<html>Username \"Anonymous\" is NOT a very cool username...</html>");
        newConnectionInfoMessage.setPreferredSize(new java.awt.Dimension(300, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newConnectionInfoMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newConnectionConnect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newConnectionIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newConnectionPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(newConnectionUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(newConnectionUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(newConnectionPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(newConnectionIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(newConnectionInfoMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(newConnectionConnect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogNewConnectionLayout = new javax.swing.GroupLayout(jDialogNewConnection.getContentPane());
        jDialogNewConnection.getContentPane().setLayout(jDialogNewConnectionLayout);
        jDialogNewConnectionLayout.setHorizontalGroup(
            jDialogNewConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogNewConnectionLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialogNewConnectionLayout.setVerticalGroup(
            jDialogNewConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogNewConnectionLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"<Peter>", "dddddddddddd dddd ddddddd ddd dd d d d ddddd dddddd dddd"},
                {"<Martin>", "<html>ffffffffffff fffff fffff fff ffffff f ff ffff ffff ff  ffff ffff ffff</html>"},
                {null, null},
                {null, null}
            },
            new String [] {
                "User", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(20);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogTestLayout = new javax.swing.GroupLayout(jDialogTest.getContentPane());
        jDialogTest.getContentPane().setLayout(jDialogTestLayout);
        jDialogTestLayout.setHorizontalGroup(
            jDialogTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTestLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialogTestLayout.setVerticalGroup(
            jDialogTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTestLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 630));

        jPanel1.setMinimumSize(new java.awt.Dimension(660, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(660, 580));

        jButtonStartConnection.setText("Start Connection");
        jButtonStartConnection.setMaximumSize(new java.awt.Dimension(200, 40));
        jButtonStartConnection.setMinimumSize(new java.awt.Dimension(200, 40));
        jButtonStartConnection.setPreferredSize(new java.awt.Dimension(200, 40));
        jButtonStartConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartConnectionActionPerformed(evt);
            }
        });

        jTextFieldMessage.setMinimumSize(new java.awt.Dimension(400, 40));
        jTextFieldMessage.setPreferredSize(new java.awt.Dimension(400, 40));
        jTextFieldMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMessageKeyPressed(evt);
            }
        });

        jButtonSendMessage.setText("Send Message");
        jButtonSendMessage.setMaximumSize(new java.awt.Dimension(200, 40));
        jButtonSendMessage.setMinimumSize(new java.awt.Dimension(200, 40));
        jButtonSendMessage.setPreferredSize(new java.awt.Dimension(200, 40));
        jButtonSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendMessageActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("Chat");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(400, 400));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 400));

        jTextAreaChat.setEditable(false);
        jTextAreaChat.setColumns(10);
        jTextAreaChat.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextAreaChat.setLineWrap(true);
        jTextAreaChat.setTabSize(4);
        jTextAreaChat.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaChat);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 350));

        jListUsers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Person1", "Person2", "Anonymous1", "Anonymous2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListUsers.setPreferredSize(new java.awt.Dimension(150, 300));
        jListUsers.setVisibleRowCount(5);
        jScrollPane2.setViewportView(jListUsers);

        jToggleButtonPrivateMessage.setText("<html>Send Private Message</html");
        jToggleButtonPrivateMessage.setToolTipText("Select receivers from the list of users");
        jToggleButtonPrivateMessage.setMaximumSize(new java.awt.Dimension(200, 40));
        jToggleButtonPrivateMessage.setMinimumSize(new java.awt.Dimension(200, 40));
        jToggleButtonPrivateMessage.setPreferredSize(new java.awt.Dimension(200, 40));
        jToggleButtonPrivateMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPrivateMessageActionPerformed(evt);
            }
        });

        jSeparator1.setMinimumSize(new java.awt.Dimension(620, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(620, 10));

        jLabelInfo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInfo1.setMaximumSize(new java.awt.Dimension(10000, 10000));
        jLabelInfo1.setMinimumSize(new java.awt.Dimension(180, 40));
        jLabelInfo1.setPreferredSize(new java.awt.Dimension(180, 40));

        jLabelInfo2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelInfo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInfo2.setText("Time: 88:88");
        jLabelInfo2.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonStartConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSendMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonPrivateMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonStartConnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButtonPrivateMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newConnectionConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newConnectionConnectActionPerformed
        startConnection();
    }//GEN-LAST:event_newConnectionConnectActionPerformed

    private void jToggleButtonPrivateMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPrivateMessageActionPerformed
        if(jToggleButtonPrivateMessage.isSelected())
        {
            jListUsers.setSelectedIndex(-1);
            jListUsers.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            jListUsers.setSelectionForeground(Color.WHITE);
            jListUsers.setSelectionBackground(Color.LIGHT_GRAY);
            jToggleButtonPrivateMessage.setText("Public Message");
            jToggleButtonPrivateMessage.setToolTipText("Click button to send message to all users");
        } else
        {
            jListUsers.setSelectedIndex(-1);
            jListUsers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jListUsers.setSelectionForeground(Color.BLACK);
            jListUsers.setSelectionBackground(Color.WHITE);
            jToggleButtonPrivateMessage.setText("Private Message");
            jToggleButtonPrivateMessage.setToolTipText("Click button and select private receivers from the list of users");
        }
    }//GEN-LAST:event_jToggleButtonPrivateMessageActionPerformed

    private void jButtonSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendMessageActionPerformed
        sendMessage();
    }//GEN-LAST:event_jButtonSendMessageActionPerformed

    private void jButtonStartConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartConnectionActionPerformed
        if(online)
        {
            // Disconnect - close connection to server
            disconnect();
        } else
        {
            jDialogNewConnection.setVisible(true);
            jDialogNewConnection.setLocationRelativeTo(jTextAreaChat);
        }
    }//GEN-LAST:event_jButtonStartConnectionActionPerformed

    private void jTextFieldMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMessageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMessageKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSendMessage;
    private javax.swing.JButton jButtonStartConnection;
    private javax.swing.JDialog jDialogNewConnection;
    private javax.swing.JDialog jDialogTest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelInfo1;
    private javax.swing.JLabel jLabelInfo2;
    private javax.swing.JList jListUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldMessage;
    private javax.swing.JToggleButton jToggleButtonPrivateMessage;
    private javax.swing.JButton newConnectionConnect;
    private javax.swing.JTextField newConnectionIP;
    private javax.swing.JLabel newConnectionInfoMessage;
    private javax.swing.JTextField newConnectionPort;
    private javax.swing.JTextField newConnectionUsername;
    // End of variables declaration//GEN-END:variables
    
    // Updates chat by adding the specified text to the last line in jTextAreaChat
    public void updateChat(String text)
    {
        jTextAreaChat.setRows(jTextAreaChat.getRows() + 1);
        jTextAreaChat.append(text + "\n");
        jTextAreaChat.setCaretPosition(jTextAreaChat.getDocument().getLength());
    }
    
    // Uodates list of users by placing the specified DefaultListModel in jListUsers
    public void updateUserList(DefaultListModel<String> userlist)
    {
        jListUsers.setModel(userlist);
    }
    
    // Clears/removes all names from jListUsers
    private void clearUserList()
    {
        DefaultListModel<String> users = new DefaultListModel<>();
        jListUsers.setModel(users);
    }
    
    // Gets the written message from jTextFieldMessage and sends it to Controller
    private void sendMessage()
    {
        if(online)
        {
            String text = jTextFieldMessage.getText();
            String msg = text.trim();
            jTextFieldMessage.setText("");
            
            msg = msg.replaceAll("#", "");
            
            // Test if message is empty. If not empty, sends message
            if (!msg.equalsIgnoreCase(""))
            {
                // Finds any selected users to send a personal message
                List<String> users = new ArrayList<>();
                if (jToggleButtonPrivateMessage.isSelected())
                {
                    users = jListUsers.getSelectedValuesList();
                }
                con.sendMessage(msg, users);
            }
            
            jTextFieldMessage.requestFocus();
        }
    }
    
    // Get written user-input and starts connection through Controller
    private void startConnection()
    {
        String username = newConnectionUsername.getText();
        
        // Test if written username contains any of the symbols, used in the Protocol-Strings
        if(username.contains("*") || username.contains("<") || username.contains(">") || username.contains(",") || username.contains("#"))
        {
            newConnectionInfoMessage.setText("<html>Username must not contain any of the following symbols:   #   *   >   ,</html>");
            return;
        }
        
        String ip = newConnectionIP.getText();
        int port = Integer.parseInt(newConnectionPort.getText());
        
        if(con.connect(ip, port, username))
        {
            newConnectionInfoMessage.setText("<html>Connected to chat!</html>");
            online = true;
            jButtonStartConnection.setText("Disconnect");
            jListUsers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
            jToggleButtonPrivateMessage.setSelected(false);
            jListUsers.setSelectionForeground(Color.BLACK);
            jListUsers.setSelectionBackground(Color.WHITE);
            jToggleButtonPrivateMessage.setText("Private Message");
            jToggleButtonPrivateMessage.setToolTipText("Click button and select private receivers from the list of users");
            
            DefaultCaret caret = (DefaultCaret)jTextAreaChat.getCaret();
            caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
            
            // Start thread that handles the 2 info-labels, showing connection-info and time
            ir = new InfoRunner(port, ip, username, jLabelInfo1, jLabelInfo2);
            Thread t = new Thread(ir);
            t.start();
            
            jDialogNewConnection.setVisible(false);
        } else
        {
            newConnectionInfoMessage.setText("<html>Could not connect to chat...</html>");
        }
    }
    
    // Disconnect from server through Controller
    private void disconnect()
    {
        ir.stopThread();
        clearUserList();
        online = false;
        jButtonStartConnection.setText("Start Connection");
        con.disconnect();
    }
    
    // ActionEvent for Enter-button -> Runs the sendMessage() method
    Action sendMessageAction = new AbstractAction()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            sendMessage();
        }
    };
    
    // Trying to add a KeyEvent for Enter-key in jTextFieldMessage, but the AbstractAction above was shorter and faster
//    public class SubmitButton implements ActionListener, KeyListener
//    {
//        JTextField nameInput;
//        public SubmitButton(JTextField textfield)
//        {
//            nameInput = textfield;
//        }
//        @Override
//        public void actionPerformed(ActionEvent submitClicked)
//        {
//            Component frame = new JFrame();
//            JOptionPane.showMessageDialog(frame, "You've Submitted the name " + nameInput.getText());
//        }
//        @Override
//        public void keyPressed(KeyEvent e)
//        {
//            if (e.getKeyCode() == KeyEvent.VK_ENTER)
//            {
//                sendMessage();
//            }
//
//        }
//        @Override
//        public void keyTyped(KeyEvent e)
//        {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//        @Override
//        public void keyReleased(KeyEvent e)
//        {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }
}
