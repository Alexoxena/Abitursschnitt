	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.stream.Stream;

public class Abiturschnitt {
	

	


	static int punkteB1;
	static int punkteB2;
	
	int [] notenBlockEins;
	int [] notenBlockZwei;

	public static void main(String[] args) {
		
		int[]notenBlockEins={15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, };
		
		
		System.out.println(blockEins(notenBlockEins));
		}
	

	public static int blockEins(int [] notenBlockEins){
		int sum=0;

		int size=notenBlockEins.length;
		
		
		
		for (int i=0; i<=size; i++){
			
			 sum = sum+notenBlockEins[i];
		}
		
		if (size<=39){
			punkteB1=sum;
		}
		else{
			punkteB1=(sum/size)*40;
		}
		return punkteB1;
	}
	
	public int blockZwei( int [] notenBlockZwei){
		int sum=0;

		int size=notenBlockZwei.length;
		
		for (int i=0; i<=size; i++){
			
			sum = sum+ notenBlockZwei[i]*4;
		}
		
		punkteB2=sum;
		
		return punkteB2;
		
	}
	
	/*static void importFile() {
	    
	     //Liest die Datei ein und speichert sie in den String[][] array
	     String [] array;
		
	    try{
	    	
	        BufferedReader reader = new BufferedReader(new FileReader("textdatei.txt"));
	        String line;
	        
	        for(int i = 0; (line = reader.readLine()) != null; i++) {
	            array[i] = line.split(" ");
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
	        System.out.println("ups, der String[][] array ist zu klein für diese Textfilegroesse");
	        System.out.println("maximal sind "+array.length+" Zeilen moeglich, sonst muss die Groesse von array in Zeile 9 erhoeht werden");
	        System.exit(1);
	    } // end try

	    
	    
	} // end importFile*/

	
	public double gesamt(){
		
		int gesamtpunkte= blockZwei(notenBlockZwei) + blockEins(notenBlockEins);
		
		double punkteschnitt= gesamtpunkte/60.0;
		
		double abischnitt= (17-punkteschnitt)/3;
		
		return abischnitt;
		
	} 
	

}
