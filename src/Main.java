import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        runGenericStack();
        runNonRepeating();
    }
    static void runGenericStack(){
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
    static void runNonRepeating(){
        FirstNonRepeatingStream stream = new FirstNonRepeatingStream();
        stream.add('a');
        stream.add('b');
        stream.add('a');
        stream.add('c');
        stream.add('b');
        stream.add('d');
        stream.add('e');
        stream.add('t');
        stream.add('f');
        System.out.println("First non-repeating element is: " + stream.getFirstNonRepeating());
    }
}