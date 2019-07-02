package com.EBusiness.MethodTest;

public class User implements Comparable<User>{
    Integer id;
    String name;
    String sexy;

    public User() {
    }

    public User(Integer id, String name, String sexy) {
        this.id = id;
        this.name = name;
        this.sexy = sexy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sexy='" + sexy + '\'' +
                '}';
    }
}
