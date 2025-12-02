public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = "Luis Gustavo"; //Correcto, y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Luis Gustavo 2"; //Correcto,pero no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-cliente = "Luis"; //Incorrecto
        String nombre_cliente = "Araceli"; //Correcto, pero no aplica las buenas practicas
        String _apellido = "Cruz"; //Correcto y aceptable
        String $apellido = "Vazquez"; // Correcto y aceptable
        int totPzs = 10; //Correcto, pero no aplica las buenas practicas
        int totalPiezas = 15; //Correcto y aceptable, aplica las buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; //Correcto, pero aun puede mejorar, aplica buenas practicas
        boolean isCasado = true; // Correcto, aplica las buenas practicas
        boolean tieneSaldo = true; //Correcto, aplica las buenas practicas pero aun puedo mejorar
        boolean hasSaldo = true; //Correcto, aplica las buenas practicas
    }
}
