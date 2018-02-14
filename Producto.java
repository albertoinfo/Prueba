
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
public class Producto
{
    // instance variables - replace the example below with your own
    private int x;
    
    StringBuilder ejemplo;

    /**
     * Constructor for objects of class Producto
     */
    public Producto( int valorInicial )
    {
        // initialise instance variables
        x = valorInicial;
        ejemplo = new StringBuilder("Hola");
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int verValor (){
        return x;
    }
    
    public void incrementarValor(){
        x = x + 1;
    }    
    
    
    
    
    
    
    
}
