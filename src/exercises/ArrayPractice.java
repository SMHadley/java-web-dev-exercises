package exercises;


import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
//        arrayPractice.printOddNumbers();
//        arrayPractice.splitString();
        arrayPractice.splitToSentence();

    }
        public void printOddNumbers() {
            int[] intArray = {1, 1, 2, 3, 5, 8};

            for (int i : intArray) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
            public String [] splitString() {

                String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";

                String[] greenEggsArray = greenEggs.split(" ");
//                System.out.println(Arrays.toString(greenEggsArray));
                return greenEggsArray;
            }

            public void splitToSentence() {

                String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";

                String[] greenEggsArray = greenEggs.split("\\.");
                System.out.println(Arrays.toString(greenEggsArray));

    }
        }




