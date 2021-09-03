package strategy;

import java.util.ArrayList;

public class LinearSearch implements SearchBehavior {
    public boolean contains(ArrayList<String> items, String data) {

        for (String item : items) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }
}