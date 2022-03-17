package Codificadores;

public class Codifica20204012 implements Codifica{

//Alterações:
//Mudei os caracteres que estavam na tabela, alfabeto minusculo, numeros de 0 a 9,
       //caracteres especiais das teclas 0 a 9 e alfabeto maiusculo
//O deslocamento que estava em 3 alterei para 2

    private static String tabela = "abcdefghijklmnopqrstuvxwyz0123456789!@#$%¨&*()ABCDEFGHIJKLMNOPQRSTUVXWYZ";
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
    public String getNomeAutor() {
        return "Cassiano Luis Flores Michel";
    }

    @Override
    public String getMatriculaAutor() {
        return "20204012";
    }
}