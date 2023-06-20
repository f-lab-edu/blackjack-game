package card;

public enum CardType {
    NUMBER,
    JACK,
    QUEEN,
    KING,
    ACE,
    UNDEFINED
    ;

    public static CardType getCardType(int number) {

        if (number < 2 || 14 < number) {
            return UNDEFINED;
        }

        switch (number) {
            case 11 : {
                return JACK;
            }
            case 12 : {
                return QUEEN;
            }
            case 13 : {
                return KING;
            }
            case 14 : {
                return ACE;
            }
            default:
                return NUMBER;
        }
    }
}
