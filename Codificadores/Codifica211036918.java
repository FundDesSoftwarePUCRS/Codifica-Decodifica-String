package Codificadores;


import java.util.*;
public class Codifica211036918 implements Codifica
{

    
    @Override
    public String getNomeAutor(){

        return "Carlo Smaniotto Mantovani";
    }

    // Retorna a matrícula do autor do codificador
    public String getMatriculaAutor(){

        return "21103691-8";

    }

    // Recebe um string e retorna o correspondente codificado
    public String codifica(String str){

        List<String> list = new ArrayList<>();
        String line[] = str.split("");
        for (int i = line.length-1; i >= 0; i-- ){
            list.add(line[i]);
        }
        String cod = String.join("", list);
        return cod;

    }

    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodifica(String str){
        List<String> listDecod = new ArrayList<>();
        String line[] = str.split("");
        for (int i = line.length-1; i >= 0; i-- ){
            listDecod.add(line[i]);
        }
        String decod = String.join("", listDecod);
        return decod;
    }



}