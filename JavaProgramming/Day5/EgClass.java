public class EgClass{
    public static void main(String... args)
    {
        ExceptionInterface obj1 = new ExceptionInterface();
        boolean checkExocc = false;
        while(!checkExocc)
        {
            try{
                obj1.methodinInterfaceA();
                checkExocc = true;
            }catch(Exception e)
            {   
                System.out.println(e);
            }
        }
    }
}