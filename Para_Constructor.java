class Para{
    String b;
    int a;
    Para(String b,int a){
        this.b=b;
        this.a=a;
    }
}
class Para_Constructor{
    public static void main(String[] args) {
        Para ab=new Para("Avishkar",5);
        System.out.println("The name is: "+ab.b);
        System.out.println("The value of a: "+ab.a);
    }
}
