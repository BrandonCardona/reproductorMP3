package views;

import javax.swing.JLabel;




public class formOpciones extends javax.swing.JFrame {

    public JLabel getLblOpciones() {
        return lblOpciones;
    }

    public void setLblOpciones(JLabel lblOpciones) {
        this.lblOpciones = lblOpciones;
    }
    
    public JLabel getLblAleatoria() {
        return lblAleatoria;
    }

    public void setLblAleatoria(JLabel lblAleatoria) {
        this.lblAleatoria = lblAleatoria;
    }

    public JLabel getLblAnadir() {
        return lblAnadir;
    }

    public void setLblAnadir(JLabel lblAnadir) {
        this.lblAnadir = lblAnadir;
    }

    public JLabel getLblCerrarOpciones() {
        return lblCerrarOpciones;
    }

    
    public void setLblCerrarOpciones(JLabel lblCerrarOpciones) {
        this.lblCerrarOpciones = lblCerrarOpciones;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }
    
    /**
     * Creates new form formOpciones
     */
    public formOpciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEliminar = new javax.swing.JLabel();
        lblAnadir = new javax.swing.JLabel();
        lblCerrarOpciones = new javax.swing.JLabel();
        lblAleatoria = new javax.swing.JLabel();
        lblOpciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblEliminar);
        lblEliminar.setBounds(250, 100, 110, 110);

        lblAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblAnadir);
        lblAnadir.setBounds(30, 100, 130, 120);

        lblCerrarOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblCerrarOpciones);
        lblCerrarOpciones.setBounds(600, 10, 70, 60);

        lblAleatoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblAleatoria);
        lblAleatoria.setBounds(500, 110, 110, 100);

        lblOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Interfaz_3.jpeg"))); // NOI18N
        getContentPane().add(lblOpciones);
        lblOpciones.setBounds(0, 0, 680, 330);

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
            java.util.logging.Logger.getLogger(formOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formOpciones().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAleatoria;
    private javax.swing.JLabel lblAnadir;
    private javax.swing.JLabel lblCerrarOpciones;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblOpciones;
    // End of variables declaration//GEN-END:variables
}


