public class TIposDatos {
    public static void main(String[] args) {
        //Tipos de Datos en Java
        //Enteros (su valor por default es de 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 9876;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2132132121;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; //L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);
        
        //Punto Flotante (Valor default es 0.0)
        float tipoFloat = 3.14F; //F o f indicar que es tipo float (si solo dejamos el punto seria de tipo double)
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d es para indicar tipo double(se ocupa opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        //Character (valor por default = '\u0000')
        char tipoChar = 'A'; //Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Booleano (valor por default es el valor de false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object(Referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Luis Gustavo";
        System.out.println("nombre = " + nombre);
    }
}
