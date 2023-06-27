package money;

/**
 * @author jhkim
 * @since 2023/06/19
 *
 */
public enum MoneyUnit {
	WON,
	DOLLAR;

	public static String getMoneyUnitList() {
		MoneyUnit[] values = MoneyUnit.values();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			if (i < values.length - 1) {
				stringBuilder.append(values[i] + ",");
			} else {
				stringBuilder.append(values[i]);
			}
		}
		return stringBuilder.toString();
	}
}
