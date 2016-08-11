
public class DeleteTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = Node.createBinaryTree();
		delete(root);
		LevelOrderTraversal.levelOrder(root);
	}
	
	public static void delete(Node root)
	{
		if(root == null)
			return;
		delete(root.left);
		delete(root.right);
		//root.left = null;
		//root.right = null;
		System.out.println("Deleting : "+root.data);
		root = null; 
	}

}
