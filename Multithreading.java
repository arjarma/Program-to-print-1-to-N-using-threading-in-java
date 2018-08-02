class Print implements Runnable
{
int start;
int end;

Print(int start,int end)
{
this.start=start;
this.end=end;
}
public void run()
{
for(int i=start;i<=end;i++)
{
System.out.println(Thread.currentThread()+" "+i);
}
}
}

class Multithreading
{
public static void main(String agr[])
{
	
Thread t1=new Thread(new Print(1,5));
Thread t2=new Thread(new Print(6,10));

t1.start();
t2.start();
}
}