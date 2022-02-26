package lesson8;

import java.util.concurrent.ThreadLocalRandom;

public class Deck implements IDeck{

    private ICard[] cards = new  ICard[52];


    public Deck() {
        cards[0] = new Card("Dvoika Trefa", 2);
        cards[1] = new Card("Dvoika Trefa", 2);
        cards[2] = new Card("Dvoika Trefa", 2);
        cards[3] = new Card("Dvoika Trefa", 2);
        cards[4] = new Card("Dvoika Trefa", 2);

        cards[5] = new Card("Dvoika Trefa", 3);
        cards[6] = new Card("Dvoika Trefa", 3);
        cards[7] = new Card("Dvoika Trefa", 3);
        cards[8] = new Card("Dvoika Trefa", 3);
        cards[9] = new Card("Dvoika Trefa", 3);

        cards[10] = new Card("Dvoika Trefa", 4);
        cards[11] = new Card("Dvoika Trefa", 4);
        cards[12] = new Card("Dvoika Trefa", 4);
        cards[13] = new Card("Dvoika Trefa", 4);
        cards[14] = new Card("Dvoika Trefa", 4);

        cards[15] = new Card("Dvoika Trefa", 5);
        cards[16] = new Card("Dvoika Trefa", 5);
        cards[17] = new Card("Dvoika Trefa", 5);
        cards[18] = new Card("Dvoika Trefa", 5);
        cards[19] = new Card("Dvoika Trefa", 5);

        cards[20] = new Card("Dvoika Trefa", 6);
        cards[21] = new Card("Dvoika Trefa", 6);
        cards[22] = new Card("Dvoika Trefa", 6);
        cards[23] = new Card("Dvoika Trefa", 6);
        cards[24] = new Card("Dvoika Trefa", 6);

        cards[25] = new Card("Dvoika Trefa", 7);
        cards[26] = new Card("Dvoika Trefa", 7);
        cards[27] = new Card("Dvoika Trefa", 7);
        cards[28] = new Card("Dvoika Trefa", 7);
        cards[29] = new Card("Dvoika Trefa", 7);

        cards[30] = new Card("Dvoika Trefa", 8);
        cards[31] = new Card("Dvoika Trefa", 8);
        cards[32] = new Card("Dvoika Trefa", 8);
        cards[33] = new Card("Dvoika Trefa", 8);
        cards[34] = new Card("Dvoika Trefa", 8);

        cards[35] = new Card("Dvoika Trefa", 9);
        cards[36] = new Card("Dvoika Trefa", 9);
        cards[37] = new Card("Dvoika Trefa", 9);
        cards[38] = new Card("Dvoika Trefa", 9);
        cards[39] = new Card("Dvoika Trefa", 9);

        cards[40] = new Card("Dvoika Trefa", 10);
        cards[41] = new Card("Dvoika Trefa", 10);
        cards[42] = new Card("Dvoika Trefa", 10);
        cards[43] = new Card("Dvoika Trefa", 10);
        cards[44] = new Card("Dvoika Trefa", 10);

        cards[45] = new Card("Dvoika Trefa", 11);
        cards[46] = new Card("Dvoika Trefa", 11);
        cards[47] = new Card("Dvoika Trefa", 11);
        cards[48] = new Card("Dvoika Trefa", 11);
        cards[49] = new Card("Dvoika Trefa", 11);

        cards[50] = new Card("Dvoika Trefa", 12);
        cards[51] = new Card("Dvoika Trefa", 12);


    }

    @Override
    public ICard randomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0,51);
        return cards[randomIndex];
    }
}
