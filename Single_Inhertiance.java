// Single Inheritance
class A{                                                    // Parent class ,Super Class, Base class
    void show(){
        System.out.println("This is Parent Class");
    }
}
class B extends A{                                          // we use extends keyword to inhertiance
    void display(){                                         // Child Class, Sub class, Derived Class
        System.out.println("This is Child Class");
    }
}
class Single_Inhertiance {    
    public static void main(String[] args) {
        B b1=new B();                                       // Child class obj is been created to access the Parent class, b1 is the Child class obj
        b1.show();
        b1.display();
    }
}
