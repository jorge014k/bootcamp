package com.example.bootcamp;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/transformar-a-codigo-morse/{texto}")

    public String primeraPrueba(@PathVariable String texto) {

        String[] tablaAbc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] tablaCodigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String codigoTransformar = "";
        for (int i = 0; i < texto.length(); i++) {
            String letraDeTexto = "" + texto.charAt(i);

            for (int j = 0; j < tablaAbc.length; j++) {
                String letraTablaAbc = tablaAbc[j];
                if (letraTablaAbc.equalsIgnoreCase(letraDeTexto)) {
                    String caracterEnCodigoMorse = tablaCodigoMorse[j];
                    codigoTransformar += " " + caracterEnCodigoMorse;
                    break; // Salir del bucle interior una vez que se ha encontrado la letra
                }
            }
        }

        return codigoTransformar;
    }


}
