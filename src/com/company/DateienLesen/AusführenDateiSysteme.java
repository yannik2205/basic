package com.company.DateienLesen;

import com.company.DateienLesen.lukowskisDateien.EndungsFilter;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class AusführenDateiSysteme {
    public static void main(String[] args) {
        int sizescan;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie groß soll die Datei mindestens sein?:");
        sizescan = scan.nextInt();
        Dateisystem datsystem = new Dateisystem(new File(args[0]), new SizeFilter(sizescan),System.out);
        datsystem.list();
    }
}
