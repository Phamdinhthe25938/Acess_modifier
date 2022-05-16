public class testCircle {
    public static void main(String[] args) {
        Acesss_modifier circle = new Acesss_modifier();
        System.out.println("ban kinh:"+circle.get());
//        System.out.println("dien tich hinh tron:"+circle.getArea());
        circle.setRadius(3);
        System.out.println("ban kinh:"+circle.get());
//        System.out.println("dien tich hinh tron:"+circle.getArea());
    }
}
