package mundo;

public class Cancion {
    
    
    private String nombre;
    private String direccion;
    private String nombreArtista;
    private Cancion siguiente;
    private Cancion anterior;
    
    
    
    public Cancion (String nombre, String direccion, String nombreArtista){
    
        this.nombre = nombre;
        this.direccion = direccion;
        this.nombreArtista = nombreArtista;
        siguiente = null;
        anterior = null;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public Cancion getSiguiente(){
        return siguiente;
    }
    
    public Cancion getAnterior(){
        return anterior;
    }
    
    public String getNombreArtista() {
    	return nombreArtista;
    }
    
    public void setSiguiente(Cancion siguiente){
        this.siguiente = siguiente;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setAnterior (Cancion anterior){
        this.anterior = anterior;
    }  
    
    public void setNombreArtista (String nombreArtista) {
    	this.nombreArtista = nombreArtista;
    }
    
    
}
