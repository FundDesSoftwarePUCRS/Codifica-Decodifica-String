package Codificadores;

public class Codifica211010749 implements Codifica {

    @Override
    public String codifica(String str) {
        return "૮ ̷ ̷ ̷・"+ str + "ﻌ ̷ ̷・ ა";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(8, str.length() - 8);
    }

    @Override
    public String getMatriculaAutor() {
        return "21101074-9";
    }

    @Override
    public String getNomeAutor() {
        return "Lucca Bibiano";
    }
}