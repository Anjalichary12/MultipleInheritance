interface A
{
   public void fun(); 
}
interface B
{
    public void funn();
    
}
class C implements A,B
{
    public void fun()
    {
        System.out.println("Its funn..");
    }
    public void funn()
    {
        System.out.println("Its funnn..");
    }
}
class Main {
    public static void main(String[] args) 
    {
        C  obj=new C();
        obj.fun();
        obj.funn();
        
    }
}
output:
its fun..
its funn..
