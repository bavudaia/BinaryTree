
public class Count {
	public static void main(String[] a)
	{
		Node tree= Node.createBinaryTree();
		int c = count(tree);
		System.out.println(c);
	}
	
	public static int count(Node root)
	{
		if(root == null)
			return 0;
		return 1+count(root.left) + count(root.right);
	}
	
	
}
