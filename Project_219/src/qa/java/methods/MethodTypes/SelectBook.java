package qa.java.methods.MethodTypes;

public class SelectBook 
{
	//Method return controls to Book1 Class
	Book1 First()
	{
		return new Book1();
	}
	
	//Method return controls to Book2 class
	Book2 Second()
	{
		return new Book2();
	}
	
	public static void main(String[] args) 
	{
		SelectBook book=new SelectBook();
		
		double book1price=book.First().getprice();
		System.out.println(book1price);
		
		double book2price=book.Second().getprice();
		System.out.println(book2price);
		
		
	}

}
