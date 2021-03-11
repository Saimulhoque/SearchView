package com.forbit.searchview;

public class Model {
    Integer Image;
    String Title;

    public Model(Integer image, String title) {
        Image = image;
        Title = title;
    }

    public Integer getImage() {
        return Image;
    }

    public void setImage(Integer image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
