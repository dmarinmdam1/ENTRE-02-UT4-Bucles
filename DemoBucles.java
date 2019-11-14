
/**
 * Esta clase cuenta con varios métodos que hacen uso de bucles
 * 
 *  @author Daniel Marín 
 */

import java.util.Random;

public class DemoBucles
{
    /** ------- Constantes ------- **/
    
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    
    /** ------- Atributos ------- **/
    
    private Random generador;
    
    /** ------- Constructor ------- **/

    /**
     * Constructor de la clase DemoBucles
     */
    
    public DemoBucles()
    {
        generador = new Random();
    }
    
    /** ------- Métodos varios ------- **/

    /**
     * Calcular la mayor potencia de 2 que es menor o igual a numero
     * Asumimos numero > 0
     * 
     * Si numero = 7 devuelve 4             numero = 8 devuelve 8
     *    numero = 19 devuelve 16           numero = 32 devuelve 32
     *    numero = 74 devuelve 64           numero = 1 devuelve 1
     *    numero = 190 devuelve 128
     *    
     *  Usa bucles while
     */
    
    public int mayorPotencia2(int numero)
    {
        int potenciaMaxima = 0;
        
        while(Math.pow(2, potenciaMaxima) <= numero)
        {
            potenciaMaxima++;
        }
        
        return (int) (Math.pow(2, potenciaMaxima - 1));
    }

    /**
     * Escribir numero como suma de potencias de 2 
     * tal como indica el enunciado (Se asume numero > 0)
     * 
     * Todos los valores se muestran en pantalla fomateados a 6 posiciones 
     * y ajustados a la derecha
     * 
     * Hay que usar el método anterior - 
     * Utiliza bucles while
     * 
     *  77 =    64     8     4     1
     * 215 =   128    64    16     4     2     1
     *  18 =    16     2
     *  64 =    64
     */
    
    public void escribirSumaPotencias(int numero)
    {
        int resto;
        
        System.out.printf("\n %3d =", numero); // Como luego los números que se van a utilizar van del 0 al 255,
                                               // alineo el número en si también y así queda más bonito :D
        
        while(numero >= 1)
        {
            resto = numero - mayorPotencia2(numero);
            
            System.out.printf("%6d", mayorPotencia2(numero));
            
            numero = resto;
        }
    }

    /**
     * Generar aleatorios entre 0 y 255
     * y escribir cada aleatorio como suma de potencias de 2
     * Parar al salir el 0 o despues de generar n aleatorios
     * (ver enunciado)
     * 
     * Hay que usar el método anterior
     * 
     * Utiliza bucles while
     * 
     */
    
    public void generarAleatorios(int n)
    {
        int contador = 0;
        int numeroGenerado = -1;
        
        System.out.print("\n Nºs aleatorios como suma de potencias de 2 \n");
        
        while(contador < n && numeroGenerado != 0)
        {
            contador++;
            
            numeroGenerado = generador.nextInt(255 + 1);
            
            if(numeroGenerado != 0)
            {
                escribirSumaPotencias(numeroGenerado);
            }
        }
        
        if(numeroGenerado == 0)
        {
            System.out.print("\n\n Bucle terminado porque se ha generado el 0");
        }
        else
        {
            System.out.printf("\n\n Bucle terminado porque se han generado %d aleatorios", n);
        }
    }

    /**
     *  Escribe en pantalla caracter n veces en la misma línes
     *  
     *  Usa bucles for
     */
    
    public void escribirCaracter(int n, char caracter)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(caracter);
        }
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    
    public  void mostrarEscalera(int escalones, int alto, int ancho)
    {
        for(int i = 1 ; i <= escalones ; i++)
        {
            for(int j = 1 ; j <= alto ; j++)
            {
                escribirCaracter((i - 1) * ancho, ' ');
                escribirCaracter(ancho, '*');
                
                System.out.print('\n'); // O también -> escribirCaracter(1, '\n');
            }
        }
    }

    /** ------- ------- ------- **/
}
