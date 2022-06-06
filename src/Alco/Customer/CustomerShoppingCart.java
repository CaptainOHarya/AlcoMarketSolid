package Alco.Customer;


import java.util.TreeMap;
import Alco.Products.IProduct;
import Alco.Products.ProductCustomer;
import Alco.io.IPrinter;
import Alco.io.PrinterProduct;


// Класс нашей потребительской корзины
public class CustomerShoppingCart {
    private TreeMap<Integer, IProduct> shoppingCart = new TreeMap<>();
    // Общая сумма товаров
    private int totalPrice;

    // Добавляем продукт и количество для вычисления
    public TreeMap<Integer, IProduct> addProductToCart(Integer cod, IProduct product, int count) {

        IPrinter printer = new PrinterProduct();
        IProduct productCustomer = new ProductCustomer(product.getName(), product.getPrice(), count);
        productCustomer.setName(product.getName());

        productCustomer.setPrice(product.getPrice());
        // Положим продукт в нашу Мапу
        shoppingCart.put(cod, productCustomer);

        // и расчитаем общую сумму
        totalPrice = calculateTotalPrice(totalPrice, productCustomer.getPrice() * count);

        printer.print(shoppingCart, count, productCustomer.getPrice(), totalPrice);

        return shoppingCart;
    }

    // Метод расчёта общей суммы товаров
    public int calculateTotalPrice(int totalPrice, int currentPrice) {
        return totalPrice + currentPrice;
    }


}

