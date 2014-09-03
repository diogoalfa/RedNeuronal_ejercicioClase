
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbookpro
 */
public class RedNeuronal_main {

    /**
     * @return 
     */
    static public double[] llenarEntradas(){
        double[] entrada={10,10,2,500,30,20};
        return entrada;
    }
    static public double[] llenarPesos(){
        double[] pesos = new double[6];
        for (int i = 0; i < pesos.length; i++) {
            pesos[i]=new Random().nextDouble();
        }
        return pesos;
    }
     static public void imprimirVector(String nombre,double[] vector){
        System.out.println(nombre+" : ");
        for (int i = 0; i < vector.length; i++) {
             System.out.print("["+vector[i]+"]"); 
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        double[] entradas;
        double[] pesos;
        double salida;
        
        entradas=llenarEntradas();
        pesos=llenarPesos();
        
        Neurona neurona=new Neurona(entradas,pesos,500);
        imprimirVector("pesos main ", pesos);
        
        imprimirVector("entradas", entradas);
        for (int i = 0; i < 1000; i++) {
            System.err.println("Entrenamiento : "+neurona.Entrenamiento());
            //System.out.println("Verificar : "+neurona.verificar(entradas));
        }
        
        double[] nuevaEntrada={1,1,1,1,1,1};
        neurona.setEntradas(nuevaEntrada);
        System.err.println("Comparacion 1 : "+neurona.Entrenamiento());
        
        nuevaEntrada[0]=5;
        nuevaEntrada[0]=10;
        nuevaEntrada[0]=2;
        nuevaEntrada[0]=3;
        nuevaEntrada[0]=0;
        nuevaEntrada[0]=11;
        neurona.setEntradas(nuevaEntrada);
        System.err.println("Comparacion 2 : "+neurona.Entrenamiento());
        //System.out.println("Entrenamiento : "+neurona.Entrenamiento());
        // TODO code application logic here
    }
    
    
}
