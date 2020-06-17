package com.example.projectku.materi;

public class MateriModel {
    private String namamateri;
    private String namapengajar;
    private String imageUrl;

    public MateriModel(String namamateri, String namapengajar, String imageUrl) {
        this.namamateri = namamateri;
        this.namapengajar = namapengajar;
        this.imageUrl = imageUrl;
    }

    public String getNamamateri() {
        return namamateri;
    }

    public void setNamamateri(String namamateri) {
        this.namamateri = namamateri;
    }

    public String getNamapengajar() {
        return namapengajar;
    }

    public void setNamapengajar(String namapengajar) {
        this.namapengajar = namapengajar;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
