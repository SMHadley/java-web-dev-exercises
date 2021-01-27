package exercises;

import java.util.*;


public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnWords = arrayPractice.splitString();


// Alternately: ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50));
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(10);
//        numbers.add(15);
//        numbers.add(20);
//        numbers.add(25);
//        numbers.add(30);
//        numbers.add(35);
//        numbers.add(40);
//        numbers.add(45);
//        numbers.add(50);
//
//        Integer theTotalSum = ArrayListPractice.sumOfEvenIntegers(numbers);
//        System.out.println("The sum of the even integers is: " + theTotalSum);
// Alternately: System.out.println("The sum of the even integers is: " + theTotalSum.toString());

        ArrayList<String> wordsForSearch  = new ArrayList<String>(Arrays.asList(returnWords));
        System.out.println("Please enter word length for search: ");
        Integer wordSearchLength = ArrayListPractice.userInput();
        ArrayListPractice.printFiveLetterWords(wordsForSearch, wordSearchLength);

    }

    public static Integer userInput() {
        Scanner input = new Scanner (System.in);
        Integer searchInput = input.nextInt();
        input.close();
        return searchInput;
    }

    public static void printFiveLetterWords(ArrayList<String> words, Integer wordLengthSearch) {
        for(int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == wordLengthSearch) {
                System.out.println(words.get(i));
            }
        }

    }
    public static Integer sumOfEvenIntegers(ArrayList<Integer> allIntegers) {
        Integer totalSum = 0;
        for (int i = 0; i < allIntegers.size(); i++) {
            if (allIntegers.get(i) % 2 == 0) {
                 totalSum += allIntegers.get(i);
            }
        }
        return totalSum;
    }

}
