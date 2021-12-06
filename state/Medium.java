import java.util.Random;

public class Medium implements State {
    private static final int MAX = 50;
    protected Random rand;
    private ArithemeticGame game;

    public Medium(ArithemeticGame game) {
        this.game = game;
        rand = new Random();
    }

    public int getNum(){
       return rand.nextInt(MAX) + 1;
    }

    public String getOperation(){
        int randChoice = rand.nextInt(3);
        if(randChoice == 0){
            return "+";
        } else if(randChoice == 1) {
            return "-";
        } else {
            return "*";
        }
    }

    public void levelUp(){
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    public void levelDown(){
        System.out.println("You are struggling, let's go to easy mode.");
    }
}
