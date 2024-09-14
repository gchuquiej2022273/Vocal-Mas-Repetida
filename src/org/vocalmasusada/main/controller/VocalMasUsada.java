package org.vocalmasusada.main.controller;

public class VocalMasUsada {

    public void encontrarVocalMasUsada(String text) {
        char[] vocales = {'a', 'e','i','o','u'};
        int[] contador = new int[5];
        int vocalMayor = 0;

        for (int i =0;i<text.length(); i++){
            char caracter = text.charAt(i);
            for (int j=0;j<vocales.length;j++){
                if (caracter == vocales[j]){
                    contador[j]++;
                }
            }
        }

        for (int i=0; i<contador.length; i++){
            if (contador[i] > contador[vocalMayor]){
                vocalMayor = i;
            }
        }

        System.out.println("La vocal mas frecuente es: "+ vocales[vocalMayor]);
    }
}