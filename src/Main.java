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
        System.out.println();
        System.out.println("Задача 2.1");
        int age2 = 18;
        if (age2 >= 18) {
            System.out.println("Добро пожаловать во взрослую жизнь, друг!");
        } else {
            System.out.println("Дружище, ещё не время, подожди немного :)");
        }
        System.out.println();
        System.out.println("Задача 2.2");
        int age3 = 2;
        if (age3 < 7) {
            System.out.print("");
        } else if (age3 >= 7 && age3 < 18) {
            System.out.println("Иди в школу!");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("Иди в университет!");
        } else {
            System.out.println("Иди на работу!");
        }
        System.out.println();
        System.out.println("Задача 2.3");
        int capacity1 = 102;
        int seatsCount1 = 60;
        int otherCount1 = capacity1 - seatsCount1;
        int seatsUsed1 = 60;
        int otherUsed1 = 60;
        if (seatsUsed1 < seatsCount1) {
            System.out.println("Есть ещё " + (seatsCount1 - seatsUsed1) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (otherUsed1 < otherCount1) {
            System.out.println("Есть ещё " + (otherCount1 - otherUsed1) + " стоячих мест");
        } else {
            System.out.println("Мест в вагоне нет!");
        }
        System.out.println();
        System.out.println("Задача 3.1");
        int age4 = 66;
        if (age4 >= 2 && age4 <=6) {
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 <= 18) {
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в школу");
        } else if (age4 > 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в университет");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + " то ему пора выходить на работу");
        }
        System.out.println();
        System.out.println("Задача 3.2");
        int age5 = 13;
        boolean isTooYoung = age5 < 5;
        boolean withAdult = age5 >= 5 && age5 < 14;
        if (isTooYoung) {
            System.out.println("Ты не можешь кататься на аттракционе");
        } else if (withAdult) {
            System.out.println("Ты можешь кататься только в сопровождении взрослого!");
        } else {
            System.out.println("Ты можешь кататься на аттракционе");
        }
        System.out.println();
        System.out.println("Задача 3.3");
        int a = 777;
        int b = 7;
        int c = 72;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        } else if (a == b || c == b) {
            System.out.println(b);
        } else if (a == c) {
            System.out.println(c);
        }
    }

}