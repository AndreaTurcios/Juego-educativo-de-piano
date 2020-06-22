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
        lblTiempo.setEnabled(false);
        lblTiempo.setVisible(false);
        pnlResolver.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnReproducirExamen = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();
        pnlResolver = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblInc1 = new javax.swing.JLabel();
        lblCorr1 = new javax.swing.JLabel();
        cmbox1 = new javax.swing.JComboBox<>();
        lblInc2 = new javax.swing.JLabel();
        lblInc3 = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        btnRegreso = new javax.swing.JButton();
        lblTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

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
                .addGap(9, 9, 9)
                .addComponent(btnReproducirP1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        btnReproducirExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoandreat/play.png"))); // NOI18N
        btnReproducirExamen.setText("Reproducir");
        btnReproducirExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirExamenActionPerformed(evt);
            }
        });
        jPanel7.add(btnReproducirExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 37));

        btnComenzar.setText("Comenzar evaluación");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        jPanel7.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 190, 20));

        pnlResolver.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("¿Qué es un pentagrama?");

        jLabel19.setText("1. 5 líneas verticales donde se ubicarán las figuras rítmicas representando a una nota");

        jLabel20.setText("2. 5 líneas horizontales donde se ubicarán las figuras rítmicas representando a una nota");

        jButton1.setText("Revisión");

        lblInc1.setForeground(new java.awt.Color(255, 0, 0));
        lblInc1.setText("Incorrecto");

        lblCorr1.setForeground(new java.awt.Color(0, 153, 0));
        lblCorr1.setText("Correcto");

        cmbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        lblInc2.setForeground(new java.awt.Color(255, 0, 0));
        lblInc2.setText("Incorrecto");

        lblInc3.setForeground(new java.awt.Color(255, 0, 0));
        lblInc3.setText("Incorrecto");

        lblNota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNota.setText("Nota");

        javax.swing.GroupLayout pnlResolverLayout = new javax.swing.GroupLayout(pnlResolver);
        pnlResolver.setLayout(pnlResolverLayout);
        pnlResolverLayout.setHorizontalGroup(
            pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolverLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(cmbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResolverLayout.createSequentialGroup()
                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResolverLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(pnlResolverLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(35, 35, 35)
                        .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorr1)
                            .addComponent(lblInc1)
                            .addComponent(lblInc2)
                            .addComponent(lblInc3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResolverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNota)
                .addGap(31, 31, 31))
        );
        pnlResolverLayout.setVerticalGroup(
            pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblInc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblCorr1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInc3)
                .addGap(14, 14, 14)
                .addComponent(cmbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(lblNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel7.add(pnlResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 630, 430));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 148, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel6);

        jTabbedPane1.addTab("Examen", jScrollPane2);

        btnRegreso.setText("Regresar al menú");
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });

        lblTiempo.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTiempo)
                        .addGap(63, 63, 63))
                    .addComponent(btnRegreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnRegreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        lblTiempo.setVisible(true);
        lblTiempo.setEnabled(true);
    }//GEN-LAST:event_btnComenzarActionPerformed

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
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton btnReproducirExamen;
    private javax.swing.JButton btnReproducirExamen1;
    private javax.swing.JButton btnReproducirF;
    private javax.swing.JButton btnReproducirP1;
    private javax.swing.JButton btnReproducirP2;
    private javax.swing.JButton btnReproducirP3;
    private javax.swing.JComboBox<String> cmbox1;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCorr1;
    private javax.swing.JLabel lblInc1;
    private javax.swing.JLabel lblInc2;
    private javax.swing.JLabel lblInc3;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlResolver;
    // End of variables declaration//GEN-END:variables
}
