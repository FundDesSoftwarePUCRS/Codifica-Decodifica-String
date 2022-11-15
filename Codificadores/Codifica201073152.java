package Codificadores;

public class Codifica201073152 implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Rafael Schaker";
    }

    @Override
    public String codifica(String str) {
        return "@@@@@@" + str + "!!!!!!";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(6, str.length() - 6);
    }

    @Override
    public String getMatriculaAutor() {
        return "20107315-2";
    }
}


