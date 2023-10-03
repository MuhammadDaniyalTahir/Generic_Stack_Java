import java.util.List;
import java.util.ArrayList;
public class FirstNonRepeatingStream {
    private List<Character> stream;
    private char c = '-';
    FirstNonRepeatingStream(){
        stream = new ArrayList<>();
    }

    public void add(final char c){

        if(this.stream.contains(c)){
            this.c = '-';

        }
        else if(this.c == '-'){
            this.c = c;
        }
        this.stream.add(c);
    }
    public Character getFirstNonRepeating(){
        return this.c;
    }
}
