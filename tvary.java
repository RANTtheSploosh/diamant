import java.util.Scanner;
public class tvary {
 public static void main(String[] args) {

  boolean a = false;
  String vstup;
  while(a == false) {
   Scanner skenr = new Scanner(System.in);

   System.out.println("Jaký tvar chceš vidět? \n1.Diamant \n2.Čtverec \n3.Obdelník");

   vstup = skenr.nextLine();
     
   switch (vstup) {
    case "1": diamant(); a = true; break;
    case "2": ctverec(); a = true; break;
    case "3": obdelnik(); a = true; break;
    default : System.out.println("VYBER SI Z UVEDENÝCH MOŽNOSTÍ. Btw zadávej čísla, ne jména tvarů :D");
  }
 }        
}
        
     
 public static void diamant() {

  int size,height,width_1,width_2,width_1_modifier,space_width_1,space_width_2,space_width_1_modifier_1,space_width_1_modifier_2,space_width_1_value_storage;
  
  Scanner size_scanner = new Scanner(System.in);
  System.out.println("Jak velký má diamant být? (pouze číslo)");
  size = size_scanner.nextInt();
  height = size + 1;
  width_1 = 0;
  width_2 = 2;
  width_1_modifier = 0;
  space_width_1_value_storage = -size;
  space_width_2 = size;
  space_width_1_modifier_2 = size;
  space_width_1_modifier_1 = -size;
  
  while (height > 0) {
   height--;
   width_2--;
   width_1_modifier++;
   space_width_1_modifier_2--;
   space_width_1_modifier_1 += 2;
   System.out.println(" ");
   space_width_1_value_storage = space_width_1_modifier_1 + space_width_1_modifier_2;
   space_width_1 = space_width_1_value_storage;

   while (space_width_1 <= space_width_2) {
    System.out.print(" ");
    space_width_1++;
        }
    width_1 = width_1_modifier + 1;
    while (width_1 > width_2) {
     width_1--;
     System.out.print("O");
   }
  }
  height = size + 1;
  while (height > 0) {
   height--;
   width_2++;
   width_1_modifier--;
   space_width_1_modifier_2++;
   space_width_1_modifier_1 -= 2;
   System.out.println(" ");
   space_width_1_value_storage = space_width_1_modifier_1 + space_width_1_modifier_2;
   space_width_1 = space_width_1_value_storage;

   while (space_width_1 <= space_width_2) {
    System.out.print(" ");
    space_width_1++;
        }
    width_1 = width_1_modifier + 1;
   while (width_1 > width_2) {
    width_1--;
    System.out.print("O");
   }
  }
 }
 static void ctverec() {
     Scanner skener = new Scanner(System.in);
     System.out.println("Jak velká má být strana tohoto čtverce? (pouze čísla)");
     
     int size = skener.nextInt();
     int true_size = size * size;
     int counter_2 = 0;
     
     for(int counter = 0;counter < true_size;counter++) {
         System.out.print("O");
         counter_2++;
               if(counter_2 == size) {
                   System.out.println(" ");
                   counter_2 = 0;
               }
     }
     
 }
 static void obdelnik() {
     Scanner skeneer = new Scanner(System.in);
     System.out.println("Jak velká má být šířka tohoto obdelníku?");
     int width = skeneer.nextInt();
     System.out.println("Jak velká má být výška tohoto obdelníku?");
     int height = skeneer.nextInt();
     int size_counter = 0;
     for(int size = width * height; size > 0; size--) {
         System.out.print("O");
         size_counter++;
         if(size_counter == width) {
             System.out.println(" ");
             size_counter = 0;
         }
         
     }
 }
}


