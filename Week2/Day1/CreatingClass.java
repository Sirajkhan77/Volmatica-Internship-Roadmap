package Week2.Day1;
class student{
    String name;
    int age;



    public student(String name, int age){
        this.name= name;
        this.age=age;
    }

}
public class CreatingClass {

    public static void main(String[] args) {
        student s=new student("siraj", 22);
        System.out.println(" Name is : "+s.name);
        System.out.println(" Age is: " +  s.age);

    }

}
