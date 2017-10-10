import java.io.* ;

public class DemoEmployee 
{
  public static void main (String[] args) throws IOException
  {
    
    BufferedReader objReader = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.print ("Please enter employee name ");
    String name =  objReader.readLine ();
    
    System.out.println ("Please enter the number of hours");
    double hours = Double.parseDouble ((objReader.readLine())); 
    
    System.out.println ("Please enter the pay rate");
    double rate = Double.parseDouble ((objReader.readLine())); 
    
    GrossPay one = new GrossPay (hours, rate);
    double grossPay = one.getgrossPay ();  
    
    Taxes tax = new Taxes (grossPay);
    
    double federalTax = tax.getfTax();
    double provincialTax = tax.getpTax();
    double nPay = tax.getnetPay();
    double fTax1 = tax.getfTax1 ();
    double pTax1 = tax.getpTax1 (); 
    double tTax = tax.gettTax ();
    
    System.out.println ( "The gross pay of the employee " + (name) + " is " + (grossPay)); 
    System.out.println ( "The Federal taxes is "  + (fTax1 * grossPay)); 
    System.out.println ( "The Provincial taxes  is " + (pTax1 * grossPay));
    System.out.println ( "The Total taxes is " + tTax); 
    System.out.println ( "The net pay of " + (name) + " is " + (nPay));
    
  }
}


class GrossPay
{
  double hours;
  double rate;
  double gP;
  
  GrossPay (double h, double r)
  {
    hours = h;
    rate = r;
    gP = hours * rate;
  } 
  double getgrossPay()
  {
    return gP;
  }
}
class Taxes
{
  double pTax = 0.14;
  double fTax = 0.17;
  double netPay = 0;
  double pTax1 = 0.14;
  double fTax1 = 0.17;
  double tTax = 0;
  
  Taxes (double grossPay)
  {
    fTax = grossPay * fTax;
    pTax = grossPay * pTax;
    tTax = grossPay * (fTax1 + pTax1);
    netPay =  grossPay - tTax;
  }
  double getnetPay ()
  {
    return netPay;
  }
  double getpTax ()
  {
    return pTax;
  }
  double getfTax ()
  {
    return fTax;
  }
  double getpTax1 ()
  {
    return pTax1;
  }
  double getfTax1 ()
  {
    return fTax1;
  }
  double gettTax ()
  {
    return tTax;
  }    
}













