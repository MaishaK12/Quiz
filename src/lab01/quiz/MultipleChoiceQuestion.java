package lab01.quiz;

public class MultipleChoiceQuestion extends Question {

    private String[] answers = new String[4]; // Array of 4 to store answer choices

    public MultipleChoiceQuestion(String text, String[] answers, String correctAnswer) {
        super(text, correctAnswer);
        this.answers = answers;
    }

    // Method for adding answer choices to question(s)
    public void addChoices(String choiceText, boolean isCorrect) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == null) {
                answers[i] = choiceText; // Add choice text to array
                if (isCorrect) {
                    setCorrectResponse(choiceText); // Set as correct response
                }
                break;
            }
        }
    }

    // Override toString method to display question and answer choices
    @Override
    public String toString() {
        String myOutput = super.toString(); // Get question text from superclass

        // Append answer choices to myOutput
        for (int i = 0; i < answers.length; i++) {
            myOutput += "\n" + (i + 1) + ". " + answers[i];
        }
        return myOutput;
    }

}
