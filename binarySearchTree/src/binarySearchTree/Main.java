package binarySearchTree;

public class Main {

	public static void main(String[] args) {
	BinarySearchTree binary = new BinarySearchTree();
	
	
	binary.insertNode(47);
	binary.insertNode(21);
	binary.insertNode(76);
	binary.insertNode(18);
	binary.insertNode(52);
	binary.insertNode(82);
	binary.insertNode(27);
	
	System.out.println(binary.getRoot().value);

	System.out.println(binary.getRoot().left.right.value);
	
	System.out.println("Is number 10 contained in the Tree?: "+binary.getNode(10));
	System.out.println("Is number 52 contained in the Tree?: "+binary.getNode(52));

	}

}
