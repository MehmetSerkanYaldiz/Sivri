package com.ex.sivri.Models;

public class Model {
    private int images;
    private String title;
    private String text;

    public Model(int images, String title, String text) {
        this.images = images;
        this.title = title;
        this.text = text;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
