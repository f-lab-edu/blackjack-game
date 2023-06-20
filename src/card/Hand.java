package card;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gutenlee
 * @since 2023/06/19
 */
public class Hand {
    private final List<Card> cardList = new ArrayList<>();

    private Hand() {}

    public static Hand create() {
        return new Hand();
    }
}
