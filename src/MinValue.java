
public class MinValue {
	
	void minValue(Node root)
	{
		if(root.left == null)
		{
			System.out.println(root.data);
			return;
		}
		
		minValue(root.left);
	}

}
