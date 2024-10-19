package com.example.th4firebaserealtime;

public class Student {

    String id, name, _class;
    float score;

    public Student(String id, float score, String _class, String name) {
        this.id = id;
        this.score = score;
        this._class = _class;
        this.name = name;
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
