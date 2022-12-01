package proyecto_2_ed;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Proyecto_2_ED {

    public static void main(String[] args) {
            Scanner Teclado = new Scanner(System.in);
            
            Queue<String> Cajero1 = new LinkedList<String>();
            Cajero1.add("Juan");
            Cajero1.add("Sebastian");
            Cajero1.add("Pedro");
            System.out.println("El cajero 1 tiene a las siguientes personas:" + Cajero1);
            
            Queue<String> Cajero2 = new LinkedList<String>();
            Cajero2.add("Abril");
            Cajero2.add("Gabriel");
            Cajero2.add("Henry");
            Cajero2.add("Luis");
            
            System.out.println("El cajero 2 tiene a las siguientes personas:" + Cajero2);
            Queue<String> Cajero3 = new LinkedList<String>();
            Cajero3.add("Angel");
            Cajero3.add("Dayana");
            Cajero3.add("Ericka");
            Cajero3.add("Sara");
            Cajero3.add("Carlor");
            System.out.println("El cajero 3 tiene a las siguientes personas:" + Cajero3);
            
            Queue<String> Cajero4 = new LinkedList<String>();
            Cajero4.add("Fernanda");
            System.out.println("El cajero 4 tiene a las siguientes personas:" + Cajero4);
            
            System.out.println("El cajero con menos gente es el numero 4");
            System.out.println("Digite el nombre de la siguiente persona");
            String n = Teclado.next();
                Cajero4.add(n);
            System.out.println("La nueva cola del cajero 4 es: "+Cajero4);
            
            System.out.println("Los siguientes en salir de las colas son:");
            System.out.println(Cajero1.poll());
            System.out.println(Cajero2.poll());
            System.out.println(Cajero3.poll());
            System.out.println(Cajero4.poll());
            
            System.out.println("Las nuevas colas son: ");
            System.out.println(Cajero1);
            System.out.println(Cajero2);
            System.out.println(Cajero3);
            System.out.println(Cajero4);
            }
    }

