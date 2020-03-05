package Codificadores;

public class Codifica151051836 implements Codifica {

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (char s : str.toCharArray()) {
            codificada += (int) s;
            codificada += '-';
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = "";
        String[] parts = str.split("-");

        for (String part : parts) {
            decodificada += (char) Integer.parseInt(part);
        }

        return decodificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "151051836";
    }

    @Override
    public String getNomeAutor() {
        return "Rafael Copstein";
    }

}