import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        String p1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un texto para ver si contiene b o v minúscula: ");
        p1=leer_entrada.nextLine();
        if (p1.contains("b") & (p1.contains("v"))) {
            if(p1.contains("p") & (p1.contains("u"))){
                System.out.println("La palabra contiene la b,v,p y la u.");
                }
                else if (p1.contains("p")) {
                    System.out.println("La palabra contiene la b,v y p.");
                }
                else if (p1.contains("u")) {
                    System.out.println("La palabra contiene la b,v y u.");
                }
                else System.out.println("La palabra contiene la b y la v pero no p ni u.");
            }
        else if(p1.contains("b")) {
            if(p1.contains("p")){
            System.out.println("La palabra contiene la b y la p.");
            }
            else { 
                System.out.println("La palabra contiene la b.");
            }
        }
        else if (p1.contains("v")) {
            if(p1.contains("u")){
                System.out.println("La palabra contiene la v y la u.");
                }
                else { 
                    System.out.println("La palabra contiene la v.");
                }
            }
        else System.out.println("La palabra no contiene la b ni la v.");
    }
}
