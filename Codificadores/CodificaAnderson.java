package Codificadores;

public class CodificaAnderson implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Anderson Fajardo";
    }

    @Override
    public String getMatriculaAutor() {
        return "14201795-3";
    }

    @Override
    public String codifica(String str) {
        return "@@@@@" + str + "!!!!!";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(5, str.length() - 5);
    }
}
