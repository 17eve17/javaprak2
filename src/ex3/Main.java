package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення списку медіа-ресурсів
        List<Media> mediaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Безкінечний цикл для обробки команд
        while (true) {
            System.out.println("\nБібліотека медіа-ресурсів:");
            System.out.println("1. Додати медіа-ресурс");
            System.out.println("2. Видалити медіа-ресурс");
            System.out.println("3. Пошук медіа-ресурсу");
            System.out.println("4. Переглянути всі медіа-ресурси");
            System.out.println("5. Вийти");
            System.out.print("Виберіть опцію: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Читання символу нового рядка після вводу числа

            switch (choice) {
                case 1:
                    // Додавання медіа-ресурсу
                    addMedia(scanner, mediaList);
                    break;
                case 2:
                    // Видалення медіа-ресурсу
                    removeMedia(scanner, mediaList);
                    break;
                case 3:
                    // Пошук медіа-ресурсу
                    searchMedia(scanner, mediaList);
                    break;
                case 4:
                    // Перегляд всіх медіа-ресурсів
                    viewAllMedia(mediaList);
                    break;
                case 5:
                    System.out.println("Вихід з програми.");
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }

    // Метод для додавання медіа-ресурсу
    public static void addMedia(Scanner scanner, List<Media> mediaList) {
        System.out.println("\nВиберіть тип медіа-ресурсу для додавання:");
        System.out.println("1. Книга");
        System.out.println("2. Журнал");
        System.out.println("3. DVD");
        System.out.print("Вибір: ");
        int mediaType = scanner.nextInt();
        scanner.nextLine();  // Читання символу нового рядка

        System.out.print("Введіть назву: ");
        String title = scanner.nextLine();

        System.out.print("Введіть автора: ");
        String author = scanner.nextLine();

        System.out.print("Введіть рік випуску: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Читання символу нового рядка

        switch (mediaType) {
            case 1:
                System.out.print("Введіть жанр книги: ");
                String genre = scanner.nextLine();
                mediaList.add(new Book(title, author, year, genre));
                break;
            case 2:
                System.out.print("Введіть номер випуску журналу: ");
                int issueNumber = scanner.nextInt();
                scanner.nextLine();  // Читання символу нового рядка
                mediaList.add(new Magazine(title, author, year, issueNumber));
                break;
            case 3:
                System.out.print("Введіть режисера DVD: ");
                String director = scanner.nextLine();
                mediaList.add(new DVD(title, author, year, director));
                break;
            default:
                System.out.println("Невірний вибір типу медіа-ресурсу.");
        }
    }

    // Метод для видалення медіа-ресурсу
    public static void removeMedia(Scanner scanner, List<Media> mediaList) {
        System.out.print("Введіть назву медіа-ресурсу для видалення: ");
        String title = scanner.nextLine();

        boolean found = false;
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                mediaList.remove(media);
                found = true;
                System.out.println("Медіа-ресурс '" + title + "' успішно видалено.");
                break;
            }
        }

        if (!found) {
            System.out.println("Медіа-ресурс з такою назвою не знайдено.");
        }
    }

    // Метод для пошуку медіа-ресурсу
    public static void searchMedia(Scanner scanner, List<Media> mediaList) {
        System.out.print("Введіть назву медіа-ресурсу для пошуку: ");
        String title = scanner.nextLine();

        boolean found = false;
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                media.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Медіа-ресурс з такою назвою не знайдено.");
        }
    }

    // Метод для перегляду всіх медіа-ресурсів
    public static void viewAllMedia(List<Media> mediaList) {
        if (mediaList.isEmpty()) {
            System.out.println("Бібліотека порожня.");
        } else {
            System.out.println("\nСписок медіа-ресурсів:");
            for (Media media : mediaList) {
                media.displayInfo();
            }
        }
    }
}



