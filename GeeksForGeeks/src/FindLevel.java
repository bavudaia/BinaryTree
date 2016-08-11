

public class FindLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree= Node.createBinaryTree();
		int level = findLevel(tree, 3);
		System.out.println(level);
	}
	public static int findLevel(Node root , int data)
	{
		int level = findLevel(root,data,1);
		return level;
	}
	public static int findLevel(Node root ,int data, int level)
	{
		if(root == null)
			return 0;
		if(root.data == data)
			return level;
		int l =  findLevel(root.left,data,level+1);
		if(l == 0)
			 l = findLevel(root.right,data,level+1);
		return l;
	}
}
