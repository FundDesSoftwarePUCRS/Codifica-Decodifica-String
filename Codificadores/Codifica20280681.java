package Codificadores;

import java.util.function.BiFunction;

public class Codifica20280681 implements Codifica {
    private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    public static int deslc = (int) Math.floor(Math.random() * 100);

    @Override
    public String codifica(String str) {
        return process(str, Integer::sum);
    }

    @Override
    public String decodifica(String str) {
        return process(str, (a, b) -> a - b);
    }

    private String process(String str, BiFunction<Integer, Integer, Integer> func) {
        StringBuilder output = new StringBuilder();

        for (char c : str.toCharArray()) {
            var s = Character.isLetterOrDigit(c) ? shift(func.apply(tabela.indexOf(c),deslc)) : c;
            output.append(s);
        }

        return output.toString();
    }

    @Override
    public String getMatriculaAutor() {
        return "202806816";
    }

    @Override
    public String getNomeAutor() {
        return "Ricardo Ferreira Guimarães";
    }

    private char shift(int k) {
        var j = k % tabela.length();
        return tabela.charAt(j < 0 ? j + tabela.length() : j);
    }


}
