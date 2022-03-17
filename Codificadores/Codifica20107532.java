package Codificadores;

public class Codifica20107532 implements Codifica{
    private static String consoantes = "BCDEFGHIJ";
    private static String vogais = "AEIOU";

    @Override
    public String decodifica(String str) {
        String descodifica = "";

        for (int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == '!') {
                descodifica += "a";
            } else if(str.charAt(i) == '@') {
                descodifica+= "e";
            }  else if(str.charAt(i) == '#') {
                descodifica+= "i";
            }  else if(str.charAt(i) == '$') {
                descodifica+= "u";
            } else {
                descodifica += str.charAt(i);
            }
        }
        return descodifica;
    }
    
    @Override
    public String codifica(String str) {
        String codificada = "";

        for (int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'a') {
                codificada += "!";
            } else if(str.charAt(i) == 'e') {
                codificada+= "@";
            }  else if(str.charAt(i) == 'i') {
                codificada+= "#";
            }  else if(str.charAt(i) == 'u') {
                codificada+= "$";
            } else {
                codificada += str.charAt(i);
            }
        }
        return codificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "20107532";
    }

    @Override
    public String getNomeAutor() {
        return "Nome: Waldyr Schneider";
    }
}
