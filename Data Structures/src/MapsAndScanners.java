import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class MapsAndScanners {
	private static Scanner scanner;
	
	
	public static void main(String[] args) {
		try {
			File f = new File("covid317.csv");
			scanner = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HashMap<String, Integer> states = new HashMap<String, Integer>();
		
		int count = 0;
		scanner.nextLine();
		int total = 0;
		while (scanner.hasNextLine()) {
			String currentLine = scanner.nextLine();
			String[] split = currentLine.split(",");
			
			if (split[2].length()>0 && split[1].equals("CA")) {
				total+=Integer.valueOf(split[2]);
			}
			
			
			
			System.out.println(states.get("FL"));
		}
		
		System.out.println(total);
		
		
		
	}
	
	public static String get(String state, int column) {
		while (scanner.hasNextLine()) {
			String currentLine = scanner.nextLine();
			String[] split = currentLine.split(",");
			
			if (split[1].equals(state)) {
				return split[column];
			}
			
			
		}
		return "Failure. Data was not located";
	}
	
	public static int total(String state, int column) {
		int total = 0;
		while (scanner.hasNextLine()) {
			String currentLine = scanner.nextLine();
			String[] split = currentLine.split(",");
			
			if (split[1].equals(state) && split[2].length()>0) {
				total+=Integer.valueOf(split[2]);
			}
			
			
		}
		return total;
	}
	
}
