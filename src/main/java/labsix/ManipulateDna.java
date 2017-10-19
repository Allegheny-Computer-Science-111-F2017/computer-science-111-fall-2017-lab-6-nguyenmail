package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ManipulateDna {
  /** This is a javadoc comment.
   * This a Javadoc comment.
   */   
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Enter a string containing only C, G, T and A: " + dna);
    String dna1 = dna.toUpperCase();
    // Step Two: Compute the complement of the DNA String
    String compDna1 = dna1.replace('A', 't');
    String compDna2 = compDna1.replace('C', 'g');
    String compDna3 = compDna2.replace('T', 'a');
    String compDna4 = compDna3.replace('G', 'c');
    String compDna = compDna4.toUpperCase();
    System.out.println("Complement of " + dna1 + " is " + compDna);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    String dnaletter = "ACTG";
    Random generator = new Random();
    int num = generator.nextInt(dnaletter.length());
    char insert = dnaletter.charAt(num);
    int pos = generator.nextInt(dna1.length());
    String addDna = (dna1.substring(0, pos) + insert + dna1.substring(pos, dna1.length()));
    System.out.println("Inserting " + insert + " in position " + pos + " gives " + addDna);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int pos1 = generator.nextInt(dna1.length());
    String delDna = (dna1.substring(0, pos1) + dna1.substring(pos1 + 1, dna1.length()));
    System.out.println("Deleting from position " + pos1 + " gives " + delDna);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int pos2 = generator.nextInt(dna1.length());
    String changeDna = dna1.replace(dna1.charAt(pos2), insert);
    System.out.println("Changing " + insert + " to position " + pos2 + " gives " + changeDna);

    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using the ManipulateDna program. " );

  }

}
