import java.util.ArrayList;

class Storage {
    ArrayList<Integer> bets = new ArrayList<Integer>();

    void add(int bet) throws BetException {
        if (bet > 10) {
            throw new BetException("\u001B[31m" + "Указана неверная ставка!!! Нельзя вводить больше 10" + "\u001B[0m");
        }
        bets.add(bet);
    }
    void addBuffered(int bet) {
        bets.add(bet);
    }


    void show() {
        System.out.println("\u001B[33m" + "Ваши ставки\n" + bets + "\u001B[0m");
    }

}

