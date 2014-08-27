
public interface Tree {

	public TreeNode child (TreeNode root);
	public TreeNode parent (TreeNode root);

	public TreeNode getMin ();
	public TreeNode getMax ();

	public void insert (TreeNode newNode);
	public void deleteNodeKey (int key);
	public void deleteNode (TreeNode node);
	
}