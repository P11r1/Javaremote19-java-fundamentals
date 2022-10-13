package quiz;


import shopping.Product;

import java.util.Scanner;

/**
 * To create a quiz and give the final score
 * <p>
 * Quiz should be minimum of 5 question
 * For each right answer = 1 points
 * For each negative answer = 0 points
 * Finally display the correct answer and the total score
 * Display the result. PASS or FAIL?
 * <p>
 * <p>
 * Quiz example:
 * Dipslay question to user like this
 * a. What is the capital city of Estonia
 * 1. Tallinn
 * 2. Tartu
 * 3. Parnu
 * 4. Viljandi
 * Enter you answer
 * Invalid answer, please enter the option only
 * <p>
 * b. What...
 * <p>
 * Total score:
 * The correct answers:
 * a. Tallinn
 * b. right answer..
 *
 * Homework:
 * 1. Display the correct answer for each question
 * 2. Calculate total score
 *
 * @author Marko
 */

public class Quiz {
    public static void main(String[] args) {

        System.out.println("WELCOME TO THE QUIZ");
        System.out.println("-------------------");

        int totalScore = 0;
        int rightAnswer = 1;
        boolean hasPassed;


        Question[] questions = getRandomQuestion();
        Answers[] userAnswers = new Answers[questions.length];


        // Display questions and options
        for (int j = 0; j < questions.length; j++) {
            Question question = questions[j];
            System.out.println(question.getDescription());

            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println(i + ". " + question.getOptions()[i]);
            }

            System.out.println("Choose option from above:");

            //Creating a user answer object and assign it to the userAnswer array
            Answers answer = new Answers();
            answer.setQuestionId(question.getId());
            answer.setCorrectOptionIndex(getAnswerOption(question.getOptions().length));
            userAnswers[j] = answer;

        }

        Answers[] correctAnswers = getAnswers();

        //Total score calculation: Compare answerOptions of correctAnswer and the userAnswer
        for (Answers correctAnswer : correctAnswers) {
            for (Answers userAnswer : userAnswers) {
                if (correctAnswer.getQuestionId() == userAnswer.getQuestionId() && correctAnswer.getCorrectOptionIndex() == userAnswer.getCorrectOptionIndex()) {
                } totalScore += rightAnswer;
            }
        }


        System.out.println("Total score: " + totalScore);

        // pass score 50%
        hasPassed = totalScore >= questions.length / 2;

        System.out.println(hasPassed ? "PASSED" : "FAILED");
    }


    private static Question[] getRandomQuestion() {
        Question question1 = new Question();
        question1.setId(10000L);
        question1.setDescription("What is the capital of Estonia?");
        question1.setOptions(new String[]{"Tartu", "Narva", "Tallinn", "Viljandi"});

        Question question2 = new Question();
        question2.setId(100001L);
        question2.setDescription("What is Estonia's native language?");
        question2.setOptions(new String[]{"English", "Finnish", "Russian", "Estonian"});

        Question question3 = new Question();
        question3.setId(10005L);
        question3.setDescription("How many wonders in the world");
        question3.setOptions(new String[]{"3", "9", "7"});


        return new Question[]{question1, question2, question3};
    }

    private static Answers[] getAnswers() {
        Answers answer1 = new Answers();
        answer1.setId(2000L);
        answer1.setQuestionId(10000L);
        answer1.setCorrectOptionIndex(2);

        Answers answer2 = new Answers();
        answer2.setId(2001L);
        answer2.setQuestionId(100001L);
        answer2.setCorrectOptionIndex(3);

        Answers answer3 = new Answers();
        answer3.setId(2002L);
        answer3.setQuestionId(10005L);
        answer3.setCorrectOptionIndex(2);

        return new Answers[]{answer1, answer2, answer3};
    }

    private static int getAnswerOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option. Please enter again:";

        int option = limit + 1;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt(); // correct input

                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }

        } while (option > limit);

        return option;
    }
}

