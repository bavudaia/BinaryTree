
public class Diameter {
	public static void main(String[] args) {
		Node n = tc1();
		System.out.println(diameter(n));
	}
	
	public static int diameter(Node root)
	{
		return d(root)[1];
	}
	
	
	public static int[] d(Node root)
	{
		if(root == null)
		{
			return new int[]{0,0};
		}
		
		int[] l = d(root.left);
		int[] r = d(root.right);
		
		int A[] = new int[2];
		A[0] = 1 + max(l[0],r[0]);
		A[1] = max (l[0] + r[0] + 1 , max(l[1] ,r[1]));
		
		return A;
	}
	
	public static int max(int a, int b)
	{
		return a>b?a:b;
	}
	
	
	
	public static Node tc1()
	{
		Node n = new Node(1);
		n.left = new Node(1);
		n.right = new Node(2);
		n.left.left = new Node(1);
		n.left.right = new Node(1);
		n.left.left.left = new Node(1);
		n.left.left.left.left = new Node(1);
		n.left.left.left.left.left = new Node(1);
		n.left.left.left.left.left.left = new Node(1);
		n.left.right = new Node(1);
		n.left.right.right = new Node(1);
		n.left.right.right.right = new Node(1);
		n.left.right.right.right.right = new Node(1);
		n.left.right.right.right.right.right = new Node(1);
		return n;
	}


}
