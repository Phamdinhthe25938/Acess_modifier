import javax.xml.crypto.dom.DOMCryptoContext;

public class Acesss_modifier {
    private double radius =1;
    private String color ="red";
    public Acesss_modifier(){

    }
    public Acesss_modifier(double radius){
        this.radius=radius;
    }
    private  double getRadius() {
        return radius;
    }
    public double get(){
        return getRadius();
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double getArea(){
        double area= Math.PI*this.radius*this.radius;
        return area;
    }
}
