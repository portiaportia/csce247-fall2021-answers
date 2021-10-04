public class Airline {
    private String title;
    private Flight[] flights;
    private int size = 0;

    public Airline(String title){
        this.title = title;
        flights = new Flight[2];
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
        if(size == flights.length){
            flights = growArray(flights);
        }
        
        flights[size] = new Flight(flightNum, from, to, duration, transfers);
        size++;
    }

    public Flight[] growArray(Flight[] flights){
        Flight[] temp = new Flight[flights.length *2];

        for(int i=0; i< flights.length; i++){
            temp[i] = flights[i];
        }

        return temp;
    }

    public String getTitle(){
        return title;
    }

    public FlightIterator createIterator(){
        return new FlightIterator(flights);
    }
}
