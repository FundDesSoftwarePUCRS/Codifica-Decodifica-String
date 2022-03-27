package Codificadores;

public class Codifica18106193 implements Codifica{

    private static String tabela = "XYZWVUTSRQPOMNOLQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz@#";
    private int desloc = 3;

    @Override
    public String getNomeAutor(){
        return "Pedro Zart";

    }
    @Override
    public String getMatriculaAutor(){
        return "18106193";
    }

    public String codifica(String str){
        String codificada ="";

        for (char c : str.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                codificada += c;
            }else{
                for(int i = 0; i<=tabela.length(); i++){
                    if(tabela.charAt(i)==c){
                        codificada+=tabela.charAt(i+desloc);
                    }
                }
            }
        }
        return codificada;
    }
    public String decodifica(String str){
        String decodificada = "";
        for(char c : str.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                decodificada+=c;
            }else{
                for(int i = 0; i<=tabela.length(); i++){
                    if(tabela.charAt(i)==c){
                        decodificada+= tabela.charAt(i-desloc);
                    }
                }
            }
        }
        return decodificada;
    }

}