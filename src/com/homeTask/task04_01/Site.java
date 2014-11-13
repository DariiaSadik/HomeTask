package com.homeTask.task04_01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Site {
    private static class Inner {
        public static final Site instance = new Site();
    }
    public static Site getInstance(){
        return Inner.instance;
    }

    private Publication[] publication = new Publication[4];

    private Site() {
        publication[0] = new Comersial("String title", "String contetnt", new Date(), new Date());
        publication[1] = new News("String title", "String contetnt", new Date(), "String source");
        publication[2] = new Articles("String title", "String contetnt", new Date(), "String author");
        publication[3] = new Publication("String title", "String contetnt", new Date());
    }

    public Publication[] getPublication() {
        return publication;
    }

    public void setPublication(Publication[] publication) {
        this.publication = publication;
    }

    public Publication[] getSortPub(){
        Publication[] pub = new Publication[publication.length];
        System.arraycopy(publication, 0, pub, 0, publication.length);
        Arrays.sort(pub);
        return pub;
    }

    public Publication[] getSort(Comparator c){
        Publication[] pub = new Publication[publication.length];
        System.arraycopy(publication, 0, pub, 0, publication.length);
        Arrays.sort(pub, c);
        return pub;
    }
}
