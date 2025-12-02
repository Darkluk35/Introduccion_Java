public class ReservaHotel {
    public static void main(String[] args) {
        /*Sistema de Reserva de Hoteles
        Se les deja realizar el siguiente reto: Capturar el detalle de la reservación de hoteles.
        El detalle que se debe capturar es:

        Nombre de Cliente
        Días de Estancia
        Tarifa Diaria
        Indicar si la habitación cuenta con vista al mar.

        Deben asignar valores iniciales y mandar a imprimir el valor de cada variable.
        Por último, se les pide modificar algunos valores de la reservación y mandar a imprimir nuevamente cada variable para observar los cambios.*/

        //Resuelto
        System.out.println("***Sistema de Reserva de Hoteles***");
        var nombreCliente = "Luis Gustavo De Jesus Lara";
        var diasEstancia = 30;
        final var TARIFA_DIARIA = 600.5f;
        var hasVistaMar = false;
        //Mostrar los detalles del cliente
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("TARIFA_DIARIA = " + TARIFA_DIARIA);
        System.out.println("hasVistaMar = " + hasVistaMar);
        //Modificacion de los detalles
        diasEstancia = 15;
        hasVistaMar = true;
        //Mostrar los detalles del cliente modificados
        System.out.println();
        System.out.println("Nuevos datos");
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("hasVistaMar = " + hasVistaMar);

    }
}
