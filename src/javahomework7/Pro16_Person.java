package javahomework7;

/* 16. Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
 */
public class Pro16_Person {

    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean setAge(int age) {
        if (age < 0 && age > 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTeen() {
        if (age > 12 || age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;

    }

    public static void main(String[] args) {
        Pro16_Person person = new Pro16_Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }
}




