/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Licciardi
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
    }
    
    public static void suma(int a, int b){
    
    }
    public static void resta(int a, int b){
        int resultado;
        resultado = a - b;
        System.out.printf("La resta entre %d y %d es %d",a,b,resultado);
    }
    public static void multiplicacion(int a, int b){
        int resultado;
        resultado=a*b;
        System.out.println(a+"*"+b+"="+resultado);
    }
    public static void division(int a, int b){
    int div = a / b;
        System.out.println("El producto de la división es: " + div);
    }
    
}
