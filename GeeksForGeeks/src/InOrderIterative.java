import java.util.Stack;

public class InOrderIterative {
	public static void main(String[] args) {
		Node tree = Node.createBinaryTree();
		inorder(tree);
	}
	
	public static void inorder(Node root)
	{
		Node curr = root;
		Stack<Node> stack = new Stack<>();
		if(curr == null)
			return;
		while(true)
		{
			if(curr!=null)
			{
				stack.push(curr);
				curr = curr.left;
			}
			else
			{
				if(!stack.isEmpty())
				{	
					curr = stack.pop();
					System.out.println(curr.data);
					curr = curr.right;
				}
				else
					break;
			}
		}
		
	}
}
