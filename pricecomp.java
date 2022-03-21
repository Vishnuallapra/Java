class product
{
	int pcode,price;
	String pname;
	product(int x,int y,String s)
	{
		pcode=x;
		pname=s;
		price=y;
	}
}
class pricecomp
{
	public static void main(String args[])
	{
		product p1=new product(1,40,"soap");
		product p2=new product(1,10,"paste");
		product p3=new product(1,25,"brush");
		if((p1.price<p2.price)&&(p1.price<p3.price))
			System.out.println("product with lowest price="+p1.pname);
		else if((p2.price<p1.price)&&(p2.price<p3.price))
			System.out.println("product with lowest price="+p2.pname);
		else
			System.out.println("product with lowest price="+p3.pname);
	}
}

