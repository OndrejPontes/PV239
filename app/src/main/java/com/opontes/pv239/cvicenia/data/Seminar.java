package com.opontes.pv239.cvicenia.data;

/**
 * Created by opontes on 3/7/16.
 */
public class Seminar {

    private String name;
    private String description;
    private int number;

    public Seminar(String name, String description, int number) {
        this.name = name;
        this.description = description;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
