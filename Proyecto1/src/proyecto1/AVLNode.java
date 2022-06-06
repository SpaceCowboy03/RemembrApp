package Proyecto1;

class AVLNode {    

    public AVLNode left, right;

    public Activity data;

    private int height;
public AVLNode()

{

    left = null;

    right = null;

    data = null;

    setHeight(0);

}

/* Constructor */

public AVLNode(Activity n)

{

    left = null;

    right = null;

    data = n;

    setHeight(0);

}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}     

}