import java.util.Scanner;
public class main{
  public static void main(String[] args){
    barcamids = new midfield[5];
    barcafors = new forward[5];
    barcadef = new defender[5];
    barcateam = new player[6];
    
    barcamids[0] = new midfield("Iniesta", "Barca", 90, 90, 80);
    barcamids[1] = new midfield("Xavi", "Barca", 80, 95, 85);
    barcamids[2] = new midfield("Busquets", "Barca", 80, 90, 85);
    barcamids[3] = new midfield("Rakitic", "Barca", 85, 80, 95);
    barcamids[4] = new midfield("Pedri", "Barca", 85, 90, 85);

    barcafors[0] = new forward("Messi", "Barca", 99, 99, 99);
    barcafors[1] = new forward("Neymar", "Barca", 80, 85, 95);
    barcafors[2] = new forward("Ronaldinho", "Barca", 80, 85, 95);
    barcafors[3] = new forward("Suarez", "Barca", 90, 85, 85);
    barcafors[4] = new forward("Lewandowski", "Barca, 95, 80, 85);

    barcadefs[0] = new defender("Puyol", "Barca", 85, 85, 85);
    barcadefs[1] = new defender("Pique", "Barca", 80, 95, 80);
    barcadefs[2] = new defender("Araujo", "Barca", 85, 80, 95);
    barcadefs[3] = new defender("Alves", "Barca", 95, 85, 80);
    barcadefs[4] = new defender("Alba", "Barca, 90, 85, 85);

    Scanner myscanner = new Scanner(System.in); 

    System.out.println("The year is 2015. You are Luis Enrique, Leading Barca at the height of its power. Only one trophy is still needed to complete a historic treble: the Uefa champions league. Tomorrow, you face your fellow spanish giants, Real Madrid in the final. The rivalry is legendary, and the game will surely be historic. Tonight, you drink coffee and make plans with the coaching staff. Choose your lineup of legendary players, with which you will face the mighty real madrid.%n %n (Hit enter to continue)"
    myscanner.nextLine();
    System.out.println("Assistant Coach: OK boss, lets select our defenders first. Choose a number between 1 and 5 to choose your first defender from the list: " + barcadefs.toString());
    int firstdef = scanner.nextInt();
    barcateam[0] = barcadefs[firstdef - 1];
    System.out.println(barcateam[0].toString() + " is a good choice, pick another from the list the same way");
    int seconddef = scanner.nextInt();
    barcateam[1] = barcadefs[firstdef - 1];
    System.out.println("
    
    
    
    
      
  }
}
