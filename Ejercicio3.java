import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        String p1="Leche";
        String p2="Cacao";
        String p3="Avellanas";
        String p4="Azúcar";
        String p;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Disponemos de los siguientes productos: Leche - Cacao - Avellanas - Azúcar");
        System.out.println("Introduce el nombre de uno de ellos para ver su precio: ");
        p=leer_entrada.nextLine();
        if(p.equals(p1)) {
            System.out.println("El precio de la Leche es de 0.82$.");
            }
        else if (p.equals(p2)) {
            System.out.println("El precio del Cacao es de 4.45$.");
            }
        else if (p.equals(p3)){
            System.out.println("El precio de las Avellanas es de 3.99$.");
            }
        else if (p.equals(p4)){
            System.out.println("El precio del Azúcar es de 0.85$.");
            }
            else System.out.println("El producto no se encuentra en nuestro catálogo.");
        }
    }