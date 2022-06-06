package Alco.io;

import java.util.TreeMap;

import Alco.Products.IProduct;

// Интерфейс печати
public interface IPrinter {

    void print();

    void print(String text);

    void print(TreeMap<Integer, IProduct> product);

    void print(TreeMap<Integer, IProduct> productCustomer, int count, int currentPrice, int totalPrice);

}
