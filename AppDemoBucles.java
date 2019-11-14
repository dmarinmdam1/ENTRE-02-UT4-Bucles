
import java.util.Scanner;

/**
 *  @author Daniel Marín
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 */

public class AppDemoBucles
{
    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    
    /** ------- Método main ------- **/
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        DemoBucles demoBucles = new DemoBucles();
        
        int input;
        
        System.out.print("\n        Teclee tope de aleatorios a generar [10, 15]: ");
        input = teclado.nextInt();
        
        if(input < 10 || input > 15)
        {        
            do
            {
                System.out.print(" Error, teclee tope de aleatorios a generar [10, 15]: ");
                input = teclado.nextInt();
            }
            while(input < 10 || input > 15);
        }
        
        demoBucles.generarAleatorios(input);
        
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        demoBucles.mostrarEscalera(6, 4, 12);
    }
    
    /** ------- ------- ------- **/
}
