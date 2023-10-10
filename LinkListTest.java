public class LinkListTest 
{
    public static void main(String[] args) 
    {
        LinkedList l = new LinkedList();
        // add elements
        l.add(1);
        l.add(2);
        System.out.println(l.get(0) +"," +l.get(1));


        // substitute element
        l.add(1, 55);
        System.out.println(l.get(0) +"," + l.get(1) + "," + l.get(2));

        // remove element
        l.remove(1);
        System.out.println(l.get(0) +"," +l.get(1));
        
        // get size
        System.out.println("size: " +l.size());


    }
}
