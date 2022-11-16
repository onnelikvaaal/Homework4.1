public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.1");
         int age = 5;
         if (age >= 18) {
             System.out.println("Добро пожаловать во взрослую жизнь, друг!");
         }
         if (age < 18) {
             System.out.println("Дружище, ещё не время, подожди немного :)");
         }
        System.out.println();
        System.out.println("Задача 1.2");
        int age1 = 10;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Иди в школу!");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Иди в университет!");
        }
        if (age1 >= 24) {
            System.out.println("Иди на работу!");
        }
        System.out.println();
        System.out.println("Задача 1.3");
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount;
        int seatsUsed = 17;
        int otherUsed = 35;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть ещё " + (seatsCount - seatsUsed) + " сидячих мест");
        }
        if (seatsUsed == seatsCount) {
            System.out.println("Сидячих мест нет!");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть ещё " + (otherCount - otherUsed) + " стоячих мест");
        }
        if (otherUsed == otherCount) {
            System.out.println("Мест в вагоне нет!");
        }
    }

}