
public class TreeListRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new TreeListRecursion().new Node().createBinaryTree();
		n = treeToList(n);
		printCircular(n);
		System.out.println();
		printCircularReverse(n);
	}
	public class Node
	{
		int data;
		Node small;
		Node large;
		public Node(){}
		public Node (int data){this.data = data;}
		public Node createBinaryTree()
		{
			Node n = new Node();
			n.data = 4;
			n.small = new Node(2);
			n.large = new Node(6);
			n.small.small = new Node(1);
			n.small.large = new Node(3);
			n.large.small = new Node(5);
			n.large.large = new  Node(7);
			return n;
		}
	}
	
	public static Node treeToList(Node root){
		
		if(root == null)
			return null;
		
		Node left = treeToList(root.small);
		Node right = treeToList(root.large);
		
		root.small = root;
		root.large = root;
		
		left =  append(left,root);
		Node l2 = append(left,right);
		
		return l2;
	}
	
	public static Node append(Node a, Node b)
	{
		if(a==null) return b;
		if(b==null) return a;
		
		Node aLast = a.small;
		Node bLast = b.small;
		
		aLast.large = b;
		b.small = aLast;
		
		a.small = bLast;
		bLast.large = a;
		
		return a;
	}
	
	public static void printCircular(Node root)
	{
		Node curr = root;
		do
		{
			System.out.print(curr.data + "-->");
			curr = curr.large;
		}while(curr!=null && curr!=root );
	}
	
	public static void printCircularReverse(Node root)
	{
		Node curr = root;
		do
		{
			System.out.print(curr.data + "-->");
			curr = curr.small;
		}while(curr!=root && curr!=null);	
	}
	
}
