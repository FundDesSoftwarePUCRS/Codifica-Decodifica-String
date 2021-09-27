package Codificadores;

public class Codifica181061938 implements Codifica{
    private static String tabela = "ABCDEFGHIKJLMNOPQRSTUVWXYZ123456789";
    private static int deslocamento = 2;

   
    @Override
    public String getMatriculaAutor(){
        return "181061938";
    }
    public String getNomeAutor(){
        return "Pedro Zart";
    }


    @Override
    public String codifica(String str){
        String codificada = "";
        for(char s : str.toCharArray()){
            if(!Character.isLetterOrDigit(s)){
                codificada+=s;
            }else{
                for(int i = 0; i <tabela.length(); i++){
                    if(tabela.charAt(i)==s){
                        codificada+= tabela.charAt(i+deslocamento);
                    }
                }
            }
        }
        return codificada;
    }
    @Override
    public String decodifica(String str){

        String decodificada = "";
        for(char s : str.toCharArray()){
            if(!Character.isLetterOrDigit(s)){
                decodificada+=s; 
            }else{
                for( int i = 0; i < tabela.length();i++){
                    if(tabela.charAt(i)==s){
                        decodificada+=tabela.charAt(i-deslocamento);
                    }
                }
            }
        }
        return decodificada;
        
    }
}
