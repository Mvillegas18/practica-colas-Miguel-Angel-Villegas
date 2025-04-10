import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    public void ingresarArticulo (Queue<Articulo> articulos){
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Nombre de usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Cedula: ");
        String cedula = sc.nextLine();
        System.out.print("Referencia: ");
        String referencia = sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Precio: ");
        double precio = sc.nextDouble();
        System.out.println("Cantidad: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        articulos.offer(new Articulo(referencia, marca, precio, cantidad, nombre, cedula));

        System.out.println("Articulo guardado con exito");
        

        

    }

    public void venderArticulo (Queue<Articulo> articulos){
        Scanner sc = new Scanner(System.in);
        if(articulos.isEmpty()){
            System.out.println("La cola esta vacia");
            return;
        }

        System.out.println("De los siguientes articulos cual quieres vender: ");

        for (Articulo articulo : articulos) {
            System.out.println("Nombre de usuario " + articulo.getNombre() + " Referencia: "  + articulo.getReferencia());
        }

        System.out.println("Vende el articulo introduciendo su nombre: ");
        String nombreAVender = sc.nextLine();
        for (Articulo articulo : articulos) {
            if(articulo.getNombre().equalsIgnoreCase(nombreAVender)){
                articulos.remove(articulo);
                System.out.println("Se ha vendido exitosamente");
            }else{
                System.out.println("El articulo no se encuentra disponible");
                return;
            }
        }
    }

    public void eliminarArticulo (Queue<Articulo> articulos) {
        if(articulos.isEmpty()){
            System.out.println("No hay articulos a eliminar...");
            return;
        }


        Articulo articuloEliminado = articulos.poll();
        System.out.println("Articulo: " + articuloEliminado.getNombre() + " eliminado con exito");


    }
}
