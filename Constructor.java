// Default Constructor

class A{
    int a=10;
    A(){                                             // Special kind of method whose class name and method name is same
        System.out.print("This is Constructor");
    }
}
class Constructor {
    public static void main(String[] args) {
        A a=new A();                                 // here we call the constructor and we can call it as many time as the object is created
        //A b=new A();
        System.out.println("\nThis is variable of class A "+a.a);
    }
}
