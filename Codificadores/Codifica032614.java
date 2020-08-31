package Codificadores;

public class Codifica032614 implements Codifica {
   // private static String tabela = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";

    @Override
    public String codifica(String str) {
        String codificada = "";
        for (char s : str.toCharArray()) {
            switch(s){
                case 'a':
                case 'A':
                    codificada += "4";
                    break;
                case 'e':
                case 'E':
                    codificada += "3";
                    break;
                case 'i':
                case 'I':
                    codificada += "1";
                    break;
                case 'o':
                case 'O':
                    codificada += "0";
                    break;
                default:
                    codificada += s;
            }
        }
        return codificada;
    }

    @Override
    public String decodifica(String str) {
    String decodificada = "";
        for (char s : str.toCharArray()) {
            switch(s){
                case '4':
                    decodificada += 'a';
                    break;
                case '3':
                    decodificada += 'e';
                    break;
                case '1':
                    decodificada += 'i';
                    break;
                case '0':
                    decodificada += 'o';
                    break;
                default:
                    decodificada += s;
            }
        }
        return decodificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "14111016-3";
    }

    @Override
    public String getNomeAutor() {
        return "Kalissa Rodrigues";
    }

}