package lesson8;

public interface IBlackjack {

    void addPlayerToGame(IPlayer player);

    void dealTwoCards();

    void dealRemaningCard();

    void printWinner();
}
