package com.opontes.pv239.cvicenia.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by opontes on 09/03/16.
 */
public class Todo implements Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.description);
        dest.writeByte(check ? (byte) 1 : (byte) 0);
    }

    protected Todo(Parcel in) {
        this.description = in.readString();
        this.check = in.readByte() != 0;
    }

    public static final Parcelable.Creator<Todo> CREATOR = new Parcelable.Creator<Todo>() {
        public Todo createFromParcel(Parcel source) {
            return new Todo(source);
        }

        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };
}
