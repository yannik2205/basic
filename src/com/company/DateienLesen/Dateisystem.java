package com.company.DateienLesen;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;

public class Dateisystem {
    private File startVerzeichnis;
    private FileFilter filter;
    private PrintStream ausgabe;
    private DateFormat datform;

    public Dateisystem(File startVerz, FileFilter filter, PrintStream ausgabe){
        this.startVerzeichnis = startVerz;
        this.filter = filter;
        this.ausgabe = ausgabe;
        this.datform = DateFormat.getDateTimeInstance();
    }

    public void list(){
        this.ausgeben(this.startVerzeichnis, " ");
    }
    private void ausgeben(File datei, String einruecken){
        if (datei.length() > 2000)
        try {
            this.ausgabe.print(einruecken + datei.getName());
            Date d = new Date((datei.lastModified()));
            this.ausgabe.print(" " + this.datform.format(d));
            if (datei.isFile()){
                this.ausgabe.println(" "+ datei.length() + "Bytes");
            }
            if (datei.isDirectory()){
                File[] eintraege = datei.listFiles(this.filter);
                this.ausgabe.println(": " + eintraege.length + "Eintraege");
                einruecken = einruecken + ' ';
                for (int i = 0; i < eintraege.length; i++){
                    this.ausgeben(eintraege[i], einruecken);
                }
            }
        }
        catch (Exception ex){
            System.err.println("Kein Zugriff: " + datei.getPath());
        }
    }
}

