

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
		// find next smallest 
		if (node.getLeftChild () == null && node.getRightChild () == null) {
			node = null
		}
		else {
			TreeNode next = findNextSmallest (node);
			node.setData (next.getData());
			// call switchnode until node has no children
			switchNode (next);
		}

	}


	// private methods

	private void switchNode (TreeNode node) {
		if (node.getLeftChild () == null && node.getRightChild () == null) {
			node = null
		}
		else {
			TreeNode next = findNextSmallest (node);
			node.setData (next.getData());
			switchNode (next);
		}
	}

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

    private TreeNode find(int key, boolean notInTree){
        TreeNode node = this.root;
        Node prevNode = this.root;
        
        while (node != null) {
            if (node.getKey() > key) {
                prevNode = node;
                node = node.getLeftChild();
            } 
            else if (node.getKey() < key) {
                prevNode = node;
                node = node.getRightChild();
            } 
            else {
                return node;
            }
        }

        if (notInTree){
            return prevNode;
        } 
        else {
            return null;
        }
    }

	private TreeNode findNextSmallest (TreeNode node) {
		if (node.getLeftChild () == null) {
			temp = node.getRightChild ();
			if (temp.getLeftChild () == null) {
				return temp;
			}
			else {
				while (temp.getLeftChild () != null) {
					temp = temp.getLeftChild ();
				}
				return temp;
			}

		}
		else if (node.getRightChild () == null) {
			// do stuff
			temp = node.getLeftChild ();
			if (temp.getRightChild () == null) {
				return temp;
			}
			else {
				while (temp.getRightChild () != null) {
					temp = temp.getRightChild ();
				}
				return temp
			}

		}
		else {
			temp = node.getRightChild ();
			while (temp.getRightChild () != null) {
				temp = temp.getRightChild ();
			}
			return temp
		}
	}    

	private void balanceTree (TreeNode problemNode) {

	}

	private TreeNode findNode (TreeNode node, data) {
		// inorder dfs

	}

}