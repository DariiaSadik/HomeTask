package com.homeTask.task04_01;

import java.util.Date;

public class News extends Publication{
    private String source;

    public News(String title, String contetnt, Date creatDate, String source) {
        super(title, contetnt, creatDate);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "News{" +
                "source='" + source + '\'' +
                '}';
    }
}
