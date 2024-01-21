package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Book hp = new Book("Harry Potter", "J.K.");
        System.out.println(hp.getTitle());
        System.out.println(hp.getAuthor());
        hp.setBorrowed(true);
        System.out.println(hp.isBorrowed());

        Person kim = new Person("김","123545676");
        Person kim2 = new Person("김","123545676");
        Person lee = new Person("이","987654321");

        System.out.println(kim.isSamePerson(lee));
        System.out.println(kim.isSamePerson(kim2));
    }
}
