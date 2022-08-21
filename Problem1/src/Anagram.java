import java.util.Scanner;

public class Anagram {
    public Anagram() {
        String firstString;
        String secondString;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first string:");
        firstString = scan.nextLine().toLowerCase();
        System.out.println("Please enter the second string:");
        secondString = scan.nextLine().toLowerCase();

        System.out.println(new DetectingAnagram().isAnagramSort(firstString, secondString));
    }
}
