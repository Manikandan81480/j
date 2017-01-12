import java.util.*;
public class hunter2
{
public static void main(String...args)
   { int f=0,p=0,i=0,j=0,p1=0,out=0;;
         Scanner x=new Scanner(System.in);
         int n=x.nextInt();
         int a[]=new int[n];

            for(i=0;i<n;i++)
            {
            a[i]=x.nextInt();
            }

for( i=0;i<n;i++)
{
for( j=i+1;j<n;j++)
{
if((a[i]==a[j])&&(f==0))
{
p=j;
f=1;
out=a[p];
break;
}
else if((a[i]==a[j])&&(f==1))
{
p1=j;
if(p<p1)
{
	out=a[p];
}
else
{
	out=a[p1];
}
}
}
}
System.out.println("output"+out);
 
   }
}

