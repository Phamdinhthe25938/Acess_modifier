public class Xay_dung_Lop {
    private String name="john";
    private String classes="c02";

   public Xay_dung_Lop(){

   }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
       Xay_dung_Lop st1=new Xay_dung_Lop();
        System.out.println("name:"+st1.name);
    }
}
