import java.io.* ;

public class LibaCAT2
{
  public static void main (String[] args) throws IOException
  {
    
    BufferedReader objReader = new BufferedReader (new InputStreamReader (System.in));
    
    // Initializing values 
    String room; 
    int adults; 
    int children; 
    String meal; 
    String day; 
    Double deposit; 
    String taxCharge = "tax";
    String tipAndTax; 
    Double dayTax = 0.7; 
    Double discount; 
    Double tax = 0.18;  
    Double surcharge = 0.07;
     Double totalBill;
    
    // Values for the different rooms and it's price
    String A = "A";
    Double roomA = 55.00;
    String B = "B";
    Double roomB = 75.00;
    String C = "C";
    Double roomC = 85.00;     
    String D = "D";
    Double roomD = 100.00;
    String E = "E";
    Double roomE = 130.00;
    
    // These values represent the different meals offered for adults and children
    Double deluxe = 15.80;
    Double standard = 11.75;
    Double childDeluxe = (deluxe * 0.6);
    Double childStandard = (standard * 0.6);
    Double taxS = (standard * tax);
    Double taxD = (deluxe * tax);
    Double remainingBalance;
    
    System.out.println ("Please enter the room you are renting "); // Room type
    room = objReader.readLine ();
    
    System.out.println ("How many adults are present? "); // Number of adult guests
    adults = Integer.parseInt ((objReader.readLine ()));  
    
    System.out.println ("How many children are present? "); // Number of children  
    children = Integer.parseInt ((objReader.readLine ()));  
    
    // To recieve values from Adults and Children
    Double mealS = (standard * adults) + (childStandard * children);
    Double mealD = (deluxe * adults) + (childDeluxe * children);
    
    System.out.println ("Which type of meal are you ordering? "); // To determine the type of meal 
    meal = objReader.readLine ();
    
    System.out.println ("Please enter the day "); // To determing if srucharge is needed later on
    day = objReader.readLine ();
    
    System.out.println ("Please enter the deposit amount "); // To know the deposit amount 
    deposit = Double.parseDouble ((objReader.readLine ())); 
    
    // To determine room type
    if (room.equals(A))  
    {
      System.out.println ("Room Type: " + room);
    }
   
    System.out.println ("# of Adults " + adults);//f  Finding number of adult guests
    System.out.println ("# of Children" + " " + children);//  Finding number of child gueste
    System.out.println ("Type of Meal" + " " + meal);// To determine if the meal is Standard or Deluxe
    
    // Stating meal type
    if (meal == "standard")
    {
      System.out.println ("Type of Meal: " + " " + "standard");
    }
    else if (meal == "deluxe")
    {
      System.out.println ("Type of Meal: " + " " + "deluxe"); 
    }
    
    // Different room costs for each type
    if (room.equals(A))
    {
      System.out.println ("Room Cost: " + "$" + roomA);
    }
    // Calculating the type of meal for an adult guest
    if (meal.equals("Standard"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + standard);   
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + deluxe);   
    }
      
    // Calculating the type of meal for a child guest
    if (meal.equals("Standard")) 
    {
      System.out.println ("Meal cost per Child: " + "$" + childStandard); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Child: " + "$" + childDeluxe); 
    }
    
    if (day.equals(day))// stating day
    {
      System.out.println ("Day " + day);
    }
    
    // Calculating mealt type to number of adult guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(standard * adults)); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(deluxe * adults)); 
    }    
    
      // Calculating mealt type to number of child guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childStandard * children));  
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childDeluxe * children));  
    }
    
    // To find out if tax and/or surcharge is included for a standard meal based on the day
    if  (meal.equals("Standard") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax " + (mealS * tax));
    }
    else if  (meal.equals("Standard") && room.equals(A) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax " + (mealS + roomA) * (surcharge + tax)); 
    }
    
    // To find out if tax and/or surcharge is included for a deluxe meal based on the day
    if  (meal.equals("Deluxe") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax: " + (mealD * tax));
    }
    else if  (meal.equals("Deluxe") && (room.equals(A)) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax: " + (mealD + roomA ) * (surcharge + tax)); 
    }
     
     // Stating deposit amount
     if (deposit.equals(deposit))
    {
      System.out.println ("The deposit is " + "$" + deposit);
    }
    
    //  Discount is caluculated if the standard meal is picked 
    if ((mealS < 100)  && meal.equals("Standard"))
    {
      System.out.println ("Discount: " +  (mealS + roomA + tax * 0.005));
    }   
    else if (mealS >= 100  && mealS < 200 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomA  + tax * 0.015));
    }  
    else if (mealS >= 200  && mealS < 400 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomA  + tax * 0.030));
    }
    else if (mealS >= 400  && mealS < 800 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomA +  tax * 0.040));
    }  
    else if (mealS >= 800 && meal.equals("Standard"))
    {
      System.out.println (("Discount: " + (mealS + roomA  + tax * 0.05)));
    }  

 
    
    // Discount is caluculated if the standard meal is picked if the Deluxe meal is picked
    if ((mealD < 100) && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomA * tax * 0.005));
    }   
    else if (mealD >= 100  && mealD < 200 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomA * 0.015));
    }   
    else if (mealD >= 200  && mealD < 400 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomA * tax  * 0.030));
    }  
    else if (mealD >= 400  && mealD < 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (meal + roomA * tax * 0.040));
    }  
    else if (mealD >= 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomA * tax  * 0.050));
    }  
   if (meal.equals("Standard"))
   {
     System.out.println ((mealS + roomA - tax - deposit) * (surcharge));
   }
   if (meal.equals("Deluxe"))
   {
     System.out.println ((mealD + roomA - tax - deposit) * (surcharge));
   }
    
   // To determine room type
    if (room.equals(B))  
    {
      System.out.println ("Room Type: " + room);
    }
   
    System.out.println ("# of Adults " + adults);//f  Finding number of adult guests
    System.out.println ("# of Children" + " " + children);//  Finding number of child gueste
    System.out.println ("Type of Meal" + " " + meal);// To determine if the meal is Standard or Deluxe
    
    // Stating meal type
    if (meal == "standard")
    {
      System.out.println ("Type of Meal: " + " " + "standard");
    }
    else if (meal == "deluxe")
    {
      System.out.println ("Type of Meal: " + " " + "deluxe"); 
    }
    
    // Different room costs for each type
    if (room.equals(B))
    {
      System.out.println ("Room Cost: " + "$" + roomB);
    }
    // Calculating the type of meal for an adult guest
    if (meal.equals("Standard"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + standard);   
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + deluxe);   
    }
      
    // Calculating the type of meal for a child guest
    if (meal.equals("Standard")) 
    {
      System.out.println ("Meal cost per Child: " + "$" + childStandard); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Child: " + "$" + childDeluxe); 
    }
    
    if (day.equals(day))// stating day
    {
      System.out.println ("Day " + day);
    }
    
    // Calculating mealt type to number of adult guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(standard * adults)); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(deluxe * adults)); 
    }    
    
      // Calculating mealt type to number of child guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childStandard * children));  
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childDeluxe * children));  
    }
    
    // To find out if tax and/or surcharge is included for a standard meal based on the day
    if  (meal.equals("Standard") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax " + (mealS * tax));
    }
    else if  (meal.equals("Standard") && room.equals(A) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax " + (mealS + roomA) * (surcharge + tax)); 
    }
    
    // To find out if tax and/or surcharge is included for a deluxe meal based on the day
    if  (meal.equals("Deluxe") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax: " + (mealD * tax));
    }
    else if  (meal.equals("Deluxe") && (room.equals(B)) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax: " + (mealD + roomB ) * (surcharge + tax)); 
    }
     
     // Stating deposit amount
     if (deposit.equals(deposit))
    {
      System.out.println ("The deposit is " + "$" + deposit);
    }
    
    //  Discount is caluculated if the standard meal is picked 
    if ((mealS < 100)  && meal.equals("Standard"))
    {
      System.out.println ("Discount: " +  (mealS + roomB + tax * 0.005));
    }   
    else if (mealS >= 100  && mealS < 200 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomB  + tax * 0.015));
    }  
    else if (mealS >= 200  && mealS < 400 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomB  + tax * 0.030));
    }
    else if (mealS >= 400  && mealS < 800 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomB +  tax * 0.040));
    }  
    else if (mealS >= 800 && meal.equals("Standard"))
    {
      System.out.println (("Discount: " + (mealS + roomB  + tax * 0.05)));
    }  
    
    // Discount is caluculated if the standard meal is picked if the Deluxe meal is picked
    if ((mealD < 100) && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomB * tax * 0.005));
    }   
    else if (mealD >= 100  && mealD < 200 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomB * 0.015));
    }   
    else if (mealD >= 200  && mealD < 400 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomB * tax  * 0.030));
    }  
    else if (mealD >= 400  && mealD < 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (meal + roomB * tax * 0.040));
    }  
    else if (mealD >= 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomB * tax  * 0.050));
    }  
   if (meal.equals("Standard"))
   {
     System.out.println ((mealS + roomB - tax - deposit) * (surcharge));
   }
     if (meal.equals("Deluxe"))
   {
     System.out.println ((mealD + roomB - tax - deposit) * (surcharge));
   }
  
     // To determine room type
    if (room.equals(C))  
    {
      System.out.println ("Room Type: " + room);
    }
   
    System.out.println ("# of Adults " + adults);//f  Finding number of adult guests
    System.out.println ("# of Children" + " " + children);//  Finding number of child gueste
    System.out.println ("Type of Meal" + " " + meal);// To determine if the meal is Standard or Deluxe
    
    // Stating meal type
    if (meal == "standard")
    {
      System.out.println ("Type of Meal: " + " " + "standard");
    }
    else if (meal == "deluxe")
    {
      System.out.println ("Type of Meal: " + " " + "deluxe"); 
    }
    
    // Different room costs for each type
    if (room.equals(B))
    {
      System.out.println ("Room Cost: " + "$" + roomB);
    }
    // Calculating the type of meal for an adult guest
    if (meal.equals("Standard"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + standard);   
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + deluxe);   
    }
      
    // Calculating the type of meal for a child guest
    if (meal.equals("Standard")) 
    {
      System.out.println ("Meal cost per Child: " + "$" + childStandard); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Child: " + "$" + childDeluxe); 
    }
    
    if (day.equals(day))// stating day
    {
      System.out.println ("Day " + day);
    }
    
    // Calculating mealt type to number of adult guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(standard * adults)); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(deluxe * adults)); 
    }    
    
      // Calculating mealt type to number of child guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childStandard * children));  
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childDeluxe * children));  
    }
    
    // To find out if tax and/or surcharge is included for a standard meal based on the day
    if  (meal.equals("Standard") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax " + (mealS * tax));
    }
    else if  (meal.equals("Standard") && room.equals(C) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax " + (mealS + roomC) * (surcharge + tax)); 
    }
    
    // To find out if tax and/or surcharge is included for a deluxe meal based on the day
    if  (meal.equals("Deluxe") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax: " + (mealD * tax));
    }
    else if  (meal.equals("Deluxe") && (room.equals(C)) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax: " + (mealD + roomC ) * (surcharge + tax)); 
    }
     
     // Stating deposit amount
     if (deposit.equals(deposit))
    {
      System.out.println ("The deposit is " + "$" + deposit);
    }
    
    //  Discount is caluculated if the standard meal is picked 
    if ((mealS < 100)  && meal.equals("Standard"))
    {
      System.out.println ("Discount: " +  (mealS + roomC + tax * 0.005));
    }   
    else if (mealS >= 100  && mealS < 200 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomC  + tax * 0.015));
    }  
    else if (mealS >= 200  && mealS < 400 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomC  + tax * 0.030));
    }
    else if (mealS >= 400  && mealS < 800 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomC +  tax * 0.040));
    }  
    else if (mealS >= 800 && meal.equals("Standard"))
    {
      System.out.println (("Discount: " + (mealS + roomC  + tax * 0.05)));
    }  
    
    // Discount is caluculated if the standard meal is picked if the Deluxe meal is picked
    if ((mealD < 100) && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomC * tax * 0.005));
    }   
    else if (mealD >= 100  && mealD < 200 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomC * 0.015));
    }   
    else if (mealD >= 200  && mealD < 400 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomC * tax  * 0.030));
    }  
    else if (mealD >= 400  && mealD < 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (meal + roomC * tax * 0.040));
    }  
    else if (mealD >= 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomC * tax  * 0.050));
    }  
   if (meal.equals("Standard"))
   {
     System.out.println ((mealS + roomC - tax - deposit) * (surcharge));
   }
   if (meal.equals("Deluxe"))
   {
     System.out.println ((mealD + roomC - tax - deposit) * (surcharge));
   }
     
       // To determine room type
    if (room.equals(D))  
    {
      System.out.println ("Room Type: " + room);
    }
   
    System.out.println ("# of Adults " + adults);//f  Finding number of adult guests
    System.out.println ("# of Children" + " " + children);//  Finding number of child gueste
    System.out.println ("Type of Meal" + " " + meal);// To determine if the meal is Standard or Deluxe
    
    // Stating meal type
    if (meal == "standard")
    {
      System.out.println ("Type of Meal: " + " " + "standard");
    }
    else if (meal == "deluxe")
    {
      System.out.println ("Type of Meal: " + " " + "deluxe"); 
    }
    
    // Different room costs for each type
    if (room.equals(D))
    {
      System.out.println ("Room Cost: " + "$" + roomD);
    }
    // Calculating the type of meal for an adult guest
    if (meal.equals("Standard"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + standard);   
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + deluxe);   
    }
      
    // Calculating the type of meal for a child guest
    if (meal.equals("Standard")) 
    {
      System.out.println ("Meal cost per Child: " + "$" + childStandard); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Child: " + "$" + childDeluxe); 
    }
    
    if (day.equals(day))// stating day
    {
      System.out.println ("Day " + day);
    }
    
    // Calculating mealt type to number of adult guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(standard * adults)); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(deluxe * adults)); 
    }    
    
      // Calculating mealt type to number of child guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childStandard * children));  
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childDeluxe * children));  
    }
    
    // To find out if tax and/or surcharge is included for a standard meal based on the day
    if  (meal.equals("Standard") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax " + (mealS * tax));
    }
    else if  (meal.equals("Standard") && room.equals(D) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax " + (mealS + roomD) * (surcharge + tax)); 
    }
    
    // To find out if tax and/or surcharge is included for a deluxe meal based on the day
    if  (meal.equals("Deluxe") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax: " + (mealD * tax));
    }
    else if  (meal.equals("Deluxe") && (room.equals(D)) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax: " + (mealD + roomD ) * (surcharge + tax)); 
    }
     
     // Stating deposit amount
     if (deposit.equals(deposit))
    {
      System.out.println ("The deposit is " + "$" + deposit);
    }
    
    //  Discount is caluculated if the standard meal is picked 
    if ((mealS < 100)  && meal.equals("Standard"))
    {
      System.out.println ("Discount: " +  (mealS + roomD + tax * 0.005));
    }   
    else if (mealS >= 100  && mealS < 200 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomD  + tax * 0.015));
    }  
    else if (mealS >= 200  && mealS < 400 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomD  + tax * 0.030));
    }
    else if (mealS >= 400  && mealS < 800 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomD +  tax * 0.040));
    }  
    else if (mealS >= 800 && meal.equals("Standard"))
    {
      System.out.println (("Discount: " + (mealS + roomD + tax * 0.05)));
    }  
    
    // Discount is caluculated if the standard meal is picked if the Deluxe meal is picked
    if ((mealD < 100) && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomD * tax * 0.005));
    }   
    else if (mealD >= 100  && mealD < 200 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomD * 0.015));
    }   
    else if (mealD >= 200  && mealD < 400 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomD * tax  * 0.030));
    }  
    else if (mealD >= 400  && mealD < 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (meal + roomD * tax * 0.040));
    }  
    else if (mealD >= 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomD * tax  * 0.050));
    }  
   if (meal.equals("Standard"))
   {
     System.out.println ((mealS + roomD - tax - deposit) * (surcharge));
   }
   else if (meal.equals("Deluxe"))
   {
     System.out.println ((mealD + roomD - tax - deposit) * (surcharge));
   } 
       // To determine room type
    if (room.equals(E))  
    {
      System.out.println ("Room Type: " + room);
    }
   
    System.out.println ("# of Adults " + adults);//f  Finding number of adult guests
    System.out.println ("# of Children" + " " + children);//  Finding number of child gueste
    System.out.println ("Type of Meal" + " " + meal);// To determine if the meal is Standard or Deluxe
    
    // Stating meal type
    if (meal == "standard")
    {
      System.out.println ("Type of Meal: " + " " + "standard");
    }
    else if (meal == "deluxe")
    {
      System.out.println ("Type of Meal: " + " " + "deluxe"); 
    }
    
    // Different room costs for each type
    if (room.equals(E))
    {
      System.out.println ("Room Cost: " + "$" + roomE);
    
    // Calculating the type of meal for an adult guest
    if (meal.equals("Standard"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + standard);   
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Adult: " + "$" + deluxe);   
    }
      
    // Calculating the type of meal for a child guest
    if (meal.equals("Standard")) 
    {
      System.out.println ("Meal cost per Child: " + "$" + childStandard); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Meal cost per Child: " + "$" + childDeluxe); 
    }
    
    if (day.equals(day))// stating day
    {
      System.out.println ("Day " + day);
    }
    
    // Calculating mealt type to number of adult guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(standard * adults)); 
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Adult Meal: " + "$" + Math.round(deluxe * adults)); 
    }    
    
      // Calculating mealt type to number of child guests
    if (meal.equals("Standard"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childStandard * children));  
    }
    else if (meal.equals("Deluxe"))
    {
      System.out.println ("Cost of Child Meal: " + "$" + Math.round(childDeluxe * children));  
    }
    
    // To find out if tax and/or surcharge is included for a standard meal based on the day
    if  (meal.equals("Standard") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax " + (mealS * tax));
    }
    else if  (meal.equals("Standard") && room.equals(E) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax " + (mealS + roomE) * (surcharge + tax)); 
    }
    
    // To find out if tax and/or surcharge is included for a deluxe meal based on the day
    if  (meal.equals("Deluxe") && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")))
    {
      System.out.println ("Tip and tax: " + (mealD * tax));
    }
    else if  (meal.equals("Deluxe") && (room.equals(E)) && (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")))
    {
      System.out.println ("Tip and tax: " + (mealD + roomE ) * (surcharge + tax)); 
    }
     
     // Stating deposit amount
     if (deposit.equals(deposit))
    {
      System.out.println ("The deposit is " + "$" + deposit);
    }
    
    //  Discount is caluculated if the standard meal is picked 
    if ((mealS < 100)  && meal.equals("Standard"))
    {
      System.out.println ("Discount: " +  (mealS + roomE + tax * 0.005));
    }   
    else if (mealS >= 100  && mealS < 200 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomE + tax * 0.015));
    }  
    else if (mealS >= 200  && mealS < 400 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomE  + tax * 0.030));
    }
    else if (mealS >= 400  && mealS < 800 && meal.equals("Standard"))
    {
      System.out.println ("Discount: " + (mealS + roomE +  tax * 0.040));
    }  
    else if (mealS >= 800 && meal.equals("Standard"))
    {
      System.out.println (("Discount: " + (mealS + roomE + tax * 0.05)));
    }  
    
    // Discount is caluculated if the standard meal is picked if the Deluxe meal is picked
    if ((mealD < 100) && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomE * tax * 0.005));
    }   
    else if (mealD >= 100  && mealD < 200 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomE * 0.015));
    }   
    else if (mealD >= 200  && mealD < 400 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomE * tax  * 0.030));
    }  
    else if (mealD >= 400  && mealD < 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (meal + roomE * tax * 0.040));
    }  
    else if (mealD >= 800 && meal.equals("Deluxe"))
    {
      System.out.println ("Discount: " +  (mealD + roomE * tax  * 0.050));
    }  
   if (meal.equals("Standard"))
   {
     System.out.println ("Remaining Balance " + (mealS + roomE - tax - deposit) * (surcharge));
   }
   else if (meal.equals("Deluxe"))
   {
   System.out.println ("Remaining Balance " + (mealD + roomE - tax - deposit) * (surcharge));
   } 
    }
   }  
  }