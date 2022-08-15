package Codificadores;

public class Codifica211004296 implements Codifica {

    @Override
    public String codifica(String str) {
        return "Cachorro longo" + str + "destaque em programação orientada a dados";
    }

    @Override
    public String decodifica(String str) {
        return str.substring(2, str.length() - 6);
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