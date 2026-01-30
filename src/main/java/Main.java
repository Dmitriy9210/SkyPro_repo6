public class Main {

    public static void main(String[] args) {

        System.out.println("Exersice 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("____________________");

        System.out.println("Exersice 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("____________________");

        System.out.println("Exersice 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("____________________");

        System.out.println("Exersice 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("____________________");

        System.out.println("Exersice 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }
        System.out.println("____________________");

        System.out.println("Exersice 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("____________________");

        System.out.println("Exersice 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("____________________");

        System.out.println("Exersice 8");
        int sum = 29000;
        int newSum = sum;
        for (int i = 1; i <= 12; i++) {
            System.out.printf("«Месяц %s, сумма накоплений равна %s рублей»%n", i, newSum);
            newSum = sum + newSum;
        }
        System.out.println("____________________");

        System.out.println("Exersice 9");
        sum = 29000;
        double newSalary = 0;
        for (int i = 1; i <= 12; i++) {
            newSalary = sum + newSalary + newSalary / 100;
            System.out.printf("«Месяц %s, сумма накоплений равна %s рублей»%n", i, newSalary);
        }
        System.out.println("____________________");

        System.out.println("Exersice 10");
        for (int i = 0; i <= 10; i++) {
            int y = 2 * i;
            System.out.printf("2*%s=%s%n", i, y);
        }
        System.out.println("____________________");
    }
}
