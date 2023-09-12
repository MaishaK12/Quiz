package lab01.quiz;

import java.util.Scanner;

public class Lab01Quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question[] quiz = new Question[6];

        // Add short answer and fill in the blank questions to quiz array
        quiz[0] = new Question("Which class is used to get user input?", "Scanner");
        quiz[1] = new Question("How many primitive data types are there in Java? Enter in words", "eight");
        quiz[2] = new Question("The inventor of Java was ___________", "James Gosling");
        quiz[3] = new Question("Every class in Java inherits from ___________", "Object");

        // Add multiple choice questions to quiz array
        String[] mcq1 = {"String", "Array", "Integer", "Iterator"};
        quiz[4] = new MultipleChoiceQuestion("What represents the collection of related data?", mcq1, "Array");

        String[] mcq2 = {"nextInt()", "next()", "nextBoolean()", "nextChar()"};
        quiz[5] = new MultipleChoiceQuestion("Which method does not belong to Scanner class?", mcq2, "nextChar()");

        // Display quiz and get answers
        for (int i = 0; i < quiz.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + quiz[i].toString());
            quiz[i].inputAnswer(sc);
        }
    }
}
