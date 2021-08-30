package Codificadores;

public class Codifica161800917 implements Codifica {
    private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
    private static final int KEY = 5;    

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s)) {
                codificada += s;
            } else {
                for (int i = 0; i < ALFABETO.length(); i++) {
                    if (ALFABETO.charAt(i) == s) {
                        codificada += ALFABETO.charAt(i + KEY);
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
                for (int i = 0; i < ALFABETO.length(); i++) {
                    if (ALFABETO.charAt(i) == s) {
                        decodificada += ALFABETO.charAt(i - KEY);
                    }
                }
            }
        }
        return decodificada;

    // Retorna o autor do codificador
    public String getNomeAutor() {
        return "Lucas Camargo";
    }

    // Retorna a matrícula do autor do codificador
    public String getMatriculaAutor() {
        return "16180091-7";
    }
}