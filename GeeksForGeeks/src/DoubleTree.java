
public class DoubleTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = Node.createBinaryTree();
		//LevelOrderTraversal.levelOrder(tree);
		create(tree);
		LevelOrderTraversal.levelOrder(tree);
	}
	
	public static void create(Node root)
	{
		if(root == null)
			return;
		Node temp = root.left;
		root.left = new Node(root.data);
		root.left.left = temp;
		create(root.left.left);
		create(root.right);
	}
}
