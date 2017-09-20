/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel
 */
public class programa {
    public static void main(String[] args) {
        cuadrado cua = new cuadrado(34.78);
        System.out.println("El área del cuadrado es: " + cua.getArea());
        System.out.println("El perimetro del cuadrado es: " + cua.getPerimetro());

        rectangulo rectangulo = new rectangulo(34, 10);
        System.out.println("El área del rectangulo es: " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimetro());
    }
}

