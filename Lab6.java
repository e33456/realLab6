public class Lab6
{
  public static boolean isNarcissisticNumber (int num)
  {
    int count = 0;
      int temp = num;
      int sum = 0;
    
    while (temp>0)
    {
      temp = temp/10;
      count++;
    } 
    int x = num;
    while (x > 0)
    {
      sum += Math.pow (x%10, count);
      x = x/10;
    }
    
    if (sum==num)
    {
      return true;
    }
    else
    {
      return false;
    }
    
  }
}
   
