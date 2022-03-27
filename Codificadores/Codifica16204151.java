package Codificadores;

public class Codifica16204151 implements Codifica{
    String str2;
    public String codifica(String str){
        str2 = str;
        str += " -- Esse eh um bom ano";
        return str;
    }

    public String decodifica(String str){
        return str2;
    }
    
    public String getMatriculaAutor(){
        return "16204151-3";
    }

    public String getNomeAutor(){
        return "Julio Cesar Oliveira Santos";
    }
    
}