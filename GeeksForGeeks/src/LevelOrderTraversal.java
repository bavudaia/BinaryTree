import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		Node tree = Node.createBinaryTree();
		levelOrder(tree);
	}
	
	public static void levelOrder(Node root)
	{
		Queue<Node> q = new ArrayDeque<>();
		if(root == null)
			return;
		q.add(root);
		int c=1;
		while(true)
		{
			c = q.size();
			if(c==0)
				break;
			while(c>0)
			{
				Node curr = q.poll();
				System.out.print(curr.data);
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
				c--;
			}
			System.out.println();
		}
		
	}
}