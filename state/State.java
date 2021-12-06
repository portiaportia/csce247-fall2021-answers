import java.util.Random;
import java.util.Scanner;

public interface State {

    public int getNum();

    public String getOperation();

    public void levelUp();

    public void levelDown();
}