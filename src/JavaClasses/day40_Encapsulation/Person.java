package JavaClasses.day40_Encapsulation;

public class Person {

    private long SSN;
    private long Id;

    public String name;


    public Person(String name){
        this.name = name;

    }


    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }


    public String toString() {
        return "Person{" +
                "SSN=" + SSN +
                ", Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
