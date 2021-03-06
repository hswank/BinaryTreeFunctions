package binaryTree;

public class binaryTreeApp {

	public static void main(String[] args) {
		Node root = new Node(15);

		Node seven = new Node(7);
		root.setLeft(seven);
		Node twenty = new Node(20);
		root.setRight(twenty);
		Node six = new Node(6);
		seven.setLeft(six);
		Node twelve = new Node(12);
		seven.setRight(twelve);
		Node five = new Node(5);
		six.setLeft(five);
		Node ten = new Node(10);
		twelve.setLeft(ten);
		Node eighteen = new Node(18);
		twenty.setLeft(eighteen);
		Node twentyTwo = new Node(22);
		twenty.setRight(twentyTwo);
		Node sixteen = new Node(16);
		eighteen.setLeft(sixteen);
		Node nineteen = new Node(19);
		eighteen.setRight(nineteen);
		Node twentyFive = new Node(25);
		twentyTwo.setRight(twentyFive);

		System.out.println(findMax(root));
		System.out.println(findMin(root));

//		for (int i = 0; i <= 25; i++) {
//			if (locateNode(root, i) != null) {
//				System.out.println(i + " is a valid Node in the Binary tree.");
//			} else {
//				System.out.println(i + " is not a valid node.");
//			}
//		}
		Node twentyFour = new Node(24);
		insertNode(root, twentyFour);
		printNodes(root);
	}

	public static int findMax(Node root) {
		Node testAgainst = root;
		int maximum = testAgainst.getValue();

		do {
			if (testAgainst.getValue() > maximum) {
				maximum = testAgainst.getValue();
			}
			testAgainst = testAgainst.getRight();
		} while (testAgainst != null);
		return maximum;
	}

	public static int findMin(Node root) {
		Node testAgainst = root;
		int minimum = testAgainst.getValue();

		do {
			if (testAgainst.getValue() < minimum) {
				minimum = testAgainst.getValue();
			}
			testAgainst = testAgainst.getLeft();
		} while (testAgainst != null);
		return minimum;
	}

	public static Node locateNode(Node node, int searchData) {
		Node current = node;
		while (current != null && current.getValue() != searchData) {
			if (current.getValue() > searchData) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
		}

		return current;
	}

	public static void printNodes(Node root) {
		int treeLength = findMax(root);

		for (int i = 0; i <= treeLength; i++) {
			if (locateNode(root, i) != null) {
				System.out.println(i);
			}
		}
	}

	public static void insertNode(Node parent, Node child) {
		Node current = parent;
		while (current != null) {
			if (current.getValue() > child.getValue()) {
				if (current.getLeft() != null) {
					current = current.getLeft();
				} else {
					current.setLeft(child);
					break;
				}
			} else {
				if (current.getRight() != null) {
				current = current.getRight();
				} else {
					current.setRight(child);
					break;
				}
			}
		}
	}
}
