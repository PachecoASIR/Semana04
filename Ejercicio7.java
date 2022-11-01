import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        String n1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto para ver si contiene un número de caracteres par o impar: ");
        n1=leer_entrada.nextLine();
        int l = n1.length();
        if(l % 2 == 0) {
                System.out.println("El número de caracteres es par.");
            }
            else System.out.println("El número de caracteres es impar.");
        }
    }