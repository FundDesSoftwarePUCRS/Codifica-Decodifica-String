package Codificadores;

public class Codifica211010608 implements Codifica {

int s = 0;

@Override
public String codifica(String str) {
int s = (int)(Math.random()*10);
System.out.println(s);
for (int i =0; i < s;i++){
str = str + "$";
}
return str;
}

@Override
public String decodifica(String str) {
return str.substring(str.length() - s);
}

@Override
public String getMatriculaAutor() {
return "21101060-8";
}

@Override
public String getNomeAutor() {
return "Lucas Cunha";
}
}