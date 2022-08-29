package Codificadores;

public class CodificaAnderson implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Rafael Schaker";
    }

    @Override
    public String codifica(String str) {
        return "@_@" + str + "@_@";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override
    public String getMatriculaAutor() {
        return "20107315-2";
    }
}