package Codificadores;

public class Codifica211010749 implements Codifica {

    @Override
    public String codifica(String str) {
        return "૮ ̷ ̷ ̷・ "+ str + " ﻌ ̷ ̷・  ";  
    }

    @Override
    public String decodifica(String str) {
        return str.substring(14, str.length() - 14);
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