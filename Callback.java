interface Callback
{
   void callback(int para);
}
class Client implements Callback{
    public void callback(int n){//interface method
        System.out.println("I am in Client class with value:"+n);
    }
    void notCb()//non-interface method
    {
        System.out.println("I am non Interface Method");
    }
}
class Test{
    public static void main(String[] var){
        new Client().callback(9);
        Callback c= new Client();//creating an object referring to interface method
        Client d = new Client();//creating an object of class which implements interface
        c.callback(6);
        d.callback(5);
        d.notCb();}}