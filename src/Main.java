import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Проверка возраста (совершеннолетие)
        System.out.print("Введите возраст человека для проверки совершеннолетия: ");
        int ageCheck = scanner.nextInt();

        if (ageCheck >= 18) {
            System.out.println("Если возраст человека равен " + ageCheck + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + ageCheck + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача 2: Проверка температуры
        System.out.print("Введите температуру воздуха: ");
        double temperature = scanner.nextDouble();

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        // Задача 3: Проверка скорости
        System.out.print("Введите скорость автомобиля (км/ч): ");
        int speed = scanner.nextInt();

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        // Задача 4: Определение учреждения по возрасту (отдельный вопрос)
        System.out.print("Введите возраст человека для определения учреждения: ");
        int educationAge = scanner.nextInt();

        if (educationAge >= 2 && educationAge <= 6) {
            System.out.println("Если возраст человека равен " + educationAge + ", то ему нужно ходить в детский сад.");
        } else if (educationAge >= 7 && educationAge <= 17) {
            System.out.println("Если возраст человека равен " + educationAge + ", то ему нужно ходить в школу.");
        } else if (educationAge >= 18 && educationAge <= 24) {
            System.out.println("Если возраст человека равен " + educationAge + ", то его место в университете.");
        } else if (educationAge > 24) {
            System.out.println("Если возраст человека равен " + educationAge + ", то ему пора ходить на работу.");
        }

        // Задача 5: Проверка возможности кататься на аттракционе
        System.out.print("Введите возраст ребенка для аттракциона: ");
        int rideAge = scanner.nextInt();

        if (rideAge < 5) {
            System.out.println("Если возраст ребенка равен " + rideAge + ", то ему нельзя кататься на аттракционе.");
        } else if (rideAge >= 5 && rideAge < 14) {
            System.out.println("Если возраст ребенка равен " + rideAge + ", то ему можно кататься на аттракционе только в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + rideAge + ", то он может кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6: Проверка свободных мест в вагоне
        System.out.print("Введите количество пассажиров в вагоне: ");
        int passengers = scanner.nextInt();
        int maxCapacity = 102;
        int seatCapacity = 60;

        if (passengers < seatCapacity) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (passengers < maxCapacity) {
            System.out.println("В вагоне есть только стоячие места.");
        } else {
            System.out.println("Вагон полностью забит.");
        }

        // Задача 7: Определение наибольшего из трех чисел
        System.out.print("Введите первое число: ");
        int one = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int two = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int three = scanner.nextInt();

        int max = one;

        if (two > max) {
            max = two;
        }
        if (three > max) {
            max = three;
        }

        System.out.println("Наибольшее число: " + max);

        scanner.close(); // Закрываем Scanner после использования
    }
}
