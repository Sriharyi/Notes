import java.util.*;
interface MyInterface{
    void methodinInterfaceA() throws Exception;
}

class ExceptionInterface implements MyInterface{
  public void methodinInterfaceA() throws Exception{
        Scanner sc = new Scanner(System.in);
        try{
            Integer A = sc.nextInt();
            Integer B = sc.nextInt();
            Integer C = A/B;
            System.out.println("diveded value:"+C);
        }
        catch(InputMismatchException ie)
        {
            throw new Exception("Input must be a number.\nso try again");
        }catch(ArithmeticException ae)
        {
            throw new Exception("how you can divide a number with zero it will infinite computer can't handle this case.  \nso try again");
        }finally
        {
            System.out.println("finally block excuted and code completed");
        }
    }
}