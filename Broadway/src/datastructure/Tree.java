package datastructure;

import java.util.Scanner;

public class Tree {

	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		createTree();
	}

	static Node createTree() {
		Node root = null;

		System.out.println("Enter Data: ");
		int data = sc.nextInt();

		if (data == -1)
			return null;

		root = new Node(data);

		System.out.println("Enter Left: " + data);
		root.left = createTree();

		System.out.println("Enter Right: " + data);
		root.right = createTree();

		return root;
	}
}

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}
}
