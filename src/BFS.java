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



	public void BFSGRAPH(int root)
	{
		
		Boolean[] visited = new Boolean[V];
		
		Queue<Integer> q = new LinkedList<Integer>();
		visited[root] = true;
		q.add(root);
		
		while(!q.isEmpty())
		{
			int top = q.poll();
			System.out.print(top);
			
			Iterator<Integer> it = adj[root].listIterator();
			while(it.hasNext())
			{
				int n = it.next();
				if(!visited[n])
				{
					visited[n] = true;
					q.add(n);
				}
			}
			
		}
		
	}
