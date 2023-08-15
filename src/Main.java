public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задание 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName  = "Ivanovich";
        String fullName  = String.format("%s %s %s", firstName, middleName, lastName);

        System.out.printf("Employee's full name — %s%n%n", fullName);
    }

    private static void task2() {
        System.out.println("Задание 2");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName  = "Ivanovich";
        String fullName  = String.format("%s %s %s", firstName, middleName, lastName);

        System.out.printf("Full name of the employee to fill out the report — %s%n%n", fullName.toUpperCase());
    }
    private static void task3() {
        System.out.println("Задание 3");

        String fullName  = "Иванов Семён Семёнович";

        System.out.printf("Name of the employee - %s%n%n", fullName.replace('ё', 'е'));
    }
}