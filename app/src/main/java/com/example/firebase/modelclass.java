package com.example.firebase;

public class modelclass {
    int img;
    String topic;

    public modelclass(int img, String topic) {
        this.img = img;
        this.topic = topic;
    }

    public int getImg() {
        return img;
    }

    public String getTopic() {
        return topic;
    }
}
