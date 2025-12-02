public class TiendaLinea {
    public static void main(String[] args) {
        //Reto - Detalle de un producto de una tienda en linea
        /*Tienda en Línea (Detalle Producto)
        En el siguiente reto deben crear varias variables para almacenar el detalle de un producto de una tienda en línea.
        El detalle a almacenar del producto es el siguiente:
        Nombre del Producto
        Precio
        Cantidad Disponible
        Indicar si está disponible para venta
        Deben asignar valores de prueba a cada variable, escoger el nombre de cada variable aplicando las
        buenas prácticas, y mandar a imprimir el valor de cada variable.
        Finalmente deben modificar el valor de cada variable con nuevos datos
        y mandar a imprimir nuevamente el valor de cada variable y así comprobar que se
        modificaron correctamente los valores.*/

        //Detalle del producto
        System.out.println("***Tienda en linea (Detalle de un producto)***");
        String nombreProducto = "Jabon en polvo";
        float precioProducto = 10.5f;
        int cantidadDisponible = 20;
        boolean isDisponible = true;

        //Imprimir el detalle del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);

        //Modificar el detalle del producto
        nombreProducto = "Aceite";
        precioProducto = 15.6f;
        cantidadDisponible = 0;
        isDisponible = false;

        //Imprimir detalle del producto modificado
        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);

    }
}
