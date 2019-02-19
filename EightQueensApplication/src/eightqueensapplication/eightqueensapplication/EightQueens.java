/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueensapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class EightQueens extends javax.swing.JFrame {

    /**
     * Creates new form EightQueens
     */
    public EightQueens() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appName = new javax.swing.JTextField();
        inputField = new javax.swing.JPanel();
        inputText = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        playGround = new javax.swing.JPanel();
        resultText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eight Queens Application");
        setPreferredSize(new java.awt.Dimension(600, 750));

        appName.setEditable(false);
        appName.setBackground(new java.awt.Color(255, 51, 51));
        appName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        appName.setText("Eight Queens Solution Application");

        inputField.setLayout(new javax.swing.BoxLayout(inputField, javax.swing.BoxLayout.LINE_AXIS));

        inputText.setText("");
        inputText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTextFocusLost(evt);
            }
        });
        inputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextActionPerformed(evt);
            }
        });
        inputField.add(inputText);

        confirmButton.setText("Enter");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        inputField.add(confirmButton);

        playGround.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        javax.swing.GroupLayout playGroundLayout = new javax.swing.GroupLayout(playGround);
        playGround.setLayout(playGroundLayout);
        playGroundLayout.setHorizontalGroup(
            playGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        playGroundLayout.setVerticalGroup(
            playGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        resultText.setEditable(false);
        resultText.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(inputField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(playGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resultText)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTextFocusGained
        // TODO add your handling code here:
        if (inputText.getText().equals("Input size of chess")){
           inputText.setText("");
        }
        inputText.setForeground(Color.BLACK);
    }//GEN-LAST:event_inputTextFocusGained

    private void inputTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTextFocusLost
        // TODO add your handling code here:
        if (inputText.getText().equals("")){
           inputText.setText("Input size of chess");
        }
        inputText.setForeground(Color.GRAY);
    }//GEN-LAST:event_inputTextFocusLost

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        GridLayout gridLayout;
        playGround.removeAll();
        try {
            String input = inputText.getText().trim();
            int n = Integer.parseInt(input);
            NQueen.N = n;
            NQueen.state = new char[n][n];
            gridLayout = new GridLayout(n,n);
            playGround.setLayout(gridLayout);
            NQueen.runSolution();
            resultText.setText("Total : " + Integer.toString(NQueen.count));
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    JPanel square = new JPanel( new BorderLayout());
                    playGround.add(square);
                    square.setLayout(new BoxLayout(square,BoxLayout.X_AXIS));
                    if (i % 2 == 0) {
                        if (NQueen.state[i][j] == 'Q') {
                            JLabel label = new JLabel();
                            ImageIcon myPicture = null;
                            
                    try {
                    java.net.URL pictureURL = getClass().getResource("queen50x50.png");
                    myPicture = new ImageIcon(pictureURL);
                  } catch (Exception ex) {
                    Logger.getLogger(EightQueens.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        label.setIcon(myPicture);
                        square.add(Box.createHorizontalGlue());
                         square.add(label);
                         square.add(Box.createHorizontalGlue());
                         
                            
                        }
                        else square.setBackground( j % 2 == 0 ? Color.white : Color.black );
                    }
                    else {
                        if (NQueen.state[i][j] == 'Q') {
                            JLabel label = new JLabel();
                            ImageIcon myPicture = null;
                    try {
                    java.net.URL pictureURL = getClass().getResource("queen50x50.png");
                    myPicture = new ImageIcon(pictureURL);
                  } catch (Exception ex) {
                    Logger.getLogger(EightQueens.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        label.setIcon(myPicture);
                         square.add(Box.createHorizontalGlue());
                         square.add(label);
                         square.add(Box.createHorizontalGlue());
                        }
                        else square.setBackground( j % 2 == 0 ? Color.black : Color.white );  
                    }
                     
                }
            }
            NQueen.count = 0;
            NQueen.state = null;
            NQueen.isPrint = false;
            playGround.validate();
            playGround.repaint();
      } catch (Exception e){
            playGround.removeAll();
            playGround.validate();
            playGround.repaint();
            resultText.setText("Cannot calculate");
      }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void inputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextActionPerformed
        // TODO add your handling code here:
        confirmButtonActionPerformed(evt);
    }//GEN-LAST:event_inputTextActionPerformed

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
            java.util.logging.Logger.getLogger(EightQueens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EightQueens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EightQueens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EightQueens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EightQueens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appName;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel inputField;
    private javax.swing.JTextField inputText;
    private javax.swing.JPanel playGround;
    private javax.swing.JTextField resultText;
    // End of variables declaration//GEN-END:variables
}
