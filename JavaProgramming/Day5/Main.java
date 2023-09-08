import java.io.*;
public class Main {
    
    public static void main(String[] args) throws NoSuchMethodException{
        MyError ob = new MyError();
        try{
            ob.print("Learn Java");
            throw new Error();
        }
        catch(Error e)
        {
            System.out.println("error displayed:"+e);
        }
    }
}
