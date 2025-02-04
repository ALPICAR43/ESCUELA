/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RETO_1;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class main {
    public static void main (String[] args){
        int op;
        float num1 , num2 ; 
        
        Scanner s = new Scanner (System.in);
        Calculadora cal = new Calculadora ();
        
        do {
            System.out.println("---Calculadora---"
                    + "\n1.-SUMA,"
                    + "\n2.-RESTA."
                    + "\n3.-MULTIPLICACION"
                    + "\n4.-DIVSION"
                    + "\n5.-MOD"
                    + "\n0.-SALIR");
            op = s.nextInt();
            
            switch  (op) {
                case 1 :
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat ();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();
                    
                    cal.suma(num1, num2);
                    System.out.println("la suma es "+ cal.suma);
                    break ; 
                case 2 : 
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat ();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();
                    
                    cal.resta(num1, num2);
                    System.out.println("la resta es "+ cal.resta);
                    
                    break ; 
                case 3 :
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat ();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();
                    
                    cal.Multiplicacion(num1, num2);
                    System.out.println("la multiplicacion es "+ cal.mult);
                    break ; 
                case 4 : 
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat ();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();
                    
                    cal.Division(num1, num2);
                    
                    break ; 
                case 5 : 
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat ();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();
                    
                    cal.Mood(num1, num2);
                    
                    break ; 
                default : 
                    System.out.println("ADIOS HASTA LUEGO :D");
        }
        
        }while (op !=0);
    }
    
    //@PROGRAMACION ATS
    //OSCAR ALFREDO PIÑON CARRASCO
}
