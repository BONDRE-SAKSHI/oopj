package org.example.main;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class Program {
	public static Dictionary<Integer, String> getDictionary( ){
		Dictionary<Integer, String> d  = new Hashtable<>();	//Upcasting
		d.put(1,"PreDAC");
		d.put(2,"DAC");
		d.put(3,"DMC");
		d.put(4,"DIVESD");
		d.put(5,"DESD");
		d.put(6,"DBDA");
		return d;
	}
	private static void countAndPrintEntries(Dictionary<Integer, String> d) {
		System.out.println("Count of entries	:	"+d.size());
	}
	private static void printKeys(Dictionary<Integer, String> d) {
		Enumeration<Integer> keys = d.keys();
		Integer key = null;
		while( keys.hasMoreElements()) {
			key = keys.nextElement();
			System.out.println( key );
		}
	} 
	private static void printValues(Dictionary<Integer, String> d) {
		Enumeration<String> values = d.elements();
		String value = null;
		while( values.hasMoreElements()) {
			value = values.nextElement();
			System.out.println(value);
		}
	}
	private static void printValue(Dictionary<Integer, String> d, int courseId) {
		Integer key = new Integer( courseId );
		String value = d.get(key);
		if( value != null )
			System.out.println(key+"	"+value);
		else
			System.out.println("Invalid key");
	}
	private static void removeEntry(Dictionary<Integer, String> d, int courseId) {
		Integer key = new Integer( courseId );
		String value = d.remove(key);
		if( value != null )
			System.out.println(key+"	"+value+" is removed");
		else
			System.out.println("Invalid key");
	}
	public static void main(String[] args) {
		Dictionary<Integer, String> d = Program.getDictionary();
		//Program.countAndPrintEntries( d );
		//Program.printKeys( d );
		//Program.printValues( d );
		//Program.printValue( d, 2 );
		Program.removeEntry( d, 200);
	}
}
