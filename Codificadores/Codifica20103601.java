package Codificadores;

public class Codifica20103601 implements Codifica{

    @Override
    public String getNomeAutor() {
        return "Morgana Weber";
    }

    @Override
    public String getMatriculaAutor() {
        return "201036019";
    }

    @Override
    public String codifica(String str) {
        char[] aux = new char[str.length()];
        String resultado = "";
        for(int i = 0; i < str.length(); i++){
            aux[i] = str.charAt(i);
            if(aux[i] == 'a'){
                aux[i] = '*';
            }else if(aux[i] == 'e'){
                aux[i] = '@';
            }else if(aux[i] == 'i'){
                aux[i] = '#';
            }else if(aux[i] == 'o'){
                aux[i] = '!';
            }else if(aux[i] == 'u'){
                aux[i] = '$';
            }
            resultado += aux[i];
        }
        return resultado;
    }

    @Override
    public String decodifica(String str) {
        char[] aux = new char[str.length()];
        String resultado = "";
        for(int i = 0; i < str.length(); i++){
            aux[i] = str.charAt(i);
            if(aux[i] == '*'){
                aux[i] = 'a';
            }else if(aux[i] == '@'){
                aux[i] = 'e';
            }else if(aux[i] == '#'){
                aux[i] = 'i';
            }else if(aux[i] == '!'){
                aux[i] = 'o';
            }else if(aux[i] == '$'){
                aux[i] = 'u';
            }
            resultado += aux[i];
        }
        return resultado;
    }
    
}
