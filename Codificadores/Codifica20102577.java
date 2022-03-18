package Codificadores;

//Mudei a tabela utilizada e o valor de desloc para 4

public class Codifica20102577 implements Codifica {
    private static String tabela = "zyxwvutsrqponmlkjihgfedcba1234567890@#ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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
        return "20102577";
    }

    @Override
    public String getNomeAutor() {
        return "Bruno Avellar";
    }

}