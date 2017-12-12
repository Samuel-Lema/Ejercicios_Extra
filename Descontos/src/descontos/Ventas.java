package descontos;

public class Ventas {
   
    private double precio;
    private int unidades;
    
    public Ventas(double ventas, int unidades){
        
        this.precio = ventas;
        this.unidades = unidades;
    }
    
    public void setVentas(double ventas){
        
        this.precio = ventas;
    }
    public double getVentas(){
        
        return precio;
    }
    public void setUnidadades(int unidades){
        
        this.unidades = unidades;
    }
    public int getUnidades(){
        
        return unidades;
    }
    
    public String calcularPrecio(){
        
        int descuento = 0;
        double precioFinal = precio * unidades;
        
        if(unidades < 100){
            
            descuento = 0;
        } else if(unidades >= 100 & unidades < 200){
            if (precio > 4000) {
                
                descuento = 5;
            } else {
                
                descuento = 2;
            }
        } else if (unidades >= 200) {
            if (precio > 4000) {
                
                descuento = 10;
            } else {
                
                descuento = 8;
            }
        }
        
        return "Sin descuento: " + precioFinal + "\r\nDescuento: " + descuento + "%\r\nPrecio Final: " + (precioFinal - (precioFinal * 0.20));
    }
}