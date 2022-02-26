package lesson8;

import java.util.Objects;

public class Card implements ICard {
    private String name;
    private int value;

    public Card() {
    }

    public Card(String name, int value) {
        this.name = name;
        this.value = value;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void open() {
        System.out.println(this.name);

    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
