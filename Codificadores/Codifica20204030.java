package Codificadores;

public class Codifica20204030 implements Codifica{

    @Override
    public String getNomeAutor() {
        return "Jeniffer Moreira Borges";
    }

    @Override
    public String getMatriculaAutor() {
        return "20204030-9";
    }

    @Override
    public String codifica(String str) {
        StringBuilder nova = new StringBuilder();
        int tamTexto = str.length();
        String fraseInvertida = new StringBuilder(str).reverse().toString();

        for(int i = 0; i < tamTexto; i++){
            int letraAtual = (int)fraseInvertida.charAt(i) + 7;

            while(letraAtual < 32){
                letraAtual += 94;
            }
            nova.append((char)letraAtual);
        }

        return nova.toString();
    }

    @Override
    public String decodifica(String str) {
        
        StringBuilder nova = new StringBuilder();
        int tamTexto = str.length();
        String fraseInvertida = new StringBuilder(str).reverse().toString();

        for(int i = 0; i < tamTexto; i++){
            int letraAtual = (int)fraseInvertida.charAt(i) - 7;

            while(letraAtual < 32){
                letraAtual -= 94;
            }
            nova.append((char)letraAtual);
        }


        return nova.toString();
    }
    
}