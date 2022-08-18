package Codificadores;

public class Codifica21104071 implements Codifica {

    @Override
    public String codifica(String str) {
        String codificado = str.replaceAll("a", "@");
        String codificado1 = codificado.replaceAll("e", "<");
        String codificado2 = codificado1.replaceAll("i", "!");
        String codificado3 = codificado2.replaceAll("o", ">");
        String codificado4 = codificado3.replaceAll("u", "#");
        return codificado4;
    }

    @Override
    public String decodifica(String str) {
        String codificado = str.replaceAll("@", "a");
        String codificado1 = codificado.replaceAll("<", "e");
        String codificado2 = codificado1.replaceAll("!", "i");
        String codificado3 = codificado2.replaceAll(">", "o");
        String codificado4 = codificado3.replaceAll("#", "u");
        return codificado4;
    }

    @Override
    public String getMatriculaAutor() {
        return "21104071";
    }

    @Override
    public String getNomeAutor() {
        return "Israel Segalin";
    }
}