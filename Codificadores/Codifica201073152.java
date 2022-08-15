package Codificadores;

public class Codifica201073152 implements Codifica {

    @Override
    public String codifica(String str) {
        String strnovo="";
        for(int i=0;i<str.length();i++)
        {   strnovo += 0;
            strnovo += str.charAt(i);}
        return strnovo;
    }

    @Override
    public String decodifica(String str) {
        String strnovo="";
        for(int i=1; i<str.length() ;i+=2){strnovo += str.charAt(i);}
        return strnovo;
    }

    @Override
    public String getMatriculaAutor() {
        return "20107315-2";
    }

    @Override
    public String getNomeAutor() {
        return "Rafael Schaker";
    }
}