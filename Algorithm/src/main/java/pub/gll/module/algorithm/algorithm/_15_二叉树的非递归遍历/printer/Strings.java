package pub.gll.module.algorithm.algorithm._15_二叉树的非递归遍历.printer;

public class Strings {
	public static String repeat(String string, int count) {
		if (string == null) return null;

		StringBuilder builder = new StringBuilder();
		while (count-- > 0) {
			builder.append(string);
		}
		return builder.toString();
	}

	public static String blank(int length) {
		if (length < 0) return null;
		if (length == 0) return "";
		return String.format("%" + length + "s", "");
	}
}
