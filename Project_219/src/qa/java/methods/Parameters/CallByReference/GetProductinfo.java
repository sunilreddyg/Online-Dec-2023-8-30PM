package qa.java.methods.Parameters.CallByReference;



public class GetProductinfo 
{
	
	public void GetFirstproduct(Product1 p1)
	{
		System.out.println(p1.name);
		p1.printprice(15000.00);
	}
	
	public void GetSecondProduct(Product2 p2)
	{
		System.out.println(p2.name);
		p2.printprice(2300.00);
	}
	

	public static void main(String[] args) {
		
		//Creating class object
		GetProductinfo info=new GetProductinfo();
		info.GetFirstproduct(new Product1());
		info.GetSecondProduct(new Product2());
		
		

	}

}
