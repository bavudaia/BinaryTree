
public class RootToLeaf {
public static void main(String[] args) {
	Node tree = Node.createBinaryTree();
	print(tree);
}

public static void print(Node root)
{
	int h = height(root);
	int A[] = new int[h];
	print(root,A,0);
}

public static void print(Node root, int A[], int pathLen)
{
	if(root == null)
	{
		return;
	}
	A[pathLen] = root.data;
	pathLen++;
	if(root.left == null && root.right == null)
	{
		printArray(A,0,pathLen-1);
		System.out.println();
	}

	print(root.left,A,pathLen);
	print(root.right,A,pathLen);
}

public static void printArray(int A[], int start, int end)
{
	if(start<=end)
	{
		while(start<end)
		{
			System.out.print(A[start] + "-->");
			start++;
		}
		System.out.print(A[end]);
	}
}

public static int height(Node root)
{
	if(root == null)
		return 0;
	return 1 + max(height(root.left), height(root.right));
}

public static int max(int a, int b)
{
	return a>b?a:b;
}
}
