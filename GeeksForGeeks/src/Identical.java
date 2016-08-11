
public class Identical {
	public static void main(String[] args) {
		Node n1 = Node.createBinaryTree();
		Node n2 = Node.createBinaryTree();
		System.out.println(isIdentical(n1, n2));
		n2.right = null;
		System.out.println(isIdentical(n1,n2));
	}
	
	public static boolean isIdentical(Node root1, Node root2)
	{
		if((root1 == null && root2!=null) || (root2 == null && root1!=null))
			return false;
		if(root1 == null && root2 == null)
			return true;
		
		return (root1.data == root2.data) 
				&& isIdentical(root1.left, root2.left)
				&& isIdentical(root1.right , root2.right)
				;
	}
}
