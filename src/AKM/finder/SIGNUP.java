    






package AKM.finder;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp1
 */

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SIGNUP extends javax.swing.JFrame {

   java.util.Random r=new java.util.Random();
     int start=100000;
     int end=1000000;
     int result=r.nextInt(end-start) +start;
     
     
     
    public SIGNUP() {
        
        initComponents();
        jButton6.setVisible(false);
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.decode("#000000")));
        jTextField2.setBorder(BorderFactory.createLineBorder(Color.decode("#000000")));
        jTextField3.setBorder(BorderFactory.createLineBorder(Color.decode("#000000")));
        jTextField4.setBorder(BorderFactory.createLineBorder(Color.decode("#000000")));
        jTextField5.setBorder(BorderFactory.createLineBorder(Color.decode("#000000")));
        jTextField6.setBorder(BorderFactory.createLineBorder(Color.decode("#000000")));
        jTextField6.setEditable(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        OTHER = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("             FULL NAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(730, 90, 240, 20);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOB");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1180, 80, 60, 30);

        jLabel6.setBackground(java.awt.Color.black);
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PHONE NUMBER");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(1130, 190, 150, 20);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADDRESS");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(950, 300, 120, 28);

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3d-small-people-team-23071405.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 290, 490, 190);

        jSeparator1.setForeground(new java.awt.Color(153, 255, 102));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(730, 160, 270, 2);

        jTextField2.setBackground(java.awt.Color.black);
        jTextField2.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("");
        jPanel2.add(jTextField2);
        jTextField2.setBounds(1100, 230, 220, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("MESS FINDER");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(200, 200, 220, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signup.jpg"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(900, 10, 250, 50);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(810, 420, 70, 30);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1090, 400, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AKM/finder/blue.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 770);

        jTextField1.setBackground(java.awt.Color.black);
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel2.add(jTextField1);
        jTextField1.setBounds(730, 130, 270, 30);

        MALE.setBackground(java.awt.Color.black);
        buttonGroup1.add(MALE);
        MALE.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 18)); // NOI18N
        MALE.setForeground(new java.awt.Color(255, 255, 255));
        MALE.setText("MALE");
        MALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEActionPerformed(evt);
            }
        });
        jPanel2.add(MALE);
        MALE.setBounds(730, 240, 90, 37);

        FEMALE.setBackground(java.awt.Color.black);
        buttonGroup1.add(FEMALE);
        FEMALE.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 18)); // NOI18N
        FEMALE.setForeground(new java.awt.Color(255, 255, 255));
        FEMALE.setText("FEMALE");
        FEMALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALEActionPerformed(evt);
            }
        });
        jPanel2.add(FEMALE);
        FEMALE.setBounds(850, 240, 93, 29);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(700, 382, 650, 20);

        jSeparator2.setForeground(new java.awt.Color(0, 204, 51));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(1100, 262, 220, 10);

        jTextField3.setBackground(java.awt.Color.black);
        jTextField3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField3);
        jTextField3.setBounds(700, 330, 650, 50);

        jTextField4.setBackground(java.awt.Color.black);
        jTextField4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField4);
        jTextField4.setBounds(710, 460, 300, 40);

        jTextField5.setBackground(java.awt.Color.black);
        jTextField5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextField5);
        jTextField5.setBounds(1080, 450, 200, 50);

        jTextField6.setBackground(java.awt.Color.black);
        jTextField6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(950, 590, 280, 40);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NEW PASSWORD\n");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(990, 560, 185, 28);

        jButton1.setBackground(java.awt.Color.black);
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VERIFY EMAIL");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(760, 520, 170, 30);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(710, 508, 300, 10);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(950, 640, 280, 10);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/E.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1220, 670, 80, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loggogogo.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(970, 660, 150, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/R.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(780, 680, 90, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(680, 0, 40, 40);

        jButton6.setBackground(java.awt.Color.black);
        jButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setBorderPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(1100, 520, 170, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(710, 570, 220, 90);

        OTHER.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(OTHER);
        OTHER.setFont(new java.awt.Font("Berlin Sans FB", 3, 18)); // NOI18N
        OTHER.setForeground(new java.awt.Color(255, 255, 255));
        OTHER.setText("OTHER");
        jPanel2.add(OTHER);
        OTHER.setBounds(790, 280, 87, 31);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(1130, 120, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FEMALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEMALEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEMALEActionPerformed

    private void MALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MALEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MALEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           jTextField1.setEditable(false);
           jTextField2.setEditable(false);
           jTextField3.setEditable(false);
           jTextField4.setEditable(true); 
           jDateChooser1.setEnabled(false);
           MALE.setEnabled(false);
           FEMALE.setEnabled(false);
        String name=jTextField1.getText(); 
       String phone =jTextField2.getText();
       boolean ch = true;
       if(name!=null)
       {
            if(name.matches("^[a-z A-Z]*$")==true)
            {
                 
                if(phone.matches("^[0-9]*$") && phone.length()==10 )
                 {
                         
                           jLabel10.setText("ENTER OTP");
                           jTextField5.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
                           jButton6.setVisible(true);
                           jButton6.setText("CONFIRM OTP");
                      Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port","465");
        props.put("mail.smtp.user", "sureshraina8067@gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false"); 
        try {
            Class.forName("java.sql.Driver");
         
              
                           
                Session session = Session.getDefaultInstance(props, null);
                session.setDebug(true);
                MimeMessage message = new MimeMessage(session);
                message.setText("HELLO "+name.toUpperCase()+" "+"YOUR OTP FOR AMKCART APP IS "+result+"\n"+"THANK YOU");
                message.setSubject("SIGN UP FOR AMKCART APP");
                message.setFrom(new InternetAddress("sureshraina8067@gmail.com"));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(jTextField4.getText().trim()));
                message.saveChanges();
                Transport transport = session.getTransport("smtp");
                transport.connect("smtp.gmail.com", "sureshraina8067@gmail.com", "keshavdubey");
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                jLabel12.setText("Your OTP mailed to you");         
            
        } 
        catch(ClassNotFoundException e) 
        {
            jLabel12.setText("Email Address not found");
            
        }           catch (MessagingException ex) { 
                        Logger.getLogger(SIGNUP.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                           
                           
                  }
            
                 else{
                    
                    JOptionPane.showMessageDialog(null,"Invalid PHONE NUMBER");
                    
                  }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NAME");
            }
             
       }    
       else
       {
           JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NAME");
       }
           
        //show otp field

        
        
        
         
          
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     String tre = jTextField6.getText();
     if(tre.length()>6)
     {
         
     
       try
        {
            
               Class.forName("oracle.jdbc.driver.OracleDriver");
              try (java.sql.Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","keshav15")) {
                String qu="INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt=con.prepareStatement(qu);
                pstmt.setString(1,jTextField1.getText());
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
                String date=sdf.format(jDateChooser1.getDate());
                pstmt.setString(2,date);
                String gender = null;
                if(MALE.isSelected())
                {
                    gender=MALE.getText();
                }
                if(FEMALE.isSelected())
                {
                    gender=FEMALE.getText();
                }
                if(OTHER.isSelected())
                {
                    gender=OTHER.getText();
                }
                pstmt.setString(3, gender);
                Long ph=Long.parseUnsignedLong(jTextField2.getText());
                pstmt.setLong(5,ph);
                pstmt.setString(4,jTextField3.getText());
                pstmt.setString(6,jTextField4.getText());
                pstmt.setString(7,jTextField6.getText());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"DETAILS ARE SUCCESSFULLY REGISTERED PLEASE GO TO LOGIN PAGE");
                new l1().setVisible(true);
                dispose();
            }
              
             
         }
         catch(HeadlessException | ClassNotFoundException | SQLException e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }
     else
     {
         JOptionPane.showMessageDialog(null, "WEAK PASSWORD");
     }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int m=Integer.parseInt(jTextField5.getText());
        if(result==m)
        {
           JOptionPane.showMessageDialog(null,"NOW PLEASE ENTER YOUR NEW PASSWORD");
           jTextField1.setEditable(false);
           jTextField2.setEditable(false);
           jTextField3.setEditable(false);
           jTextField4.setEditable(false);
           jTextField5.setEditable(false);
           jDateChooser1.setEnabled(false);
           MALE.setEnabled(false);
           FEMALE.setEnabled(false);
           OTHER.setEnabled(false);
           jTextField6.setEditable(true); 
           
        }
        else
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CORRECT OTP");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new MF().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGNUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JRadioButton OTHER;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
