import java.util.*;
class Test
{
     static int count;
     public static int similar(String a,String b)
     {
         int c=0;
         for(int i=0;i<a.length();i++)
         {
            for(int j=0;j<b.length();j++)
            {
               if(a.charAt(i)==b.charAt(j))
               c++;
            }
         }
         return c;
     }
     public static void training(String a[],String b[],int c[])
     {
         int k[]=new int[a.length];
         int x=0;
         for(int i=0;i<a.length;i++)
         {
            if(c[i]==0)
            {
               k[x++]=similar(a[i],b[i]);
            }
         }
         int sum=0;
         for(int i=0;i<x;i++)
         {  
            sum=sum+k[i];
         }
         count=sum/x;
     }
     public static void check(int first,int second)
     {
        double a=Math.abs(first-second)*1.0;
        double b=Math.max(first,second)*1.0;
        double x=(a/b)*100.0;
        System.out.println("Confidence = "+x+"%");
     }
     public static void testing(String a,String b)
     {
         int count_test=similar(a,b);
         if(count_test>=count)
         System.out.println("Similar");
         else
         System.out.println("Different");
         check(count_test,count);
     }
     public static void main(String args[])
     { 
         Scanner sc=new Scanner(System.in);
         /*String a1[]={"good","perfect","great","best","complete","new","new","love","love","dull","dull","show","show","important","important","good","perfect","great","best","complete"};
         String b1[]={"bad","flawless","terrible","worst","finished","fresh","old","like","hate","boring","exciting","display","hide","necessary","unimportant","nice","imperfect","significant","premier","partial"};
         */String a1[]={"Hello everyone","Nice to meet you","It is apple","You are right","Yeah, I see"};
         String b1[]={"Hi everyone","Pleased to see you","It is mountain","You are correct","I do not agree"};
         
         //int c1[]={1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1};
         int c1[]={0,0,1,0,1};
         training(a1,b1,c1);
         String a=sc.nextLine();
         String b=sc.nextLine();
         testing(a,b);
     }
}

