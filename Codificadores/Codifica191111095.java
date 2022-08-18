/**
 * Codificadores
 * @author: Anderson Sprenger
 * @version: 15 AGO 22
 */

package Codificadores;

import java.nio.charset.StandardCharsets;

public class Codifica191111095 implements Codifica {
    @Override
    public String getNomeAutor() {
        return "Anderson Sprenger";
    }

    @Override
    public String getMatriculaAutor() {
        return "19111109-5";
    }

    @Override
    public String codifica(String str) {
        byte[] data = str.getBytes(StandardCharsets.UTF_8);

        for (int i = 0; i < data.length; i++) {
            data[i] -= 20;
        }

        return new String(data, StandardCharsets.UTF_8);
    }

    @Override
    public String decodifica(String str) {
        byte[] data = str.getBytes(StandardCharsets.UTF_8);

        for (int i = 0; i < data.length; i++) {
            data[i] += 20;
        }

        return new String(data, StandardCharsets.UTF_8);
    }
}
