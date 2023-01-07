package homeWorks.homeWork4;

import homeWorks.homeWork2.PensionFond;

public class Worker extends Person implements AbleToCalculatePension{

   PensionFond pensionFond = new PensionFond("money", true, "01.01.2000");

        private int minSalary;
        private int maxSalary;

        public void setMinSalary(int minSalary) {
            this.minSalary = minSalary;
        }

        public int getMinSalary() {
            return minSalary;
        }

        public void setMaxSalary(int maxSalary) {
            this.maxSalary = maxSalary;
        }

        public int maxSalary() {
            return maxSalary;
        }

        @Override
        public void die() {
            System.out.println("Этот человек не дожил до пенсии");
        }

    @Override
    public double calculatePension() {
            double state = pensionFond.countOfPension(80,2000, 5000);
        return state;
    }
}

