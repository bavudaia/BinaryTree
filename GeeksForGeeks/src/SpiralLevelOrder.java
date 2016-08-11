import java.util.Stack;

public class SpiralLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Node tree = Node.createBinaryTree();
			spiral(tree);
	}
	
	public static void spiral(Node root)
	{
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				Node x = s1.pop();
				System.out.print(x.data);
				if(x.right!=null)
					s2.push(x.right);
				if(x.left!=null)
					s2.push(x.left);				
			}
			System.out.println();
			while(!s2.isEmpty())
			{
				Node x = s2.pop();
				System.out.print(x.data);
				if(x.left!=null)
					s1.push(x.left);
				if(x.right!=null)
					s1.push(x.right);
			}
		}
	}

}
