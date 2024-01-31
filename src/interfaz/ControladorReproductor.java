package interfaz;

import TelematicoTools.FormMouse.formRoot;
import TelematicoTools.Platillos.DiscoOne;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import views.formLista;
import views.formReproductor;
import mundo.*;
import views.formOpciones;
public class ControladorReproductor implements MouseListener{
    
    
    //atributo
    private formReproductor fR;
    private formLista fL;
    private formOpciones fo;
    private ListaCanciones lc;
    private DiscoOne d1 = new DiscoOne();
    private int repetir;
    private boolean pausado;
    private formRoot mouseMove= new formRoot();
    private int cantidadCanciones;
    
    //constructor
    
    public ControladorReproductor(formReproductor fR, formLista fL, ListaCanciones lc, formOpciones fo){  // se recibe como parametro el formulario del reproductor
        this.fR = fR;
        this.fL = fL;
        this.lc = lc;
        this.fo = fo;
        pausado = false;
        cantidadCanciones = lc.getContador();
        iniciar();
    }

    
   private void iniciar(){
       
        // Se agregan unas canciones iniciales con la direccion (Es posible que se deba modificar la direccion 
        // y las canciones se encuentran en una capeta dentro del mismo proyecto)
        agregarCancionesIniciales();  
       
        //EVENTOS
        this.fR.getLblCerrar1().addMouseListener(this);
        this.fR.getLblMinimizar().addMouseListener(this);
        this.fR.getLblLista().addMouseListener(this);
        this.fR.getLblPlay().addMouseListener(this);
        this.fR.getLblPause().addMouseListener(this);
        this.fR.getLblStop().addMouseListener(this);
        this.fR.getLblReiniciar().addMouseListener(this);
        this.fR.getLblAnterior().addMouseListener(this);
        this.fR.getLblSiguiente().addMouseListener(this);
         
       
        //form
        this.fR.setSize( 830,461);
        this.fR.setVisible(true);
        this.fR.setLocationRelativeTo(null);
        mouseMove.MoverFrame(this.fR, this.fR.getLblFondo());
        
       
   }

    @Override
    public void mouseClicked(MouseEvent e) {
       }

    @Override
    public void mousePressed(MouseEvent e) {
      }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource() == this.fR.getLblCerrar1()){
            System.exit(0);
        }
        
        else if (e.getSource() == this.fR.getLblMinimizar()){
            this.fR.setExtendedState(1);
        }
        
        else if ( e.getSource() == this.fR.getLblLista())
        {
            this.fL.setVisible(true);
        }
        
        else if (e.getSource() == this.fR.getLblPlay()) {

            if (cantidadCanciones == lc.getContador()) {
                if (lc.getCancionActual() != null) {
                    fR.getLblTitulo().setText(lc.getCancionActual().getNombre());
                }

                if (!pausado && lc.getCancionActual() != null) {
                    d1 = lc.reproducirCancionActual();
                    if (d1 != null) {
                        d1.equalizador(this.fR.getLblEcualizador(), 1);
                        this.fR.getLblEcualizador().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay canciones para reproducir en la lista");
                    }
                    mouseMove.ControlProgress(this.fR.getjPprogressBar(), this.fR.getJsVolumen(), d1);
                    d1.getTimeRun(this.fR.getjPprogressBar());
                } else if (pausado && lc.getCancionActual() != null) {
                    d1.continuar();
                }
            } else {
                if (lc.getCancionActual() != null) {
                    fR.getLblTitulo().setText(lc.getCancionActual().getNombre());
                }
                d1 = lc.reproducirCancionActual();
                if (d1 != null) {
                    d1.equalizador(this.fR.getLblEcualizador(), 1);
                    this.fR.getLblEcualizador().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay canciones para reproducir en la lista");
                }
                mouseMove.ControlProgress(this.fR.getjPprogressBar(), this.fR.getJsVolumen(), d1);
                d1.getTimeRun(this.fR.getjPprogressBar());
                cantidadCanciones = lc.getContador();
            }

        }
        
        else if (e.getSource() == this.fR.getLblPause())
        {
            d1 = lc.pausarCancionActual();
            this.fR.getLblEcualizador().setVisible(false);
            pausado = true;
        }
        
        else if (e.getSource() == this.fR.getLblStop())
        {
            d1.stop();
            this.fR.getLblEcualizador().setVisible(false);
        }
        
        else if (e.getSource() == this.fR.getLblReiniciar())
        {
            d1 = lc.reproducirCancionActual();
            if(d1 != null){
                d1.equalizador(this.fR.getLblEcualizador(), 1);
                this.fR.getLblEcualizador().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "No hay canciones para reproducir el la lista");
            }
            mouseMove.ControlProgress(this.fR.getjPprogressBar(), this.fR.getJsVolumen(), d1);
            d1.getTimeRun(this.fR.getjPprogressBar()); 
        }
        
        else if (e.getSource() == this.fR.getLblSiguiente()){
            if(lc.getCancionActual().getSiguiente() != null){
                d1= lc.avanzarCancionSiguienteReproducirla();
            }else{
                JOptionPane.showMessageDialog(null, "No hay mas canciones para reproducir el la lista");
            }
            
            if(lc.getCancionActual() != null){
                fR.getLblTitulo().setText(lc.getCancionActual().getNombre());
            }
            if(d1 != null){
                d1.equalizador(this.fR.getLblEcualizador(), 1);
                this.fR.getLblEcualizador().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "No hay mas canciones para reproducir el la lista");
            }
            mouseMove.ControlProgress(this.fR.getjPprogressBar(), this.fR.getJsVolumen(), d1);
            d1.getTimeRun(this.fR.getjPprogressBar());
        }
        
        else if(e.getSource() == this.fR.getLblAnterior()){
            
            
            if(lc.getCancionActual().getNombre().equals(lc.getCabeza().getNombre())){
                JOptionPane.showMessageDialog(null, "No hay mas canciones para reproducir el la lista");
            }else{
            
            if(lc.getCancionActual().getAnterior() != null){
                d1= lc.retrocederCancionAnteriorReproducirla();
            }else{
                JOptionPane.showMessageDialog(null, "No hay mas canciones para reproducir el la lista");
            }
            
            if(lc.getCancionActual() != null){
                fR.getLblTitulo().setText(lc.getCancionActual().getNombre());
            }
            if(d1 != null){
                d1.equalizador(this.fR.getLblEcualizador(), 1);
                this.fR.getLblEcualizador().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "No hay mas canciones para reproducir el la lista");
            }
            mouseMove.ControlProgress(this.fR.getjPprogressBar(), this.fR.getJsVolumen(), d1);
            d1.getTimeRun(this.fR.getjPprogressBar());
            }
        }
        
        
    }
    
    public void agregarCancionesIniciales(){
        
        
        String direccion = "C:\\Users\\User\\OneDrive - Universidad Cooperativa de Colombia\\Desktop\\SEMESTRE 2\\Herramientas Computacionales\\ProyectoFinalMP3_EstructuradeDatos\\Canciones";
        lc.agregarCancionCualquierPosicion("Si te dejas llevar", direccion + "\\Si te dejas llevar.mp3", 0, "Nombre1");
        lc.agregarCancionCualquierPosicion("La noche mas linda", direccion + "\\La noche mas linda.mp3", 1,  "Nombre1");
        lc.agregarCancionCualquierPosicion("Jordan", direccion + "\\Jordan.mp3", 2,  "JUAN");
        lc.agregarCancionCualquierPosicion("Colapso", direccion + "\\Colapso.mp3", 3 , "Nombre1");
        lc.agregarCancionCualquierPosicion("Fuentes de Ortiz", direccion + "\\Fuentes de Ortiz.mp3", 4, "JUAN");
        lc.agregarCancionCualquierPosicion("Call me - Slowed", direccion + "\\call me.mp3", 5 , "");
        lc.agregarCancionCualquierPosicion("After Dark", direccion + "\\afterDark.mp3", 6 , "JUAN");
        lc.agregarCancionCualquierPosicion("Its you", direccion + "\\Its you.mp3", 7,  "JUAN");
        
         
    }
    
    
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
    
}
