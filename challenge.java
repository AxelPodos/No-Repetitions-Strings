/*
Consigna
Escribí una función que reciba dos parámetros: un string S y un integer R.
La función debe devolver un string donde los caracteres consecutivos de S no se repitan más que R veces.
Tiene que devolver un string con el texto limpio y la cantidad de caracteres repetidos correcta.

Ejemplos:
Ej: "AAAAAFFFFOOOA", 2 => "AAFFOOA"
Ej: "111223333344", 1 => "1234"
Ej: "AABB", 1 => "AB"

tomas@kovix.com
*/

public class challenge {

    public static void main(String[] args) {
           
        String palabra1 = "AAAAAFFFFOOOA";
        String palabra2 = "111223333344";
        String palabra3 = "AABB";

        int num1 = 2;
        int num2 = 1;
        int num3 = 1;

        String nuevaPalabra = noRepetitions(palabra1, num1);  
        String nuevaPalabra2 = noRepetitions(palabra2, num2);  
        String nuevaPalabra3 = noRepetitions(palabra3, num3);  

        System.out.println(nuevaPalabra);   
        System.out.println(nuevaPalabra2);   
        System.out.println(nuevaPalabra3);   
    }

    private static String noRepetitions(String palabra, int limite) {
        
        String resultado = "";
        int contador = 1;

        for (int i = 0 ; i < palabra.length() ; i++) {
            
            char letra = palabra.charAt(i);

            if (i != palabra.length() -1) {

                char sigLetra = palabra.charAt(i+1);

                boolean distintos = Character.compare(letra, sigLetra) != 0;

                if (distintos) {
                    contador = 1;
                } else {
                    contador ++;
                }

                if (distintos || contador <= limite) {
                    resultado += letra;
                }

            } else {
                resultado += letra;
            }
        }

        return resultado;
    }

}
