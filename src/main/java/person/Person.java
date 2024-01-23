package person;

public class Person {
    private double height;
    private double weight;
    private String socialSecurityNumber;
    private long phoneNumber;

    public double getHeight() {
        return height;
    }

    Person(double height, double weight, String socialSecurityNumber, long phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Person otherPerson = (Person) obj;
        return socialSecurityNumber.equals(otherPerson.socialSecurityNumber);
    }

}
