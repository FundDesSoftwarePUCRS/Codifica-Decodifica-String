package Codificadores;

import java.util.regex.Pattern;

public class Codifica21101429 implements Codifica {
    
    @Override
    public String getNomeAutor() {
        return "Pedro Gaspary";
    }

    @Override
    public String getMatriculaAutor() {
        return "21101429-5";
    }

    @Override
    public String codifica(String str) {
        String cifra = "";
        for(String letra : str.split("")) {
            if(Pattern.matches("[A-Z]", letra)) {
                letra = letra.toLowerCase();
            } else {
                letra = letra.toUpperCase();
            }
            cifra += letra;
        }
        return cifra;
    }

    @Override
    public String decodifica(String str) {
        String decod = "";
        for(String letra : str.split("")) {
            if(Pattern.matches("[A-Z]", letra)) {
                letra = letra.toLowerCase();
            } else {
                letra = letra.toUpperCase();
            }
            decod += letra;
        }
        return decod;
    }
}