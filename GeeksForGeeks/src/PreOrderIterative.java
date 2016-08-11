import java.util.Stack;

public class PreOrderIterative {
	public static void main(String[] args) {
		Node tree = Node.createBinaryTree();
		preOrder(tree);
	}
	
	public static void preOrder(Node root)
	{
		Node curr = root;
		Stack<Node> stack = new Stack<>();
		if(curr == null)
			return;
		while(true)
		{
			if(curr!=null)
			{
				System.out.println(curr.data);
				stack.push(curr);
				curr = curr.left;
			}
			
			else
			{
				if(!stack.isEmpty())
				{
					curr = stack.pop();
					curr = curr.right;
				}
				else
				{
					break;
				}
			}
		}
	}
}
