
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Navia F. <diogo.again@icloud.com>
 */
public class RedNeuronal_main
{

    static public double[] llenarEntradas()
    {
        double[] entrada={10,10,2,500,30,20};
        return entrada;
    }
    static public double[] llenarPesos()
    {
        double[] pesos = new double[6];
        for (int i = 0; i < pesos.length; i++) {
            pesos[i]=new Random().nextDouble();
        }
        return pesos;
    }
     static public void imprimirVector(String nombre,double[] vector)
     {
        System.out.println(nombre+" : ");
        for (int i = 0; i < vector.length; i++) {
             System.out.print("["+vector[i]+"]"); 
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        double[] entradas;
        double[] pesos;
        double salida;
        
        entradas=llenarEntradas();
        pesos=llenarPesos();
        imprimirVector("Entradas 1",entradas);
        /*  Entrenamiento 1*/
        Neurona neurona = new Neurona(entradas,pesos,500);
        imprimirVector("pesos main ", pesos);
        for (int i = 0; i < 10000; i++) {
            //System.out.println("Entrenamiento : "+neurona.Entrenamiento());
            neurona.Entrenamiento();
            //System.out.println("Verificar : "+neurona.verificar(entradas));
        }
        System.out.println(
                "Salida - entrenamiento 1 : "+neurona.Entrenamiento()
        );
        /*  Entrenamiento 2 */
        double[] nuevaEntrada={1,1,1,1,1,1};
        imprimirVector("Entrada 2",nuevaEntrada);
        neurona.setEntradas(nuevaEntrada);
        System.out.println(
                "Salida - Entrenamiento 2 : "+neurona.Entrenamiento()
        );

        /*  Entrenamiento 3 */
        nuevaEntrada[0]=5;
        nuevaEntrada[0]=10;
        nuevaEntrada[0]=2;
        nuevaEntrada[0]=3;
        nuevaEntrada[0]=0;
        nuevaEntrada[0]=11;
        imprimirVector("Entrada 3",nuevaEntrada);
        neurona.setEntradas(nuevaEntrada);
        System.out.println(
                "Salida - Entrenamiento 3 : "+neurona.Entrenamiento()
        );
        /* Comprobacion con la entrada 1 */
        imprimirVector("Entrada 1",entradas);
        neurona.setEntradas(entradas);
        System.out.println(
                "Salida - Entrenamiento 4 : "+neurona.Entrenamiento()
        );

        //System.out.println("Entrenamiento : "+neurona.Entrenamiento());
        // TODO code application logic here
    }
    
    
}
