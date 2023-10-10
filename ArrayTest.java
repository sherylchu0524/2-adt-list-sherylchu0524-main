public class ArrayTest
{
    public static void main(String[] args) 
    {
        // make list
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        // output list
        for (int i = 0; i<4; i++)
        {
            System.out.println(i + "num:" + a.get(i));
        }

        // sub in number
        a.add(2, 99);
        // output list
       for (int i = 0; i<5; i++)
        {
            System.out.println(i + "num:" + a.get(i));

        }

        // remove the numeber
        a.remove(2);

        // output list
        for (int i = 0; i<4; i++)
        {
            System.out.println(i + "num:" + a.get(i));

        }

        // test add
        a.add(60);
        // output list
        for (int i = 0; i<5; i++)
        {
            System.out.println(i + "num:" + a.get(i));
        }

    }
}
