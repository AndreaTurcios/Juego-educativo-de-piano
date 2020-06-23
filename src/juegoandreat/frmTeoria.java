package juegoandreat;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import javax.swing.*;
import javax.swing.Timer;

public class frmTeoria extends javax.swing.JFrame {
private Timer t;
    private ActionListener ac;
    private int x=0;
    public frmTeoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblVidas.setEnabled(false);
        pnlResolver.setVisible(false);
        iconoMuerto.setVisible(false);
        btnNivel2.setVisible(false);
        //lblInc1.setVisible(false);
        //lblInc2.setVisible(false);
        //lblInc3.setVisible(false);
        //lblCorr1.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pregunta1 = new javax.swing.ButtonGroup();
        Pregunta2 = new javax.swing.ButtonGroup();
        Pregunta3 = new javax.swing.ButtonGroup();
        Pregunta4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        btnReproducirP2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        btnReproducirP1 = new javax.swing.JButton();
        btnReproducirP3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        btnReproducir1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        btnReproducir = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        btnReproducirF = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        btnReproducirExamen1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        pnlResolver = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rbOpc1 = new javax.swing.JRadioButton();
        rbOpc2 = new javax.swing.JRadioButton();
        rbOpc3 = new javax.swing.JRadioButton();
        rbOpc4 = new javax.swing.JRadioButton();
        lblInc1 = new javax.swing.JLabel();
        lblCorr1 = new javax.swing.JLabel();
        lblInc2 = new javax.swing.JLabel();
        lblInc3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        rbOpc5 = new javax.swing.JRadioButton();
        rbOpcC = new javax.swing.JRadioButton();
        lblInc4 = new javax.swing.JLabel();
        lblCorr2 = new javax.swing.JLabel();
        rbOpc7 = new javax.swing.JRadioButton();
        lblInc5 = new javax.swing.JLabel();
        rbOpcC1 = new javax.swing.JRadioButton();
        lblInc6 = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        btnRevision = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        rbOpc6 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        rbOpc8 = new javax.swing.JRadioButton();
        lblInc7 = new javax.swing.JLabel();
        lblInc8 = new javax.swing.JLabel();
        rbOpc9 = new javax.swing.JRadioButton();
        lblCorr3 = new javax.swing.JLabel();
        rbOpc10 = new javax.swing.JRadioButton();
        lblInc9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        rbOpc11 = new javax.swing.JRadioButton();
        rbOpc12 = new javax.swing.JRadioButton();
        lblInc10 = new javax.swing.JLabel();
        lblInc11 = new javax.swing.JLabel();
        rbOpc13 = new javax.swing.JRadioButton();
        lblCorr4 = new javax.swing.JLabel();
        rbOpc14 = new javax.swing.JRadioButton();
        lblInc12 = new javax.swing.JLabel();
        btnReproducirExamen = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();
        btnRegreso = new javax.swing.JButton();
        pnlLinea = new javax.swing.JPanel();
        lblTiempo1 = new javax.swing.JLabel();
        iconoMuerto = new javax.swing.JLabel();
        lblVidas = new javax.swing.JLabel();
        btnNivel2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        btnReproducirP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        btnReproducirP2.setText("Reproducir");
        btnReproducirP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirP2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musica.PNG"))); // NOI18N

        jLabel14.setText("El texto que se muestra a continuación, puede reproducirse al darle click al botón \"Reproducir\":");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel7))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(btnReproducirP2))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReproducirP2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jScrollPane4.setViewportView(jPanel12);

        jTabbedPane1.addTab("Musica", jScrollPane4);

        btnReproducirP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        btnReproducirP1.setText("Reproducir");
        btnReproducirP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirP1ActionPerformed(evt);
            }
        });

        btnReproducirP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        btnReproducirP3.setText("Reproducir");
        btnReproducirP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirP3ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejemplopentagrama.PNG"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pentagrama.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/partituraheyjude.PNG"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/introduccionpenta.PNG"))); // NOI18N

        jLabel15.setText("El texto que se muestra a continuación, puede reproducirse al darle click al botón \"Reproducir\":");

        jLabel16.setText("El texto que se muestra a continuación, puede reproducirse al darle click al botón \"Reproducir\":");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReproducirP3))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel10))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReproducirP1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel11))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel12)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReproducirP1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReproducirP3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(6, 6, 6))
        );

        jScrollPane5.setViewportView(jPanel10);

        jTabbedPane1.addTab("Pentagrama", jScrollPane5);

        btnReproducir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        btnReproducir1.setText("Reproducir");
        btnReproducir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducir1ActionPerformed(evt);
            }
        });

        jLabel21.setText("El texto que se muestra a continuación, puede reproducirse al darle click al botón \"Reproducir\":");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/velocidad.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(btnReproducir1)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel22)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReproducir1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel15);

        jTabbedPane1.addTab("Velocidad", jScrollPane3);

        btnReproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        btnReproducir.setText("Reproducir");
        btnReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notas.PNG"))); // NOI18N

        jLabel18.setText("El texto que se muestra a continuación, puede reproducirse al darle click al botón \"Reproducir\":");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(btnReproducir))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel18)
                .addGap(13, 13, 13)
                .addComponent(btnReproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel9);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Notas musicales", jPanel4);

        btnReproducirF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        btnReproducirF.setText("Reproducir");
        btnReproducirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirFActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuraritmica.PNG"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fig.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel9))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReproducirF)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReproducirF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel8);

        jTabbedPane1.addTab("Figuras ritmicas", jScrollPane6);

        btnReproducirExamen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoandreat/play.png"))); // NOI18N
        btnReproducirExamen1.setText("Reproducir");
        btnReproducirExamen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirExamen1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teoriaresumen.PNG"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resumen2.PNG"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoandreat/cc170c9e37a50172db721bbe592d716a.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clave-fa-notas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnReproducirExamen1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReproducirExamen1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jScrollPane8.setViewportView(jPanel11);

        jTabbedPane1.addTab("Repaso", jScrollPane8);

        jScrollPane2.setAutoscrolls(true);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlResolver.setBackground(new java.awt.Color(204, 204, 204));
        pnlResolver.setMinimumSize(new java.awt.Dimension(1002, 736));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("¿Qué es un pentagrama?");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("¿Cuál de las figuras que se muestra a continuación tiene asignado un tiempo incorrecto?");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregunta 1"));

        Pregunta1.add(rbOpc1);
        rbOpc1.setText("5 líneas verticales donde se ubicarán las figuras rítmicas representando a una nota");
        rbOpc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpc1MouseClicked(evt);
            }
        });
        rbOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpc1ActionPerformed(evt);
            }
        });

        Pregunta1.add(rbOpc2);
        rbOpc2.setText("5 líneas horizontales donde se ubicarán las figuras rítmicas representando a una nota");

        Pregunta1.add(rbOpc3);
        rbOpc3.setText("4 líneas donde se ubican las notas");

        Pregunta1.add(rbOpc4);
        rbOpc4.setText("Líneas consecutivas");

        lblInc1.setForeground(new java.awt.Color(255, 0, 0));
        lblInc1.setText("Incorrecto");

        lblCorr1.setForeground(new java.awt.Color(0, 153, 0));
        lblCorr1.setText("Correcto");

        lblInc2.setForeground(new java.awt.Color(255, 0, 0));
        lblInc2.setText("Incorrecto");

        lblInc3.setForeground(new java.awt.Color(255, 0, 0));
        lblInc3.setText("Incorrecto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rbOpc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(rbOpc3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(rbOpc2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(lblCorr1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(rbOpc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc1)))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc1)
                    .addComponent(lblInc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc2)
                    .addComponent(lblCorr1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc3)
                    .addComponent(lblInc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc4)
                    .addComponent(lblInc3)))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregunta 2"));

        Pregunta2.add(rbOpc5);
        rbOpc5.setText("Redonda - 4 tiempos");

        Pregunta2.add(rbOpcC);
        rbOpcC.setText("Blanca - 3 tiempos");

        lblInc4.setForeground(new java.awt.Color(255, 0, 0));
        lblInc4.setText("Incorrecto");

        lblCorr2.setForeground(new java.awt.Color(0, 153, 0));
        lblCorr2.setText("Correcto");

        Pregunta2.add(rbOpc7);
        rbOpc7.setText("Negra - 1 tiempo");

        lblInc5.setForeground(new java.awt.Color(255, 0, 0));
        lblInc5.setText("Incorrecto");

        Pregunta2.add(rbOpcC1);
        rbOpcC1.setText("Corchea - 1/2 tiempo");

        lblInc6.setForeground(new java.awt.Color(255, 0, 0));
        lblInc6.setText("Incorrecto");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rbOpc5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc4))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rbOpc7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc5))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rbOpcC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCorr2))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rbOpcC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc6)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc5)
                    .addComponent(lblInc4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc7)
                    .addComponent(lblInc5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcC)
                    .addComponent(lblCorr2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInc6)
                    .addComponent(rbOpcC1))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lblNota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNota.setText("Nota");

        btnRevision.setText("Revisión");
        btnRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisionActionPerformed(evt);
            }
        });

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregunta 3"));

        Pregunta3.add(rbOpc6);
        rbOpc6.setText("Mi (E)");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notaclave.PNG"))); // NOI18N

        Pregunta3.add(rbOpc8);
        rbOpc8.setText("Sol (G)");

        lblInc7.setForeground(new java.awt.Color(255, 0, 0));
        lblInc7.setText("Incorrecto");

        lblInc8.setForeground(new java.awt.Color(255, 0, 0));
        lblInc8.setText("Incorrecto");

        Pregunta3.add(rbOpc9);
        rbOpc9.setText("La (A)");

        lblCorr3.setForeground(new java.awt.Color(0, 153, 0));
        lblCorr3.setText("Correcto");

        Pregunta3.add(rbOpc10);
        rbOpc10.setText("Re (D)");

        lblInc9.setForeground(new java.awt.Color(255, 0, 0));
        lblInc9.setText("Incorrecto");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbOpc6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc7))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbOpc8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc8))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbOpc9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCorr3))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbOpc10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc9)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc6)
                    .addComponent(lblInc7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc8)
                    .addComponent(lblInc8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc9)
                    .addComponent(lblCorr3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc10)
                    .addComponent(lblInc9))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("¿Qué nota es la que se encuentra ubicada en el pentagrama?");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("¿Cuáles claves se utilizan en el piano?");

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregunta 4"));

        Pregunta4.add(rbOpc11);
        rbOpc11.setText("La clave de sol y la clave de fa");

        Pregunta4.add(rbOpc12);
        rbOpc12.setText("La clave de fa y la clave de do");

        lblInc10.setForeground(new java.awt.Color(255, 0, 0));
        lblInc10.setText("Incorrecto");

        lblInc11.setForeground(new java.awt.Color(255, 0, 0));
        lblInc11.setText("Incorrecto");

        Pregunta4.add(rbOpc13);
        rbOpc13.setText("La (A)");

        lblCorr4.setForeground(new java.awt.Color(0, 153, 0));
        lblCorr4.setText("Correcto");

        Pregunta4.add(rbOpc14);
        rbOpc14.setText("Re (D)");

        lblInc12.setForeground(new java.awt.Color(255, 0, 0));
        lblInc12.setText("Incorrecto");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(rbOpc14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInc12))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbOpc13)
                            .addComponent(rbOpc11)
                            .addComponent(rbOpc12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorr4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInc10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInc11, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(10, 10, 10))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc11)
                    .addComponent(lblCorr4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc12)
                    .addComponent(lblInc10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc13)
                    .addComponent(lblInc11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpc14)
                    .addComponent(lblInc12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlResolverLayout = new javax.swing.GroupLayout(pnlResolver);
        pnlResolver.setLayout(pnlResolverLayout);
        pnlResolverLayout.setHorizontalGroup(
            pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolverLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResolverLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlResolverLayout.createSequentialGroup()
                        .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addGroup(pnlResolverLayout.createSequentialGroup()
                                    .addComponent(btnRevision)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNota))
                                .addComponent(jLabel20)
                                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 430, Short.MAX_VALUE))))
        );
        pnlResolverLayout.setVerticalGroup(
            pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota)
                    .addComponent(btnRevision))
                .addGap(36, 36, 36))
        );

        jPanel5.getAccessibleContext().setAccessibleName("");

        jPanel7.add(pnlResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 670, 1300));

        btnReproducirExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoandreat/play.png"))); // NOI18N
        btnReproducirExamen.setText("Reproducir");
        btnReproducirExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirExamenActionPerformed(evt);
            }
        });
        jPanel7.add(btnReproducirExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        btnComenzar.setText("Comenzar evaluación");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        jPanel7.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 190, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 266, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel6);

        jTabbedPane1.addTab("Examen", jScrollPane2);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 687, 346));

        btnRegreso.setText("Regresar al menú");
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 147, -1));

        pnlLinea.setVerifyInputWhenFocusTarget(false);
        pnlLinea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(pnlLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 90, -1));

        lblTiempo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTiempo1.setText("Vidas:");
        jPanel3.add(lblTiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, 22));

        iconoMuerto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game_skull_head_skull_dead_die_death_icon_133746.png"))); // NOI18N
        iconoMuerto.setEnabled(false);
        jPanel3.add(iconoMuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 30, 30));

        lblVidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVidas.setText("3 ");
        jPanel3.add(lblVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, 22));

        btnNivel2.setText("Ir al siguiente nivel");
        jPanel3.add(btnNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
        Menu llamar = new Menu();
        llamar.setVisible(true);
        llamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnRegresoActionPerformed

    private void btnReproducirExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirExamenActionPerformed
        System.out.println("Audio");
        try {
            //String file = "src/juegoandreat/Notas/AUDIOS/EstefanyAudioFiguras.mp3";
            String file = "src/juegoandreat/Notas/AUDIOS/ExamenAndrea.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducirExamen.setEnabled(false);
        
    }//GEN-LAST:event_btnReproducirExamenActionPerformed

    private void btnReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirActionPerformed
        System.out.println("Audio");
        try {
            //String file = "src/juegoandreat/Notas/AUDIOS/EstefanyAudioFiguras.mp3";
            String file = "src/juegoandreat/Notas/AUDIOS/EdwinNotas.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducir.setEnabled(false);
    }//GEN-LAST:event_btnReproducirActionPerformed

    private void btnReproducirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirFActionPerformed
         System.out.println("Audio");
        try {
            String file = "src/juegoandreat/Notas/AUDIOS/EstefanyAudioFiguras.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducirF.setEnabled(false);
   
    }//GEN-LAST:event_btnReproducirFActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
    
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btnReproducirP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirP1ActionPerformed
    System.out.println("Audio");
        try {
            String file = "src/juegoandreat/Notas/AUDIOS/AudioAndreaPenta1.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducirP1.setEnabled(false);
    }//GEN-LAST:event_btnReproducirP1ActionPerformed

    private void btnReproducirExamen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirExamen1ActionPerformed
        System.out.println("Audio");
        try {
            String file = "src/juegoandreat/Notas/AUDIOS/AudioResumenAndrea.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducirExamen1.setEnabled(false);
    }//GEN-LAST:event_btnReproducirExamen1ActionPerformed

    private void btnReproducirP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirP2ActionPerformed
        System.out.println("Audio");
        try {
            String file = "src/juegoandreat/Notas/AUDIOS/MusicaAndrea.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducirP2.setEnabled(false);
    }//GEN-LAST:event_btnReproducirP2ActionPerformed

    private void btnReproducirP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirP3ActionPerformed
       System.out.println("Audio");
        try {
            String file = "src/juegoandreat/Notas/AUDIOS/AudioAndreaPenta2.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducirP3.setEnabled(false);
    }//GEN-LAST:event_btnReproducirP3ActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        pnlResolver.setVisible(true);
        lblVidas.setVisible(true);
        lblVidas.setEnabled(true);
    }//GEN-LAST:event_btnComenzarActionPerformed


    private void btnRevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisionActionPerformed
       int vidas = 3;
        lblInc1.setVisible(true);
        lblInc2.setVisible(true);
        lblInc3.setVisible(true);
        lblCorr1.setVisible(true);
        int nota=0;
        int notafinal=0;
        //pregunta 1
        if (rbOpc2.isSelected()==true) {
            System.out.println("Datos correctos");
            nota++;
        }else{
           System.out.println("Datos incorrectos");
           vidas--;
          }         
        //pregunta2
        if (rbOpcC.isSelected()==true) {
            System.out.println("Datos correctos");
            nota++;
        }else{
           System.out.println("Datos incorrectos");
           vidas--;
           
          }   
        //pregunta3
        if (rbOpc9.isSelected()==true) {
            System.out.println("Datos correctos");
            nota++;
        }else{
           System.out.println("Datos incorrectos");
           vidas--;
          } 
        //pregunta4
        if (rbOpc11.isSelected()==true) {
            System.out.println("Datos correctos");
            nota++;
        }else{
           System.out.println("Datos incorrectos");
           vidas--;
          } 
        //vidas
      String vidafinal= String.valueOf(vidas);
      lblVidas.setText(vidafinal);
      //no borrar esta parte nunca 
       String notaf = String.valueOf(nota);
       lblNota.setText(notaf);
        if (vidas<=0) {
            pnlLinea.setVisible(false);
            lblVidas.setText("Has muerto");
            iconoMuerto.setVisible(true);
        }
        //nota
        if (nota==10) {
            btnNivel2.setVisible(true);
        }
        //vidas mayor a 0
        //x=590
        //y=380
        //el height del panel linea es de 30
        //el width del panel linea es de 90
//        if (vidas==1) {
//            int hei = pnlLinea.getHeight();
//            int wi = pnlLinea.getWidth();
//            System.out.println("el height del panel linea es de "+hei);
//            System.out.println("el width del panel linea es de "+wi);
//            int heig = hei/3;
//            int wid = wi/3;
//            System.out.println("el height del panel linea / 3 es de "+heig);
//            System.out.println("el width del panel linea / 3 es de "+wid);
//            
//            lblLinea.setSize(0,0);
//        }
    }//GEN-LAST:event_btnRevisionActionPerformed

    private void rbOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpc1ActionPerformed
        
    }//GEN-LAST:event_rbOpc1ActionPerformed

    private void rbOpc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpc1MouseClicked
       
    }//GEN-LAST:event_rbOpc1MouseClicked

    private void btnReproducir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducir1ActionPerformed
           try {
            String file = "src/juegoandreat/Notas/AUDIOS/Edwin Velocidad.wav";
            InputStream in = new FileInputStream(file);
            AudioStream audioCsos1 = new AudioStream(in);
            AudioPlayer.player.start(audioCsos1);
        } catch (Exception e) {
            System.err.println("Audio" + e);
        }
        btnReproducir1.setEnabled(false);
   
    }//GEN-LAST:event_btnReproducir1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmTeoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTeoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTeoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTeoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTeoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Pregunta1;
    private javax.swing.ButtonGroup Pregunta2;
    private javax.swing.ButtonGroup Pregunta3;
    private javax.swing.ButtonGroup Pregunta4;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnNivel2;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton btnReproducir1;
    private javax.swing.JButton btnReproducirExamen;
    private javax.swing.JButton btnReproducirExamen1;
    private javax.swing.JButton btnReproducirF;
    private javax.swing.JButton btnReproducirP1;
    private javax.swing.JButton btnReproducirP2;
    private javax.swing.JButton btnReproducirP3;
    private javax.swing.JButton btnRevision;
    private javax.swing.JLabel iconoMuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCorr1;
    private javax.swing.JLabel lblCorr2;
    private javax.swing.JLabel lblCorr3;
    private javax.swing.JLabel lblCorr4;
    private javax.swing.JLabel lblInc1;
    private javax.swing.JLabel lblInc10;
    private javax.swing.JLabel lblInc11;
    private javax.swing.JLabel lblInc12;
    private javax.swing.JLabel lblInc2;
    private javax.swing.JLabel lblInc3;
    private javax.swing.JLabel lblInc4;
    private javax.swing.JLabel lblInc5;
    private javax.swing.JLabel lblInc6;
    private javax.swing.JLabel lblInc7;
    private javax.swing.JLabel lblInc8;
    private javax.swing.JLabel lblInc9;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTiempo1;
    private javax.swing.JLabel lblVidas;
    private javax.swing.JPanel pnlLinea;
    private javax.swing.JPanel pnlResolver;
    private javax.swing.JRadioButton rbOpc1;
    private javax.swing.JRadioButton rbOpc10;
    private javax.swing.JRadioButton rbOpc11;
    private javax.swing.JRadioButton rbOpc12;
    private javax.swing.JRadioButton rbOpc13;
    private javax.swing.JRadioButton rbOpc14;
    private javax.swing.JRadioButton rbOpc2;
    private javax.swing.JRadioButton rbOpc3;
    private javax.swing.JRadioButton rbOpc4;
    private javax.swing.JRadioButton rbOpc5;
    private javax.swing.JRadioButton rbOpc6;
    private javax.swing.JRadioButton rbOpc7;
    private javax.swing.JRadioButton rbOpc8;
    private javax.swing.JRadioButton rbOpc9;
    private javax.swing.JRadioButton rbOpcC;
    private javax.swing.JRadioButton rbOpcC1;
    // End of variables declaration//GEN-END:variables
}
