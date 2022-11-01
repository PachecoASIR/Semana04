import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int n1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para ver si es par o impar: ");
        n1=leer_entrada.nextInt();
        if(n1 % 2 == 0) {
                System.out.println("El número es par.");
            }
            else System.out.println("El número es impar.");
        }
    }