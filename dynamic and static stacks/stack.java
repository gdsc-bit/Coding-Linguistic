import java.util.*;
interface stackop
{
 void push(int item);
 void pop();
}
   abstract class FixedStack implements stackop
{
 int stk[ ];
 int tos;
 void getdata(int size)
 {
 stk=new int[size];
 tos=-1;
int a=stk.length;
System.out.println("Length="+a);
 }
 public void push(int item)
 {
 if(tos==stk.length-1)
 {
 System.out.println("Stack is full");
 }
 else
 System.out.print("PUSH:"+(stk[++tos]=item)+" ");
 }
 public void pop()
 {
 if(tos==-1)
 {
System.out.println("Stack underflows"); 
 }
 else
 System.out.println("POP:"+(stk[tos--])+" ");
 }
 public int peek()
    {
        if (tos == -1) {
            Console.WriteLine("Stack is Empty");
            return -1;
        }
        else {
            Console.WriteLine("{0} popped from stack ", stk[top]);
            return stk[top];
        }
    }
}
class DynStack extends FixedStack implements stackop
{
 DynStack(int size)
 {
stk=new int[size];
 tos=-1;
int a=stk.length;
}
 public void push(int item)
 {
if(tos==stk.length-1)
 { 
 int t[ ]=new int[stk.length * 2]; //double size
for(int i=0;i<stk.length;i++)
 t[i]=stk[i];
System.out.println("\nInitial Length="+stk.length);
 stk=t;
int a=stk.length;
System.out.println("Increased Length(Double Size)="+a);
 System.out.print("PUSH:"+(stk[++tos]=item)+" ");
 }
 
else
 System.out.print("PUSH:"+(stk[++tos]=item)+" ");
 }
 public void pop()
 {
 if(tos==-1)
 {
System.out.println("Stack underflows"); 
 }
 else
 System.out.println("POP:"+(stk[tos--])+" ");
 }
}
class StackTest extends FixedStack
{
 public static void main(String args[ ])
 {
Scanner sc=new Scanner(System.in);
int n=3;
System.out.println("The size of Fixed Stack:"+n);
StackTest fs=new StackTest();
System.out.println("\nEnter the size of Dynamic Stack:");
int p=sc.nextInt();
 DynStack ds=new DynStack(p);
 stackop mystk;
mystk=fs;
System.out.println("\nFixed Stack Operations:");
fs.getdata(n);
 for(int i=0;i<4;i++)
 mystk.push(i);
 System.out.println("Fixed length Stack Contents are.");
 for(int i=0;i<4;i++)
 mystk.pop();
mystk=ds;
System.out.println("\nDynamic Stack Operations:");
 for(int i=0;i<(p+2);i++)
 mystk.push(i);
 System.out.println("\nDynamic length Stack Contents are");
 for(int i=0;i<(p+2);i++)
 mystk.pop();
 }
}
