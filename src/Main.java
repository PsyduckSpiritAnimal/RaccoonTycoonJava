import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        GameUI ui = new GameUI(scanner);
        GameManager gameManager = new GameManager(4, 3, ui, bank);

        gameManager.startGame();
        scanner.close();
    }
}
