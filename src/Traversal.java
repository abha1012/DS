
public class Traversal {
	
	void Inorder(Node root) {
		
		if(root == null)
			return;
		
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);
		
	}
	

	 void Preorder(Node root) {
		
		if(root == null)
			return;
		
		System.out.println(root.data);
		Preorder(root.left);
		Preorder(root.right);
		
	}
	

	 void Postorder(Node root) {
		
		if(root == null)
			return;
		
		Postorder(root.left);
		Postorder(root.right);
		System.out.println(root.data);
		
	}

}
