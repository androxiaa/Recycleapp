package it.unich.s3221238.recycleapp;

public class ModelliGiochi {
    String GiocoNome;
    String SitoNome;
    int image;

    public ModelliGiochi(String giocoNome, String sitoNome, int image) {
        GiocoNome = giocoNome;
        SitoNome = sitoNome;
        this.image = image;
    }

    public String getGiocoNome() {
        return GiocoNome;
    }

    public String getSitoNome() {
        return SitoNome;
    }

    public int getImage() {
        return image;
    }
}
