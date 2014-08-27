

public class AVLTree implements Tree {
	private TreeNode root;

	public AVLTree (TreeNode root) {
		this.root = root;
	}

	public TreeNode search (int data) {

		return this.root;
	}
	
	public TreeNode child (TreeNode root) {

		return root;
	}

	public TreeNode parent (TreeNode root) {

		return root;
	}

	public TreeNode getMin () {
		TreeNode temp = this.root;

		while (temp.getLeftChild () != null) {
			temp = temp.getLeftChild ();
		}

		return temp;
	}

	public TreeNode getMax () {
		TreeNode temp = this.root;

		while (temp.getRightChild () != null) {
			temp = temp.getRightChild ();
		}
		
		return temp;
	}

	public void insert (TreeNode newNode) {
		// insert
		TreeNode temp = this.root;

		while (temp != null) {
			if (newNode.getData () > temp.getData ()) {
				temp = temp.getRightChild ();
			}
			else {
				temp = temp.getLeftChild ();
			}
		}
		newNode.setParent (temp.getParent());
		temp = newNode;

		// check if balanced
		if (isBalanced() == false) {
			balanceTree ();
		}
		else {
			return;
		}
	}

	public void deleteNodeKey (int key) {

	}

	public void deleteNode (TreeNode node) {

	}


	private boolean isBalanced () {


		return true; 
	}

	private void balanceTree () {

	}



}