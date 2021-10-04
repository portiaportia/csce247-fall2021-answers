import java.util.Iterator;

public class FlightIterator implements Iterator {
    private Flight[] flights;
    int position = 0;

    public FlightIterator(Flight[] flights){
        this.flights = flights;
    }

    @Override
    public boolean hasNext() {
        return flights.length > position && flights[position] != null;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return flights[position++];
        }
        return null;
    }
    
}
