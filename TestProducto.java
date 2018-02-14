
/**
 * Write a description of class TestProducto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestProducto
{
   public static void main ( String arg[] ){
       
       Producto p1, p2;
       p1 = new Producto(10);
       p2 = new Producto(5);
       
       System.out.println(" Producto p1 = " + p1.verValor());
       System.out.println(" Producto p2 = " + p2.verValor());
       
    }    
}
