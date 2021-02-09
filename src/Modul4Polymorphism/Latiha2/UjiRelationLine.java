package Modul4Polymorphism.Latiha2;

public class UjiRelationLine {

    public static void main(String[] args) {
        Line lineA = new Line(10, 222, 35, 79);
        Line lineB = new Line(100, 398, 56, 9);
        
       lineA.getLength();
       lineB.getLength();
       
        System.out.println("Length Line A : " + lineA.getLength() );
        System.out.println("Length Line B : " + lineB.getLength());
        System.out.println("\nLine A > Line B ----> " + lineA.isGreater(lineA, lineB) );
        System.out.println("Line A < Line B ----> " + lineA.isLeas(lineA, lineB));
        System.out.println("Line A == Line B ----> " + lineA.isEqual(lineA, lineB));
        
        System.out.println("\nLine B > Line A ----> " + lineB.isGreater(lineB, lineA) );
        System.out.println("Line B < Line A ----> " + lineB.isLeas(lineB, lineA));
        System.out.println("Line A == Line B ----> " + lineB.isEqual(lineB, lineA));
        
    }
    
}
