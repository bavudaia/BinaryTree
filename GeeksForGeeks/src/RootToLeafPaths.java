
public class RootToLeafPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = Node.createBinaryTree();
		print(tree);
	}
	
	public static void print(Node root)
	{
		int h = h(root);
		int A[] = new int[h];
		print(root,A,0);
	}
	
	public static void print(Node root, int[] A, int p)
	{
		if(root == null)
			return;

		A[p] = root.data;
		p++;
		
		if(root.left == null && root.right == null)
		{
			printArr(A,0,p-1);
		}
		print(root.left,A,p);
		print(root.right,A,p);
	}
	
	public static void printArr(int A[],int s, int e)
	{
		if(s<=e)
		{
			for(int i=s;i<e;i++)
				System.out.print(A[i] + "-->");
			System.out.println(A[e]);
		}
	}
	
	public static int h(Node root)
	{
		if(root == null)
			return 0;
		return max(h(root.left) , h(root.right))+1;
	}
	
	public static int max(int a, int b){
		return a>b?a:b;
	}

}
