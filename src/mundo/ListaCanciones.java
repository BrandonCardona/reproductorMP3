package mundo;

import TelematicoTools.Platillos.DiscoOne;

public class ListaCanciones {
    
    private DiscoOne d1 = new DiscoOne();
    private Cancion cancionActual;
    private Cancion cabeza;
    private Cancion ultimo;
    private int contador;
    
    public ListaCanciones(){
    
        cabeza = null;
        ultimo = null;
        cancionActual = cabeza;
        contador = 0;
    }
    
    
    public void agregarCancionFinal(String nombre, String direccion, String nombreArtista){
    
        Cancion nuevaCancion = new Cancion(nombre,direccion,nombreArtista);
        
        if(cabeza == null){
            cabeza = nuevaCancion;
            ultimo = cabeza;
            
        }else{
 
            ultimo.setSiguiente(nuevaCancion);
            nuevaCancion.setAnterior(ultimo);
            ultimo = nuevaCancion;
        }
        cancionActual = cabeza;
        contador++;
    }
    
    public void agregarCancionInicio(String nombre, String direccion, String nombreArtista){
        
        Cancion nuevaCancion = new Cancion(nombre, direccion, nombreArtista);
        
        if(cabeza == null){
            cabeza = nuevaCancion;
            ultimo = cabeza;
            
        }else{
            
            cabeza.setAnterior(nuevaCancion);
            nuevaCancion.setSiguiente(cabeza);
            cabeza = nuevaCancion;
        }
        cancionActual = cabeza;
        contador++;
    }
    
    public void agregarCancionCualquierPosicion(String nombre, String direccion, int posicion, String nombreArtista){
        
        Cancion nuevaCancion = new Cancion(nombre,direccion,nombreArtista);
        
        if(posicion == 0){
            agregarCancionInicio(nombre, direccion, nombreArtista);
            
        }else if(posicion == contador){
            agregarCancionFinal(nombre, direccion, nombreArtista);
            
        }else if(posicion > 0 && posicion < contador){
            
            Cancion cancionPresente = cabeza;
            Cancion cancionSiguiente = cancionPresente.getSiguiente();
            int i = 0;
            
            while(i < posicion - 1){
                
                cancionPresente = cancionSiguiente;
                cancionSiguiente = cancionPresente.getSiguiente();                
                i++;
            }
            nuevaCancion.setAnterior(cancionPresente);
            nuevaCancion.setSiguiente(cancionSiguiente);
            cancionPresente.setSiguiente(nuevaCancion);
            cancionSiguiente.setAnterior(nuevaCancion);
            contador++;
        }
        cancionActual = cabeza;
    }
    
    
    public void eliminarCancionFinal(){
    
        if(cabeza != null && cabeza.getSiguiente() != null){
            ultimo = ultimo.getAnterior();
            ultimo.setSiguiente(null);
            contador--;
        }else if(contador == 1){
            ultimo = null;
            cabeza = null;
            contador--;
        }
        cancionActual = cabeza;
    }
    
    public void eliminarCancionInicio(){
    
        if(cabeza != null && cabeza.getSiguiente() != null){
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
            contador--;
        }else if(contador == 1){
             cabeza = null;
             ultimo = null;
             contador--;
        }
        cancionActual = cabeza;
    }
    
    public void eliminarCancionCualquierPosicionNumero (int posicion){
    
        if(posicion == 0){
            eliminarCancionInicio();
            
        }else if(posicion == contador-1){
            eliminarCancionFinal();
            
        }else if(posicion > 0 && posicion < contador-1){
        
            Cancion cancionPresente = cabeza;
            Cancion cancionSiguiente = cabeza.getSiguiente();
            int i = 0;
            
            while (i < posicion-1){
                cancionPresente = cancionSiguiente;
                cancionSiguiente = cancionPresente.getSiguiente();
                i++;
            }
            
            cancionPresente.setSiguiente(cancionSiguiente.getSiguiente());
            cancionSiguiente.getSiguiente().setAnterior(cancionPresente);
            
            cancionSiguiente.setAnterior(null);
            cancionSiguiente.setSiguiente(null);
            contador--;
        }
        cancionActual = cabeza;
    }
    
    
    public boolean eliminarCancionCualquierPosicionNombre (String nombre){
    
        boolean eliminada = false;
        
        if(cabeza.getNombre().toLowerCase().equals(nombre)){
            eliminarCancionInicio();
            eliminada = true;
        }else if(ultimo.getNombre().toLowerCase().equals(nombre)){
            eliminarCancionFinal();
            eliminada = true;
        }else {
        
            Cancion cancionPresente = cabeza;
            Cancion cancionSiguiente = cabeza.getSiguiente();
            
            
            while (cabeza != null){
                
                if(cancionSiguiente.getNombre().toLowerCase().equals(nombre)){
                    cancionPresente.setSiguiente(cancionSiguiente.getSiguiente());
                    cancionSiguiente.getSiguiente().setAnterior(cancionPresente);
                    cancionSiguiente.setAnterior(null);
                    cancionSiguiente.setSiguiente(null);
                    eliminada = true;
                    contador--;
                    break;
                }else{
                    cancionPresente = cancionSiguiente;
                    cancionSiguiente = cancionPresente.getSiguiente();
                }
            }
            
        }
        cancionActual = cabeza;
        return eliminada;
    }
    
    
    public DiscoOne reproducirCancionCualquierPosicion(int posicion) {
        
        
        if(posicion == 0){
                
            cancionActual = cabeza;
            return reproducirCancionActual();
            
        }else if(posicion == contador -1){
            
            cancionActual = ultimo;
            return reproducirCancionActual();
            
        }else if (posicion > 0 && posicion < contador-1){
            
            Cancion cancionPresente = cabeza;
            int i = 0;
            
            while (i < posicion){
                cancionPresente = cancionPresente.getSiguiente();
                i++;
            }
            cancionActual = cancionPresente;
            return reproducirCancionActual();
        }else{
            return null;
        }
    }
    
    
    public DiscoOne reproducirCancionActual(){
        if(cancionActual != null){
            byte[] musica = d1.getBytes(cancionActual.getDireccion());
            d1.PlayMP3(musica);
            return d1;
        }else{
            return null;
        }
        
    }
    
    public DiscoOne pausarCancionActual(){
        if(cancionActual != null){
            d1.pause();
            return d1;
        }else{
            return null;
        }
    }
    
    
    public DiscoOne avanzarCancionSiguienteReproducirla(){
        
        if(cancionActual.getSiguiente() != null){
            cancionActual = cancionActual.getSiguiente();
            return reproducirCancionActual();
        }else{
            return null;
        }
        
    }
    
    public DiscoOne retrocederCancionAnteriorReproducirla(){
        
        if(cancionActual.getAnterior() != null){
            cancionActual = cancionActual.getAnterior();
            return reproducirCancionActual();
        }else{
            return null;
        }
        
    }
    
    public int cantCancionesInterpretaArtista(String nombreArtista) {
    	
    	nombreArtista = nombreArtista.toLowerCase();
    	
    	int cantidad = 0;
    	Cancion cancionPresente = cabeza;
    	
    	while(cancionPresente != null) {
    		
    		if(cancionPresente.getNombreArtista().toLowerCase().equals(nombreArtista)) {
    			cantidad++;
    		}
    		cancionPresente = cancionPresente.getSiguiente();
    	}
    	
    	
    	return cantidad;
    }
    
    public boolean estaCancionLista(String nombre) {
    	
    	nombre = nombre.toLowerCase();
    	
    	Cancion cancionPresente = cabeza;
    	
    	while(cancionPresente != null) {
    		
    		if(cancionPresente.getNombre().toLowerCase().equals(nombre)) {
    			
    			return true;
    		}
    		
    		cancionPresente = cancionPresente.getSiguiente();
    	}
    	return false;
    }
    
    
    
    public Cancion getCancionActual(){
        return cancionActual;
    }
    
    public int getContador(){
        return contador;
    }
    
    public Cancion getCabeza(){
        return cabeza;
    }
}
