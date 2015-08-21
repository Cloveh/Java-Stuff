import java.util.Scanner;

public class ClassMadlibs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		String[] words = new String[10];
		
		words[0] = "Verb";
		words[1] = "Proper noun";
		words[2] = "Adjective";
		words[3] = "Number";
		words[4] = "Noun";
		words[5] = "Adverb";
		words[6] = "Pronoun";
		words[7] = "Verb";
		words[8] = "Noun";
		words[9] = "Ajective";
		
		String[] imput = new String[10];
		
		for(int i=0; i< words.length; i++){
				System.out.println("Imput" + words[i]);
				imput[i]= scan.next();
				
			}
		
		System.out.println("You start" + imput[0] + "from the spooky scary skeletons. They scare your friend," + imput [1] + ", he is very spookd. " + input [2] + "");
		
	}
}
