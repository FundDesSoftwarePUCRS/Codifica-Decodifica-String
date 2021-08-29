package Codificadores;

public class Codifica20103640 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#.,;:!@$%&*()[]{}?";
    private static int deslc = 4;

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
        return "20103640";
    }

    @Override
    public String getNomeAutor() {
        return "Nicolle Lumertz";
    }

} 