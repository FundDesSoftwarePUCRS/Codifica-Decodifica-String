package Codificadores;

public class Codifica21103849 implements Codifica {

    @Override
    public String codifica(String str) {
        //Codificacao em codigo moorse, porem espacos sao representados por "-" e letras maiusculas
        //pela memsa representacao que minuscula, porem com um "-" antes
        String[] nStr= str.split("");
        int cont=0;
        String retorno="";
        while(cont<nStr.length){
            if(nStr[cont].equals("a")){
                retorno=retorno+"._ ";
            }
            if(nStr[cont].equals("b")){
                retorno=retorno+"_... ";
            }
            if(nStr[cont].equals("c")){
                retorno=retorno+"_._. ";
            }
            if(nStr[cont].equals("d")){
                retorno=retorno+"_.. ";
            }
            if(nStr[cont].equals("e")){
                retorno=retorno+". ";
            }
            if(nStr[cont].equals("f")){
                retorno=retorno+".._. ";
            }
            if(nStr[cont].equals("g")){
                retorno=retorno+"__. ";
            }
            if(nStr[cont].equals("h")){
                retorno=retorno+".... ";
            }
            if(nStr[cont].equals("i")){
                retorno=retorno+".. ";
            }
            if(nStr[cont].equals("j")){
                retorno=retorno+".___ ";
            }
            if(nStr[cont].equals("k")){
                retorno=retorno+"_._ ";
            }
            if(nStr[cont].equals("l")){
                retorno=retorno+"._.. ";
            }
            if(nStr[cont].equals("m")){
                retorno=retorno+"__ ";
            }
            if(nStr[cont].equals("n")){
                retorno=retorno+"_. ";
            }
            if(nStr[cont].equals("o")){
                retorno=retorno+"___ ";
            }
            if(nStr[cont].equals("p")){
                retorno=retorno+".__. ";
            }
            if(nStr[cont].equals("q")){
                retorno=retorno+"__._ ";
            }
            if(nStr[cont].equals("r")){
                retorno=retorno+"._. ";
            }
            if(nStr[cont].equals("s")){
                retorno=retorno+"... ";
            }
            if(nStr[cont].equals("t")){
                retorno=retorno+"_ ";
            }
            if(nStr[cont].equals("u")){
                retorno=retorno+".._ ";
            }
            if(nStr[cont].equals("v")){
                retorno=retorno+"..._ ";
            }
            if(nStr[cont].equals("w")){
                retorno=retorno+".__ ";
            }
            if(nStr[cont].equals("x")){
                retorno=retorno+"_.._ ";
            }
            if(nStr[cont].equals("y")){
                retorno=retorno+"_.__ ";
            }
            if(nStr[cont].equals("z")){
                retorno=retorno+"__.. ";
            }
            if(nStr[cont].equals("A")){
                retorno=retorno+"-._ ";
            }
            if(nStr[cont].equals("B")){
                retorno=retorno+"-_... ";
            }
            if(nStr[cont].equals("C")){
                retorno=retorno+"-_._. ";
            }
            if(nStr[cont].equals("D")){
                retorno=retorno+"-_.. ";
            }
            if(nStr[cont].equals("E")){
                retorno=retorno+"-. ";
            }
            if(nStr[cont].equals("F")){
                retorno=retorno+"-.._. ";
            }
            if(nStr[cont].equals("G")){
                retorno=retorno+"-__. ";
            }
            if(nStr[cont].equals("H")){
                retorno=retorno+"-.... ";
            }
            if(nStr[cont].equals("I")){
                retorno=retorno+"-.. ";
            }
            if(nStr[cont].equals("J")){
                retorno=retorno+"-.___ ";
            }
            if(nStr[cont].equals("K")){
                retorno=retorno+"-_._ ";
            }
            if(nStr[cont].equals("L")){
                retorno=retorno+"-._.. ";
            }
            if(nStr[cont].equals("M")){
                retorno=retorno+"-__ ";
            }
            if(nStr[cont].equals("N")){
                retorno=retorno+"-_. ";
            }
            if(nStr[cont].equals("O")){
                retorno=retorno+"-___ ";
            }
            if(nStr[cont].equals("P")){
                retorno=retorno+"-.__. ";
            }
            if(nStr[cont].equals("Q")){
                retorno=retorno+"-__._ ";
            }
            if(nStr[cont].equals("R")){
                retorno=retorno+"-._. ";
            }
            if(nStr[cont].equals("S")){
                retorno=retorno+"-... ";
            }
            if(nStr[cont].equals("T")){
                retorno=retorno+"-_ ";
            }
            if(nStr[cont].equals("U")){
                retorno=retorno+"-.._ ";
            }
            if(nStr[cont].equals("V")){
                retorno=retorno+"-..._ ";
            }
            if(nStr[cont].equals("W")){
                retorno=retorno+"-.__ ";
            }
            if(nStr[cont].equals("X")){
                retorno=retorno+"-_.._ ";
            }
            if(nStr[cont].equals("Y")){
                retorno=retorno+"-_.__ ";
            }
            if(nStr[cont].equals("Z")){
                retorno=retorno+"-__.. ";
            }
            if(nStr[cont].equals(" ")){
               retorno=retorno+"- "; 
            }
            if(nStr[cont].equals("1")){
                retorno=retorno+".____ ";
            }
            if(nStr[cont].equals("2")){
                retorno=retorno+"..___ ";
            }
            if(nStr[cont].equals("3")){
                retorno=retorno+"...__ ";
            }
            if(nStr[cont].equals("4")){
                retorno=retorno+"...._ ";
            }
            if(nStr[cont].equals("5")){
                retorno=retorno+"..... ";
            }
            if(nStr[cont].equals("6")){
                retorno=retorno+"_.... ";
            }
            if(nStr[cont].equals("7")){
                retorno=retorno+"__... ";
            }
            if(nStr[cont].equals("8")){
               retorno=retorno+"___.. "; 
            }
            if(nStr[cont].equals("9")){
                retorno=retorno+"____. "; 
            }
            if(nStr[cont].equals("0")){
                retorno=retorno+"_____ "; 
            }
            cont++;
        }
        return retorno;
    }

    @Override
    public String decodifica(String str) {
        String[] nStr= str.split(" ");
        int cont=0;
        String retorno="";
        while(cont<nStr.length){
            if(nStr[cont].equals("._")){
                retorno=retorno+"a";
            }
            if(nStr[cont].equals("_...")){
                retorno=retorno+"b";
            }
            if(nStr[cont].equals("_._.")){
                retorno=retorno+"c";
            }
            if(nStr[cont].equals("_..")){
                retorno=retorno+"d";
            }
            if(nStr[cont].equals(".")){
                retorno=retorno+"e";
            }
            if(nStr[cont].equals(".._.")){
                retorno=retorno+"f";
            }
            if(nStr[cont].equals("__.")){
                retorno=retorno+"g";
            }
            if(nStr[cont].equals("....")){
                retorno=retorno+"h";
            }
            if(nStr[cont].equals("..")){
                retorno=retorno+"i";
            }
            if(nStr[cont].equals(".___")){
                retorno=retorno+"j";
            }
            if(nStr[cont].equals("_._")){
                retorno=retorno+"k";
            }
            if(nStr[cont].equals("._..")){
                retorno=retorno+"l";
            }
            if(nStr[cont].equals("__")){
                retorno=retorno+"m";
            }
            if(nStr[cont].equals("_.")){
                retorno=retorno+"n";
            }
            if(nStr[cont].equals("___")){
                retorno=retorno+"o";
            }
            if(nStr[cont].equals(".__.")){
                retorno=retorno+"p";
            }
            if(nStr[cont].equals("__._")){
                retorno=retorno+"q";
            }
            if(nStr[cont].equals("._.")){
                retorno=retorno+"r";
            }
            if(nStr[cont].equals("...")){
                retorno=retorno+"s";
            }
            if(nStr[cont].equals("_")){
                retorno=retorno+"t";
            }
            if(nStr[cont].equals(".._")){
                retorno=retorno+"u";
            }
            if(nStr[cont].equals("..._")){
                retorno=retorno+"v";
            }
            if(nStr[cont].equals(".__")){
                retorno=retorno+"w";
            }
            if(nStr[cont].equals("_.._")){
                retorno=retorno+"x";
            }
            if(nStr[cont].equals("_.__")){
                retorno=retorno+"y";
            }
            if(nStr[cont].equals("__..")){
                retorno=retorno+"z";
            }
            if(nStr[cont].equals("-._")){
                retorno=retorno+"A";
            }
            if(nStr[cont].equals("-_...")){
                retorno=retorno+"B";
            }
            if(nStr[cont].equals("-_._.")){
                retorno=retorno+"C";
            }
            if(nStr[cont].equals("-_..")){
                retorno=retorno+"D";
            }
            if(nStr[cont].equals("-.")){
                retorno=retorno+"E";
            }
            if(nStr[cont].equals("-.._.")){
                retorno=retorno+"F";
            }
            if(nStr[cont].equals("-__.")){
                retorno=retorno+"G";
            }
            if(nStr[cont].equals("-....")){
                retorno=retorno+"H";
            }
            if(nStr[cont].equals("-..")){
                retorno=retorno+"I";
            }
            if(nStr[cont].equals("-.___")){
                retorno=retorno+"J";
            }
            if(nStr[cont].equals("-_._")){
                retorno=retorno+"K";
            }
            if(nStr[cont].equals("-._..")){
                retorno=retorno+"L";
            }
            if(nStr[cont].equals("-__")){
                retorno=retorno+"M";
            }
            if(nStr[cont].equals("-_.")){
                retorno=retorno+"N";
            }
            if(nStr[cont].equals("-___")){
                retorno=retorno+"O";
            }
            if(nStr[cont].equals("-.__.")){
                retorno=retorno+"P";
            }
            if(nStr[cont].equals("-__._")){
                retorno=retorno+"Q";
            }
            if(nStr[cont].equals("-._.")){
                retorno=retorno+"R";
            }
            if(nStr[cont].equals("-...")){
                retorno=retorno+"S";
            }
            if(nStr[cont].equals("-_")){
                retorno=retorno+"T";
            }
            if(nStr[cont].equals("-.._")){
                retorno=retorno+"U";
            }
            if(nStr[cont].equals("-..._")){
                retorno=retorno+"V";
            }
            if(nStr[cont].equals("-.__")){
                retorno=retorno+"W";
            }
            if(nStr[cont].equals("-_.._")){
                retorno=retorno+"X";
            }
            if(nStr[cont].equals("-_.__")){
                retorno=retorno+"Y";
            }
            if(nStr[cont].equals("-__..")){
                retorno=retorno+"Z";
            }
            if(nStr[cont].equals("-")){
               retorno=retorno+" "; 
            }
            if(nStr[cont].equals(".____")){
                retorno=retorno+"1";
            }
            if(nStr[cont].equals("..___")){
                retorno=retorno+"2";
            }
            if(nStr[cont].equals("...__")){
                retorno=retorno+"3";
            }
            if(nStr[cont].equals("...._")){
                retorno=retorno+"4";
            }
            if(nStr[cont].equals(".....")){
                retorno=retorno+"5";
            }
            if(nStr[cont].equals("_....")){
                retorno=retorno+"6";
            }
            if(nStr[cont].equals("__...")){
                retorno=retorno+"7";
            }
            if(nStr[cont].equals("___..")){
               retorno=retorno+"8"; 
            }
            if(nStr[cont].equals("____.")){
                retorno=retorno+"9"; 
            }
            if(nStr[cont].equals("_____")){
                retorno=retorno+"0"; 
            }
            cont++;
        }
        return retorno;
    }

    @Override
    public String getMatriculaAutor() {
        return "21103849-2";
    }

    @Override
    public String getNomeAutor() {
        return "Felipe Elsner Silva";
    }
}