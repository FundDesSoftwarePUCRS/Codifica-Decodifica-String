package Codificadores;

public class Codifica2010 implements Codifica {
    private static String tabela = "XYZWVUTSRQPOMNOLQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private static int deslc = 2;

    public Codifica2010() {
    }

    @Override
    public String codifica(String str) {
        StringBuilder codificada = new StringBuilder();

        for (char c : str.toCharArray()) {
            var s = Character.isLetterOrDigit(c) ? encodeChar(c) : c;
            codificada.append(s);
        }

        return codificada.toString();
    }

    @Override
    public String decodifica(String str) {
        StringBuilder decodificada = new StringBuilder();

        for (char c : str.toCharArray()) {
            var s = Character.isLetterOrDigit(c) ? decodeChar(c) : c;
            decodificada.append(s);
        }

        return decodificada.toString();
    }

    @Override
    public String getMatriculaAutor() {
        return "202806816";
    }

    @Override
    public String getNomeAutor() {
        return "Ricardo Ferreira Guimarães";
    }

    private char encodeChar(char c) {
        return tabela.charAt((tabela.indexOf(c) + deslc) % tabela.length());
    }

    private char decodeChar(char c) {
        var x = tabela.indexOf(c) - deslc;

        return tabela.charAt(x > 0 ? x : tabela.length() - deslc);
    }

}
