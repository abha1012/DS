	public void BFSTREE(Node root)
	{
		if(root == null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node top = q.poll();
			System.out.print(top);
			
			if(top.left != null)
			{
				q.add(top.left);
			}
			
			if(top.right != null)
			{
				q.add(top.right);
			}
		}	
	}
