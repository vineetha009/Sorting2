
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS6083Balluri {

	public static void main(String[] args)throws FileNotFoundException
	{
		CS6083Balluri sh=new CS6083Balluri();
		System.out.println("Name:vineetha Alluri");
		System.out.println("course id:CS608");
		System.out.println(java.time.LocalDate.now());
		
		long s1= System.nanoTime();
		sh.hibbsort();
		long e1=System.nanoTime();
		long D1=e1-s1;
		System.out.println("Nanoseconds taken by algorithm to sort:"+D1);
		long s2=System.nanoTime();
		sh.powsort();
		long e2=System.nanoTime();
		long D2=e2-s2;
		System.out.println("Nanoseconds taken by algorithm to sort:"+D2);
		long s3=System.nanoTime();
		sh.primesort();
		long e3=System.nanoTime();
		long D3=e3-s3;
		System.out.println("Nanoseconds taken by algorithm to sort:"+D3);
		
	}
	public int[] input()throws FileNotFoundException
	{
	FileInputStream ts=new FileInputStream("inputData3B.txt");
	Scanner sc=new Scanner(ts);
	int num[]=new int[1000];
	int i=0;
	while(sc.hasNextInt())
	{ 
	   
	   num[i]=sc.nextInt();
	   i++;
	}
	sc.close();
	return num;
		}
	
	public int[]hibb(){
		int[] hib=new int[9];
		int index=0;
		for(int i=0;i<9;i++)
		{
			hib[index]=(int)(Math.pow(2,i))-1;
			index++;
		}return hib;
	}
	
	public int[]pow()
	{
		int[] pow=new int[10];
		int index=0;
		for(int i=0;i<10;i++)
		{
			pow[index]=(int)(Math.pow(2, i));
			index++;
		}return pow;
		
	}
	public int[] prime() {
		int[] prime=new int[96];
		int k=0;
		  for(int i=1;i<500;i++)
		  {
			 int count=0;
			  for (int j=2;j<=i;j++)
			  {
				  if(i%j==0)
				  {
					 count++;
				  }	  
			  }
		  
		for(k=0;count==0 && k<i; )
		{
			prime[k]=i;
			k++;
		}
		  }return prime;
			
	}
	
	
	void hibbsort()throws FileNotFoundException
	{
		int[] num1=input();
		int[] gaps=hibb();
		
		
		int n=num1.length;
		int j;
		for(int g=gaps.length-1;g>=0;g--)
		{
			int gap=gaps[g];
			for(int i=gap;i<n;i++) 
			{
			  j=i;	
             int temp1=num1[i];
             while(j>=0 && j>=gap && num1[j-gap]>temp1)
             {
            	 num1[j]=num1[j-gap];
            	 j=j-gap;
            	
             }
             num1[j]=temp1;
			}
		}
		
		System.out.println("Shell sort using hibbards gap sequence");
		System.out.println("num1[100]: " +num1[100]);
		System.out.println("num1[125]: " +num1[125]);
		System.out.println("num1[250]: " +num1[250]);
		System.out.println("num1[700]: " +num1[700]);
		System.out.println("num1[900]: " +num1[900]);
		
		
		
			}
	void powsort()throws FileNotFoundException
	{
		int[] num2=input();
		int[] gaps=pow();
		
		
		int n=num2.length;
		int j;
		for(int g=gaps.length-1;g>=0;g--)
		{
			int gap=gaps[g];
			for(int i=gap;i<n;i++) 
			{
			  j=i;	
             int temp1=num2[i];
             while(j>=0 && j>=gap && num2[j-gap]>temp1)
             {
            	 num2[j]=num2[j-gap];
            	 j=j-gap;
            	
             }
             num2[j]=temp1;
			}
		}
		
		System.out.println("Shell sort using powers of 2");
		System.out.println("num2[100]: " +num2[100]);
		System.out.println("num2[125]: " +num2[125]);
		System.out.println("num2[250]: " +num2[250]);
		System.out.println("num2[700]: " +num2[700]);
		System.out.println("num2[900]: " +num2[900]);
		
	}

	void primesort()throws FileNotFoundException
	{
		
		int[] num3=input();
		int[] gaps=prime();
		
		
		int n=num3.length;
		int j;
		int gap;
		for(int g=95;g>=0;g--)
		{
			gap=gaps[g];
			for(int i=gap;i<n;i++) 
			{
			  j=i;	
             int temp1=num3[i];
             while(j>=gap && num3[j-gap]>temp1)
             {
            	 num3[j]=num3[j-gap];
            	 j=j-gap;
            	
             }
             num3[j]=temp1;
             
			}
		}
		System.out.println("Shell sort using Relative primes");
		System.out.println("num3[100]: " +num3[100]);
		System.out.println("num3[125]: " +num3[125]);
		System.out.println("num3[250]: " +num3[250]);
		System.out.println("num3[700]: " +num3[700]);
		System.out.println("num3[900]: " +num3[900]);
		}
}
