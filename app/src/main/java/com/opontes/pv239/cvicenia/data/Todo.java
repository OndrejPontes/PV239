package com.opontes.pv239.cvicenia.data;

/**
 * Created by opontes on 09/03/16.
 */
public class Todo {
    private String description;
    private boolean check;

    public Todo(String description, boolean check) {
        this.description = description;
        this.check = check;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
