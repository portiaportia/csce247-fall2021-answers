package observer;

import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    public Store(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
        bestSellers = new LinkedList<>();
    }
    
    public void update(Book book){
        bestSellers.add(book);

        if(bestSellers.size() > 5){
            bestSellers.poll();
        }
    }

    public void display(){
        System.out.println("\nTop 5 Best Sellers:");
        for(Book book : bestSellers){
            System.out.println(" - " + book);
        }
    }
}
