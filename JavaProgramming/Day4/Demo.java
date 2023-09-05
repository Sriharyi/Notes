class Demo{
    public static void main(String... args)
    {
        calculator calc = new Mycalculator();
        System.out.println(calc.add(3,6));
        System.out.println(calc.add(3.000f,6.0f));
        System.out.println(calc.add(3.0,6.0));
        System.out.println(calc.add(3.0f,6));
        System.out.println(calc.add(3,6.0f));
        System.out.println(calc.add(3.0,6));
        System.out.println(calc.add(3,6.0));
        System.out.println(calc.add(3.0,6.0f));
        System.out.println(calc.add(3.0f,6.0));

        System.out.println(calc.sub(3,6));
        System.out.println(calc.sub(3.0f,6.0f));
        System.out.println(calc.sub(3.0,6.0));
        System.out.println(calc.sub(3.0f,6));
        System.out.println(calc.sub(3,6.0f));
        System.out.println(calc.sub(3.0,6));
        System.out.println(calc.sub(3,6.0));
        System.out.println(calc.sub(3.0,6.0f));
        System.out.println(calc.sub(3.0f,6.0));

        System.out.println(calc.mul(3,6));
        System.out.println(calc.mul(3.0f,6.0f));
        System.out.println(calc.mul(3.0,6.0));
        System.out.println(calc.mul(3.0f,6));
        System.out.println(calc.mul(3,6.0f));
        System.out.println(calc.mul(3.0,6));
        System.out.println(calc.mul(3,6.0));
        System.out.println(calc.mul(3.0,6.0f));
        System.out.println(calc.mul(3.0f,6.0));

        System.out.println(calc.div(3,6));
        System.out.println(calc.div(3.0f,6.0f));
        System.out.println(calc.div(3.0,6.0));
        System.out.println(calc.div(3.0f,6));
        System.out.println(calc.div(3,6.0f));
        System.out.println(calc.div(3.0,6));
        System.out.println(calc.div(3,6.0));
        System.out.println(calc.div(3.0,6.0f));
        System.out.println(calc.div(3.0f,6.0));
    }
}