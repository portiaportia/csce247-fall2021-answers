package observer;

import java.util.ArrayList;

public class Customer implements Observer{
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName){
        this.subject = subject;
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<>();
    }

    @Override
    public void update(Book book) {
        wishList.add(book);
    }

    public void display(){
        System.out.println("\nWish List:");
        for(Book book : wishList){
            System.out.println(" - " + book);
        }
    }
}
