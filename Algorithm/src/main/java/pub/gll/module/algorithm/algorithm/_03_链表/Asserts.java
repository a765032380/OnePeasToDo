package pub.gll.module.algorithm.algorithm._03_链表;

public class Asserts {
	public static void test(boolean value) {
		try {
			if (!value) throw new Exception("测试未通过");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
