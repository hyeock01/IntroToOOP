package encapsulation;

public class Person {
    private String name;
    private String sinnum;

    public Person(String name, String sinnum) {
        this.name = name;
        this.sinnum = sinnum;
    }

    public String getName() {
        return name;
    }

    private String generateId(){
        return sinnum + "!!" + name + "%%";
    }

    public boolean isSamePerson(Person other){
        return this.generateId().equals(other.generateId());
    }
}
