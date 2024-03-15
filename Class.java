
class Student{
    int Roll_no=162;                                                        // Variables
    String name="Avishkar";
    void Show(){                                                            //Method
        System.out.print("Student Class is created succcessfully \n");
    }
}
class Class {
    public static void main(String[] args){
        Student s1=new Student();   
        s1.Show();                                                        // s1 is the object of Student class
        System.out.println("The Name of Student is: "+s1.name);           // . is used to give access
        System.out.println("The Roll-no of Student is: "+s1.Roll_no);
    }
}
