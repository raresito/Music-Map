package com.example.rares.raresbook.pojo;

/**
 * Created by Rares on 17-Aug-16.
 */
public class Setting{

    String text = null;
    boolean selected = false;

    public Setting(String text, boolean selected) {
        super();
        this.text = text;
        this.selected = selected;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
