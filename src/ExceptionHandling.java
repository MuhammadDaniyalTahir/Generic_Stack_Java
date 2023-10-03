import java.io.IOException;

public class ExceptionHandling extends Exception {
    ExceptionHandling(final String error){
        super(error);
    }
    public String getmessage(){
        return super.getMessage();
    }
}
