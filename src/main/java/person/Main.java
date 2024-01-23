package person;

public class Main {


    public static void main(String[] args) {
        Person[] persons = {
                new Person(6.3, 70.2, "100-200-1567", 15000),
                new Person(7.2, 55.4, "100-200-1567", 25000),
                new Person(5.2, 45.8, "350-420-7066", 10000)
        };
        for(int i = 0; i < persons.length - 1; i++) {
            if(persons[i].equals(persons[i+1]))
                System.out.println("Same");
            else
                System.out.println("Not same");
        }
    }
}
