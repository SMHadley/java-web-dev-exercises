package exercises;

import java.util.*;


public class Alice {
    public static void main (String[] args) {
        String searchTerm;
        String quote;

        Scanner input = new Scanner(System.in);
        quote = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she" +
                " had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use of a" +
                " book,' thought Alice 'without pictures or conversation?'";
        System.out.println(quote);
        System.out.println("Please enter search term: ");
        searchTerm = input.nextLine();
        input.close();
        String [] quoteArray = quote.toLowerCase(Locale.ROOT).split(" ");
        int index = quote.indexOf(searchTerm);
        String [] extractWord = quote.toLowerCase(Locale.ROOT).split(String.valueOf(searchTerm));
//
        if (Arrays.asList(quoteArray).contains(searchTerm)) {
            System.out.println("The search term " + searchTerm + " was found");
            System.out.println("Index of search term: " + index);
            System.out.println("Length of search term: " + searchTerm.length());
//            System.out.println(quoteMinusWord);
        } else {
            System.out.println("The search term " + searchTerm + " was not found");
        }

    }

}


