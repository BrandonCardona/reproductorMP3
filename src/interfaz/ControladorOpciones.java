package interfaz;

import javax.swing.JOptionPane;
import TelematicoTools.FormMouse.formRoot;
import TelematicoTools.Platillos.DiscoAux;
import TelematicoTools.Platillos.DiscoOne;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import mundo.*;
import views.*;

public class ControladorOpciones implements MouseListener{
    
    private formReproductor fR;
    private formOpciones fO;
    private formLista fL;
    private ListaCanciones lc;
    private formRoot mouseMove= new formRoot();
    private DiscoOne d1 = new DiscoOne();

    public ControladorOpciones(formReproductor fR, formLista fL,formOpciones fO, ListaCanciones lc) {
        
        this.fO = fO;
        this.lc = lc;
        this.fL = fL;
        this.fR = fR;
        iniciar();
    }
    
    private void iniciar(){
        //EVENTOS
        this.fO.getLblAnadir().addMouseListener(this);
        this.fO.getLblEliminar().addMouseListener(this);
        this.fO.getLblAleatoria().addMouseListener(this);
        this.fO.getLblCerrarOpciones().addMouseListener(this);
       
        
        this.fO.setSize(677,333);
        this.fO.setLocationRelativeTo(null);
        
        mouseMove.MoverFrame(this.fO, this.fO.getLblOpciones());
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == this.fO.getLblCerrarOpciones()) {
        	
            this.fO.dispose();
            this.fL.getLblTotal().setText("0 <- Canciones");
            this.fL.setVisible(true);
        	// Aqui valide los metodos que se preguntaron 
            /*String nombreArtista = JOptionPane.showInputDialog("Ingrese el nombre del artista");
        	int cantidad = lc.cantCancionesInterpretaArtista(nombreArtista);
        	
        	JOptionPane.showMessageDialog(null, "El artista interpreta " + cantidad + " canciones");*/
        	/*
        	String nombreCancion = JOptionPane.showInputDialog("Ingrese el nombre de la cancion");
        	boolean cancionExiste = lc.estaCancionLista(nombreCancion);
        	
        	if(cancionExiste) {
        		JOptionPane.showMessageDialog(null, "La cancion esta en la lista");
        		
        	}else if(!cancionExiste) {
        		JOptionPane.showMessageDialog(null, "La cancion no esta en la lista");

        	}*/
        	
        } else if (e.getSource() == this.fO.getLblAleatoria()) {
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion de la canción que desea reproducir"));
            d1 = lc.reproducirCancionCualquierPosicion(posicion);

            if (d1 != null) {

                if (lc.getCancionActual() != null) {

                    fO.dispose();
                    fL.dispose();
                    d1 = lc.reproducirCancionActual();
                    fR.getLblTitulo().setText(lc.getCancionActual().getNombre());
                    d1.equalizador(this.fR.getLblEcualizador(), 1);
                    this.fR.getLblEcualizador().setVisible(true);
                    mouseMove.ControlProgress(this.fR.getjPprogressBar(), this.fR.getJsVolumen(), d1);
                    d1.getTimeRun(this.fR.getjPprogressBar());
                }
            } else {
                JOptionPane.showMessageDialog(null, "La posición no existe");
            }
         } else if (e.getSource() == this.fO.getLblAnadir()){
            
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la canción");
            String direccion = JOptionPane.showInputDialog("Introduzca la dirección de la cancion que desea agregar a la lista");
            String nombreArtista = JOptionPane.showInputDialog("Ingrese el nombre del artista de esa cancion");
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion en la cual desea agregar la canción"));
            
            if(posicion >= 0 && posicion <= lc.getContador()){
                lc.agregarCancionCualquierPosicion(nombre, direccion, posicion, nombreArtista);
                JOptionPane.showMessageDialog(null, "La cancion se ha agregado con exito\n"
                        + "Se reproducira la lista desde el comienzo");
            }else{
                JOptionPane.showMessageDialog(null, "La posicion ingresada no es valida");
            }
            
        } else if (e.getSource() == this.fO.getLblEliminar()) {

            int opcionEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea: \n"
                    + "1. Eliminar canción por el nombre\n"
                    + "2. Eliminar canción por el indice"));

            switch (opcionEliminar) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Introduzca el nombre de la canción");
                    boolean eliminado = lc.eliminarCancionCualquierPosicionNombre(nombre.toLowerCase());

                    if (eliminado) {
                        JOptionPane.showMessageDialog(null, "La cancion se ha eliminado\n"
                                + "Se reproducira la lista desde el comienzo");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ninguna cancion con ese nombre en la lista");
                    }
                    break;
                case 2:

                    int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion en la cual desea eliminar la canción"));

                    if (posicion >= 0 && posicion < lc.getContador()) {
                        lc.eliminarCancionCualquierPosicionNumero(posicion);
                        JOptionPane.showMessageDialog(null, "La cancion se ha eliminado con exito\n"
                                + "Se reproducira la lista desde el comienzo");
                    } else {
                        JOptionPane.showMessageDialog(null, "La posicion ingresada no es valida");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion ingresada no es valida");
                    break;
            }

        }
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
    
    
}
