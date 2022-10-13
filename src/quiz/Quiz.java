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
 * 2 Tartu
 * 3. Parnu
 * 4. Viljandi
 * Enter you answer
 * Invalid answer, please enter the option only
 * <p>
 * b. What
 * <p>
 * Total score:
 * The correct answers:
 * a. Tallinn
 * b. right answer..
 *
 * @author Marko
 */
public class Quiz {
    public static void main(String[] args) {

        System.out.println("WELCOME TO THE QUIZ");
        System.out.println("-------------------");

        int totalScore = 0;
        int rightAnswer = 1;
        int wrongAnswer = 0;
        boolean hasPassed = false;


        Question[] questions = getRandomQuestion();
        Answers[] userAnswers = new Answers[questions.length];

        for (int j = 0; j < questions.length; j++) {
            Question question = questions[j];
            System.out.println(question.getDescription());

            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println(i + ". " + question.getOptions()[i]);
            }

            System.out.println("Choose option from above:");
            Answers answer = new Answers();
            answer.setQuestionId(question.getId());
            answer.setCorrectOptionIndex(getAnswerOption(question.getOptions().length));
            userAnswers[j] = answer;

        }

        Answers[] correctAnswers = getAnswers();

        for (Answers correctAnswer : correctAnswers) {
            for (int j = 0; j < userAnswers.length; j++) {
                if(correctAnswer.getQuestionId() == userAnswers[j].getQuestionId() && correctAnswer.getCorrectOptionindex == userAnswers[j].getCorrectOptionIndex()) {
                    totalScore += rightAnswer;
                }
            }
            Answers[] correctAnswer = correctAnswers[j];

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
        question1.setOptions(new String[]{"1. Tartu \n2. Narva \n3. Tallinn \n4. Viljandi"});

        Question question2 = new Question();
        question2.setId(100001L);
        question2.setDescription("What is Estonia's native language?");
        question2.setOptions(new String[]{"1. English \n2. Finnish \n3. Russian \n4. Estonian"});

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
        answer1.setCorrectOptionIndex(3);

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

