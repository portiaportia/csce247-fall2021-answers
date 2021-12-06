
import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    protected Scanner reader;

    public ArithemeticGame() {
        reader = new Scanner(System.in);
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.state = easyState;
    }

    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        int answer = 0;
        String question = "";
        String operation = state.getOperation();

        if(operation.equals("+")){
            answer = num1 + num2;
            question = num1 + " + " + num2;
        } else if(operation.equals("-")){
            answer = num1 - num2;
            question = num1 + " - " + num2;
        } else if(operation.equals("*")){
            answer = num1 * num2;
            question = num1 + " * " + num2;
        } else if(operation.equals("/")){
            answer = num1 / num2;
            question = num1 + " / " + num2;
        }

        int userAnswer = getUserAnswer(question);
        giveFeedback(answer, userAnswer);
        adjustScore(answer, userAnswer); 
        adjustLevel();        
    }

    private int getUserAnswer(String question){
        System.out.print(question + ": ");
        return Integer.parseInt(reader.nextLine());
    }

    private void giveFeedback(int correctAns, int userAns){
        if(correctAns == userAns) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    private void adjustScore(int correctAns, int userAns){
        if(correctAns == userAns) {
            score++;
        } else {
            score--;
        }
    }

    private void adjustLevel(){
        if(score >= 3) {
            state.levelUp();
            score = 0;
        }
        if(score <= -3) {
            state.levelDown();
            score = 0;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
