import java.util.Scanner;

public class EgClass{
    public static void main(String... args)
    {

        Integer arr[] = new Integer[100];
        for(int i=0;i<100;i++)
        {
            arr[i] = i;
        }
        Scanner sc = new Scanner(System.in);
        Integer index;
                try {
                        System.out.println("Enter the index need to be accessed");
                        index = sc.nextInt();
                        if(index<0 || index>=100)
                        {
                            throw new MyException("accessed the element which is not in the arrayindex");
                        }
                        System.out.println(arr[index]);
                }
                catch(MyException ex) {
                    System.out.println(ex);
                    System.out.println(ex.getMessage());
                }






        // ExceptionInterface obj1 = new ExceptionInterface();
        // boolean checkExocc = false;
        // while(!checkExocc)
        // {
        //     try{
        //         obj1.methodinInterfaceA();
        //         checkExocc = true;
        //     }catch(Exception e)
        //     {   
        //         System.out.println(e);
        //     }
        // }
    }
}