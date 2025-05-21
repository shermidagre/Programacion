import java.util.ArrayList;

import java.util.List;


 class untilted {


    // Función para converter unha palabra en secuencias de n letras

    public static List<String> secuenciasDeNLetras(String palabra, int n) {

        List<String> secuencias = new ArrayList<>();


        // Iterar sobre a palabra para extraer as secuencias

        for (int i = 0; i <= palabra.length() - n; i++) {

            String secuencia = palabra.substring(i, i + n);

            secuencias.add(secuencia);

        }


        return secuencias;

    }


    // Función para ler o título e o contido dunha páxina web

    public static void analizaTexto(String texto) {

        // Separar o texto no primeiro salto de liña

        String[] partes = texto.split("\n", 2);


        // O título é a primeira parte

        String titulo = partes[0];


        // O contido é a segunda parte (se existe)

        String contido = partes.length > 1 ? partes[1] : "";


        // Crear o documento HTML

        String html = "<h1>" + titulo + "</h1>\n<p>" + contido + "</p>";


        // Imprimir o documento HTML

        System.out.println(html);

    }


    public static void main(String[] args) {

        // Exemplo de uso da función secuenciasDeNLetras

        List<String> resultado = secuenciasDeNLetras("cambio", 4);

        System.out.println("Secuencias de 4 letras: " + resultado);


        // Exemplo de uso da función analizaTexto

        String texto = "Título da páxina\nEste é o contido da páxina web.";

        analizaTexto(texto);

    }

}