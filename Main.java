  import java.util.Scanner;
  
  public class Main {
  public static void main(String [] args) {
  
    Scanner input = new Scanner(System.in);
  

   double drinkPr = 2.50;
   double candyPr = 3.00;
   double hotdogPr = 6.00;
   double hamburgerPr = 6.00;

   int orderNum = (int)(Math.random() * 100) + 1;

   System.out.println("Enter number of drinks");
   int numDrink = input.nextInt();

   System.out.println("Enter number of candy");
   int numCandy = input.nextInt();

   System.out.println("Enter number of hotdogs");
   int numHotdog = input.nextInt();

   System.out.println("Enter number of hamburgers");
   int numHamburger = input.nextInt();


   input.nextLine();

   System.out.println("Enter full highshool name");
   String fullSchoolName = input.nextLine();

   int firstSpace = fullSchoolName.indexOf(" ");
   int secondSpace = fullSchoolName.indexOf(" ", firstSpace + 1);

   String firstInitial = fullSchoolName.substring(0,1);
   String secondInitial = fullSchoolName.substring(firstSpace + 1, firstSpace + 2);
   String thirdInitial = fullSchoolName.substring(secondSpace + 1, secondSpace + 2);

   String highSchoolName = firstInitial + secondInitial + thirdInitial;

   double taxRate = 0.07;
   double subtotal = drinkPr + numDrink + candyPr + numCandy + hotdogPr + numHotdog + hamburgerPr + numHamburger;
   double totalTax = subtotal * taxRate;
   totalTax = ((int)(totalTax * 100 + 0.5) /100.0);
   double total = subtotal + totalTax;
   total = ((int)(total * 100 + 0.5) /100.0);

   // decimal rounding 
   // test order of numbers -- check where it is stored after being read in, or check how it is referenced when being printed 
   // polish the printed result









     // RECEIPT PRINTOUT SECTION

     System.out.println("****************************");
     System.out.println("*                          *");
     System.out.println("*  " + highSchoolName + " Snack Bar           *");
     System.out.println("*  Order Number " + orderNum +  "         *");
     System.out.println("*                          *");  
     System.out.println("*  " + numDrink + " Drink......$" +  (numDrink * drinkPr) + "      *");  
     System.out.println("*  " + numCandy + " Candy......$" +  (numCandy * candyPr) + "      *");  
     System.out.println("*  " + numHotdog + " Hotdog......$" +  (numHotdog * hotdogPr) + "     *");  
     System.out.println("*  " + numHamburger + " Hamburger......$" +  (numHamburger * hamburgerPr) + "  *");  
     System.out.println("*                          *"); 
     System.out.println("*     Subtotal....$" + subtotal + "    *");                  
     System.out.println("*     Tax.........$" + totalTax + "    *");     
     System.out.println("*     Total.......$" + total + "   *");         
     System.out.println("*                          *");    
     System.out.println("****************************");

     input.close();
    }
  }
