package Week2.Day1;

import java.util.ArrayList;
import java.util.List;

public class KodelixApp {
    public static void main(String[] args) {
        List<Employees> team = new ArrayList<>();
        team.add(new Employees("Siraaj", "Backend", 60000));
        team.add(new Employees("Amir", "Frontend", 55000));
        team.add(new Employees("Umer", "DevOps", 65000));
        team.add(new Employees("Saqlain", "QA", 50000));
        Employees lead = team.get(0);
        lead.applyRaise(10);
        lead.printDetails();
    }
}
