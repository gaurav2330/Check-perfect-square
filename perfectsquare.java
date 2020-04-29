import java.lang.Math;  
import java.io.*;  
  
class perfectsquare {  
  
static boolean checkPerfectSquare(double n)  
{    
    double d = Math.sqrt(n);  
    
    if (d * d == n)  
        return true;  
  
    return false;  
}  
  
static int largestPerfectSquareNumber(int a[], double n)  
{  
 
    int max = -1;  
 
    for (int i = 0; i < n; i++)
     {  
        if (checkPerfectSquare(a[i]))  
            max = Math.max(a[i], max);  
    }  
  
    return max;  
}   
  
    public static void main (String[] args) {  
            int []a = { 16, 20, 25, 2, 3, 10 };  
  
    double n = a.length;  
  
    System.out.println( largestPerfectSquareNumber(a, n));  
  
    }  
}  

