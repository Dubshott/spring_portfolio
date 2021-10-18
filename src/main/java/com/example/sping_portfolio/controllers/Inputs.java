package com.example.sping_portfolio.controllers;

public class Inputs {
    private String classes;
    private String teacher;
    private String rating;

    public String getClasses() { return classes; }

    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String newTeacher) {
        this.teacher = newTeacher;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String newRating) {
        this.rating = newRating;
    }



    @Override
    public String toString() {
        return String.format(classes, teacher, rating);
    }

}
