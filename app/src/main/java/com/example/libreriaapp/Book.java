package com.example.libreriaapp;

public class Book {
    private final String id;
    private final String title;
    private final String description;
    private final int coverRes;

    public Book(String id, String title, String description, int coverRes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.coverRes = coverRes;
    }
 //getters y setters
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getCoverRes() {
        return coverRes;
    }
    /*
    public void setCoverRes(int coverRes) {
        this.coverRes = coverRes;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setId(int id) {
        this.id = id;
    }
    */
}
