package strategy;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch implements SearchBehavior {
    public boolean contains(ArrayList<String> items, String data) {

        Collections.sort(items);
        return binarySearch(items, data, 0, items.size() - 1);
    }

    public boolean binarySearch(ArrayList<String> items, String data, int lowIndex, int highIndex) {

        if (lowIndex > highIndex)
            return false;

        int midIndex = (lowIndex + highIndex) / 2;

        if (data.equals(items.get(midIndex))) {
            return true;
        } else if (data.compareTo(items.get(midIndex)) > 0) {
            return binarySearch(items, data, midIndex + 1, highIndex);
        } else {
            return binarySearch(items, data, 0, midIndex - 1);
        }
    }
}