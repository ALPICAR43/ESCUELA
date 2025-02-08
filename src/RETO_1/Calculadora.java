/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RETO_1;

/**
 *
 * @author Oscar
 */
public class Calculadora {

    float suma, resta, mult;
    String resultado;

    public float suma(float a, float b) {
        suma = a + b;
        return suma;
    }

    public float resta(float a, float b) {
        resta = a - b;
        return resta;
    }

    public float Multiplicacion(float a, float b) {
        mult = a * b;
        return mult;
    }

    public void Division(float a, float b) {
        float div;
        if (b != 0) {
            div = a / b;
            System.out.println("La division es: " + div);

        } else {
            resultado = "Dato invalido B";
            System.out.println(resultado);
        }

    }

    public void Mood(float a, float b) {
        float mod;
        if (b != 0) {
            mod = a % b;
            System.out.println("El resultado final es: " + mod);
        } else {
            resultado = "Dato invalido B";
            System.out.println(resultado);

        }

    }
    //@PROGRAMACION ATS
    //OSCAR ALFREDO PIÑON CARRASCO

}
