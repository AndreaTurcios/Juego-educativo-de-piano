package juegoandreat;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFrame;
import sun.audio.*;
public class frmJuegoMain extends javax.swing.JFrame {
    public frmJuegoMain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCSost1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnA1 = new javax.swing.JButton();
        btnG1 = new javax.swing.JButton();
        btnF1 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnDSost1 = new javax.swing.JButton();
        btnFSost1 = new javax.swing.JButton();
        btnGSost1 = new javax.swing.JButton();
        btnASost1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jButton11.setText("jButton9");

        jButton13.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnCSost1.setBackground(new java.awt.Color(102, 102, 102));
        btnCSost1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCSost1MouseClicked(evt);
            }
        });
        btnCSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSost1ActionPerformed(evt);
            }
        });

        btnC2.setBackground(new java.awt.Color(255, 255, 255));
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnB1.setBackground(new java.awt.Color(255, 255, 255));
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });

        btnA1.setBackground(new java.awt.Color(255, 255, 255));
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });

        btnG1.setBackground(new java.awt.Color(255, 255, 255));
        btnG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG1ActionPerformed(evt);
            }
        });

        btnF1.setBackground(new java.awt.Color(255, 255, 255));
        btnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1ActionPerformed(evt);
            }
        });

        btnE1.setBackground(new java.awt.Color(255, 255, 255));
        btnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE1ActionPerformed(evt);
            }
        });

        btnD1.setBackground(new java.awt.Color(255, 255, 255));
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });

        btnC1.setBackground(new java.awt.Color(255, 255, 255));
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC1MouseClicked(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        btnC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnC1KeyPressed(evt);
            }
        });

        btnDSost1.setBackground(new java.awt.Color(102, 102, 102));
        btnDSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSost1ActionPerformed(evt);
            }
        });

        btnFSost1.setBackground(new java.awt.Color(102, 102, 102));
        btnFSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFSost1ActionPerformed(evt);
            }
        });

        btnGSost1.setBackground(new java.awt.Color(102, 102, 102));
        btnGSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGSost1ActionPerformed(evt);
            }
        });

        btnASost1.setBackground(new java.awt.Color(102, 102, 102));
        btnASost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASost1ActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoandreat/returnrefresh.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnE1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnF1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnG1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnCSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnDSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(btnFSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnGSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnASost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnDSost1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFSost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGSost1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnASost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnG1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
       System.out.println("C1");
       try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/C1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C1" + e);
        }
                                             
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG1ActionPerformed
        System.out.println("G");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/G.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error G" + e);
        }
    }//GEN-LAST:event_btnG1ActionPerformed

    private void btnC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseClicked
        
    }//GEN-LAST:event_btnC1MouseClicked

    private void btnCSost1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCSost1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCSost1MouseClicked

    private void btnCSost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSost1ActionPerformed
        System.out.println("C#1");
        try {
            String file = "src/juegoandreat/Notas/Music_Note/C_s1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C#1" + e);
        }
    }//GEN-LAST:event_btnCSost1ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        System.out.println("D1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/D1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error D1" + e);
        }
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnDSost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSost1ActionPerformed
        System.out.println("D#1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/D_s1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error D#1" + e);
        }
    }//GEN-LAST:event_btnDSost1ActionPerformed

    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        System.out.println("E1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/E1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error E1" + e);
        }
    }//GEN-LAST:event_btnE1ActionPerformed

    private void btnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1ActionPerformed
        System.out.println("F1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/F1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error F1" + e);
        }
    }//GEN-LAST:event_btnF1ActionPerformed

    private void btnFSost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFSost1ActionPerformed
        System.out.println("F#1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/F_s.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error F#1" + e);
        }
    }//GEN-LAST:event_btnFSost1ActionPerformed

    private void btnGSost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGSost1ActionPerformed
        System.out.println("G#1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/G_s.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error G#1" + e);
        }
    }//GEN-LAST:event_btnGSost1ActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        System.out.println("A1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/A.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error A1" + e);
        }
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnASost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASost1ActionPerformed
        System.out.println("A#1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/Bb.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error A#1" + e);
        }
    }//GEN-LAST:event_btnASost1ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        System.out.println("B1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/B.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error B1" + e);
        }
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        System.out.println("C2");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/C.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C2" + e);
        }
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnC1KeyPressed
        System.out.println("C1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/C1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C1" + e);
        }
    }//GEN-LAST:event_btnC1KeyPressed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu llamar = new Menu();
        llamar.setVisible(true);
        llamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmJuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmJuegoMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnASost1;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnCSost1;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnDSost1;
    private javax.swing.JButton btnE1;
    private javax.swing.JButton btnF1;
    private javax.swing.JButton btnFSost1;
    private javax.swing.JButton btnG1;
    private javax.swing.JButton btnGSost1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
