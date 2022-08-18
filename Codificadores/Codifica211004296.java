package Codificadores;

public class Codifica211004296 implements Codifica {

    @Override
    public String codifica(String str) {
        return "cachorro longo" + str + "programacao orientada a dados";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(14, str.length() - 29);
    }

    @Override
    public String getMatriculaAutor() {
        return "21100429-6";
    }

    @Override
    public String getNomeAutor() {
        return "Eduardo Tropea";
    }
}