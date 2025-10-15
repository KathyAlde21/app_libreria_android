package com.example.libreriaapp;

public class Book {
    private int id;
    private String title;
    private String description;
    private int coverResId;

    public Book(int id, String title, String description, int coverResId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.coverResId = coverResId;
    }
 //getters y setters
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getCoverResId() {
        return coverResId;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCoverResId(int coverResId) {
        this.coverResId = coverResId;
    }
}
