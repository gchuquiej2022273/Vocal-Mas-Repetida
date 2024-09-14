package org.vocalmasusada.main;

import org.vocalmasusada.main.controller.VocalMasUsada;

public class Main {
    public static void main(String[] args) {
        VocalMasUsada vocalMasUsada = new VocalMasUsada();
        String texto = "Hola buenos dias como estamos hoy";
        vocalMasUsada.encontrarVocalMasUsada(texto);
    }

}