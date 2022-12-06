package com.company.DateienLesen.lukowskisDateien;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DateiLesen {
	public static void main(String[] args) {
		InputStream fis = null; //Referenz fis der abstrakten Klasse InputStream
		try {
			int inByte;
			fis = new FileInputStream("testdatei.txt");
			while ((inByte = fis.read()) != -1) {
				System.out.print((char) inByte);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace(); //Ausnahmebeh.
		} catch (IOException ioe) {
			ioe.printStackTrace(); // Ausnahmebeh.
		} finally {
			try {
				if (fis != null) {
					fis.close(); //auf jeden Fall schliessen
				}
			} catch (IOException ioe) {
				ioe.printStackTrace(); // Ausnahmebeh.
			}
		}
	}
}

