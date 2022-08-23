package com.company.Semester3;

public class Feiertag {
    private String name;
    private int tag;
    private String monat;

    public Feiertag(String name, int tag, String monat){
        this.monat = monat;
        this.name = name;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTag() {
        return tag;
    }
    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getMonat() {
        return monat;
    }
    public void setMonat(String monat) {
        this.monat = monat;
    }

    @Override
    public String toString() {
        return "Feiertag{" +
                "name='" + name + '\'' +
                ", tag=" + tag +
                ", monat='" + monat + '\'' +
                '}';
    }
}
