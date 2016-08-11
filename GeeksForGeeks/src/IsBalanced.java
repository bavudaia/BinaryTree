
public class IsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = Node.createBinaryTree();
		System.out.println(isBalanced(tree));
		System.out.println(isBalanced(null));
		Node n= tc1();
		System.out.println(isBalanced(n));
	}
	
	public static boolean isBalanced(Node root)
	{
		int A[] = new int[1];
		return isBalancedR(root, A);
	}
	public static boolean isBalancedR(Node root, int[] h)
	{
		if(root == null)
		{
			return true;
		}
		int lh[] = new int[1];
		int rh[] = new int[1];
		boolean res = isBalancedR(root.left, lh)
						&& isBalancedR(root.right , rh);
		h[0] = max(lh[0], rh[0]) + 1;
		return res && (mod(lh[0] - rh[0]) <= 1);
	}
	
	public static int mod(int a)
	{
		return a>0?a:-a;
	}
	public static int max(int a , int b)
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
