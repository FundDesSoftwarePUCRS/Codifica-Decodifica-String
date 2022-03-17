package Codificadores;
public class Codifica1119 implements Codifica{
    String str2;
    public String codifica(String str){
        str2 = str;
        str += "ÇÇÇÇÇÇ";
        return str;
    }

    public String decodifica(String str){
        return str2;
    }
    
    public String getMatriculaAutor(){
        return "20101119-4";
    }

    public String getNomeAutor(){
        return "Eduardo Henrique da Silva Cardoso";
    }
    
}