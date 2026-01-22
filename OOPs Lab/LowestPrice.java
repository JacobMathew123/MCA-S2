class Product{
    int pcode;
    String pname;
    double price;
    Product(int pcode,String pname,double price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
}
public class LowestPrice{
    public static void main(String args[]){
        Product obj1=new Product(101,"Laptop",55000);
        Product obj2=new Product(102,"Mobile",30000);
        Product obj3=new Product(103,"Tablet",25000);
        Product lowest=obj1;
        if(obj2.price<lowest.price){
            lowest=obj2;
        }
        if(obj3.price<lowest.price){
            lowest=obj3;
        }
        System.out.println("Product with lowest price:");
        System.out.println("Product Code:"+lowest.pcode);
        System.out.println("Product Name:"+lowest.pname);
        System.out.println("Price:"+lowest.price);
    }
}

