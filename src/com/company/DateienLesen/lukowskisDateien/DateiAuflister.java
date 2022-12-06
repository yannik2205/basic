package com.company.DateienLesen.lukowskisDateien;

import java.io.File;
import java.io.FileFilter;
import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;

public class DateiAuflister {
    private File startVerzeichnis;
    private FileFilter filter;
    private PrintStream ausgabe;
    private DateFormat datform;
    public DateiAuflister(File startVerz, FileFilter filter, PrintStream
            ausgabe){
        if(!startVerz.exists()){
            throw new IllegalArgumentException(
                    startVerz.getPath() + " nicht vorhanden");
        }
        this.startVerzeichnis = startVerz;
        this.filter = filter;
        this.ausgabe = ausgabe;
        this.datform = DateFormat.getDateTimeInstance();
    }
    public void list(){
        this.ausgeben(this.startVerzeichnis, " ");
    }
    private void ausgeben(File datei, String einrueck){
        try{
            this.ausgabe.print(einrueck + datei.getName());
            Date d = new Date(datei.lastModified());
            this.ausgabe.print(" " + this.datform.format(d));
            if(datei.isFile()){
                this.ausgabe.println(" " + datei.length() + " Bytes");
            }
            if(datei.isDirectory()){
                File[] eintraege = datei.listFiles(this.filter);
                this.ausgabe.println(": " + eintraege.length + " Eintraege");
                einrueck = einrueck + ' ';
                for(int i=0; i<eintraege.length; i++){
                    this.ausgeben(eintraege[i], einrueck);
                }
            }
        }catch(Exception ex){
            System.err.println("Kein Zugriff: " + datei.getPath());
        }
    }
}

