import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Articulo> cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();


        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENÚ BANCO ---");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Vender articulo");
            System.out.println("3. Eliminar articulo");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");

            if(!sc.hasNextInt()) {
                System.out.println("Error: Debe ingresar un numero entero");
                sc.nextLine();
                continue;
            }

            int opcion = sc.nextInt();
            sc.nextLine();

            if(opcion < 1 || opcion > 4) {
                System.out.println("Error: Opcion no valida. Ingrese un numero entre 1 y 4");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Agregar articulo ---");
                    metodos.ingresarArticulo(cola);
                    break;
                case 2:
                    System.out.println("\n--- Vender articulo ---");
                    metodos.venderArticulo(cola);
                    break;
                case 3:
                    System.out.println("Desde eliminar articulos");
                break;
                case 4:
                    System.out.println("👋 Saliendo del sistema...");
                    continuar = false;
                    break;
            }
        }
        sc.close();
    }
}