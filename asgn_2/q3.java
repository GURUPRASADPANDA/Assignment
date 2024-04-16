/*
 In a super market each product is having minimum details like prodId, price, quantity
that is used during the biling process. Keeping this in mind prepare a class named as
Product having the member variables
 prodId, price, quantity
 a static variable totalPrice
Initialize the value of product through parameterized constructor. It consists of a
display() method to display the value of instance variables. A person went to market
and purchase 5 different products. Using the above mentioned class, display the details
of products that the person has purchased. Also, determine how much total amount
the person will pay for the purchase of 5 products.
 */
class Product{
    int prodId;
    double price;
    int quantity;
    static double totalPrice = 0;

    Product(int prodId,double price,int quantity){
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice = totalPrice + (price*quantity);
    }
    void display(){
        System.out.println(prodId+"\t"+price+"\t"+quantity);
    }
}

class q3 {
    public static void main(String[] args) {
        Product p1 = new Product(001, 40, 4);
        Product p2 = new Product(002, 50, 5);
        Product p3 = new Product(003, 60, 6);
        Product p4 = new Product(004, 70, 7);
        Product p5 = new Product(005, 80, 8);

        System.out.println("prodId\tprice\tquantity");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        System.out.println("you have to PAY total amout : "+Product.totalPrice);
    }

}
