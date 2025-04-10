import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENÚ BANCO ---");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Mostrar articulo");
            System.out.println("3. Vender articulo");
            System.out.println("4. Eliminar articulo");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");

            if(!sc.hasNextInt()) {
                System.out.println("Error: Debe ingresar un numero entero");
                sc.nextLine();
                continue;
            }

            int opcion = sc.nextInt();
            sc.nextLine();

            if(opcion < 1 || opcion > 6) {
                System.out.println("Error: Opcion no valida. Ingrese un numero entre 1 y 6");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Desde ingresar articulos");
                    break;
                case 2:
                    System.out.println("Desde ver articulos");
                    break;
                case 3:
                    System.out.println("Desde vender articulos");
                    
                break;
                case 4:
                    System.out.println("Desde eliminar articulos");
                break;
                case 5:
                    System.out.println("👋 Saliendo del sistema...");
                    continuar = false;
                    break;
            }
        }
    }
}