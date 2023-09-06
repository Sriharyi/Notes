
class MyException extends Exception {
    String msg;
    MyException(String msg) {
        super(msg);
        this.msg=msg;
    }
    
    public String toString() {
        return msg;
    }
}

