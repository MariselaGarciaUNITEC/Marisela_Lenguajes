/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author T-102
 */
public class Prueba1 {
    
    public static void main(String[] args) {
        //probaremos los tipos de datos integrales 
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //Algunas de las siguientes lineas van a marcar error 
        b=(byte)s;
        
        s=b;
        
        i=s;
        
        l=s;
        
        s=(short)l;
        
        b=(byte)i;
        
        //Algo chistoso con los flotantes 
        float f=(float)2.0;
        double d=2.0;
        
        boolean b1=true;
        boolean b2=false;
        
        //Tipo caracter
        char algo='h';
        char otro=' ';
                
               
        
    }
}
