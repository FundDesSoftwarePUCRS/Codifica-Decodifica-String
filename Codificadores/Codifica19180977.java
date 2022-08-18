package Codificadores;

public class Codifica19180977 implements Codifica{

    String newStr;
    String codificado;

    @Override
    public String getNomeAutor(){

        return "Nicolas P. Salles";
    }

    @Override
    public String getMatriculaAutor(){

        return "19180977";

    }

    
    public String codifica(String str){
        codificado = "";
        for(int i = 0; i < str.length(); i++){
            char charOut = str.charAt(i);
            newStr = Integer.toHexString((int)charOut);
            codificado += newStr;
        }
        return codificado;
    }

    public String decodifica(String str){
        String codificado = "";
        char decimalToChar;
        for(int i = 0; i < str.length(); i+=2){
            String hexString = str.substring(i, i+2);
            try {
                // Actual conversion of hexadecimal to decimal
                int hexToDecimal = Integer.parseInt(hexString, 16);
                decimalToChar = (char)hexToDecimal;
                codificado += decimalToChar;
            }
            catch(NumberFormatException ne) {
                // Printing a warning message if the input
                // is not a valid hexadecimal number
                System.out.println("Invalid Input");
            }
        }
        return codificado;
    }
}
