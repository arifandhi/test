import java.util.Scanner;

public class Square {
	private static Scanner sc;
	static void print_rectangle(int n, int m) 
    { 
        int i, j; 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= m; j++) 
            { 
                if (i==1 && j ==1)
                print(" ");
                else if (i==n && j ==m)
                print(" ");
                else if (i==1 && j ==m)
                print(" ");
                else if (i==n && j ==1)
                print(" ");
                else if (i == 1 || i == n ||  j == 1 || j == m) 
                    print("*");             
                else
                    print(" ");             
            } 
            println(); 
        } 
       
    } 
	public static void main(String[] args) 
	{
		int side;
		sc = new Scanner(System.in);
		
		println(" Please Enter any Side of a Square : ");
		side = sc.nextInt()+2;
// 		def side = System.console().readLine 'Enter valid number'
        // println "Hello $username"
		side=5
		if (side<1)
		{
		    println(" Please insert valid number");
		}
		print_rectangle(side, side); 
	}
}
