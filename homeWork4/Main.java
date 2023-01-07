package homeWorks.homeWork4;

import homeWorks.homeWork4.Pensioner;
import homeWorks.homeWork4.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Pensioner pensioner = new Pensioner();


        System.out.println(worker.calculatePension());

        double example = pensioner.setPension(367.5);
//        pensioner.setAgeOfPerson(70);
//
        System.out.println(pensioner.getAgeOfPerson());
        System.out.println(example);





        pensioner.die();
        worker.die();
    }
}
