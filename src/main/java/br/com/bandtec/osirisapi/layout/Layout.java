package br.com.bandtec.osirisapi.layout;

public interface Layout {
    String toCSV();
    String toTXT();
    void fromTXT(String conteudo);
}
