
package Codificadores;

public class Codifica21100652-3 implements Codifica {
    @Override
    public String getNomeAutor() {
        return "Gustavo Sanford Bortolon";
    }

    @Override
    public String getMatriculaAutor() {
        return "21100652-3";
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
