class book
{
  String name, author;
  int price, num_pages;
  book(String name, String author, int price, int num_pages)
  {
    this.name = name;
    this.author = author;
    this.price = price;
    this.num_pages = num_pages;
  }
 
  public String toString()
  {
    return name+" "+author+" "+price+" "+num_pages;  
  }

  public static void main(String args[])
  {
    book b1 = new book("J K Rowling", "Harrry Potter", 600, 1000);
    System.out.println(b1.toString());
  }
}

