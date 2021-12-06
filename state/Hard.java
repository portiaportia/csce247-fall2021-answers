import java.util.Random;

public class Hard implements State {
    private static final int MAX = 50;
    protected Random rand;
    private ArithemeticGame game;

    public Hard(ArithemeticGame game) {
        this.game = game;
        rand = new Random();
    }

    public int getNum(){
       return rand.nextInt(MAX) + 1;
    }

    public String getOperation(){
        int randChoice = rand.nextInt(4);
        if(randChoice == 0){
            return "+";
        } else if(randChoice == 1) {
            return "-";
        } else if(randChoice == 2) {
            return "*";
        } else {
            return "/";
        }
    }

    public void levelUp(){
        System.out.println("You are doing so well!!!");
    }

    public void levelDown(){
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }
}
