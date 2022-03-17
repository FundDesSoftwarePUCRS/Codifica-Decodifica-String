package Codificadores;

public class Codifica20204015 implements Codifica {
    private static String tabela = "!@#$%*()_=§?/<>{}[]|1234567890ZYXWVUTSRQPNMLKJIHGFEDCBA0987654321aeiou";
    private static int deslc = 2;

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                codificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        codificada += tabela.charAt(i + deslc);
                    }
                }
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                decodificada += s;
            } else {
                for (int i = 0; i < tabela.length(); i++) {
                    if (tabela.charAt(i) == s) {
                        decodificada += tabela.charAt(i - deslc);
                    }
                }
            }
        }
        return decodificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "20204015";
    }

    @Override
    public String getNomeAutor() {
        return "Mateus de Carvalho de Freitas";
    }

}
