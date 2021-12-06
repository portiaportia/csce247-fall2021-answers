import java.util.Random;

public class Easy implements State {
    private static final int MAX = 10;
    protected Random rand;
    private ArithemeticGame game;

    public Easy(ArithemeticGame game) {
        this.game = game;
        rand = new Random();
    }

    public int getNum(){
       return rand.nextInt(MAX) + 1;
    }

    public String getOperation(){
        if(rand.nextBoolean()){
            return "+";
        } else {
            return "-";
        }
    }

    public void levelUp(){
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }

    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study.");
    }

}
