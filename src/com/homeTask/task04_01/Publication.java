package com.homeTask.task04_01;

import java.util.Date;

public class Publication implements Comparable{
    private String title;

    private String contetnt;
    private Date creatDate;

    public Publication(String title, String contetnt, Date creatDate) {
        this.title = title;
        this.contetnt = contetnt;
        this.creatDate = creatDate;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContetnt() {
        return contetnt;
    }

    public void setContetnt(String contetnt) {
        this.contetnt = contetnt;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", contetnt='" + contetnt + '\'' +
                ", creatDate=" + creatDate +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return title.compareTo(((Publication) o).title);
    }

}
