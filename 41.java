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

public void getBookInfo()
 {
        System.out.println("\n Book name "+Name);
        System.out.println("\n ISBN number "+ISBN);
        System.out.println("\n Author name "+Author);
        System.out.println("\n Publisher name "+Publisher);
}
}