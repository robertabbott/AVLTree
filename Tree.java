
public interface Tree {

	public TreeNode predecessor(TreeNode root);
	public TreeNode successor (TreeNode root);

	public TreeNode getMin ();
	public TreeNode getMax ();

	public void insert (TreeNode newNode);
	public void deleteNodeKey (int key);
	public void deleteNode (TreeNode node);
	
}