package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;
	Scanner sc = new Scanner(System.in);

	public Node(int data) {
		this.data = data;

	}

	public Node() {
	}

	public Node createTree() {
		Node root = null;
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new Node(data);
		System.out.print("Left child " + data + " : ");
		root.left = createTree();
		System.out.print("Right child " + data + " : ");
		root.right = createTree();
		return root;
	}

	// Inorder traversal ----- left -> root(display) -> right
	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);

	}

	// Preorder traversal ----- root(display) -> left -> right
	public void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);

	}

	// Postorder traversal ----- left -> right -> root(display)
	public void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public int heightOfTree(Node root) {
		if(root == null)
			return 0;
		return Math.max(heightOfTree(root.left), heightOfTree(root.right)) +1;
	}
	
	public int sizeOfTree(Node root) {
		if(root == null)
			return 0;
		return sizeOfTree(root.left) + sizeOfTree(root.right) +1;
	}
	public int maxValueInTree(Node root) {
		if(root == null)
			return Integer.MIN_VALUE;
		return Math.max(root.data, Math.max(maxValueInTree(root.left), maxValueInTree(root.right)));
	}
	public void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			if(curr == null) {
				if(queue.isEmpty())
					return;
				queue.add(null);
				System.out.println();
			}
			System.out.print(curr.data+" ");
			if(curr.left != null)
				queue.add(curr.left);
			if(curr.right != null)
				queue.add(curr.right);
		}
		
	}
	public void leftViewOfTree(Node root) {
		ArrayList<Node> list = new ArrayList<>();
		printLeftView(root, list, 0);
		for(Node curr: list)
			System.out.print(curr.data+" ");
	}
	public void printLeftView(Node root, List<Node> list, int level) {
		if(root == null)
			return;
		if(list.size() == level)
			list.add(root);
		printLeftView(root.left, list, level+1);
		printLeftView(root.right, list, level+1);
	}
}

public class BinaryTree {

	public static void main(String[] args) {

		Node node = new Node();
		Node root = node.createTree();
		node.inOrder(root);
		System.out.println();
		node.preOrder(root);
		System.out.println();
		node.postOrder(root);
		System.out.println();
		System.out.println(node.heightOfTree(root));
		System.out.println(node.sizeOfTree(root));
		System.out.println(node.maxValueInTree(root));
		node.levelOrder(root);
		System.out.println();
		node.leftViewOfTree(root);
		

	}

}
