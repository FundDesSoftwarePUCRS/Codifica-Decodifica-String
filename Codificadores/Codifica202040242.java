package Codificadores;

public class Codifica202040242 implements Codifica {

    @Override
    public String codifica(String str) {
        String aux="";
        for (int i =0;i<str.length();i++){
            aux +=(char)(str.charAt(i)+(str.length()/2));
        }
        return aux;
    }

    @Override
    public String decodifica(String str) {
        String aux="";
        for (int i =0;i<str.length();i++){
         aux +=(char)(str.charAt(i)-(str.length()/2));
        }
        return aux;
    }

    @Override
    public String getNomeAutor() {
       
        return "Leonardo Cruz";
    }

    @Override
    public String getMatriculaAutor() {
        return "20204024-2";
    }
}
