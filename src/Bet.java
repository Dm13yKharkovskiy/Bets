import lib.Inject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;


class Bet {
    private int value;
    private double risk;

    private String link;

    public Bet() {

    }
    public Bet(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void readFromFile(String link) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(link));
        String line;
        Storage storage = new Storage();
        while ((line = reader.readLine())!= null) {
            storage.addBuffered(Integer.parseInt(line));
        }
        storage.show();
    }


    @Override
    public String toString() {
        return "{" + value + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet1 = (Bet) o;
        return value == bet1.value && Double.compare(bet1.risk, risk) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, risk);
    }
}
