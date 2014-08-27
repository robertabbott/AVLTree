
public class testTreeNode {

	public static void main (String[] args) {
		TreeNode node1 = new TreeNode (1, 5);
		TreeNode node2 = new TreeNode (2, 10, node1);
		TreeNode node3 = new TreeNode (3, 3, node1);

		node1.setRightChild (node2);
		node1.setLeftChild (node3);
		node1.updateHeight ();

		System.out.println (node1.getData());
		System.out.println (node1.getRightChild().getData());
		System.out.println (node1.getHeight());
	}
}