package com.homeTask.task04_01;

import java.util.Date;

public class Articles extends Publication{
    private String author;

    public Articles(String title, String contetnt, Date creatDate, String author) {
        super(title, contetnt, creatDate);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Articles{" +
                "author='" + author + '\'' +
                '}';
    }
}
