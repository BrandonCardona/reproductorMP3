package interfaz;

import views.*;
import mundo.*;


public class ReproductorMp3 {

   
    public static void main(String[] args) {
        
        //INSTANCIAS DE LOS JFRAME
        ListaCanciones lc = new ListaCanciones();
        formReproductor fp = new formReproductor();
        formLista fl = new formLista();
        formOpciones fo = new formOpciones();
        
        //INSTANCIAS DE LOS CONTROLADORES
        ControladorReproductor cR = new ControladorReproductor(fp,fl,lc,fo);
        ControladorLista cL = new ControladorLista(fl,lc,fo);
        ControladorOpciones cO = new ControladorOpciones(fp,fl,fo,lc);
        
        
        
        
        
    }
    
}
