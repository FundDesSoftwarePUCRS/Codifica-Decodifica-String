package Codificadores;

public class Codifica18106193 implements Codifica{

    private String tabela = "zyxwvutsrqponmlkjihgfedcba1234567890@#ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int desloc = 4;

    @Override
    public String getNomeAutor(){
        return "Pedro Zart";

    }
    @Override
    public String getMatriculaAutor(){
        return "18106193";
    }

    public String codifica(String str){
        String codificada = " ";

        for (char s : str.toCharArray()){
            if(!Character.isLetterOrDigit(s)){
                codificada += s;
            }else{
                for(int i = 0; i<tabela.length(); i++)
                {
                    if(tabela.charAt(i)==s){
                        codificada += tabela.charAt(i + desloc);
                    }
                }
            }
        }
        return codificada;
    }
    public String decodifica(String str){
        String decodificada = "";
        for(char s : str.toCharArray()){
            if(!Character.isLetterOrDigit(s)){
                decodificada+=s;
            }else{
                for(int i = 0; i<tabela.length(); i++){
                    if(tabela.charAt(i)==s){
                        decodificada+= tabela.charAt(i-desloc);
                    }
                }
            }
        }
        return decodificada;
    }

}