class BookTest 
{
public static void main(String[] args) 
{
 Book b=new Book("TVD",2300,"Eswar","JHIM");//passing  constructorized parameters as input 
 Book b1=new Book("Greatest Fears",4500,"Benjamin","Franlok");//passing constructorized parameters
 Book b2 =new Book("Kite monster",200,"Sterman","Dual");//passing constructorized parameters
 b.getBookInfo();//method to display description containing details of book
 b1.getBookInfo();
 b2.getBookInfo();
}
}
