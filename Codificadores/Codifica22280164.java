package Codificadores;

public class Codifica22280164 implements Codifica {

    @Override
    public String codifica(String str) {
        return str + "-tebayo";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(0, str.length() - 7);
    }

    @Override
    public String getMatriculaAutor() {
        return "22280164";
    }

    @Override
    public String getNomeAutor() {
        return "Bruno Battesini";
    }
}
