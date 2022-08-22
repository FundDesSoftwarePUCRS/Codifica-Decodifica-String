/**
 * Codificadores
 * @author: Anderson Sprenger
 * @version: 15 AGO 22
 */

package Codificadores;

import java.nio.charset.StandardCharsets;

public class codifica20106624 implements Codifica {
    @Override
    public String getNomeAutor() {
        return "Henrique Feijó Paim";
    }

    @Override
    public String getMatriculaAutor() {
        return "20106624-8";
    }
    @Override
    public  String codifica(String str) {
        String aux="";
        for(int i=str.length()-1;i>=0;i--){
            aux+=str.charAt(i);
            aux+='$';
        }

        return aux;
    }
    @Override
    public  String decodifica(String str) {
        String aux="";
        for(int i=str.length()-1;i>=0;i--){
            aux+=str.charAt(i);

        }
        aux=aux.replace("$","");
        return aux;

    }
}
