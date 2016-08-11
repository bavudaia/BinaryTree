
public class NumberOfLeaves {
	public static void main(String[] args) {
		Node tree = Node.createBinaryTree();
		System.out.println(count(tree));
	}
	
	public static int count(Node root)
	{
		if(root == null)
			return 0;
		if(root.left== null && root.right == null)
			return 1;
		return count(root.left) + count(root.right);
	}
	
}
