public class Th1_Static_method {
    private static int id;
    private String name;
   private  static   String college ="bdth";
    public Th1_Static_method(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  static void change(){
        id=1;
    }
    public  void display(){
        System.out.println("id:"+this.id+"name:"+this.name+"class:"+college);
    }

    public static void main(String[] args) {
        Th1_Static_method st1= new Th1_Static_method(1,"hoang");
        Th1_Static_method st2= new Th1_Static_method(2,"the");
        Th1_Static_method st3= new Th1_Static_method(3,"duc");
        st1.id=4;
        st1.display();
        st2.display();
        st3.display();
    }
}
