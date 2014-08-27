public class TreeNode {
	
	private Object data;
	private final Integer key;

    private int height = 0;

	private TreeNode leftChild = null;
	private TreeNode rightChild = null;
	private TreeNode parent = null;

    public TreeNode(int key, Object data) {
        this.key = key;
        this.data = data;
    }

    public TreeNode(int key, Object data, TreeNode parent) {
        this.key = key;
        this.data = data;
        this.parent = parent;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public void setData (Object data) {
    	this.data = data;
    }

    public void setLeftChild (TreeNode leftChild) {
    	this.leftChild = leftChild;
    }

    public void setRightChild (TreeNode rightChild) {
    	this.rightChild = rightChild;
    }

    public void setParent (TreeNode parent) {
    	this.parent = parent;
    }

    public int getHeight () {
        return this.height;
    }

    public TreeNode getLeftChild () {
    	return this.leftChild;
    }

    public TreeNode getRightChild () {
    	return this.rightChild;
    }

    public TreeNode getParent () {
    	return this.parent;
    }

    public Object getData () {
    	return this.data;
    }

    public Integer getKey () {
    	return this.key;
    } 

    public void updateHeight () {
        if (getHeight (this.leftChild) > getHeight (this.rightChild)) {
            setHeight (getHeight (this.leftChild)+1);
        }
        else {
            setHeight (getHeight (this.rightChild)+1);
        }
    }

    public void deleteNode () {
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }

    public int getHeight (TreeNode node) {
        if (node != null) {
            return node.height;
        }
        else {
            return -1;
        }
    }




}