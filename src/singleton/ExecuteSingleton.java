package singleton;

import java.util.Scanner;

public class ExecuteSingleton {

    public static void executeImpl(){
        UserManager userManager = UserManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após a leitura do número

        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            userManager.addUser(i, name);
        }

        userManager.listUsers();
    }
}
