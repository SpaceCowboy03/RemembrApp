/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monticulos;

/**
 *
 * @author FranZixX
 */
public class Monticulo{
    
    int[] monticulo;
    int cantElementos;
    int tamaño;

    public Monticulo(int[] monticulo, int cantElementos, int tamaño){
        this.monticulo = monticulo;
        this.cantElementos = cantElementos;
        this.tamaño = tamaño;
    }
   
    public Monticulo (int cant, int max){
        monticulo = new int[max];
        cantElementos = cant;
        tamaño = max;
    }
   
    public boolean vacio(){
        if(cantElementos == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void meterValor(int elemento){
        if(this.cantElementos == this.tamaño){
            System.out.println("El montículo ya está lleno.");
        }else{
            this.cantElementos++;
            monticulo[this.cantElementos] = elemento;
            arriba(this.cantElementos);
        }
    }
    
    public int extractMax(){
 
        int element;
 
        if(this.cantElementos != 0){
            element = monticulo[1];
            monticulo[1] = monticulo[this.cantElementos];
            this.cantElementos--;
            abajo(1);
            return element;
        }
 
        return Integer.MAX_VALUE;
    }
    
    private void intercambiar(int element1, int element2){
        int cambio;
 
        cambio = monticulo[element1];
        monticulo[element1] = monticulo[element2];
        monticulo[element2] = cambio;
 
    }
    
    public void arriba(int elemento){
        while (elemento > 1 && monticulo[elemento/2] < monticulo[elemento]){
            intercambiar(elemento, elemento/2);
            elemento = elemento/2;
        }
    }
    
    public void abajo (int elemento){
        int hijoizq;
        int hijoder;
        int padre;
 
        do{
            hijoizq = 2*elemento;
            hijoder = (2*elemento)+1;
            padre = elemento;
 
            if(hijoder <= this.cantElementos && monticulo[hijoder] > monticulo[elemento]){
                elemento = hijoder;
            }
 
            if(hijoizq <= this.cantElementos && monticulo[hijoizq] > monticulo[elemento]){
                elemento = hijoizq;
            }
 
            intercambiar(padre, elemento);
            elemento = elemento/2;
        }while (padre == elemento);
        
    }
    
    public int getMax(){
        if (this.vacio()){
            System.out.println("El montículo está vacío.");
            return Integer.MAX_VALUE;
        }
        else{
            return monticulo[1];
        }
    }
   
    
   
   
   
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
