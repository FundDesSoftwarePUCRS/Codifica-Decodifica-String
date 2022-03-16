import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

import Codificadores.Codifica;

public class App {
    public static void executaCodificacao(Codifica cod, String frase) {
        System.out.println("Nome: " + cod.getNomeAutor());
        System.out.println("Matricula: " + cod.getMatriculaAutor());
        System.out.println("Frase original: " + frase);
        String codificada = cod.codifica(frase);
        System.out.println("Frase codificada: " + codificada);
        String decodificada = cod.decodifica(codificada);
        System.out.println("Frase decodificada: " + decodificada);
        System.out.println("----------------------------------");
    }

    public static void main(String args[]) {

        Path filesPath = Paths.get("Codificadores");
        System.out.println("Pasta:"+filesPath.toAbsolutePath());
        List<String> codificadores = null;

        try (Stream<Path> walk = Files.walk(filesPath)) {
            codificadores = walk
                .map(x -> x.getFileName())
                .map(x -> x.toString())
                .filter(f -> !f.equals("Codifica.class"))
                .filter(f -> f.endsWith(".class"))
                .map(s -> s.toString().substring(0, s.lastIndexOf('.')))
                .collect(Collectors.toList());

            codificadores.forEach(fn -> System.out.println(fn));

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        String frase = "Hoje e dia 19 de agosto de 2021";
        try {
            for (String cod : codificadores) {
                System.out.println(cod);
                Class<?> clazz = Class.forName("Codificadores." + cod);
                Object ref = clazz.getConstructor().newInstance();
                executaCodificacao((Codifica) ref, frase);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}
