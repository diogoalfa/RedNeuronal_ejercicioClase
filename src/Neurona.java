/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbookpro
 */
public class Neurona {
    private double[] entradas;
    private double[] pesos;
    private double salida;

    public Neurona(double[] entradas, double[] pesos, double salida) {
        this.entradas = entradas;
        this.pesos = pesos;
        this.salida = salida;
    }
    
    

    public double[] getEntradas() {
        return entradas;
    }

    public void setEntradas(double[] entradas) {
        this.entradas = entradas;
    }

    public double[] getPesos() {
        return pesos;
    }

    public void setPesos(double[] pesos) {
        this.pesos = pesos;
    }

    public double getSalida() {
        return salida;
    }

    public void setSalida(double salida) {
        this.salida = salida;
    }
    
    public void imprimirVector(String nombre,double[] vector){
        System.out.println(nombre+" : ");
        for (int i = 0; i < vector.length; i++) {
             System.out.print("["+vector[i]+"]"); 
        }
        System.out.println("");
    }
    
    public double Entrenamiento(){
         double y0=0;
         double y1=0;
         double y2=0;
         double y3=0;
         double y4=0;
         int i=0;
         //imprimirVector("pesos entrenamiento ",pesos);
        // while(i<entradas.length){
//             for (int j = 0; j < entradas.length; j++) {
//                 yi=yi+pesos[j]*entradas[j];
//             }
             y0=(pesos[0]*entradas[0])/(pesos[1]*entradas[1]);
             //System.out.println("y0 antes :"+y0);
             y1=(pesos[3]*entradas[3])+(pesos[5]*entradas[5]);
             //System.out.println("y1 antes :"+y1);
             y2=(pesos[5]*entradas[5])+y1;
             //System.out.println("y2 antes :"+y2);
             y3=(pesos[2]*entradas[2])*y2;
             //System.out.println("y3 antes :"+y3);
             y4=y0*y3;
             y0=y4;
            // System.out.println("y0 :"+y0);
             if (y0 >= 0) {
                 //y0=1;
             } else {
                //y0=-1;
             }
             if (y0 == salida) {

             } else {
                 for (int j = 0; j < pesos.length; j++) {
                     pesos[j]=recalcularPeso(pesos[j],salida,entradas[j]);
                    
                 }
                 //imprimirVector("pesos ajustados ", pesos);
                 //i--;
             }
           // i++;
         //}
        return y0;
    }
    
    public double recalcularPeso(double peso,double salida,double entrada){
        
        double nuevoPeso=peso+0.5*salida*entrada;
        return nuevoPeso;
    }
    
    public double verificar(double[] entradas){
        double yi = 0;

        for (int i = 0; i <entradas.length; i++) {
            yi=yi+pesos[i]*entradas[i];
        }
        return yi;
    }
}
