
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS6083Aalluri {
	public static void main(String []args)throws FileNotFoundException
	{
	
	System.out.println("Name:vineetha Alluri");
	System.out.println("course id:CS608");
	System.out.println(java.time.LocalDate.now());
	FileInputStream ts=new FileInputStream("inputData3A.txt");
	Scanner sc=new Scanner(ts);
	int num[]=new int[100];
	int i=0;
	while(sc.hasNextInt())
	{ 
	   
	   num[i]=sc.nextInt();
	   i++;
	}
	  
		int n=num.length;
		for(int k=1;k<n; )
		{   
			int temp=num[k];
			int j=k-1;
			
			while(j>=0&&num[j]>temp)
			{   
				num[j+1]=num[j];
				j=j-1;
				}
			num[j+1]=temp;
			k++;
			}
			System.out.println("num[10]: "+num[10]);
			System.out.println("num[25]: "+num[25]);
			System.out.println("num[50]:"+num[50]);
			System.out.println("num[70]: "+num[70]);
			System.out.println("num[90]:" +num[90]);
			
		
			sc.close();
		}
	
	}

	


