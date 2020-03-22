package Codificadores;
public class Codifica191052778 implements Codifica {

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (int i = 0; i < str.length() ; i++) {
            switch(str.charAt(i)){
                case 'a': codificada +=  "!"; break;
                case 'e': codificada +=  "@"; break;
                case 'i': codificada +=  "#"; break;
                case 'o': codificada +=  "$"; break;
                case 'u': codificada +=  "%"; break;
                default: codificada +=  str.charAt(i);
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = "";
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)){
                case '!': decodificada +=  "a"; break;
                case '@': decodificada +=  "e"; break;
                case '#': decodificada +=  "i"; break;
                case '$': decodificada +=  "o"; break;
                case '%': decodificada +=  "u"; break;
                default: decodificada +=  str.charAt(i);
            }
        }
        return decodificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "19105277-8";
    }

    @Override
    public String getNomeAutor() {
        return "Clara da Cunha Davila";
    }

}