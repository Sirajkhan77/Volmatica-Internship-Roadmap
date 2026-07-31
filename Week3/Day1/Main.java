package Week3.Day1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository<Student> studRepo= new Repository<>();
        studRepo.save(1, new Student(1, "siraj"));
        studRepo.save(2, new Student(2, "Backend"));
        studRepo.save(3, new Student(3, "Khan"));
        System.out.println(studRepo.findAll());
        System.out.println(studRepo.findById(2));
        studRepo.delete(2);
        System.out.println(studRepo.findAll());

        Repository<Product> p = new Repository<>();
        p.save(1, new Product(1,"EarBuds"));
        p.save(2, new Product(2, "Nike"));

        System.out.println(p.findAll());

    }
}
