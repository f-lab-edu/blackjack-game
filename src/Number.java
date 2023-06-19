/**
 * @author jhkim
 * @since 2023/06/18
 * 카드의 번호 enum클래스
 */
public enum Number {
	A(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	J(10),
	Q(10),
	K(10);
	private int num;

	Number(int num) {
		this.num = num;
	}
}
