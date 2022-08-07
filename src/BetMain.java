
import java.io.IOException;
import java.util.Scanner;


public class BetMain {

    public static void main(String[] args) throws IOException {

        Storage storage = new Storage();
        int bet;
        String exit;
        boolean answer = false;
        Scanner inputBet = new Scanner(System.in);
        System.out.println("Выберите функцию: 1 - ввод ставок из файла; 2 - ввод ставок из консоли.");
        int function = inputBet.nextInt();
        switch (function) {
            case 1:
                System.out.println("Введите ссылку на файл (пример - C:\\\\Users\\\\Дмитрий\\\\IdeaProjects\\\\Bets\\\\BetsList.txt)");
                String link = inputBet.next();
                Bet myBetBufferRead = new Bet();
                myBetBufferRead.readFromFile(link);
                System.out.println("Ставки считаны. Вывод ставок на экран");
                break;

            case 2:
                do {
                    System.out.println("Введите ставку (целое число от 1 до 10). Никогда не вводите больше 10).  Для завершения нажмите q.");
                    if (inputBet.hasNextInt()) {
                        bet = inputBet.nextInt();
                        Bet myBetConsole = new Bet(bet);
                        try {
                            storage.add(myBetConsole.getValue());
                        } catch (BetException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Вы ввели не число");
                        exit = inputBet.next();
                        answer = exit.equals("q");

                        if (answer) {
                            System.out.println("Завершение ввода ставок");
                        } else {
                            System.out.println("\u001B[31m" + "Вы ввели " + exit + ". Для завершения необходимо ввести q!!!");
                        }

                    }

                } while (answer == false);
                storage.show();
                break;
            default:
                System.out.println("Вы сделали неверный выбор");

        }


    }
}
