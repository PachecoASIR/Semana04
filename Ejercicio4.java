import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String p1="Triangulo";
        String p2="Rectangulo";
        String p3="Pentagono";
        String p4="Hexagono";
        String p;
        int n1;
        int n2;
        double resultado;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Intruduce una de las siguientes formas geométricas para calcular el área de una de ellas: Triangulo - Rectangulo - Pentagono - Hexagono");
        System.out.println("Introduce el nombre de uno de ellos para calcular su área: ");
        p=leer_entrada.nextLine();
        if(p.equals(p1)) {
            System.out.println("Introduce un valor para la base: ");
            n1=leer_entrada.nextInt();
            System.out.println("Introduce un valor para la altura: ");
            n2=leer_entrada.nextInt();
            resultado= (float)(n1 * n2)/2;
            System.out.println("El área del triángulo es: " + resultado);
            }
        else if (p.equals(p2)) {
            System.out.println("Introduce un valor para la base: ");
            n1=leer_entrada.nextInt();
            System.out.println("Introduce un valor para la altura: ");
            n2=leer_entrada.nextInt();
            resultado= 1.72 * n2;
            System.out.println("El área del rectángulo es: " + resultado);
            }
        else if (p.equals(p3)){
            System.out.println("Introduce un valor para el lado: ");
            n1=leer_entrada.nextInt();
            double l2 = Math.pow(n1, 2);
            resultado= 1.72 * l2;
            System.out.println("El área del pentágono es: " + resultado);
            }
        else if (p.equals(p4)){
            System.out.println("Introduce un valor para el lado: ");
            n1=leer_entrada.nextInt();
            int c = n1/2;
            int d = n1 * 6;
            double c2 = Math.pow(c, 2);
            double c3 = Math.pow(n1, 2);
            double c4 = c3 - c2;
            double x = Math.sqrt(c4);
            resultado= (float)(x * d)/2;
            System.out.println("El área del hexágono es: " + resultado);
            }
            else System.out.println("La figura no se corresponde con ninguna de las que se muestran por pantalla.");
        }
    }