public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> st = new GenericStack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Stack size(): " + st.size());
        try{
            System.out.println("Stack pop(): " + st.pop());
        }
        catch (ExceptionHandling e){
            System.out.println(e.getmessage());
        }
        System.out.println("Stack isEmpty(): " + st.isEmpty());
    }
}