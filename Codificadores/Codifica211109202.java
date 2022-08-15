package Codificadores;

public class Codifica211109202 implements Codifica {
    
    @Override
    public String codifica(String str) {
        String saida = "";
        for(int i = 0; i<str.length();i++){
            char a = str.charAt(i);
            //Ele substitui cada caractere da string pelo proximo caractere da tabele ASCII
            a++;
           saida+=a;
        }
        return saida;
    }

    @Override
    public String decodifica(String str) {
        String saida = "";
        for(int i = 0; i<str.length();i++){
            char a = str.charAt(i);
            a--;
           saida+=a;
        }
        return saida;
    }

    @Override
    public String getMatriculaAutor() {
        return "21110920-2";
    }

    @Override
    public String getNomeAutor() {
        return "Aloysio Winter";
    }
}
