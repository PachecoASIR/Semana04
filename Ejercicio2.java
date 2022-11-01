import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        String p1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra para ver si contiene b minúscula: ");
        p1=leer_entrada.nextLine();
        if(p1.contains("b")) {
            System.out.println("La palabra contiene la b.");
        }
        else System.out.println("La palabra no contiene la b.");

    }
}