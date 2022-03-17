package Codificadores;

//Mudanças:
// deslc foi de 2 para 3
// mudei a posição dos chars na tabela
public class Codifica20280524 implements Codifica {
    private static String tabela = "1234567890abcdefghijklmnopqrstuvwxyzXYZWVUTSRQPOMNOLQRSTUVWXYZ@#";
    private static int deslc = 3;

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
    public String getNomeAutor() {
        return "Leonardo Gibrowski Faé";
    }

    @Override
    public String getMatriculaAutor() {
        return "20280524";
    }
}
