import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        runGenericStack();
        runNonRepeating();
        runMergeIntervals();

    }
    static void runGenericStack(){
        System.out.println("\n****************Running Generic Stack*************");
        GenericStack st = new GenericStack();
        FirstNonRepeatingStream obj1 = new FirstNonRepeatingStream();
        FirstNonRepeatingStream obj2 = new FirstNonRepeatingStream();
        FirstNonRepeatingStream obj3 = new FirstNonRepeatingStream();
        st.push(1);
        st.push(2);
        st.push(obj2);
        st.push(obj3);
        st.push(obj1);
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
        System.out.println("\n****************Non Repeating Stream*************");
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
    static void runMergeIntervals(){
        System.out.println("\n****************Merging Intervals*************");
        int[] arr1 = {1,3};
        int[] arr2 = {2,6};
        int[] arr3 = {8,10};
        int[] arr4 = {15,18};
        int[] arr5 = {80,100};

        List<int[]> list = new ArrayList<int[]>();
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);
        System.out.println("List before merging");
        displayList(list);
        mergeIntervals(list);
        System.out.println("List after merging");
        displayList(list);
    }
    static void mergeIntervals(List<int[]> intervals){
        for(int i = 0; i < intervals.size()-1; i++){
            if(intervals.get(i)[1] > intervals.get(i+1)[0]){
                intervals.add(i, new int[]{intervals.get(i)[0], intervals.get(i+1)[1]});
                intervals.remove(i+1);
                intervals.remove(i+1);
                i--;
            }
        }
    }
    static void displayList(List<int[]> intervals){
        for(int i = 0; i < intervals.size(); i++){
            System.out.println("[" + intervals.get(i)[0] + "," + intervals.get(i)[1] + "]");
        }
    }
}