package com.company.DateienLesen.lukowskisDateien;

import java.io.File;
import java.io.FileFilter;

public class EndungsFilter implements FileFilter {
    private String endung;
    public EndungsFilter(String endung){
        this.endung = endung;
    }
    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(this.endung) || f.isDirectory();
    }

}

