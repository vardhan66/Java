<<<<<<< HEAD
class Book 
{
private String Name;
private int ISBN;
private String Author;
private String Publisher;


 Book(String name,int isbn,String author,String publisher)
 {
Name = name;
ISBN = isbn;
Author = author;
Publisher = publisher;
}

public void setName(String Name) 
{
this.Name = Name;
}
public String getName()
 {
return Name;
}
public void setISBN(int ISBN) 
{
this.ISBN = ISBN;
}
public int getISBN() 
{
return ISBN;
}
public void setAuthor(String Author) 
{
this.Author = Author;
}
public String getAuthor() 
{
return Author;
}
public void setPublisher(String Publisher) 
{
this.Publisher = Publisher;
}
public String getPublisher() 
{
return Publisher;
}

public void getBookInfo()
 {
        System.out.println("\n Book name "+Name);
        System.out.println("\n ISBN number "+ISBN);
        System.out.println("\n Author name "+Author);
        System.out.println("\n Publisher name "+Publisher);
}
}
=======
class Book 
{
private String Name;
private int ISBN;
private String Author;
private String Publisher;


 Book(String name, int isbn, String author, String publisher)
 {
Name = name;
ISBN = isbn;
Author = author;
Publisher = publisher;
}

public void setName(String Name) 
{
this.Name = Name;
}
public String getName()
 {
return Name;
}
public void setISBN(int ISBN) 
{
this.ISBN = ISBN;
}
public int getISBN() 
{
return ISBN;
}
public void setAuthor(String Author) 
{
this.Author = Author;
}
public String getAuthor() 
{
return Author;
}
public void setPublisher(String Publisher) 
{
this.Publisher = Publisher;
}
public String getPublisher() 
{
return Publisher;
}

public void getBookInfo()//Method used to display details
 {
        System.out.println("\n Book name "+Name);//displays name
        System.out.println("\n ISBN number "+ISBN);//displays ISBN number
        System.out.println("\n Author name "+Author);//displays author name
        System.out.println("\n Publisher name "+Publisher);//displays publisher
}
}
>>>>>>> fb50a6d9c64cd30c00b4eacd319f6a2123565f10
