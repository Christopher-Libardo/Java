import java.io.* ;

public class PhoneRecords
{
  public static void main (String[] args) throws IOException
  {
    
    BufferedReader objReader = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.print ("Please enter the date (in a capital letter; M, T, W, R, F, R (for Thursday, or S (for Saturday or Sunday)");
    String dayCode = objReader.readLine ();
    
    System.out.println ("Please enter hour the call started from (0 (12:00 midnight) to 23 (11:00 pm))");
    int startHour = Integer.parseInt ((objReader.readLine ())); 
    
    System.out.println ("Please enter the length of the call in minutes");
    int callLength = Integer.parseInt ((objReader.readLine ())); 
    
    PhoneCall call = new PhoneCall(dayCode, startHour, callLength ); // object
    Double fee = call.getcalcCost(); // receives the cost value
    
    System.out.println("The day the call started on is " + dayCode); // ouputs the day
    System.out.println("The hour the call started is " + startHour); // outputs the hour started 
    System.out.println("The length of the call is " + callLength + " minutes"); // ouputs the length if the call
    System.out.println("The total cost of the call is $" + fee); // ouputs the call's total cost
    
  }
}

class PhoneCall
{
  String dayCode;
  int startHour = 0;
  int callLength = 0;
  double fee = 0;
  
  PhoneCall (String dC, int sH, int cL) // constructor 
  {
    dayCode = dC;
    startHour = sH;
    callLength = cL;
    calcCost(); // declared so that the cost value is not zero
  }
  
  void calcCost ()
  {
    if (dayCode.equals("M") || dayCode.equals("T")|| dayCode.equals("W") || dayCode.equals("R") || dayCode.equals("F"))
    {
      if (startHour >= 8 || startHour <= 18 ) // to determine th
      {
    fee = Math.round(callLength * 0.40);
      }
        if (startHour <= 7 || startHour >= 19) 
      {
    fee = Math.round(callLength  * 0.25);
      }
    }
    { 
    if (dayCode.equals("S"))// calculates fee if day of call is on a weekend
     {
        fee = Math.round(callLength * 0.15);
      }
    }
  }
    double getcalcCost ()
    { 
      return fee; // returns value of fee to main method
    }
  } 


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
