package juegoandreat;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Random;
import javafx.scene.input.KeyCode;
import javax.swing.JFrame;
import juegoandreat.Menu;
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jbtncancion = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCSost1MouseExited(evt);
            }
        });
        btnCSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSost1ActionPerformed(evt);
            }
        });

        btnC2.setBackground(new java.awt.Color(255, 255, 255));
        btnC2.setText("DO");
        btnC2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnC2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnC2MouseReleased(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnB1.setBackground(new java.awt.Color(255, 255, 255));
        btnB1.setText("SI");
        btnB1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnB1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnB1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnB1MouseReleased(evt);
            }
        });
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });

        btnA1.setBackground(new java.awt.Color(255, 255, 255));
        btnA1.setText("LA");
        btnA1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnA1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnA1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnA1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnA1MouseReleased(evt);
            }
        });
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });

        btnG1.setBackground(new java.awt.Color(255, 255, 255));
        btnG1.setText("SOL");
        btnG1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnG1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnG1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnG1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnG1MouseReleased(evt);
            }
        });
        btnG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG1ActionPerformed(evt);
            }
        });

        btnF1.setBackground(new java.awt.Color(255, 255, 255));
        btnF1.setText("FA");
        btnF1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnF1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnF1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnF1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnF1MouseReleased(evt);
            }
        });
        btnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1ActionPerformed(evt);
            }
        });

        btnE1.setBackground(new java.awt.Color(255, 255, 255));
        btnE1.setText("MI");
        btnE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnE1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnE1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnE1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnE1MouseReleased(evt);
            }
        });
        btnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE1ActionPerformed(evt);
            }
        });

        btnD1.setBackground(new java.awt.Color(255, 255, 255));
        btnD1.setText("RE");
        btnD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnD1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnD1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnD1MouseReleased(evt);
            }
        });
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });
        btnD1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnD1KeyPressed(evt);
            }
        });

        btnC1.setBackground(new java.awt.Color(255, 255, 255));
        btnC1.setText("DO");
        btnC1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnC1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnC1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnC1MouseReleased(evt);
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnC1KeyReleased(evt);
            }
        });

        btnDSost1.setBackground(new java.awt.Color(102, 102, 102));
        btnDSost1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDSost1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDSost1MouseExited(evt);
            }
        });
        btnDSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSost1ActionPerformed(evt);
            }
        });

        btnFSost1.setBackground(new java.awt.Color(102, 102, 102));
        btnFSost1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFSost1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFSost1MouseExited(evt);
            }
        });
        btnFSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFSost1ActionPerformed(evt);
            }
        });

        btnGSost1.setBackground(new java.awt.Color(102, 102, 102));
        btnGSost1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGSost1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGSost1MouseExited(evt);
            }
        });
        btnGSost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGSost1ActionPerformed(evt);
            }
        });

        btnASost1.setBackground(new java.awt.Color(102, 102, 102));
        btnASost1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnASost1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnASost1MouseExited(evt);
            }
        });
        btnASost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASost1ActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/returnrefresh.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Sostenido");

        jbtncancion.setText("Sigue las teclas");
        jbtncancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncancionActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("(Simón dice)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnE1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnF1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnG1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnCSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnDSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(btnFSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnGSost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnASost1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtncancion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtncancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnFSost1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addComponent(btnDSost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCSost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGSost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnASost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
       System.out.println("C");
      // System.out.println("nota musica" + notaMusical.equals("C1"));
       
        if (jCheckBox1.isSelected ()) {
              try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            
            String file = "src/juegoandreat/Notas/Music_Note/Do sostenido.mp3";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            System.out.println("nota musica1" + notaMusical.equals("C1"));
            AudioPlayer.player.start(audioCsos1);
            if(simonDice && notaMusical.equals("C1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }
      }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/C.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
             System.out.println("nota musica" + notaMusical.equals("C1"));
            if(simonDice && notaMusical.equals("C1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error C_s1" + e);
        }

             }                               
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG1ActionPerformed
        System.out.println("G");
        if (jCheckBox1.isSelected ()) {
       try {
            String file = "src/juegoandreat/Notas/Music_Note/G_s.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
            System.out.println("nota musica" + notaMusical.equals("G1"));
            if(simonDice && notaMusical.equals("G1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error G_s" + e);
        }
        }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/G.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
             if(simonDice && notaMusical.equals("G1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }

             } 
    }//GEN-LAST:event_btnG1ActionPerformed

    private void btnC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseClicked
        btnC1.setBackground(Color.blue);
    }//GEN-LAST:event_btnC1MouseClicked

    private void btnCSost1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCSost1MouseClicked
        btnCSost1.setBackground(Color.blue);
    }//GEN-LAST:event_btnCSost1MouseClicked

    private void btnCSost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSost1ActionPerformed
        System.out.println("C#1");
        try {
            String file = "src/juegoandreat/Notas/Music_Note/Do-sostenido.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C#1" + e);
        }
    }//GEN-LAST:event_btnCSost1ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        System.out.println("D");
         if (jCheckBox1.isSelected ()) {
       try {
            String file = "src/juegoandreat/Notas/Music_Note/D_s.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
            System.out.println("nota musica" + notaMusical.equals("D1"));
            if(simonDice && notaMusical.equals("D1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error D" + e);
        }
       }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/D.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
             System.out.println("nota musica" + notaMusical.equals("D1"));
            if(simonDice && notaMusical.equals("D1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }

             }     
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnDSost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSost1ActionPerformed
        System.out.println("D#1");
       
       try {
            String file = "src/juegoandreat/Notas/Music_Note/Re-sostenido.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error D#1" + e);
        }
    }//GEN-LAST:event_btnDSost1ActionPerformed

    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        System.out.println("E");
         if (jCheckBox1.isSelected ()) {
       try {
            String file = "src/juegoandreat/Notas/Music_Note/E.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
            System.out.println("nota musica" + notaMusical.equals("E1"));
            if(simonDice && notaMusical.equals("E1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error E" + e);
        }
        }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/E.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
             System.out.println("nota musica" + notaMusical.equals("E1"));
            if(simonDice && notaMusical.equals("E1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }

             } 
    }//GEN-LAST:event_btnE1ActionPerformed

    private void btnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1ActionPerformed
        System.out.println("F");
        if (jCheckBox1.isSelected ()) {
       try {
            String file = "src/juegoandreat/Notas/Music_Note/F_s.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
            System.out.println("nota musica" + notaMusical.equals("F1"));
            if(simonDice && notaMusical.equals("F1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error F" + e);
        }
       }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/F.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
              System.out.println("nota musica" + notaMusical.equals("F1"));
            if(simonDice && notaMusical.equals("F1")){
                System.out.println("Ingresa al metodo");
                simonDiceJuego();
            }
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }

             } 
    }//GEN-LAST:event_btnF1ActionPerformed

    private void btnFSost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFSost1ActionPerformed
        System.out.println("F#1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/Fa-sostenido.wav";
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
            String file = "src/juegoandreat/Notas/Music_Note/Solsostenido.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error G#1" + e);
        }
    }//GEN-LAST:event_btnGSost1ActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        System.out.println("A");
        if (jCheckBox1.isSelected ()) {
       try {
            String file = "src/juegoandreat/Notas/Music_Note/A.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error A" + e);
        }
       }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/A.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }

             } 
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnASost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASost1ActionPerformed
        System.out.println("A#1");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/La-sostenido.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error A#1" + e);
        }
    }//GEN-LAST:event_btnASost1ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        System.out.println("B");
        if (jCheckBox1.isSelected ()) {
       try {
            String file = "src/juegoandreat/Notas/Music_Note/Bb.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error B" + e);
        }
       }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/B.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }

             } 
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        System.out.println("C1");
        if (jCheckBox1.isSelected ()) {
       try {
            String file = "src/juegoandreat/Notas/Music_Note/FA.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C1" + e);
        }
       }else {
            try {
            //String file = "C:\\Users\\15-CW0001la\\Documents\\NetBeansProjects\\JuegoAndreaT\\src\\juegoandreat\\Notas\\Music_Note\\C1.wav";
            String file = "src/juegoandreat/Notas/Music_Note/C1.wav/";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }

             } 
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnC1KeyPressed
        System.out.println("C");
       try {
            String file = "src/juegoandreat/Notas/Music_Note/C1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Error C" + e);
        }
    }//GEN-LAST:event_btnC1KeyPressed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu llamar = new Menu();
        llamar.setVisible(true);
        llamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        btnC1.setBackground(Color.white);
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MousePressed
        
    }//GEN-LAST:event_btnC1MousePressed

    private void btnD1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1MousePressed
       
    }//GEN-LAST:event_btnD1MousePressed

    private void btnE1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnE1MousePressed
       
    }//GEN-LAST:event_btnE1MousePressed

    private void btnF1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnF1MousePressed
      
    }//GEN-LAST:event_btnF1MousePressed

    private void btnG1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG1MousePressed
      
    }//GEN-LAST:event_btnG1MousePressed

    private void btnA1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA1MousePressed
      
    }//GEN-LAST:event_btnA1MousePressed

    private void btnB1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB1MousePressed
       
    }//GEN-LAST:event_btnB1MousePressed

    private void btnC2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MousePressed
      
    }//GEN-LAST:event_btnC2MousePressed

    private void btnC1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseReleased
       
    }//GEN-LAST:event_btnC1MouseReleased

    private void btnD1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1MouseReleased
        
    }//GEN-LAST:event_btnD1MouseReleased

    private void btnE1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnE1MouseReleased
       
    }//GEN-LAST:event_btnE1MouseReleased

    private void btnF1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnF1MouseReleased
       
    }//GEN-LAST:event_btnF1MouseReleased

    private void btnG1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG1MouseReleased
       
    }//GEN-LAST:event_btnG1MouseReleased

    private void btnA1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA1MouseReleased
       
    }//GEN-LAST:event_btnA1MouseReleased

    private void btnB1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB1MouseReleased
       
    }//GEN-LAST:event_btnB1MouseReleased

    private void btnC2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseReleased
        
    }//GEN-LAST:event_btnC2MouseReleased

    private void btnD1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnD1KeyPressed
 


    }//GEN-LAST:event_btnD1KeyPressed
       

    private void btnC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnC1KeyReleased
       
    }//GEN-LAST:event_btnC1KeyReleased

    private void btnC1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseEntered
        
    }//GEN-LAST:event_btnC1MouseEntered

    private void btnD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1MouseClicked
         btnD1.setBackground(Color.blue);
    }//GEN-LAST:event_btnD1MouseClicked

    private void btnD1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1MouseExited
        btnD1.setBackground(Color.white);
    }//GEN-LAST:event_btnD1MouseExited

    private void btnE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnE1MouseClicked
        btnE1.setBackground(Color.blue);
    }//GEN-LAST:event_btnE1MouseClicked

    private void btnE1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnE1MouseExited
        btnE1.setBackground(Color.white);
    }//GEN-LAST:event_btnE1MouseExited

    private void btnF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnF1MouseClicked
        btnF1.setBackground(Color.blue);
    }//GEN-LAST:event_btnF1MouseClicked

    private void btnF1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnF1MouseExited
        btnF1.setBackground(Color.white);
    }//GEN-LAST:event_btnF1MouseExited

    private void btnG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG1MouseClicked
        btnG1.setBackground(Color.blue);
    }//GEN-LAST:event_btnG1MouseClicked

    private void btnG1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnG1MouseExited
        btnG1.setBackground(Color.white);
    }//GEN-LAST:event_btnG1MouseExited

    private void btnA1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA1MouseExited
        btnA1.setBackground(Color.white);
    }//GEN-LAST:event_btnA1MouseExited

    private void btnA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA1MouseClicked
        btnA1.setBackground(Color.blue);
    }//GEN-LAST:event_btnA1MouseClicked

    private void btnB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB1MouseClicked
        btnB1.setBackground(Color.blue);
    }//GEN-LAST:event_btnB1MouseClicked

    private void btnB1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB1MouseExited
        btnB1.setBackground(Color.white);
    }//GEN-LAST:event_btnB1MouseExited

    private void btnC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseClicked
        btnC2.setBackground(Color.blue);
    }//GEN-LAST:event_btnC2MouseClicked

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        btnC2.setBackground(Color.white);
    }//GEN-LAST:event_btnC2MouseExited

    private void btnCSost1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCSost1MouseExited
        btnCSost1.setBackground(Color.white);
    }//GEN-LAST:event_btnCSost1MouseExited

    private void btnDSost1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSost1MouseClicked
        btnDSost1.setBackground(Color.blue);
    }//GEN-LAST:event_btnDSost1MouseClicked

    private void btnDSost1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSost1MouseExited
        btnDSost1.setBackground(Color.white);
    }//GEN-LAST:event_btnDSost1MouseExited

    private void btnFSost1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFSost1MouseClicked
        btnFSost1.setBackground(Color.blue);
    }//GEN-LAST:event_btnFSost1MouseClicked

    private void btnFSost1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFSost1MouseExited
        btnFSost1.setBackground(Color.white);
    }//GEN-LAST:event_btnFSost1MouseExited

    private void btnGSost1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGSost1MouseClicked
        btnGSost1.setBackground(Color.blue);
    }//GEN-LAST:event_btnGSost1MouseClicked

    private void btnGSost1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGSost1MouseExited
        btnGSost1.setBackground(Color.white);
    }//GEN-LAST:event_btnGSost1MouseExited

    private void btnASost1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnASost1MouseClicked
        btnASost1.setBackground(Color.blue);
    }//GEN-LAST:event_btnASost1MouseClicked

    private void btnASost1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnASost1MouseExited
        btnASost1.setBackground(Color.white);
    }//GEN-LAST:event_btnASost1MouseExited
   
    private void jbtncancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncancionActionPerformed
        //Iniciando
        simonDice = true;
        simonDiceJuego();
        
    }//GEN-LAST:event_jbtncancionActionPerformed

    private void simonDiceJuego(){
        //Variable global 
        String[] l = {"C0","D0","E0", "F0","G0" };
        String[] tecla = {"C0","D0","E0", "F0","G0" };
        Random r = new Random();
        int valorDado = r.nextInt(6);
        while (valorGlobal == valorDado){
            valorDado = r.nextInt(6);
        }
        
        switch(valorDado){
            case 0:
                btnC1.setBackground(Color.yellow);
                notaMusical="C1";
                valorGlobal =valorDado;
                break;
            case 1:
                btnD1.setBackground(Color.yellow);
                notaMusical="D1";
                valorGlobal =valorDado;
                break;
            case 2:
                btnE1.setBackground(Color.yellow);
                notaMusical="E1";
                valorGlobal =valorDado;
                break;
            case 3:
                btnF1.setBackground(Color.yellow);
                notaMusical="F1";
                valorGlobal =valorDado;
                break;    
            case 4:
                btnG1.setBackground(Color.yellow);
                notaMusical="G1";
                valorGlobal =valorDado;
                break;
            case 5:
                break;
        }
    }
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
    //Variables activos del juego
    private Boolean simonDice = false;
    private String notaMusical ="";
    private int valorGlobal = 99;
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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtncancion;
    // End of variables declaration//GEN-END:variables

    private void btnD1AceptarActionPerformed(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
