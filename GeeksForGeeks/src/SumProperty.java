
public class SumProperty {
	public static void main(String[] args) {
		Node tree  = new SumProperty().new Node().createBinaryTree();
		System.out.println(check(tree));
		
		tree.left.right = new SumProperty().new Node(27);
		System.out.println(check(tree));
	}
	public static boolean check(Node root)
	{
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		int left = 0;
		int right = 0;
		if(root.left!=null)
		 left  = root.left.data;
		if(root.right!=null)
		 right = root.right.data;
		
		if(left+right == root.data)
		{
			return check(root.left) && check(root.right);
		}
		return false;
	}
	
	public class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(){}
		public Node(int data){this.data =data;}
		
		public Node createBinaryTree()
		{
			Node node = new Node(10);
			node.left = new Node(7);
			node.right = new Node(3);
			node.right.right = new Node(3);
			
			return node;
		}
	}
}
