package Codificadores;

public class Codifica191112127 implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Daniele Paz";
    }

    @Override
    public String getMatriculaAutor() {
        return "19111212-7";
    }

    @Override
    public String codifica(String str) {
        return "°˖✧ "+str+" ✧˖°";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(8, str.length() - 8);
    }

}