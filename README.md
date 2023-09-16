# Quiz
My first lab for my Data Structures and Algorithms class.

Inheritance, overriding, polymorphism and instanceof:
  Copy Week01-Quiz project (Demo project, posted under Week 1 learning materials) and paste it to a new project for this lab. Call it Lab01-Quiz.
  A multiple choice question object differs from a Question object as it store the various choices for the answer.

MultipleChoiceQuestion class:
  Create a class MultipleChoiceQuestion which inherits from Question class.
  Declare an instance array variable to hold 4 answer choices.
  Create a constructor as required.
  Declare and define a method for adding answer choices.
    public void addChoices(String choiceText, boolean isCorrect)
    The method has two parameters: the answer choice to be added and a Boolean value to indicate whether this choice is correct. For example, objectName.addChoices("Array",true);
    It means, for the second argument pass false against the wrong choices. For example, objectName.addChoices("String", false);
    choiceText is saved in instance array variable. Remember, process an array using for loop.
    if the second argument is true, then text becomes the correct response. In order to set it to correct answer, call setCorrectResponse() of Question class.
  Override toString() to handle the display of answer choices so that the respondent can choose one of them.
    Declare a local String variable, myOutput.
    To display the question text, call and append superclass’s toString() to myOutput variable.
    To display the answer choices, append the contents of instance array variable to myOutput variable.
    Return myOutput.

Tester class:
  Modify Tester class so that a quiz can be presented with a mixture of short answer, fill in the blank and multiple choice questions.
  Change the size of quiz array to 6.
  Create any two multiple choice questions and save them into the array.
  Let the respondent enter answer to every question as displayed.
