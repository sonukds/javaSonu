import java.io.*; class sonukds
{
public static void main(String args[])
{
String name[]={"Madras","Delhi","Ahameabad","Calcutta","Bombay"}; int size=name.length;
String temp=null; int i,j;
System.out.println("Before sorting:"); for( i=0;i<size;i++)
{
System.out.println(name[i]);
}

for(i=0;i<size;i++) for(j=i+1;j<size;j++)
if(name[j].compareTo(name[i])<0)
{
temp=name[i]; name[i]=name[j]; name[j]=temp;
}
System.out.println("After sorting:"); for( i=0;i<size;i++)
{
System.out.println(name[i]);
}
}
}