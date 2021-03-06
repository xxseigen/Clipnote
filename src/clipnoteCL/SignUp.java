/**
 *
 * @author Lecaros, Tracy Josh
 *         Naldoza, Catherine Marie
 * @version 1.0
 * @since 11/09/20
 * 
 */


package clipnoteCL;


import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

    
    /**
     * Creates new form SignUp.
     */
    public SignUp() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    
    
    /*
     * This function verify if the text fields are empty.
     * The function also checks if the username or password is correct.
     *
     * @throws exception when textfields are empty
    */
    public boolean verifyFields(){
        
        String sName        = signUpNameField.getText();
        String sUsername    = signUpUsernameField.getText();
        String sPassword    = String.valueOf(signUpPasswordField.getPassword());
        String sConfirm     = String.valueOf(signUpConfirmField.getPassword());
        
        
        
        // check empty fields
        if(sName.trim().equals("") || sUsername.trim().equals("") || sPassword.trim().equals("")
            || sPassword.trim().equals("") || sConfirm.trim().equals("")){
            
            JOptionPane.showMessageDialog(null, "Please Fill Out All of the Empty Fields","Empty Fields", 2);
            return false;
     
        }
        
        
        // verify the password and confirm password if they are the same
        else if(!sPassword.equals(sConfirm)){
            
            JOptionPane.showMessageDialog(null, "The Password Does Not Match", "Confirm Password", 2);
            return false;
   
        }
        
        // if there is no issue
        else{
            
            return true;
        }
    }
    
    
    
    /*
     * This function checks the username if it exists in the databse
     *
     * @throws exception when the username is already taken 
    */
    public boolean verifyUsername(String username){
        
        PreparedStatement ps;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `accounts` WHERE `username` = ?";
        
        
        try {
            
            ps = DatabaseConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            
            if(rs.next()){
                
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken", "Username Failed", 2);
            
            } 
        
        
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;

    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpMainPanel = new javax.swing.JPanel();
        signUpPanel = new javax.swing.JPanel();
        sigUpInnerPanel = new javax.swing.JPanel();
        signUpButton = new javax.swing.JButton();
        signUpName = new javax.swing.JLabel();
        signUpNameField = new javax.swing.JTextField();
        signUpUsername = new javax.swing.JLabel();
        signUpUsernameField = new javax.swing.JTextField();
        signUpPassword = new javax.swing.JLabel();
        signUpConfirm = new javax.swing.JLabel();
        signUpPasswordField = new javax.swing.JPasswordField();
        signUpConfirmField = new javax.swing.JPasswordField();
        logIn = new javax.swing.JLabel();
        signUpLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        signUpMainPanel.setBackground(new java.awt.Color(21, 31, 41));
        signUpMainPanel.setName("ClipNote"); // NOI18N
        signUpMainPanel.setPreferredSize(new java.awt.Dimension(1150, 800));

        signUpPanel.setBackground(new java.awt.Color(255, 255, 255));

        sigUpInnerPanel.setBackground(new java.awt.Color(28, 162, 243));

        signUpButton.setBackground(new java.awt.Color(27, 162, 243));
        signUpButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign up");
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        signUpName.setBackground(new java.awt.Color(255, 255, 255));
        signUpName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        signUpName.setText("Name:");

        signUpNameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        signUpUsername.setBackground(new java.awt.Color(255, 255, 255));
        signUpUsername.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        signUpUsername.setText("Username");

        signUpUsernameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        signUpPassword.setBackground(new java.awt.Color(255, 255, 255));
        signUpPassword.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        signUpPassword.setText("Password");

        signUpConfirm.setBackground(new java.awt.Color(255, 255, 255));
        signUpConfirm.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        signUpConfirm.setText("Confirm Password");

        signUpPasswordField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        signUpConfirmField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        logIn.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        logIn.setForeground(new java.awt.Color(51, 51, 51));
        logIn.setText("Alread Have an Account? Login");
        logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logInMouseExited(evt);
            }
        });

        javax.swing.GroupLayout sigUpInnerPanelLayout = new javax.swing.GroupLayout(sigUpInnerPanel);
        sigUpInnerPanel.setLayout(sigUpInnerPanelLayout);
        sigUpInnerPanelLayout.setHorizontalGroup(
            sigUpInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sigUpInnerPanelLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(sigUpInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signUpName)
                    .addComponent(signUpNameField)
                    .addComponent(signUpUsername)
                    .addComponent(signUpUsernameField)
                    .addComponent(signUpConfirm)
                    .addComponent(signUpPassword)
                    .addComponent(signUpPasswordField)
                    .addComponent(signUpConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
            .addGroup(sigUpInnerPanelLayout.createSequentialGroup()
                .addGroup(sigUpInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sigUpInnerPanelLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sigUpInnerPanelLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(logIn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sigUpInnerPanelLayout.setVerticalGroup(
            sigUpInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sigUpInnerPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(signUpName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logIn)
                .addGap(37, 37, 37))
        );

        signUpLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clipnoteCL/logoClipNote.png"))); // NOI18N

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(signUpLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(sigUpInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sigUpInnerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(signUpLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signUpMainPanelLayout = new javax.swing.GroupLayout(signUpMainPanel);
        signUpMainPanel.setLayout(signUpMainPanelLayout);
        signUpMainPanelLayout.setHorizontalGroup(
            signUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpMainPanelLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(signUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        signUpMainPanelLayout.setVerticalGroup(
            signUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpMainPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(signUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*
     * This function craetes account and stores it to the database
     *
     * @throws exception when the signUp process failed
     */
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        
        // get data from TextFields
        String sName        = signUpNameField.getText();
        String sUsername    = signUpUsernameField.getText();
        String sPassword    = String.valueOf(signUpPasswordField.getPassword());
        String sConfirm     = String.valueOf(signUpConfirmField.getPassword());
        
        
        // check if the TextFields are empty
        if(verifyFields()){
            
            
            //check if the username already exists
            if(!verifyUsername(sUsername))
               {
                
                PreparedStatement ps;
                ResultSet rs;
                
                String registerUserQuery = "INSERT INTO `accounts`(`name`, `username`, `password`) VALUES (?,?,?)";
                
                try{
                    
                    ps = DatabaseConnection.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, sName);
                    ps.setString(2, sUsername);
                    ps.setString(3, sPassword);
                    
                    
                    if(ps.executeUpdate() != 0 ){
                        
                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                   
                    } else{
                        
                        JOptionPane.showMessageDialog(null, "Failed To Create Account");
                    
                    }
                    
                } catch (SQLException e){
                    
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);

                }

            }

        }
       
    }//GEN-LAST:event_signUpButtonActionPerformed

    
    /*
     * This function turns the signUp button to its original color
     * when cursor is away from the button
     */
    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseExited

        signUpButton.setBackground(new Color(21,31,41));
        
    }//GEN-LAST:event_signUpButtonMouseExited

    
     /*
     * This function changes the signUp button when the cursor
     * is above the button
     */
    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseEntered

        signUpButton.setBackground(new Color(0, 101, 183));
        
    }//GEN-LAST:event_signUpButtonMouseEntered

    
    
    /*
     * This function directs the user to the login page 
     */
    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked

        ClipNote login = new ClipNote();
        login.setVisible(true);
        login.pack();
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_logInMouseClicked

    //not used
    private void logInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseEntered

    }//GEN-LAST:event_logInMouseEntered

    
    private void logInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseExited

    }//GEN-LAST:event_logInMouseExited

    
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logIn;
    private javax.swing.JPanel sigUpInnerPanel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpConfirm;
    private javax.swing.JPasswordField signUpConfirmField;
    private javax.swing.JLabel signUpLogo;
    private javax.swing.JPanel signUpMainPanel;
    private javax.swing.JLabel signUpName;
    private javax.swing.JTextField signUpNameField;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JLabel signUpPassword;
    private javax.swing.JPasswordField signUpPasswordField;
    private javax.swing.JLabel signUpUsername;
    private javax.swing.JTextField signUpUsernameField;
    // End of variables declaration//GEN-END:variables
}
