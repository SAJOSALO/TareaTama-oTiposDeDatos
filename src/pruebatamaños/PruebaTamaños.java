
package pruebatamaños;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PruebaTamaños {
  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número entero para saber su tamaño en la memoria: ");
        int nuevoNumero = s.nextInt();
        final int tamañoBits = Integer.SIZE;
        byte nuevoByte = s.nextByte();
        System.out.println("El número que ingresó es " + nuevoByte + " y este ocupa " + tamañoBits + " bytes en la memoria");
        
        String input = s.nextLine();

        // Calcular el tamaño de la cadena en bytes
        byte[] bytes = input.getBytes();
        int sizeInBytes = bytes.length;

        // Mostrar el valor y el tamaño en memoria
        System.out.println("El valor introducido es: " + input);
        System.out.println("Tamaño en memoria: " + sizeInBytes + " bytes");
    }
    
}
