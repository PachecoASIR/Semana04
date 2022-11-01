import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int n1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para ver si es menor que 10: ");
        n1=leer_entrada.nextInt();
        if(n1 < 10) {
            System.out.println("El número es menor que 10.");
            }
            else System.out.println("El número es mayor o igual que 10");
        }
    }