public class Flight {
    String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom(){
        return from;
    }

    public String getTo(){
        return to;
    }

    public int getDuration(){
        return duration;
    }

    public int getNumTransfers(){
        return transfers;
    }

    private String getFormattedDuration(){
        int hours = duration / 60;
        int minutes = duration - hours * 60;
        return hours + " hours " + minutes + " minutes";
    }

    private String getTransferString(){
        if(transfers == 0){
            return "Direct Flight";
        } else if(transfers == 1) {
            return "1 Transfer";
        } else {
            return transfers + " Transfers";
        }
    }

    public String toString(){
        return "Flight Number: " + flightNum + "\nFrom: " + from + "\nTo: " + to + "\nDuration: " + getFormattedDuration() + "\n" + getTransferString();
    }
}
