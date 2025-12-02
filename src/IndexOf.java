public class IndexOf {
    public static void main(String[] args) {

        //Razonamiemnto y prediccion
        //String frase = "Java es genial";
        //System.out.println(frase.indexOf("Java"));
        //System.out.println(frase.indexOf("python"));
        //System.out.println(frase.indexOf("java"));
        //System.out.println(frase.indexOf('e'));
        //System.out.println(frase.indexOf("a", 7));

        //Logica secuencial
        //String data = "user:admin;pass:1234;role:user:admin;";
        //String target = "admin";
        //int primerAdmin = data.indexOf(target);
        //int segundoAdmin = data.indexOf(target,primerAdmin+1);
        //System.out.println("El segundo admin comienza desde el indice: " + segundoAdmin);


        //El bucle de la busqueda
        String frase = "El perro corrió por el orbe rojo";
        String buscar = "o";
        int contador = 0;
        int indice = frase.indexOf(buscar);
        while (indice != -1){
            contador++;
            indice = frase.indexOf(buscar,indice + 1);
        }
        System.out.println("La letra 'o' aparece " + contador + " veces");


    }
}
