package juegoandreat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;

public class FormPrincipal extends javax.swing.JFrame {
    private Timer t;
    private ActionListener ac;
    private int x=0;
public FormPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ac= new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
                x = x+1;
                barraprogreso1.setValue(x);
                if (barraprogreso1.getValue()==100) {
                dispose();
                t.stop();
                frmJuegoMain llamar = new frmJuegoMain();
        llamar.setVisible(true);
        llamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            }
        };
        t = new Timer(90,ac);
        t.start();
                }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraprogreso1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraprogreso1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        barraprogreso1.setBorder(null);
        getContentPane().add(barraprogreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 790, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Cargando...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoandreat/giff.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public class Principal extends JApplet {
 }
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraprogreso1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
                
