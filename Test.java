public class Test {
    public static void main(String[] args) 
    {
        // make stack
        Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(-7);
        s.push(1);
        s.push(20);
        s.push(-6);
        s.push(9);

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
