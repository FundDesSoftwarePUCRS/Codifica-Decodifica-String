package Codificadores;

public class Codifica211042841 implements Codifica {
  @Override
  public String getNomeAutor() {
    return "Lorenzo Windmoller Martins";
  }

  @Override
  public String getMatriculaAutor() {
    return "21104284-1";
  }

  @Override
  public String codifica(String str) {
    String codificada = "";

    for (int i = 0; i < str.length(); i++) {
      char symbol = str.charAt(i);

      int code = (int) symbol;

      int code_sum = code + code;

      codificada += Character.toString((char) code_sum);
    }

    return codificada;
  }

  @Override
  public String decodifica(String str) {
    String decodificada = "";

    for (int i = 0; i < str.length(); i++) {
      char symbol = str.charAt(i);

      int code = (int) symbol;

      int code_sum = code / 2;

      decodificada += Character.toString((char) code_sum);
    }

    return decodificada;
  }
}
