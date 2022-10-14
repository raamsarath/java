package com.excpt;

class ProductExceptions extends Exception{
	public  ProductExceptions(String s) {
		super(s);
	}
}
class Product{
	public void productprice(float price) {
		try {
			if(price<=0||price>=1000) {
				throw new  ProductExceptions("Invalid Product Price "+price);
			}else {
				System.out.println("Valid Product Price "+price);
			}
		}
		catch(ProductExceptions e) {
			e.printStackTrace();
		}
	}
}

public class ProductException {

	public static void main(String[] args) {
              Product pob=new Product();
              pob.productprice(1200);

	}

}
