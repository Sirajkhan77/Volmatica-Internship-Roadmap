package Week2.Day3;

import java.util.Objects;

public class Contact {

    private String firstName;
    private String  phoneNo;

    Contact (String name, String phNo){
        setName(name);
        setPhNo(phNo);
    }
    public  void setName(String name){
        if (name.trim().isEmpty() || name.isEmpty()){
            System.out.println("Please Enter a Valid name: ");
        }
        this.firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public  void setPhNo(String number){
        if (number.trim().isEmpty() || number.isEmpty()){
            System.out.println("Please Enter a Valid Number: ");
        }else if(number.length()!=11){
            System.out.println("Please Enter 11 digits Number..");
        }else {
            this.phoneNo = number;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) && Objects.equals(phoneNo, contact.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, phoneNo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contact{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", phoneNo='").append(phoneNo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //    private String name;
//    private String phoneNumber;
//
//    public Contact(String name, String phoneNumber) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    // Overriding equals() is crucial for HashSet to compare objects correctly
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Contact contact = (Contact) o;
//        // Two contacts are considered duplicates if they have the same phone number
//        return Objects.equals(phoneNumber, contact.phoneNumber);
//    }
//
//    // Overriding hashCode() ensures equal objects map to the same bucket in the HashSet
//    @Override
//    public int hashCode() {
//        return Objects.hash(phoneNumber);
//    }
//
//    @Override
//    public String toString() {
//        return name + " (" + phoneNumber + ")";
//    }
}
