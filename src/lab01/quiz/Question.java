// NOTE: this class has been left untouched

package lab01.quiz;

import java.util.Scanner;

public class Question {

    private String questionText;
    private String correctResponse;
    
    //Creates a question with an empty question and answer
    public Question(){
        this.setQuestionText("");
        this.setCorrectResponse("");
    }
    
    public Question(String text){
        this.setQuestionText(text);
    }
    public Question(String text, String answer){
        this.setQuestionText(text);
        this.setCorrectResponse(answer);
    }
    //sets the text of this question
    public void setQuestionText(String text){
        this.questionText = text;
    }
    //sets the answer for this question
    public void setCorrectResponse(String answer){
        this.correctResponse = answer;
    }
    
    public String getQuestionText(){
        return this.questionText;
    }
    
    public String getCorrectResponse(){
        return this.correctResponse;
    }
    
    /*
      checks the response/answer given for correctness
      @param givenResponse The response to check
      return true if the response is correct, false otherwise
    */
    public boolean verifyAnswer(String givenResponse){
        //it does not take into account upper/lower case characters.
        return givenResponse.equalsIgnoreCase(this.getCorrectResponse());
    }
    
    /*public String verifyAnswer(String givenResponse){
        String response = "";
        response = givenResponse.equalsIgnoreCase(this.getCorrectResponse())? "correct" : "incorrect";
        return response;
    }*/
    
    //allows user to type the answer
    public void inputAnswer(Scanner scan){
        System.out.print("Type your answer:");
        System.out.println(this.verifyAnswer(scan.nextLine()));
    }
    
    //display the question
    @Override
    public String toString(){
        return this.getQuestionText();
    }
}
