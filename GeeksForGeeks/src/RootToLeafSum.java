
public class RootToLeafSum {
	public static void main(String[] args) {
		Node tree = tc1();
		printMatchedSum(tree, 4);
	}
	public static void printMatchedSum(Node root, int sum)
	{
	   int A[] = new int[h(root)];
	   p(root, A , 0,0, sum);
	}
	public static void printArr(int A[] , int pathLen)
	{
		if(pathLen>0)
		{
		for(int i=0;i<pathLen-1;i++)
			System.out.print(A[i] + "-->");
		System.out.print(A[pathLen-1]);
		}
	}
	public static void p(Node root , int A[] , int pathLen, int currSum , int sum)
	{
		if(root == null)
		{
			return;
		}
		A[pathLen] = root.data;
		currSum+= root.data;
		pathLen++;
		if(root.left == null && root.right == null )
		{
			if(currSum == sum)
			{printArr(A,pathLen);}
			return;
		}
		p(root.left,A,pathLen,currSum ,sum);
		p(root.right,A,pathLen,currSum, sum);
	}
	
	public static int h (Node root)
	{
		if(root == null)
			return 0;
		return max(h(root.left), h(root.right))+1;
	}
	
	public static int max(int a, int b)
	{
		return a>b?a:b;
	}
	
	public static Node tc1 ()
	{
		Node n = new Node(1);
		n.left = new Node(1);
		n.right = new Node(2);
		n.right.left = new Node(1);
		n.left.left = new Node(2);
		n.left.right = new Node(3);
		
		return n;
	}
}
