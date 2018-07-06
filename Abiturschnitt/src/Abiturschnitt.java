	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.stream.Stream;
	import java.io.File;
	import java.util.Scanner;


public class Abiturschnitt {
	

	static int [] notenBlockEins;


	static int punkteB1;
	static int punkteB2;
	
	//static int[]notenBlockEins={15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, };
	static int [] notenBlockZwei={ 15, 15, 15, 15, 15};
	public static void main(String[] args) {
		
		//System.out.println(blockEins(notenBlockEins));
		//System.out.println(blockZwei(notenBlockZwei));
		
		
		//System.out.println(gesamt());
		System.out.println(readFile());
	}
	public static int blockEins (int [] notenBlockEins){ //gesamtpunktzahl block 1 wird aus array berechnet
		int sum=0;

		int size=notenBlockEins.length;
		
		
		
		for (int i=0; i<size; i++){
			
			 sum = sum + notenBlockEins[i];
		}
		
		if (size==40){
			punkteB1=sum;
		}
		else{
			punkteB1=(sum/size)*40;
		}
		return punkteB1;
	}
	
	public static int blockZwei( int [] notenBlockZwei){ //gesamtpunktzahl block 2 wird aus array berechnet
		int sum=0;

		int size= notenBlockZwei.length;
		
		for (int i=0; i<size; i++){
			
			sum = sum + notenBlockZwei[i]*4;
		}
		
		punkteB2= sum;
		
		return punkteB2;
		
	}
	
	/*static void importFile() {
	    
	     //Liest die Datei ein und speichert sie in den String[][] array
		
	    try{
	    	
	        BufferedReader reader = new BufferedReader(new FileReader("textdatei.txt"));
	        String line;
	        
	        for(int i = 0; (line = reader.readLine()) != null; i++) {
	            notenBlockEins[i] = line.split(" ");
	        }

	        reader.close();

	    } // end try
	    catch(FileNotFoundException ex){
	        System.out.println("File nicht gefunden");
	    } // end catch
	    catch(IOException ex){
	        System.out.println ("Lesefehler");
	    } // end catch
	    catch (IndexOutOfBoundsException ex) {
	        System.out.println("ups, der int [] notenBlockEins ist zu klein für diese Textfilegroesse");
	        System.out.println("maximal sind "+notenBlockEins.length+" Zeilen moeglich, sonst muss die Groesse von array in Zeile 9 erhoeht werden");
	        System.exit(1);
	    } // end try

	    int foo= notenBlockEins[0];
	    System.out.println(foo);
	    
	} // end importFile*/

	
	public static double gesamt(){		//gesamtschnitt wird aus der gesamtpunktzahl berechnet
		
		int gesamtpunkte= blockZwei(notenBlockZwei) + blockEins(notenBlockEins);
		System.out.println(gesamtpunkte);
		
		double punkteschnitt= gesamtpunkte/60.0;
		//System.out.println(punkteschnitt);
		
		double abischnitt= (17-punkteschnitt)/3;
		//System.out.println(abischnitt);
		
		if (abischnitt<1.0){
			abischnitt=1.0;
		}
		
		return abischnitt;
		
	} 
	public static int [] readFile( ) throws {
		 
		 /*try{
	        @SuppressWarnings("resource")
			Scanner b = new Scanner(f);
	        int [] notenBlockEins = new int[b.nextInt()];
	            for(int i = 0; i < notenBlockEins.length; i++){
	                notenBlockEins[i] = b.nextInt();
	            }
	        for (int o : notenBlockEins){
	            System.out.println(o);
	        }
			// reader.close();

		 }*/
		 
		 try{
		    	
		        BufferedReader reader = new BufferedReader(new FileReader("textdatei.txt"));
		        String line;
		        
		        for(int i = 0; (line = reader.readLine()) != null; i++) {
		        }

		        reader.close();

	} // end try
		 catch(FileNotFoundException ex){
		        System.out.println("File nicht gefunden");
		    } // end catch
		    catch(IOException ex){
		        System.out.println ("Lesefehler");
		    } // end catch
		    catch (IndexOutOfBoundsException ex) {
		        System.out.println("ups, der int [] notenBlockEins ist zu klein für diese Textfilegroesse");
		        System.out.println("maximal sind "+notenBlockEins.length+" Zeilen moeglich, sonst muss die Groesse von array in Zeile 9 erhoeht werden");
		        System.exit(1);
		    } // end try
		 
		 
	        return notenBlockEins;
	    }
	
	
	/*public void toString(String array[]){
		for (int i=0; i<array.length; i++){
			for 
		}
	}*/
	

}
