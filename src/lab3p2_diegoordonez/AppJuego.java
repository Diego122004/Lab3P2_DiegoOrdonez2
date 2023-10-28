
package lab3p2_diegoordonez;


public class AppJuego extends App{
    protected int edadR;

    public AppJuego() {
    }

    public AppJuego(int edadR) {
        this.edadR = edadR;
    }

    public AppJuego(int edadR, String name, String dev, double price) {
        super(name, dev, price );
        this.edadR = edadR;
    }

    public void setEdadR(int edadR) {
        this.edadR = edadR;
    }

    public int getEdadR() {
        return edadR;
    }

    @Override
    public String toString() {
        return super.toString()+"La edad recomendada es"+" "+edadR;
    }

    
  


    
    
}
