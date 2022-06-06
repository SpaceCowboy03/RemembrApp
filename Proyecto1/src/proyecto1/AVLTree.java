package Proyecto1;

class AVLTree extends Activity{

    private AVLNode root;     

    public AVLTree()

    {

        root = null;

    }
    public boolean isEmpty()

    {

        return root == null;

    }

    public void makeEmpty()

    {

        root = null;

    }
    
    public void insert(Activity data)

    {

        root = insert(data, root);

    }


    private int height(AVLNode t )

    {

        return t == null ? -1 : t.getHeight();

    }


    private int max(int lhs, int rhs)

    {

        return lhs > rhs ? lhs : rhs;

    }


    private AVLNode insert(Activity data, AVLNode t)

    {

        if (t == null)

            t = new AVLNode(data);

        else if ( compare(data,t.data)<0)

        {

            t.left = insert( data, t.left );

            if( height( t.left ) - height( t.right ) == 2 )

                if(compare(data,t.left.data)<0  )//data < t.left.data

                    t = rotateWithLeftChild( t );

                else

                    t = doubleWithLeftChild( t );

        }

        else if( compare(data,t.data)>0 )//data > t.data

        {

            t.right = insert( data, t.right );

            if( height( t.right ) - height( t.left ) == 2 )

                if(compare(data,t.right.data)>0 )//data > t.right.data

                    t = rotateWithRightChild( t );

                else

                    t = doubleWithRightChild( t );

        }

        else

          ;  // Duplicate; do nothing

        t.setHeight(max( height( t.left ), height( t.right ) ) + 1);

        return t;

    }
   

    private AVLNode rotateWithLeftChild(AVLNode k2)

    {

        AVLNode k1 = k2.left;

        k2.left = k1.right;

        k1.right = k2;

        k2.setHeight(max( height( k2.left ), height( k2.right ) ) + 1);

        k1.setHeight(max( height( k1.left ), k2.getHeight() ) + 1);

        return k1;

    }



    private AVLNode rotateWithRightChild(AVLNode k1)

    {

        AVLNode k2 = k1.right;

        k1.right = k2.left;

        k2.left = k1;

        k1.setHeight(max( height( k1.left ), height( k1.right ) ) + 1);

        k2.setHeight(max( height( k2.right ), k1.getHeight() ) + 1);

        return k2;

    }

   

    private AVLNode doubleWithLeftChild(AVLNode k3)

    {

        k3.left = rotateWithRightChild( k3.left );

        return rotateWithLeftChild( k3 );

    }

    
    private AVLNode doubleWithRightChild(AVLNode k1)

    {

        k1.right = rotateWithLeftChild( k1.right );

        return rotateWithRightChild( k1 );

    }    

   

    public boolean search(Activity val)

    {

        return search(root, val);

    }

    private boolean search(AVLNode r, Activity val)

    {

        boolean found = false;

        while ((r != null) && !found)

        {

            Activity rval = r.data;

            if (compare(val,rval)<0)//val < rval

                r = r.left;

            else if (compare(val,rval)>0)//val > rval

                r = r.right;

            else

            {

                found = true;

                break;

            }

            found = search(r, val);

        }

        return found;

    }

    public void inorder()

    {

        inorder(root);

    }

    private void inorder(AVLNode r)

    {

        if (r != null)

        {

            inorder(r.left);

            System.out.print(r.data +" ");

            inorder(r.right);

        }

    }

    public void preorder()

    {

        preorder(root);

    }

    private void preorder(AVLNode r)

    {

        if (r != null)

        {

            System.out.print(r.data.name +" ");

            preorder(r.left);             

            preorder(r.right);

        }

    }


    public void postorder()

    {

        postorder(root);

    }

    private void postorder(AVLNode r)

    {

        if (r != null)

        {

            postorder(r.left);             

            postorder(r.right);

            System.out.print(r.data +" ");

        }

    }     

}


