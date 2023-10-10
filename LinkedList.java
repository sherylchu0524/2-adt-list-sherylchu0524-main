public class LinkedList
{
    // the first node 
   private Node head;
   private int numItems;

   public LinkedList()
   {
      this.head = null;
      this.numItems = 0;
   }


   public void add(int element)
   {
        // check if we have head yet
        if(numItems>=1)
        {
            // position start from head
            Node position = this.head;
            // if has next = true, keep connecting to the last one
            while(position.hasNext())
            {
                
                position = position.next();
            }
            Node n = new Node(element);
            position.setNext(n);
        }
        // else if no head
        else
        {
            Node n  = new Node(element);
            this.head = n;
            
        }
System.out.println("added:"+ element);
        numItems ++;
   }      

   public void add(int index, int element)
   {
    // check for head 
    if (numItems>1)   
    {
        // position start from head
        Node position = this.head;
       // for loop to determine index
        for (int i = 0; i<index; i++)
        {
            position = position.next();
        }
        // get the node after
        Node after = position.next();
        // create new node
        Node n = new Node(element);
        // direct node to new one
        position.setNext(n);
        // direct the new node to the one after
        n.setNext(after);
    }
    else
    {
        Node n  = new Node(element);
        this.head = n;
    }
    numItems ++;

        
   }

   public int get(int index)
   {
        int num;    
        
        // check if have items
        
        if (numItems>1)
        {
            Node position = this.head;
            // get the node
            for(int i = 0; i<index; i++)
            {
                position = position.next();
            }
            // get the number of that node
            num = position.getNumber();
        }
        else
        {
            throw new IndexOutOfBoundsException("error");
        }

        return num;
        
   }

   public int remove(int index)
   {
        int removed;
        // check if have items
        if (numItems>1)
        {
            Node numBefore = this.head;
            for(int i = 0; i<index; i++)
            {
                numBefore = numBefore.next();
            }
            Node toRemove = numBefore.next();
            Node nextNum = toRemove.next();
            // get the number removed
            removed = toRemove.getNumber();
            // link the one before to after
            numBefore.setNext(nextNum);
            
            System.out.println("removed: "+removed);
            numItems --;
        }
        else
        {
            throw new IndexOutOfBoundsException("error");
        }

        return removed;

   }

   public int size()
   {
        return this.numItems;
   }

   public boolean isEmpty()
   {
        // if numitem = 0, return true, else false
        return this.numItems == 0;
   }

}
