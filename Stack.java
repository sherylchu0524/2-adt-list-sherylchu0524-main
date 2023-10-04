public class Stack 
{
    private int[] items;
    private int numItems; 
    public Stack()
    {
        this.numItems = 0;
        this.items = new int [5];

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

    public void push(int item)
    {
        // do we have room
        if(this.numItems == this.items.length)
        {
            // run out of room
            this.makeArrayBigger();

        }
        // add the thing in
        this.items[this.numItems] = item;
        // increase item count
        this.numItems++;
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

    public int peek()
    {
        return this.items[this.numItems - 1];
    }

    public int pop()
    {
        // get item on top
        int topNum = this.peek();
        // remove from the last spot
        this.numItems--;
        this.items[this.numItems] = 0;
        // return topnum
        return topNum;

    }
}