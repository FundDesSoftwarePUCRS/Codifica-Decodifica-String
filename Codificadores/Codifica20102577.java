package Codificadores;

public class Codifica20102577 implements Codifica {

    @Override
    public String codifica(String str){
       int codificada = Integer.parseInt(str);
        String codPront = "";

       codificada = codificada * 11;
        codPront = Integer.toString(codificada);

        return codPront;

    }

    @Override
    public String decodifica(String str){
        int decodificada = Integer.parseInt(str);
         String decodPront = "";

            decodificada = decodificada/11;
            decodPront = Integer.toString(decodificada);

        return decodPront;
    }

    @Override
    public String getMatriculaAutor() {
        return "20102577";
    }
    @Override
    public String getNomeAutor() {
        return "Bruno S A Avellar";
    }

}
