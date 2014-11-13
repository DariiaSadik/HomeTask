package com.homeTask.task04_01;

import java.util.Date;

public class Comersial extends Publication{
    private Date oldDate;

    public Comersial(String title, String contetnt, Date creatDate, Date oldDate) {
        super(title, contetnt, creatDate);
        this.oldDate = oldDate;
    }

    public Date getOldDate() {
        return oldDate;
    }

    public void setOldDate(Date oldDate) {
        this.oldDate = oldDate;
    }

    @Override
    public String toString() {
        return "Comersial{" +
                "oldDate=" + oldDate +
                '}';
    }
}
