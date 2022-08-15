package Codificadores;

public interface Codifica {
    // Retorna o autor do codificador
    public String getNomeAutor();

    // Retorna a matrícula do autor do codificador
    public String getMatriculaAutor();

    // Recebe um string e retorna o correspondente codificado
    public String codifica(String str);

    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodifica(String str);
}