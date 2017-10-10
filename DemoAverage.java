import java.io.* ;

public class DemoAverage
{
  public static void main (String[] args) throws IOException
  {
    
    BufferedReader objReader = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.println ("Please enter your first course average");
    double course = Double.parseDouble ((objReader.readLine())); 
    
    System.out.println ("Please enter your second course average");
    double course2 = Double.parseDouble ((objReader.readLine())); 
    
    System.out.println ("Please enter your third course average");
    double course3 = Double.parseDouble ((objReader.readLine()));
    
    System.out.println ("Please enter your fourth course average");
    double course4 = Double.parseDouble ((objReader.readLine())); 
    

    Average one = new Average (course, course2, course3, course4);
    double avg = one.getavg();
    
    System.out.println (" Your average is " + avg);
    
  }
}

class Average
{
  double course = 0;
  double course2 = 0;
  double course3 = 0;
  double course4 = 0;
  double avg;  
 
  Average (double c, double c2, double c3, double c4)
  {
    course = c;
    course2 = c2;
    course3 = c3;
    course4 = c4;
    avg = ((course + course2 + course3 + course4) / 4);
  }
 
  double getavg()
  {
    return avg;
  }
  
}
