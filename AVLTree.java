

public class AVLTree implements Tree {
	private TreeNode root;

	// constructors
	public AVLTree () {
		this.root = null
	}

	public AVLTree (TreeNode root) {
		this.root = root;
	}

	public AVLTree (List <TreeNode> nodeList) {
		for (i=0; i<nodeList.size(); i++) {
			insert (nodeList.get(i));
		}
	}


	// public methods
	public TreeNode search (int data) {
		return findNode (this.root, data);
	}
	
	public TreeNode successor(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode node;
        if (root.getRightChild() != null){
            // check right subtree first
            node = root.getRightChild(); 
        } 
        else {
        	if (root.getParent() != null) {
	            TreeNode parent = root.getParent();
	            if (root.equals(root.getLeftChild())) {
	                node = parent;
	                while (node.getLeftChild() == null) {
	                    if (node.getRightChild() == null) {
	                        return parent;
	                    }
	                    else {
	                    	node = node.getRightChild();
	                    }
	                }
	                node = node.getLeftChild();
	            } 
	            else {
	                // if the start node is the right child of the parent, start node doesn't have a successor
	                return null;
	            }
	        }
        }
        
        return findMin(node);
    }

	public TreeNode predecessor(TreeNode root) {
        if (root == null) {
        	return null;
        }
        TreeNode node;



        return
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
		temp.updateHeight ()

		// check if balanced
		if (isBalanced(temp) != null) {
			balanceTree (isBalanced(temp));
		}
		else {
			return;
		}
	}

	public void deleteNodeKey (int key) {

	}

	public void deleteNode (TreeNode node) {

	}


	// private methods
	private TreeNode isBalanced (TreeNode node) {
		if (node.getParent () != null) {
			if (node.getHeight () > 1) {
				return node;
			}
			else {
				return isBalanced (node.getParent());
			}
		}

		return null; 
	}

	private void balanceTree (TreeNode problemNode) {

	}

	private TreeNode findNode (TreeNode node, data) {
		// inorder dfs

	}

}