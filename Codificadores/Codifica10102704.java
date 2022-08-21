package Codificadores;

public class Codifica10102704 implements Codifica {
    @Override
    public String getNomeAutor(){
        return "Bruno Marques";
    }
    @Override
    public String getMatriculaAutor(){
        return "10102704";
    }
    @Override
    public String codifica(String str){
        char c;
        String reverse = "";
        for (int i=0; i<str.length(); i++){
            c = str.charAt(i);
            reverse = c+reverse;
        }
        return reverse;
    }
    @Override
    public String decodifica(String str){
        char c;
        String reverse = "";
        for (int i=0; i<str.length(); i++){
            c = str.charAt(i);
            reverse = c+reverse;
        }
        return reverse;
    };
}