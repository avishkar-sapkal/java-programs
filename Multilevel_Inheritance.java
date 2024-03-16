//MultiLevel inhertiance
//Use when you have a chain of classes where each subclass inherits from another subclass, forming a hierarchy.

class A{                                                    // Class A is Parent of class B but GrandParent of class C
    void show(){
        System.out.println("This is Grandparent Class");
    }
}
class B extends A{                                          // Class B is Parent of class C
    void display(){
        System.out.println("This is Parent class");
    }
}
class C extends B{                                          // This is the child class
    void print(){
        System.out.println("This is Child class");
    }
}

class Multilevel_Inheritance {
    public static void main(String[] args) {
        C c1=new C();
        c1.show();
        c1.display();
        c1.print();
    }
}
