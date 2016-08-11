
public class InorderThreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = Node.createBinaryTree();
		inorder(tree);
	}
	
	public static void inorder(Node root)
	{
		Node curr = root;
		if(root == null)
			return;
		while(curr!=null)
		{
			if(curr.left == null)
			{
				System.out.println(curr.data);
				curr = curr.right;
			}
			else
			{
				Node pre = curr.left;
				while(pre.right!=null && pre.right!=curr)
					pre = pre.right;
				if(pre.right == null)
				{
					pre.right = curr;
					curr = curr.left;
				}
				else
				{
					System.out.println(curr.data);
					pre.right = null;
					curr = curr.right;
				}
			}
		}
	}

}

