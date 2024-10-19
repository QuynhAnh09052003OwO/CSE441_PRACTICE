package com.example.th4firebaserealtime;

public class Student {

    String id;
    String name;
    String _class;
    float score;

    public Student(String id, String name, String _class, float score) {
        this.id = id;
        this.name = name;
        this._class = _class;
        this.score = score;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
