class OuterClass {
    static class InnerClass {
        Integer a = 0;
        static Integer b = 0;
        Integer getA() {
            return this.a++;
        }
        Integer getB() {
            return InnerClass.b++;
        }
    }
}

class EgClass extends OuterClass.InnerClass {
    public static void main(String[] args) {
        EgClass eg1 = new EgClass();
        EgClass eg2 = new EgClass();
        System.out.println(eg1.getA());
        System.out.println(eg2.getA());
        System.out.println(eg2.getB());
        System.out.println(eg2.getB());
    }
}