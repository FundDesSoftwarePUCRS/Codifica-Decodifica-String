package Codificadores;

public class Codifica20103837 implements Codifica {

    @Override
    public String getNomeAutor(){
        return "Thiago Defini Scherer";
    }

    @Override
    public String getMatriculaAutor(){
        return "20103837";
    }

    @Override
    public String codifica(String frase){
        return frase.toUpperCase();
    }

    @Override
    public String decodifica(String frase){
        return frase.toLowerCase();
    }

}