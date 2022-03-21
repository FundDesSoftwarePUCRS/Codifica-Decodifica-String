package Codificadores;

public class Codifica20204002 implements Codifica {
    @Override
    public String getNomeAutor() {
        return "José Junior Borges Monteiro";
    }

    @Override
    public String getMatriculaAutor() {
        return "20204002";
    }

    @Override
    public String codifica(String str) {
      String codificada = "";
        for (char s : str.toCharArray()) {
            int indexAscii = (int) s;
            int novoValor = indexAscii + 2;
            codificada += (char) novoValor;
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
       String decodificada = "";
        for (char s : str.toCharArray()) {
            int indexAscii = (int) s;
            int novoValor = indexAscii - 2;
            decodificada += (char) novoValor;
        }
        return decodificada;
    }
}
