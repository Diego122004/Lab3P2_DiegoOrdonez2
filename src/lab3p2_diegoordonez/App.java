
package lab3p2_diegoordonez;


public class App {
    protected String nombre;
    protected String desarollador;
    protected double precio;
    protected boolean estado;
    protected double rating;
    protected int descargas;
    
    public App(){
    }

    public App(String name, String dev, double price ) {
        this.nombre = name;
        this.desarollador = dev;
        this.precio = price;
      
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public void setDesarollador(String desarollador) {
        this.desarollador = desarollador;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    public String getName() {
        return nombre;
    }

    public String getDesarollador() {
        return desarollador;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getRating() {
        return rating;
    }

    public int getDescargas() {
        return descargas;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
}
