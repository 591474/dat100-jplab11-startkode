package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean ok=false;
		String plassering =mappe+"/"+filnavn;
		PrintWriter skriver;
		try {
		skriver = new PrintWriter(plassering);
		String blogg = samling.toString();
		skriver.println(blogg);
		skriver.close();
		ok=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ok;
	}
}
