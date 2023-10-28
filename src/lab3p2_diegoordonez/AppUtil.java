package lab3p2_diegoordonez;

/**
 *
 * @author 50432
 */
public class AppUtil extends App {

    protected String categoria;

    public AppUtil(String categoria) {
        this.categoria = categoria;
    }

    public AppUtil(String categoria, String name, String dev, double price) {
        super(name, dev, price);
        this.categoria = categoria;
    }

    
    
    public AppUtil() {
    }

   

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return super.toString()+"categoria"+" "+categoria;
    }
    
    

}
