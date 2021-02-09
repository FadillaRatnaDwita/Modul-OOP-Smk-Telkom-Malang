package kelasTerbuka;

//Class Player
class Player{
    String name;
    double health;
    //int level;
    
    //Object member
    Weapon weapon;
    Armor armor;
    
    //Constructor
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }
    
    //Methode
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    
    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.Show();
        this.armor.Show();
    }
  
}

//Class Senjata
class Weapon{
    double attackPower;
    String name;
    
    //Constructor
       Weapon(String name, double attackPower) {
           this.name = name;
           this.attackPower = attackPower;
        }
       
     //Methode
       void Show(){
           System.out.println("Weapon : " + this.name + " , Power : " + this.attackPower );
       }
     
    
}

//Class Armor
class Armor{
    double defencePower;
    String name;
    
    //Constructot
    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    
    //Methode
     void Show(){
           System.out.println("Armor: " + this.name + " , Power : " + this.defencePower );
       }
     
}

public class Latihan1 {

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>> GAME <<<<<<<<<<<<<<<<");
        
        //Object Player
        Player player1 = new Player("Steeve", 20);
        Player player2 = new Player("Theo", 30);
        
        //Object weapon
        Weapon tembak = new Weapon( "Tembak", 20);
        Weapon pedang = new Weapon("Pedang", 33);
        
        //Object armor
        Armor pakaianBesi = new Armor("Pakaian Besi",17);
        Armor bajuKaret = new Armor("Baju Elastis", 19);
        
        //Equip senjata dan armor
          //PLAYER 1
        player1.equipWeapon(tembak);
        player1.equipArmor(pakaianBesi);
        player1.display();
        
           //PLAYER 2
        player2.equipWeapon(pedang);
        player2.equipArmor(bajuKaret);
        player2.display();
        
        
        
    
    }
    
}
