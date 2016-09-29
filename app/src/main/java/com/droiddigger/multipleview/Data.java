package com.droiddigger.multipleview;

/**
 * Created by mufad on 9/29/2016.
 */

public class Data {
    String title,about;
    int photo,viewtype;

    Data(String title, String about, int photo,int viewtype) {
        this.title = title;
        this.about = about;
        this.photo = photo;
        this.viewtype=viewtype;
    }

    Data(String title, String about,int viewtype) {
        this.title = title;
        this.about = about;
        this.viewtype=viewtype;
    }
}
