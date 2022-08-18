package Codificadores;

public class Codifica19105389 implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Enzo Silveira";
    }

    @Override
    public String getMatriculaAutor() {
        return "19105389";
    }

    @Override
    public String codifica(String str) {
        return str.concat("CODIFICADA");
    }

    @Override
    public String decodifica(String str) {
        return str.substring(0, str.length()-10);
    }
    
}
