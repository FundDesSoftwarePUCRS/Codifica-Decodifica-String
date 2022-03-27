package Codificadores;

public class Codifica151112513 implements Codifica {
    private String separadorCaracteres;

    public Codifica151112513() {
        separadorCaracteres = ",";
    }

    @Override
    public String getNomeAutor() {
        return "Eduardo Berwanger";
    }

    @Override
    public String getMatriculaAutor() {
        return "15111251-3";
    }

    @Override
    public String codifica(String str) {
        char[] caracteres = str.toCharArray();

        String strCodificada = "";

        for (char caractere : caracteres) {
            strCodificada += (int)caractere + separadorCaracteres;
        }

        return strCodificada;
    }

    @Override
    public String decodifica(String str) {
        String[] caracteresCodificados = str.split(separadorCaracteres);

        String strDecodificada = "";

        for (String caractereCodificado : caracteresCodificados) {
            strDecodificada += (char)Integer.parseInt(caractereCodificado);
        }

        return strDecodificada;
    }
}