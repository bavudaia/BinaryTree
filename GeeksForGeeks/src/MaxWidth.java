import java.util.ArrayDeque;
import java.util.Queue;

public class MaxWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = Node.createBinaryTree();
		System.out.println(maxWidth(tree));
	}
	public static int max(int a, int b){return a>b?a:b;}
	public static int maxWidth(Node root)
	{
		Queue<Node> q = new ArrayDeque<>();
		if(root == null)
			return 0;
		q.add(root);
		int maxCount = 0;
		while(true)
		{
			int count = q.size();
			if(count <= 0)
				break;
			maxCount = max(count,maxCount);
			while(count>0)
			{
				Node curr = q.poll();
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
				count--;
			}
		}
		return maxCount;
		
	}

}
