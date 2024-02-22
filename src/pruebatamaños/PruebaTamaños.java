
package pruebatamaños;

import java.util.Scanner;

/**
 *
 * @author Santiago José Salgado López
 * 
 * Este código pide por consola alguno de los tipos primitivos de datos,
 * para luego imprimir el input del usuaria y el espacio que el tipo de dato ocupa en la memoria.
 * 
 */
public class PruebaTamaños {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un booleano para saber su tamaño en la memoria: ");
        boolean entradaBoolean = Boolean.parseBoolean(sc.next()); //Aquí convierto un string a un booleano.
        
        if (entradaBoolean == true){
            int tamañoBoolean = (1/8);
            System.out.println("El booleano que ingresó es " + entradaBoolean + " y este ocupa " + tamañoBoolean + " bytes en la memoria");
        }
        else if(entradaBoolean == false){
            long tamañoBoolean = (1/8);
            System.out.println("El booleano que ingresó es " + entradaBoolean + " y este ocupa " + tamañoBoolean + " bytes en la memoria");
        }
        else{
            System.out.println("Revisa tu entrada.");
        }

        
        System.out.println("Ingrese un caracter para saber su tamaño en la memoria: ");
        char entradaChar = sc.next().charAt(0);
        final int tamañoChar = Character.BYTES;
        System.out.println("El carácter que ingresó es " + entradaChar + " y este ocupa " + tamañoChar + " bytes en la memoria");
        
        System.out.println("Ingrese un byte para saber su tamaño en la memoria: ");
        byte entradaByte = sc.nextByte();
        final int tamañoByte = Byte.BYTES;
        System.out.println("El byte que ingresó es " + entradaByte + " y este ocupa " + tamañoByte + " bytes en la memoria");
        
        System.out.println("Ingrese un short para saber su tamaño en la memoria: ");
        short entradaShort = sc.nextByte();
        final int tamañoShort = Short.BYTES;
        System.out.println("El short que ingresó es " + entradaShort + " y este ocupa " + tamañoShort + " bytes en la memoria");
        
        System.out.println("Ingrese un número entero para saber su tamaño en la memoria: ");
        int entradaEntero = sc.nextInt();
        final int tamañoEntero = Integer.BYTES;
        System.out.println("El número que ingresó es " + entradaEntero + " y este ocupa " + tamañoEntero + " bytes en la memoria");
        
        System.out.println("Ingrese un long para saber su tamaño en la memoria: ");
        long entradaLong = sc.nextLong();
        final int tamañoLong = Long.BYTES;
        System.out.println("El número que ingresó es " + entradaLong + " y este ocupa " + tamañoLong + " bytes en la memoria");
        
        System.out.println("Ingrese un float para saber su tamaño en la memoria: ");
        float entradaFloat = sc.nextFloat();
        final int tamañoFloat = Float.BYTES;
        System.out.println("El número que ingresó es " + entradaFloat + " y este ocupa " + tamañoFloat + " bytes en la memoria");
        
        System.out.println("Ingrese un double para saber su tamaño en la memoria: ");
        double entradaDouble = sc.nextDouble();
        final int tamañoDouble = Double.BYTES;
        System.out.println("El número que ingresó es " + entradaDouble + " y este ocupa " + tamañoDouble + " bytes en la memoria");
        
    }
    
}
