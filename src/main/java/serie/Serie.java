/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie;

/**
 *
 * @author nacho
 */


// declaracion de la clase: publica llamada serie
public class Serie {

    /**
     * @param args the command line arguments
     * 
     * 
     * Titulo, (Genero : accion , comedia, scifi, drama)
     * , sipnosis, numero de  temporadas, productor
     * 
     * 
     * 
     * 
     * 
     */
     // Atributos  de clase son los static 
    
    // los atributos de instacia los no static
   private String titulo;
   private String genero;
   private String sipnosis;
   private String productor;
   private int numeroTemporadas;
   private int numeroLikes;

    public Serie() {
        // los atributos quedan inicializados con valores por defecto
        // los objetos apuntan a null
        // numeros a cero
        // boolean a false
    }
// sin likes
    public Serie(String titulo, String genero, String sipnosis, String productor, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.productor = productor;
        this.numeroTemporadas = numeroTemporadas;
    }
 // con likes
    public Serie(String titulo, String genero, String sipnosis, String productor, int numeroTemporadas, int numeroLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.productor = productor;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroLikes = numeroLikes;
    }
    
    

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }
    
    
    

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sipnosis="
                + sipnosis + ", productor=" + productor + ", numeroTemporadas=" 
                + numeroTemporadas + ", numeroLikes=" + numeroLikes + '}';
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(int numeroLikes) {
        this.numeroLikes = numeroLikes;
    }

    
  public void darlike(){
  this.numeroLikes++;
  
  }
  
  
    
}
