interface MyInterface{
    int r = 3;
   default int return3(){
    return 3;
   };
}


class InterfaceDemo implements MyInterface{
    public static void main(String... args)
    {
        MyInterface m = new InterfaceDemo();
        System.out.println(m.return3());

    }
}