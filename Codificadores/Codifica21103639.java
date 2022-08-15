package Codificadores;

public class Codifica21103639 implements Codifica {
    @Override
    public String codifica(String str) {
        return incrementaString(str, 1);
    }

    @Override
    public String decodifica(String str) {
        return incrementaString(str, -1);
    }

    @Override
    public String getMatriculaAutor() {
        return "21103639";
    }

    @Override
    public String getNomeAutor() {
        return "Bernardo Barzotto Zomer";
    }

    private String incrementaString(String str, int inc) {
        StringBuilder stringBuilder = new StringBuilder(str.length());

        for (char ch : str.toCharArray()) {
            stringBuilder.append((char) (ch + inc));
        }

        return stringBuilder.toString();
    }
}