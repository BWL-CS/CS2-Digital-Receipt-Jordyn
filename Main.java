  public class Main {
  public static void main(String [] args) {
  
    Scanner input = new Scanner(System.in);
  

   double drinkPr = 2.50;
   double candyPr = 3.00;
   double hotdogPr = 6.00;
   double hamburgerPr = 6.00;

   int orderNum = math.random() + 100;

   System.out.println("Enter number of drinks?");
   int numDrink = input.nextInt();

   System.out.println("Enter number of candy");
   int numHotdog = input.nextInt();

   System.out.println("Enter number of hotdogs");
   int numHamburger = input.nextInt();

   System.out.println("Enter number of hambergers");
   int numCandy = input.nextInt();


   input.nextLine();

   System.out.println("Enter full highshool name");
   String fullSchoolName = input.nextLine();

   int firstSpace = fullSchoolName.indexOf(" ");
   int secondSpace = fullSchoolName.indexOf(" " + firstSpace + 1);

   String firstInitial = fullSchoolName.substring(0,1);
   String secondInitial = fullSchoolName.substring(firstSpace + 1, firstSpace + 2);
   String thirdInitial = fullSchoolName.substring(secondSpace + 1, secondSpace + 2);

   String highSchoolName = firstInitial + secondInitial + thirdInitial;

   double taxRate = 0.06;
   double subtotal = drinkPr + numDrink + candyPr + numCandy + hotdogPr + numHotdog + hamburgerPr + numHamburger;
   double totalTax = subtotal * taxRate;





   













     // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*   " + highSchoolName + "Snack Bar"  *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$1.50          *");                      
     System.out.println("*     Candy ..........$1.25          *");     
     System.out.println("*     Hot Dog ........$2.75          *");     
     System.out.println("*     Hamburger ......$3.50          *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
  }
  }
