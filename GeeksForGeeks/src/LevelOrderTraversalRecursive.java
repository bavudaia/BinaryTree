
public class LevelOrderTraversalRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = Node.createBinaryTree();
		levelOrder(tree);
	}
	
	public static void levelOrder(Node root)
	{
		int height = height(root);
		for(int i=1;i<=height;i++)
		{
			levelOrderForHeight(root, i);
			System.out.println();
		}
	}
	public static void levelOrderForHeight(Node root, int height)
	{
		if(root == null)
			return;
		if(height == 1)
			System.out.print(root.data + "->");
		else
		{
			levelOrderForHeight(root.left, height-1);
			levelOrderForHeight(root.right, height-1);
		}
	}
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		return 1 + max(height(root.left), height(root.right));
	}
	public static int max(int a, int b)
	{
		return a>b?a:b;
	}
}
