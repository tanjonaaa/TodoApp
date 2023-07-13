package App.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {
    private static List<String> tasks = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Marquer une tâche comme terminée");
            System.out.println("3. Afficher toutes les tâches");
            System.out.println("4. Supprimer une tâche");
            System.out.println("5. Effacer toutes les tâches");
            System.out.println("6. Quitter");
            System.out.print("Entrez votre choix (1-6) : ");
            choice = scanner.nextInt();

            if (choice == 1) {
                addTask(scanner);
            } else if (choice == 2) {
                markTaskAsDone(scanner);
            } else if (choice == 3) {
                displayTasks();
            } else if (choice == 4) {
                deleteTask(scanner);
            } else if (choice == 5) {
                clearTasks();
            } else if (choice == 6) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Choix invalide. Veuillez entrer un numéro valide.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Entrez la tâche à ajouter : ");
        String task = scanner.next();
        tasks.add(task);
        System.out.println("Tâche ajoutée avec succès !");
    }

    private static void markTaskAsDone(Scanner scanner) {
        System.out.print("Entrez le numéro de la tâche à marquer comme terminée : ");
        int taskNumber = scanner.nextInt();
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            String task = tasks.get(taskNumber - 1);
            tasks.remove(taskNumber - 1);
            System.out.println("La tâche \"" + task + "\" a été marquée comme terminée.");
        } else {
            System.out.println("Numéro de tâche invalide !");
        }
    }

    private static void displayTasks() {
        System.out.println("===== Tâches =====");
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche à afficher.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void deleteTask(Scanner scanner) {
        System.out.print("Entrez le numéro de la tâche à supprimer : ");
        int taskNumber = scanner.nextInt();
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            String task = tasks.get(taskNumber - 1);
            tasks.remove(taskNumber - 1);
            System.out.println("La tâche \"" + task + "\" a été supprimée.");
        } else {
            System.out.println("Numéro de tâche invalide !");
        }
    }

    private static void clearTasks() {
        tasks.clear();
        System.out.println("Toutes les tâches ont été effacées.");
    }
}
