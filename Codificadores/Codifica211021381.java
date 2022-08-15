package Codificadores;

public class Codifica211021381 implements Codifica {

    @Override
    public String codifica(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String decodifica(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String getMatriculaAutor() {
        return "21102138-1";
    }

    @Override
    public String getNomeAutor() {
        return "Gabriel Ramos";
    }
}