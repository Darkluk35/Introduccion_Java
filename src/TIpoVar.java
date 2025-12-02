public class TIpoVar {
    public static void main(String[] args) {
        System.out.println("***Uso de var en java***");
        //Sin el uso de var
        String nombre1 = "Luis";
        System.out.println("nombre1 = " + nombre1);
        // COn el uso de var
        var nombre2 = "Araceli";
        System.out.println("nombre2 = " + nombre2);
        //Definir otras variables usando
        var edad = 30; //Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5f; //Se infiere tipo float
        var esCasado = false; //Se infiere tipo boolean
        esCasado = true;
        // esCasado = "No"; No podemos asignar un tipo distinto

        //Se debe definir su valor
        //var precio; esto lanza un error, tenemos que asignar un valor
        //precio = 10;

        //Se debe poner inferir el tipo de dato
        //var apellido = null; No se puede inferir el tipo de dato
    }
}
