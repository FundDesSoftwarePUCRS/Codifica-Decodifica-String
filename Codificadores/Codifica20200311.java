package Codificadores;

//mudanças
// adicionei novos caracteres para a tabela
// mudei o deslocamento para 5

public class Codifica20200311 implements Codifica{
    private static String tabela = "@#$%&*!ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789abcdefghijklmnopqrstuvxwxyz";
    private static int deslc = 5;

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
        return "José Eduardo Rodrigues Serpa";
    }

    @Override
    public String getMatriculaAutor() {
        return "20200311";
    }

}
