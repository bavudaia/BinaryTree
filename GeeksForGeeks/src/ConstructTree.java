
public class ConstructTree {
	public static void main(String[] args) {
		int in[] = {4,2,6,1,7,3,8};
		int pre[] = {1,2,4,6,3,7,8};
		Node root=fromPreInorder(pre, in);
		LevelOrderTraversal.levelOrder(root);
	}
	
	public static Node fromPreInorder(int[] pre , int [] in)
	{
		int s = 0;
		int e = pre.length-1;
		int [] index = new int[1];
		
		return fromPreInorder(pre, in, s, e, index);
	}
	/* assume all distict elements */
	public static Node fromPreInorder(int[] pre , int[] in , int s, int e ,int[] index)
	{
		if(s>e)
		{
			return null;
		}
		int x = index[0];
		int target = 0;
		for(int i=s;i<=e;i++)
		{
			if(pre[x] == in[i])
			{	target = i; break;}
		}
		if(target == -1)
			return null;
		index[0]++;
		Node root = new Node(pre[x]);
		
		
		root.left = fromPreInorder(pre, in, s, target-1,index);
		root.right = fromPreInorder(pre, in, target+1, e,index);
		return root;
	}
}
