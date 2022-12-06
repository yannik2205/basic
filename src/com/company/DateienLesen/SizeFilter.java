package com.company.DateienLesen;

import java.io.File;
import java.io.FileFilter;

public class SizeFilter implements FileFilter {
    private double size;

    public SizeFilter(int size) {
        this.size = size;
    }

    @Override
    public boolean accept(File f) {
        return f.length() > this.size;
    }
}
