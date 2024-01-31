package interfaz;
import mundo.*;
import TelematicoTools.FormMouse.formRoot;
import TelematicoTools.Platillos.DiscoAux;
import TelematicoTools.Platillos.DiscoOne;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import views.*;

public class ControladorLista implements MouseListener {
    //atributo
    private formOpciones fo;
    private formLista fL;
    private ListaCanciones lc;
    private formRoot mouseMove= new formRoot();
    private boolean mostrado;
    private DiscoOne d1 = new DiscoOne();
    private DefaultListModel lista = null;
    
    
    public ControladorLista(formLista fL, ListaCanciones lc, formOpciones fo)
    {
        this.fL = fL;
        this.lc = lc;
        this.fo = fo;
        mostrado = false;
        iniciar();
    }
    
    //constructor 
    
    private void iniciar(){
        //EVENTOS
        this.fL.getLblCerrar().addMouseListener(this);
        this.fL.getLblPC().addMouseListener(this);
        this.fL.getLblOpcionesLista().addMouseListener(this);
        
        limpiarJlist();
        
        this.fL.setSize(842,476);
        this.fL.setLocationRelativeTo(null);
        
        mouseMove.MoverFrame(this.fL, this.fL.getLblFondoLista());
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource() == this.fL.getLblCerrar())
        {
            this.fL.dispose();
            limpiarJlist();
        }
        else if (e.getSource() == this.fL.getLblPC())
        {
            if(!mostrado){
                mostrarListaCanciones();
                fL.getLblTotal().setText(lc.getContador() + " <- Canciones");
                mostrado = true;
            }else if(mostrado){
                limpiarJlist();
                fL.getLblTotal().setText("0 <- Canciones");
                mostrado = false;
            }
            
                        
            
        }
        else if ( e.getSource() == this.fL.getLblOpcionesLista())
        {
            this.fL.setVisible(false);
            this.fo.setVisible(true);
            limpiarJlist();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

     public DefaultListModel limpiarJlist(){
    
        DefaultListModel modelo = new DefaultListModel();
        this.fL.getLblList().setModel(modelo);
        return modelo;
    }    
    
     public void mostrarListaCanciones(){
        DefaultListModel modelo = (DefaultListModel) fL.getLblList().getModel();
        Cancion cancionInicial = lc.getCabeza();
        int i = 0;
        while(cancionInicial != null){
            modelo.addElement(i + " - "+cancionInicial.getNombre());
            cancionInicial = cancionInicial.getSiguiente();
            i++;
        }
     }
     
     
    
}