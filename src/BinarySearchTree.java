
public class BinarySearchTree {
	
	static Traversal traversal = new Traversal();
	static MinValue min = new MinValue();
	
	static Node Root;
	
	BinarySearchTree()
	{
		Root = null;
	}
	
	
	private Node Insert(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
	
		if(data < root.data)
		{
			root.left = Insert(root.left, data);
		}
		else if(data > root.data)
			root.right = Insert(root.right, data);
		
		return root;
	}
	
	private Node Search(Node root, int data)
	{
		if(root == null || root.data == data)
		{
			return root;
		}
				
		if(data < root.data)
		{
			return Search(root.left, data);
		}

			return Search(root.right, data);	
	}
	

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		Root = new Node(50);
	      tree.Insert(Root, 30);
	      tree.Insert(Root, 20);
	      tree.Insert(Root, 40);
	      tree.Insert(Root, 70);
	      tree.Insert(Root, 60);
	      tree.Insert(Root, 80);

	      System.out.println("InOrder");
	      traversal.Inorder(Root);
//	      System.out.println("PreOrder");
//	      traversal.Preorder(Root);
//	      System.out.println("PostOrder");
//	      traversal.Postorder(Root);
	      
	      System.out.println("Min Value");
	      min.minValue(Root);
	}

}
