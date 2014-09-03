/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbookpro
 */
public class Perceptron {
    private double[] entradas;
    private double[] pesos;
    private double[] salidas;

    public double[] getPesos() {
        return pesos;
    }

    public void setPesos(double[] pesos) {
        this.pesos = pesos;
    }
    
    

    public double[] getEntradas() {
        return entradas;
    }

    public void setEntradas(double[] entradas) {
        this.entradas = entradas;
    }
    
    
    public double [] Entrenamiento(){
        double yi = 0;
        int i=0;
        while(i<entradas.length){
            for (int j = 0; j < entradas.length; j++) {
                yi=yi+pesos[j]*entradas[j];
            }
            if(yi>=0){
                yi=1;
            }else{
                yi=-1;
            }
            if(yi==salidas[i]){
                
            }else{
                for (int j = 0; j < pesos.length; j++) {
                    pesos[j]=recalcularPeso(pesos[j],salidas[j],entradas[j]);
                }
                i=-1;
            }
           i++;
        }
        
        
        return pesos;
    }
    
    
    public double verificar(double[] entradas){
        double yi = 0;
        
        
        for (int i = 0; i <entradas.length; i++) {
            yi=yi+pesos[i]*entradas[i];
        }
        return yi;
    }
    
    public double recalcularPeso(double peso,double salida,double entrada){
        
        double nuevoPeso=peso+0.5*salida*entrada;
        return nuevoPeso;
    }
    
}
