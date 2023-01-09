package homeWorks.homeWork4;

import homeWorks.homeWork4.Pensioner;
import homeWorks.homeWork4.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAgeOfPerson(80);
        worker.setMaxSalary(5000);
        worker.setMinSalary(2000);

        System.out.println(worker.calculatePension());
    }
}
