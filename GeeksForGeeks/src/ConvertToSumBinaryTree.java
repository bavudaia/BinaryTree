
public class ConvertToSumBinaryTree {
	public static void main(String[] args) {
		Node tree = Node.createBinaryTree();
		convert(tree);
		print(tree);
	}
	
	public static void convert(Node root)
	{
		if(root == null)
			return;
		if(root.left == null && root.right == null)
			return;
		
		convert(root.left);
		convert(root.right);
		
		int left=0,right = 0;
		
		left = (root.left == null)?0:root.left.data;
		right = (root.right == null)?0:root.right.data;
		
		root.data = left+right;
	}
	
	public static void print(Node tree)
	{
		LevelOrderTraversal.levelOrder(tree);
	}
}
