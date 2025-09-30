package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        int numberOfProduct;
        char option = ' ';
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        

        
        do {
            System.out.print("Enter the number of products: ");

            numberOfProduct = sc.nextInt();
            sc.nextLine();

            String name;
            String dateS;
            LocalDate date;
            double price;
            double customsFee;
            for (int i = 1; i <= numberOfProduct; i++) {
                System.out.printf("Product #%d data:%nCommon, used or imported (c/u/i) ", i);
                option = sc.next().charAt(0);
                sc.nextLine();
                switch (option) {
                    case 'c' -> {
                        System.out.print("Name: ");
                        name = sc.nextLine();
                        System.out.print("Price: ");
                        price = sc.nextDouble();
                        sc.nextLine();
                        products.add(new Product(name, price));
                    }
                    case 'u' -> {
                        System.out.print("Name: ");
                        name = sc.nextLine();
                        System.out.print("Price: ");
                        price = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Manufacture date (DD/MM/YYYY): ");
                        dateS = sc.nextLine();
                        date = LocalDate.parse(dateS, formato);
                        products.add(new UsedProduct(name, price, date));
                    }
                    case 'i' -> {
                        System.out.print("Name: ");
                        name = sc.nextLine();
                        System.out.print("Price: ");
                        price = sc.nextDouble();
                        System.out.print("Customs Free: ");
                        customsFee = sc.nextDouble();
                        sc.nextLine();
                        ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
                        importedProduct.totalPrice();
                        products.add(importedProduct);
                    }
                }
            }
            for(Product product : products) {
                System.out.print(product.priceTag() + "\n");
            }
             System.out.print("a)Do new simulation\nb)Exit\n");
             option = sc.next().charAt(0);

            
        } while ( option == 'a' );


        sc.close();
    }

}
