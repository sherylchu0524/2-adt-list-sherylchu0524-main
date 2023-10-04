public class ArrayList
{
    private int[] items;
    private int numItems;
       
   public ArrayList()
   {
      this.numItems = 0;
      this.items = new int[5];

   }


   public void add(int element)
   {  
      // make sure for room
      if(this.numItems == this.items.length)
      {
          // run out of room
          makeArrayBigger();
      }      // add element in END of list
      this.items[numItems] = element;
      // add to amount for later
      numItems++;
   }      

   public void add(int index, int element)
   {
        // check for space
        if(this.numItems+1 == this.items.length)
        {
            // run out of room
            makeArrayBigger();
        }        
        // move space to substiture
        for (int i = numItems; i>=index; i--)
        {
            // move up
            items[i+1] = items[i];
        }
        // substitute the index and element
        items[index] = element;
        // add amount of items
        numItems++;

        
   }

   public int get(int index)
   {
        int numGet;
        // check if in bound
        if(index<0 || index>numItems)
        {
            throw new IndexOutOfBoundsException("error");
        }
        else 
        {
            numGet = items[index];
        }
        return numGet;
   }

   public int remove(int index)
   {
        // shuufle elements backward
        for (int i = index+1; i<numItems; i++)
        {
            items[i-1] = items[i];
        }
        numItems--;
        return items[index];
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

   private void makeArrayBigger()
    {
        // make a new array twice the size
        int[] bigger = new int[this.items.length*2];
        // copy everything
        for (int i = 0; i<this.items.length; i++)
        {
            bigger[i] = this.items[i];
        }

        //make the biggger array the actual item array
        this.items = bigger;
    }



}

