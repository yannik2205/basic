package com.company.projekte_praxis_zweites_semester.Studenten;

import java.util.Date;
//test for git and some more and some more and some more
public class Student {
    private Date gebdatum;
    private String einkommen;
    private String name;
    public Student(String name, Date gebdatum, String einkommen) {
        this.name = name;
        this.gebdatum = gebdatum;
        this.einkommen = einkommen;
    }

    public String getName() {return name;}


    public Date getGebdatum() {
        return gebdatum;
    }

    public String getEinkommen() {
        return einkommen;
    }

    public void lernen(){
        System.out.println("lesen");
    }

    public void feiern(){
        System.out.println("tanzen");
    }



}
