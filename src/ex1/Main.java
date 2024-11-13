package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vehicle vehicle = null;

        while (true) {
            System.out.println("\nВиберіть транспортний засіб:");
            System.out.println("1 - Автомобіль");
            System.out.println("2 - Мотоцикл");
            System.out.println("3 - Вантажівка");
            System.out.println("0 - Вихід");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Завершення програми.");
                break;
            }

            System.out.print("Введіть марку транспортного засобу: ");
            String make = scanner.nextLine();
            System.out.print("Введіть модель: ");
            String model = scanner.nextLine();
            System.out.print("Введіть рік випуску: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    vehicle = new Car(make, model, year);
                    break;
                case 2:
                    vehicle = new bike(make, model, year);
                    break;
                case 3:
                    vehicle = new Truck(make, model, year);
                    break;
                default:
                    System.out.println("Невірний вибір.");
                    continue;
            }

            System.out.println("Вибрано транспортний засіб: " + vehicle);

            while (true) {
                System.out.println("\nОберіть дію:");
                System.out.println("1 - Запустити");
                System.out.println("2 - Зупинити");
                if (vehicle instanceof Refuelable) {
                    System.out.println("3 - Заправити");
                }
                System.out.println("0 - Повернутись до вибору транспортного засобу");

                int action = scanner.nextInt();
                scanner.nextLine();

                if (action == 0) {
                    break;
                }

                switch (action) {
                    case 1:
                        vehicle.start();
                        break;
                    case 2:
                        vehicle.stop();
                        break;
                    case 3:
                        if (vehicle instanceof Refuelable) {
                            ((Refuelable) vehicle).refuel();
                        } else {
                            System.out.println("Цей транспортний засіб не потребує заправки.");
                        }
                        break;
                    default:
                        System.out.println("Невірний вибір.");
                        break;
                }
            }
        }

        scanner.close();
    }
}

