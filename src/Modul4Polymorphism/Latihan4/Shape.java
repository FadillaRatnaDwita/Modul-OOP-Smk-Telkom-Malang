package Modul4Polymorphism.Latihan4;

public class Shape {
    //Private member variable
    private String color;
    //Constructot
    public Shape(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Shape[color=" + color + " ]";
    }
    
    //All shapes must have a method called getArea
    public double getArea(){
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
