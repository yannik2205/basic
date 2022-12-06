package com.company.DateienLesen.lukowskisDateien;
import java.io.File;
public class DateiAuflisterTest {
    public static void main(String[] args) {
        DateiAuflister lister
                = new DateiAuflister(new File(args[0]),
                new EndungsFilter(".txt"),
                System.out);
        lister.list();
    }
}
