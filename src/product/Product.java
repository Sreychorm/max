package product;

import java.util.Scanner;

class ProductInfor{
    String code,name,madeIn;
    int price,amount;
    Scanner input = new Scanner(System.in);
    void add(){
        System.out.print("Code: ");
        code= input.next();
        System.out.print("Name: ");
        name= input.next();
        System.out.print("Made In: ");
        madeIn= input.next();
        System.out.print("Price: ");
        price= input.nextInt();
        System.out.print("Amount: ");
        amount= input.nextInt();
    };

}
public class Product {
    public static void main(String[] args){
        int opt;
        System.out.println("___________________STOCK CONTROLLING___________________");
        System.out.println("    Adding Product");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Amount of Product Name: ");
        int limitPro= input.nextInt();
        ProductInfor[] product =new ProductInfor[limitPro];
        //add product
        for (int i=0; i<limitPro; i++){
            product[i]= new ProductInfor();
            product[i].add();
        }
        do {
            System.out.println("1-Checking Stock");
            System.out.println("2-Find Product By Code");
            System.out.println("3-Find Product By Country");
            System.out.println("Pls Select Option below from (1-3) ->");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("_________Checking Stock___________");
                    //show all product or checking stock for all product
                    for (int i = 0; i < limitPro; i++) {
                        System.out.println(product[i].code + ": " + product[i].name + ", " + product[i].madeIn + ", " + product[i].price + ", " + product[i].amount);
                    }
                    System.out.println("__________________________________");
                    break;
                case 2:
                    System.out.println("_________Search Product By Code___________");
                    // search product by code
                    System.out.print("Enter Code of Product ");
                    String byCode = input.next();
                    boolean isCode=false;
                    for (int i = 0; i < limitPro; i++) {
                        if (byCode.equals(product[i].code)) {
                            isCode=true;
                            System.out.println(product[i].code + ": " + product[i].name + ", " + product[i].madeIn + ", " + product[i].price + ", " + product[i].amount);
                        }
                    }
                    if(!isCode)System.out.println(byCode+" is not found");
                    break;
                case 3:
                    System.out.println("_________Search Product By Country___________");
                    //checking product by Country
                    System.out.print("Enter Country of Product ");
                    String byCountry = input.next();
                    for (int i = 0; i < limitPro; i++) {
                        if (byCountry.equals(product[i].madeIn)) {
                            System.out.println(product[i].code + ", " + product[i].name + ", " + product[i].madeIn + ", " + product[i].price + ", " + product[i].amount);
                        } else System.out.println("Product not Found");
                    }

            }
        }while (opt<4);

    }

}
