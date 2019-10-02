
package ultimo;


public class Punto5 {
   
    private int cantidad;
    private double precio;
    private double iva;

    public Punto5() {
    }

    public Punto5(int cantidad, double precio, double iva) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
    }
    
    
 

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }
    
  
    
    
}
