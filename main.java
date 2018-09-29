import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
	
	public static ArrayList<String> readDictionary() {
		File filePath = new File("data/words.txt");
		ArrayList<String> dictionary = new ArrayList<>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			
			String line;
			
//			line = reader.readLine();
//			while (line != null) {
//				dictionary.add(line);
//				line = reader.readLine();
//			}
			
			// above and below are exact same.
			
			while ( (line = reader.readLine()) != null) {
				dictionary.add(line);
			}
			
			
		} catch (NoSuchFileException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("IO Exception!");
		}
		
		return dictionary;		
	}

	public static ArrayList<String> readWordList() {

		
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		userInput.split(", ");
		ArrayList <String> inputList = new ArrayList();
		inputList.add(userInput);
		return inputList;
	}
	
	
	public static boolean isUniqueList(ArrayList<String> stringList) {
		for(int count=0; count<stringList.size(); count++) {
			for(int other=0; other<stringList.size(); other++) {
				if(count == other) {
					continue;
				}
				if(stringList.get(count).equals(stringList.get(other))) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(readWordList());
		// System.out.print(readDictionary());
		// ArrayList<String> dict = readDictionary();
		
		ArrayList<String> l = readWordList();
		ArrayList<String> myList = new ArrayList();
//		String testInput = "cat,bat,    tab, sit";
//		for (String word: testInput.split(", *")) {
//			System.out.println(word);
//		}
		
		
		/*int[] array = new int[50];
		int[] array2 = {1, 2, 3};
		
		array2[2] = 4;
		array2[3] = 5;
		
		ArrayList<Integer> array3 = new ArrayList<Integer>();
		
		array3.add(1);
		array3.add(2);
		array3.add(3);
		
		array3.get(1);
		
		array3.size();
		String[] words = new String[68435453];*/
		
	}
}

