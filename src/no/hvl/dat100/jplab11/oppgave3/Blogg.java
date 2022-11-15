package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	protected int nesteledig=0;
	
	
	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		nesteledig=0;
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig=0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i = 0; i < nesteledig; i++) {
            if (innlegg.erLik(innleggtabell[i]))
                return i;
		}
	
	return-1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet=true;
		
		
			if(finnInnlegg(innlegg)<0){
			funnet=false; 
			}
		
		return funnet;
	}

	public boolean ledigPlass() {
		boolean plass=false;
		for(Innlegg e :innleggtabell) {
			if(e == null) {
				plass = true;
			}
		}
		
		return plass;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean inserted = false;

		if(!finnes(innlegg)&&ledigPlass()) {
			
			innleggtabell[nesteledig]=innlegg;
			nesteledig++;
			inserted=true;
		}
		
		return inserted;
		
	}
	
	public String toString() {
		
		String result = nesteledig + "\n";

        for (Innlegg e : innleggtabell) {
        	if(e!=null) {
        		result += e.toString();
        	}
        	
        }
        return result;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}