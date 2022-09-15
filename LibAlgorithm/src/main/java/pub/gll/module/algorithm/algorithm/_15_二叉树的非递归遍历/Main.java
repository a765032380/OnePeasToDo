package pub.gll.module.algorithm.algorithm._15_二叉树的非递归遍历;

import pub.gll.module.algorithm.algorithm._15_二叉树的非递归遍历.printer.BinaryTrees;
import pub.gll.module.algorithm.algorithm._15_二叉树的非递归遍历.tree.BST;
import pub.gll.module.algorithm.algorithm._15_二叉树的非递归遍历.tree.BinaryTree.Visitor;

public class Main {
	public static void main(String[] args) {
		// 创建BST
		Integer data[] = new Integer[] {
				7, 4, 9, 2, 5, 8, 11
		};
		BST<Integer> bst = new BST<>();
		for (int i = 0; i < data.length; i++) {
			bst.add(data[i]);
		}
		// 树状打印
		BinaryTrees.println(bst);
		// 遍历器
		final StringBuilder sb = new StringBuilder();
		Visitor<Integer> visitor = new Visitor<Integer>() {
			@Override
			public boolean visit(Integer element) {
				sb.append(element).append(" ");
				return false;
			}
		};
		// 遍历
		sb.delete(0, sb.length());
		bst.preorder(visitor);
		Asserts.test(sb.toString().equals("7 4 2 5 9 8 11 "));

		sb.delete(0, sb.length());
		bst.inorder(visitor);
		Asserts.test(sb.toString().equals("2 4 5 7 8 9 11 "));

		sb.delete(0, sb.length());
		bst.postorder(visitor);
		Asserts.test(sb.toString().equals("2 5 4 8 11 9 7 "));
	}
}
