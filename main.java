import java.util.Scanner;
import java.util.Random;


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
    barcadefs[3] = new defender("Alves", "Barca", 95, 90, 80);
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
    System.out.println("Nice, now pick a midfielder from this list: " + barcamids.toString());
    int firstmid = scanner.nextInt();
    barcateam[2] = barcamids[firstmid - 1];
    System.out.println("Now pick another");
    int secondmid = scanner.nextInt();
    barcateam[3] = barcamids[secondmid - 1];
    System.out.println("Good picks boss, but now you need an attack. Of course Messi starts, now pick one from this list: " barcafors.toString());
    int firstforward = scanner.nextInt();
    barcateam[4] = barcafors[firstforward - 1];
    barcateam[5] = barcafors[0];
    System.out.println("Well done boss. We will field a lineup of " + barcateam.toString() + " against Real tomorrow. I like our chances");

    Madridteam = new player[6]
    Madridteam[0] = new defender("Pepe", "Madrid", 90, 80, 85);
    Madridteam[1] = new defender("Ramos", "Madrid", 85, 80, 90);
    Madridteam[2] = new midfield("Modric", "Madrid", 80, 85, 90);
    Madridteam[3] = new midfield("Kroos", "Madrid", 85, 90, 80);
    Madridteam[4] = new forward("Ronaldo", "Madrid", 99, 99, 99);
    Madridteam[5] = new forward("Bale", "Madrid", 85, 80, 95);
    
    Thread.sleep(2000);

    int barcascore = 0;
    int madridscore = 0;

    
    int barcapossesion = 0;
    for(player p in barcateam){
      barcapossesion += p.getpas();
    }

    int madridpossesion = 0;
    for(player p in madridteam){
      madridpossesion += p.getpas();
    }
    
    int barcadef = 0;
    for(int x = 0; x ++; x<4){
      barcadef += barcateam[x].getdef();
    }
    int madriddef = 0;
    for(int x = 0; x ++; x<4){
      madriddef += madridteam[x].getdef();
    }

    int barcaattack = 0;
    for(player p in barcateam){
      barcaattack += p.getsho();
    }
    
    int madridattack = 0;
    for(player p in madridteam){
      madridattack += p.getsho();
    }
    
    System.out.println("The next day, at the Camp Nou...");
    Thread.sleep(1000);
    
    

    System.out.println("Commentator: On a warm night here in Catalonia, the very finest footballers the world has to offer have assembled to play out this edition of the greatest rivalry in sporting history. 
      This is El Clasico, a battle not between two sets of footballers, but a battle between two footballing traditions, between two cities, and between two cultures. The intricate, passing football of barcelona,
      against the lethal rapid counter attacks of Real Madrid. The home grown talents of Barca, against the Galactico Superstars of Madrid. The humble Messi against the arrogant Ronaldo. The stakes could not be
      higher tonight. Only time will tell which side will emerge triumphant")
      Thread.sleep(5000);
    System.out.println("0': Barcelona kick off and we're underway. They have a spell of early possesion but lose it trying to go long looking for + " barcaplayers[5] + " Madrid tries to break quickly with " + 
                      madridplayers[5] + "but halted in their tracks by" + barcaplayers[3] + ". Both sides look promising in the opening exchanges, hopefully the match continues like this.");

    Random random = new Random();
    
    for(int x = 0; x <= 17; x ++){
      minute = 5*x + getRandomNumber(0, 4);
      String message = minute.toString() + "': ";
      if( random.nextInt(barcapossesion+madridpossesion) <= barcapossesion){
        if (random.nextInt(100) <= 20){
  
            barcascore += 1;
            String [] possiblemessages = new String[]{
             "" +  barcateam[1] + "slides it through for Messi, he chips the keeper, MESSIIIIIIIIIIIIIIIIIIIIIIIIIIIII. The man you can always count on to create the magic,
            and he's done it again for Barca today. What a brilliant goal.",
              
              barcateam[3] + "has found space out wide, takes on his man, beats him, plays it into the box for " + barcateam[4] + " and SCORES GOAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLLLL FOR BARCELONA",
              
              "Barcelona comfortable just circulating the ball slowly advancing. " + barcateam[0] + " plays it into midfield for " + barcateam[3] + " who finds" + barcateam[2] + " back to" + barcateam[3] + "
              who gets " + barcateam[4] " in space. HE DOESN'T MISS THOSE, WHAT A GOAL! CLASSIC TIKI TAKA, ABOSOLUTELY MAJESTIC TO WATCH!",

              "Messi drives through midfield, past one, past two, past THREE, PAST FOUR ALONE WITH CASILLAS. MESSI SHOOTS MESSIIIIIIIII! UNBELIEVABLE, BEYOND SUPERHUMAN, WHO ELSE BUT HIM COULD DO THAT! SURELY A GOAL
              THAT WILL GO DOWN IN HISTORY AS ONE OF THE GREATEST EVER SCORED"

              " " + barcateam[2] + "will try for distance... AND SCORE. HE'S ABSOLUTELY BLASTED THAT, NO HOPE FOR CASSILLAS, AND WHAT A GOAL"

              
            int randomIndex = random.nextInt(possiblemessages.length);
            message += possiblemessages[randomIndex];
            message += ". The score is now Barca - " + barcascore.toString + ", Madrid - " + madridscore.toString()
            System.out.println(Message);
          } 
          else{
            System.out.println("Barca smother madrid with their possesion, but fail to create significant chances");
        
          }

        
        }
        else{
          if (random.nextInt(100) <= 20){
  
            madridscore += 1;
                String [] possiblemessages = new String[]{
             "" +  madridteam[1] + "slides it through for Ronaldo, goes around the keeper with his stepovers, RONALDOOOOOOOOOOO. The man you can always count on to bring the goals,
            and he's done it again for Madrid today. What a brilliant goal.",
              
              madridteam[3] + "has found space out wide, takes on his man, beats him, plays it into the box for " + madridteam[5] + " and SCORES GOAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLLLL FOR BARCELONA",
              
              "Madrid breaking quickly with " + madridteam[0] + " plays it into midfield for " + madridteam[3] + " who finds" + madridteam[2] + " back to" + madridteam[3] + "
              who gets " + madridteam[5] " in space. HE DOESN'T MISS THOSE, WHAT A GOAL! RAPID, END TO END COUNTERATTACK, THERE'S NO STOPPING THAT",

              "" + madridteam[5] + " IS THROUGH ON GOAL, HES TACKLED FROM BEHING AND HE STAYS DOWN. ITS A FREEKICK! Ronaldo to take, surely not in his scoring range, but he's surprised us before. 
                  RONALDOOOOOOOOOOOOOOOOOOOOOOOOOOOO. ITS A MOMENT OF ABSOLUTE MAGIC FROM HIM HE'S BLASTED IT WITH NO HOPE OF A SAVE FROM TER STEGEN. THE POWER, THE PLACEMENT SURELY ON PAR WITH
                  THE ROBERTO CARLOS GOAL. A MOMENT TO REMEMBER FOR MADRID FANS AROUND THE WORLD"

              " " + madridteam[2] + "will try from distance... AND SCORE. HE'S ABSOLUTELY BLASTED THAT, NO HOPE FOR TER STEGEN, AND WHAT A GOAL"

              
                int randomIndex = random.nextInt(possiblemessages.length);
                message += possiblemessages[randomIndex];
                message += ". The score is now Barca - " + barcascore.toString + ", Madrid - " + madridscore.toString()
                System.out.println(Message);
                } 
              else{
                System.out.println("Madrid look to break with pace, but thwarted again");
        
              }
              Thread.sleep(5000)
            }
          if (barcagoals == madridgoals){
            System.out.println("90': Messi drives into the box, one last chance to score here. Ooh it's a nasty challenge from  Ramos and Messi's down holding his leg. Will it be a penalty? IT WILL. Messi steps up
              to take. Can he complete a treble that will be remembered for decades? HE CAAAAN MESIIIIIIIII HAS DONE IT FOR BARCA, HE ALWAYS DOES, WHAT A MOMENT
          }

        
        }
      }
    }
      
    
    
    
    
    
    
      
  }
}
