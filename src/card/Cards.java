package card;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gutenlee
 * @since 2023/06/19
 */
public class Cards {
    private final List<Card> cardList = new ArrayList<>();

    public static Cards init() {
        return new Cards();
    }
}
