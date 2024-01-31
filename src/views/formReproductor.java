package views;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class formReproductor extends javax.swing.JFrame {

    public JProgressBar getjPprogressBar() {
        return jPprogressBar;
    }

    public void setjPprogressBar(JProgressBar lblProgressBar) {
        this.jPprogressBar = lblProgressBar;
    }

    public JSlider getJsVolumen() {
        return jsVolumen;
    }

    public void setJsVolumen(JSlider lblVolumen) {
        this.jsVolumen = lblVolumen;
    }
    
    public JLabel getLblFondo() {
        return lblFondo;
    }

    public void setLblFondo(JLabel lblFondo) {
        this.lblFondo = lblFondo;
    }
    
    public JLabel getLblAnterior() {
        return lblAnterior;
    }

    public void setLblAnterior(JLabel lblAnterior) {
        this.lblAnterior = lblAnterior;
    }

    public JLabel getLblCerrar1() {
        return lblCerrar1;
    }

    public void setLblCerrar1(JLabel lblCerrar1) {
        this.lblCerrar1 = lblCerrar1;
    }

    public JLabel getLblEcualizador() {
        return lblEcualizador;
    }

    public void setLblEcualizador(JLabel lblEcualizador) {
        this.lblEcualizador = lblEcualizador;
    }

    public JLabel getLblLista() {
        return lblLista;
    }

    public void setLblLista(JLabel lblLista) {
        this.lblLista = lblLista;
    }

    public JLabel getLblMinimizar() {
        return lblMinimizar;
    }

    public void setLblMinimizar(JLabel lblMinimizar) {
        this.lblMinimizar = lblMinimizar;
    }

    public JLabel getLblPause() {
        return lblPause;
    }

    public void setLblPause(JLabel lblPause) {
        this.lblPause = lblPause;
    }

    public JLabel getLblPlay() {
        return lblPlay;
    }

    public void setLblPlay(JLabel lblPlay) {
        this.lblPlay = lblPlay;
    }

    public JLabel getLblReiniciar() {
        return lblReiniciar;
    }

    public void setLblReiniciar(JLabel lblReiniciar) {
        this.lblReiniciar = lblReiniciar;
    }

    public JLabel getLblSiguiente() {
        return lblSiguiente;
    }

    public void setLblSiguiente(JLabel lblSiguiente) {
        this.lblSiguiente = lblSiguiente;
    }

    public JLabel getLblStop() {
        return lblStop;
    }

    public void setLblStop(JLabel lblStop) {
        this.lblStop = lblStop;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    
    
    
    
    
    public formReproductor() {
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

        lblPlay = new javax.swing.JLabel();
        lblPause = new javax.swing.JLabel();
        lblStop = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jPprogressBar = new javax.swing.JProgressBar();
        jsVolumen = new javax.swing.JSlider();
        lblEcualizador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLista = new javax.swing.JLabel();
        lblReiniciar = new javax.swing.JLabel();
        lblCerrar1 = new javax.swing.JLabel();
        lblAnterior = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblPlay);
        lblPlay.setBounds(350, 300, 110, 110);

        lblPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblPause);
        lblPause.setBounds(210, 330, 80, 80);

        lblStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblStop);
        lblStop.setBounds(510, 340, 70, 70);

        lblTitulo.setForeground(new java.awt.Color(0, 255, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("...");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(160, 20, 480, 30);

        jPprogressBar.setForeground(new java.awt.Color(102, 255, 255));
        jPprogressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jPprogressBar);
        jPprogressBar.setBounds(180, 260, 470, 20);

        jsVolumen.setForeground(new java.awt.Color(51, 255, 204));
        jsVolumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jsVolumen);
        jsVolumen.setBounds(620, 420, 200, 16);
        getContentPane().add(lblEcualizador);
        lblEcualizador.setBounds(180, 160, 470, 100);

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Volumen");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(700, 400, 70, 16);

        lblLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblLista);
        lblLista.setBounds(20, 20, 90, 30);

        lblReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblReiniciar);
        lblReiniciar.setBounds(30, 400, 50, 40);

        lblCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblCerrar1);
        lblCerrar1.setBounds(760, 10, 40, 50);

        lblAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblAnterior);
        lblAnterior.setBounds(30, 160, 90, 100);

        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblSiguiente);
        lblSiguiente.setBounds(700, 160, 90, 100);

        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblMinimizar);
        lblMinimizar.setBounds(680, 10, 50, 50);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Screenshot 2022-05-21 125613.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 830, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(formReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formReproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jPprogressBar;
    private javax.swing.JSlider jsVolumen;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblCerrar1;
    private javax.swing.JLabel lblEcualizador;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPause;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblReiniciar;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblStop;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}