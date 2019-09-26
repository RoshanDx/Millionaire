/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

import static java.awt.Color.BLACK;
import static java.awt.Color.GREEN;
import static java.awt.Color.WHITE;
import java.util.Random;
import java.lang.*;

/**
 *
 * @author mahenzorg
 */
public class MainMenu extends javax.swing.JFrame {

    int call_question;
    int count = 0;
    int fifty_fifty = 0;
    int money = 0;
    boolean change = true;
   
    /**
     * Creates new form MainMenu
     */
    public void init() {
        call_question = 0;

    }

    public MainMenu() {
        initComponents();
        
        
    }

    public void endgame() {

        EndGame end = new EndGame();
        end.setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMoney = new javax.swing.JLabel();
        btnfifty = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        test = new javax.swing.JTextField();
        txtAns2 = new javax.swing.JTextField();
        txtAns3 = new javax.swing.JTextField();
        txtAns4 = new javax.swing.JTextField();
        txtAns1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtMoney.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtMoney.setText("Money : 0");

        btnfifty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnfifty.setText("Lifeline : 50/50");
        btnfifty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiftyActionPerformed(evt);
            }
        });

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_Currency_dollar_381602.png"))); // NOI18N
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtnMouseClicked(evt);
            }
        });
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        test.setEditable(false);
        test.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        test.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        test.setText("Click the $ to go to  the questions.");

        txtAns2.setEditable(false);
        txtAns2.setBackground(new java.awt.Color(255, 255, 255));
        txtAns2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAns2MouseClicked(evt);
            }
        });
        txtAns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAns2ActionPerformed(evt);
            }
        });

        txtAns3.setEditable(false);
        txtAns3.setBackground(new java.awt.Color(255, 255, 255));
        txtAns3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAns3MouseClicked(evt);
            }
        });

        txtAns4.setEditable(false);
        txtAns4.setBackground(new java.awt.Color(255, 255, 255));
        txtAns4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAns4MouseClicked(evt);
            }
        });
        txtAns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAns4ActionPerformed(evt);
            }
        });

        txtAns1.setEditable(false);
        txtAns1.setBackground(new java.awt.Color(255, 255, 255));
        txtAns1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAns1MouseClicked(evt);
            }
        });
        txtAns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAns1ActionPerformed(evt);
            }
        });

        jLabel2.setText("B)");

        jLabel3.setText("A)");

        jLabel4.setText("C)");

        jLabel5.setText("D)");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Who Wants To Be A Millionaire");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(test)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAns3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAns4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnfifty)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMoney)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtMoney)
                .addGap(29, 29, 29)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnfifty, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAns4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAns3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAns4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAns4MouseClicked

        if (call_question == 1 && txtAns4.getText().equals(Question.ans[0])) {
            money = money + 100;
            txtAns4.setBackground(GREEN);
            change = false;
            txtMoney.setText("Money: " + String.valueOf(money));

        } else if (call_question == 2 && txtAns4.getText().equals("Isaac Newton")) {
            money = money + 100;
            change = true;
            txtAns4.setBackground(GREEN);
            change = false;
            txtMoney.setText("Money: " + String.valueOf(money));

        } else if (call_question == 3) {
            endgame();
        } else if (call_question == 4) {
            endgame();
        } else if (call_question == 5) {
            endgame();
        }


    }//GEN-LAST:event_txtAns4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:


    }//GEN-LAST:event_formWindowActivated

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        //call_question = call_question+1;

        for (int i = 0; i <= 6; i++) {
            if (call_question == i) {
                test.setText(Question.questions[i][0]);
                txtAns1.setText(Question.questions[i][1]);
                txtAns2.setText(Question.questions[i][2]);
                txtAns3.setText(Question.questions[i][3]);
                txtAns4.setText(Question.questions[i][4]);

            }
        }
        call_question = call_question + 1;

        txtAns1.setBackground(WHITE);
        txtAns2.setBackground(WHITE);
        txtAns3.setBackground(WHITE);
        txtAns4.setBackground(WHITE);


    }//GEN-LAST:event_nextBtnActionPerformed

    private void btnfiftyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiftyActionPerformed

        Random rand = new Random();
        
        //JTextField [] jtArray = new JTextField[]{txtAns1,txtAns2,txtAns3};

        if (fifty_fifty < 0) {
            fifty_fifty = 1;
        } else if (fifty_fifty >= 0) {
            //btnfifty.setBackground(RED);
            btnfifty.setEnabled(false);
        }

        if (call_question == 1) {
      
            txtAns1.setBackground(BLACK);
            txtAns2.setBackground(BLACK);

        } else if (call_question == 2) {

            txtAns1.setBackground(BLACK);
            txtAns3.setBackground(BLACK);

        } else if (call_question == 3) {

            txtAns1.setBackground(BLACK);
            txtAns2.setBackground(BLACK);

        } else if (call_question == 4) {

            txtAns2.setBackground(BLACK);
            txtAns3.setBackground(BLACK);

        } else if (call_question == 5) {

            txtAns3.setBackground(BLACK);
            txtAns4.setBackground(BLACK);

        }

    }//GEN-LAST:event_btnfiftyActionPerformed

    private void txtAns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAns1ActionPerformed

    }//GEN-LAST:event_txtAns1ActionPerformed

    private void txtAns1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAns1MouseClicked

        if (call_question == 4 && txtAns1.getText().equals(Question.ans[3])) {
            money = money + 100;
            txtAns1.setBackground(GREEN);
            change = false;
            txtMoney.setText("Money: " + String.valueOf(money));

        }

        if (call_question == 1) {
            endgame();
        } else if (call_question == 2) {
            endgame();
        }
        if (call_question == 3) {
            endgame();
        }
        if (call_question == 5) {
            endgame();
        }


    }//GEN-LAST:event_txtAns1MouseClicked

    private void txtAns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAns4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAns4ActionPerformed

    private void txtAns3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAns3MouseClicked

        if (call_question == 3 && txtAns3.getText().equals(Question.ans[2])) {
            money = money + 100;
            txtAns3.setBackground(GREEN);
            change = false;
            txtMoney.setText("Money: " + String.valueOf(money));
            
        }

        else if (call_question == 1) {
            endgame();
        } else if (call_question == 2) {
            endgame();
        }
        else if (call_question == 4) {
            endgame();
        }
        else if (call_question == 5) {
            endgame();
        }

    }//GEN-LAST:event_txtAns3MouseClicked

    private void nextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nextBtnMouseClicked

    private void txtAns2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAns2MouseClicked

        if (call_question == 5 && txtAns2.getText().equals(Question.ans[4])) {
            money = money + 100;
            change = true;
            txtAns2.setBackground(GREEN);
            change = false;
            txtMoney.setText("Money: " + String.valueOf(money));

            EndGame2 eg2 = new EndGame2();
            eg2.setVisible(true);
            this.dispose();
        }

        if (call_question == 1) {
            endgame();
        } else if (call_question == 2) {
            endgame();
        }
        if (call_question == 3) {
            endgame();
        }
        if (call_question == 4) {
            endgame();
        }

    }//GEN-LAST:event_txtAns2MouseClicked

    private void txtAns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAns2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAns2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfifty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField test;
    private javax.swing.JTextField txtAns1;
    private javax.swing.JTextField txtAns2;
    private javax.swing.JTextField txtAns3;
    private javax.swing.JTextField txtAns4;
    private javax.swing.JLabel txtMoney;
    // End of variables declaration//GEN-END:variables
}
