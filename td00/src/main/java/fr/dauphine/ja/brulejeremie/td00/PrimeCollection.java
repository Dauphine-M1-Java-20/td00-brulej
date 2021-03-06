package fr.dauphine.ja.brulejeremie.td00;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class PrimeCollection 
{ 
	int toto;
	String texte;
	ArrayList<Integer> numbers;
	
	protected PrimeCollection(ArrayList<Integer> numbers ) {
		this.numbers = numbers;
	}
	protected PrimeCollection() {
		this.numbers = new ArrayList<Integer>() ;
	}
		
	protected void initRandom(int n,int m) {
		Random random = new Random();
		for (int i=0; i< n ; i++) {
			this.numbers.add(random.nextInt(m));
		}	
	}
	
	
	protected boolean isPrime(int p) {
		int sqrt = (int) Math.sqrt(p);
		for (int i=2; i <= sqrt; i++) {
			if (p%i == 0 ){
				return false;
			}
		}
		return true;
	
	}
	
	protected void printPrimes() {
		Iterator it = this.numbers .iterator();
	    while(it.hasNext()) {
	    	int elem = (int)it.next();
	    	if ( isPrime(elem)== true ) {
	    		System.out.println(elem);
	    	}
	      }	
	}
	
    public static void main( String[] args )
    {
    	PrimeCollection collec = new PrimeCollection();
    	collec.initRandom( 100, 2000);
    	collec.printPrimes();
        
    }
}
