package Codificadores;

public class Codifica20103027 implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Henrique de Lima Xavier";
    }

    @Override
    public String getMatriculaAutor() {
        return "20103027";
    }

    // Soma 10 ao código ASCII de cada caractere da String.
    @Override
    public String codifica(String str) {
        char[] codificada = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
			codificada[i] = (char) ((int) str.charAt(i) + 10);
		}
        return new String(codificada);
    }

    @Override
    public String decodifica(String str) {
        char[] decodificada = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
			decodificada[i] = (char) ((int) str.charAt(i) - 10);
		}
        return new String(decodificada);
    }
    
}
