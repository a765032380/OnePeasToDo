package pub.gll.module.algorithm.algorithm._02_动态数组;

public class Asserts {
	public static void test(boolean value) {
		try {
			if (!value) throw new Exception("测试未通过");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
