package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Логгер
        Logger logger = Logger.getInstance();
        logger.logToConsole("Запуск програми...");

        // Створення агентства новин
        NewsAgency newsAgency = new NewsAgency();

        // Створення підписників
        UserSubscriber subscriber1 = new UserSubscriber("Іван");
        UserSubscriber subscriber2 = new UserSubscriber("Оля");

        // Додавання підписників
        newsAgency.addSubscriber(subscriber1);
        newsAgency.addSubscriber(subscriber2);

        // Меню для користувача
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати підписника");
            System.out.println("2. Видалити підписника");
            System.out.println("3. Генерувати новини");
            System.out.println("4. Вийти");
            System.out.print("Виберіть опцію: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очищаємо буфер

            if (choice == 1) {
                // Додавання підписника
                System.out.print("Введіть ім'я підписника: ");
                String name = scanner.nextLine();
                UserSubscriber newSubscriber = new UserSubscriber(name);
                newsAgency.addSubscriber(newSubscriber);
                System.out.println("Підписник " + name + " доданий.");

            } else if (choice == 2) {
                // Видалення підписника
                System.out.print("Введіть ім'я підписника для видалення: ");
                String name = scanner.nextLine();
                for (Subscriber subscriber : newsAgency.getSubscribers()) {
                    if (subscriber instanceof UserSubscriber && ((UserSubscriber) subscriber).getName().equals(name)) {
                        newsAgency.removeSubscriber(subscriber);
                        System.out.println("Підписник " + name + " видалений.");
                        break;
                    }
                }

            } else if (choice == 3) {
                // Генерація новин
                System.out.print("Введіть текст новини: ");
                String news = scanner.nextLine();
                newsAgency.generateNews(news);

            } else if (choice == 4) {
                // Вихід з програми
                System.out.println("Вихід з програми.");
                break;
            } else {
                System.out.println("Невірна опція! Спробуйте ще раз.");
            }
        }

        logger.logToConsole("Кінець роботи програми.");
    }
}


