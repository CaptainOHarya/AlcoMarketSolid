package Alco.io;


import java.util.TreeMap;

import Alco.Products.IProduct;


public class PrinterProduct implements IPrinter {
    // Мы здесь будем выводить на экран, но может быть нам надо будет сохранять данные в файл
    // или посылать по почте

    // сумма, после которой доставка бесплатна
    public static final int deliveryTotalFree = 5000;
    // сумма для доставки, если общая сумма будет меньше deliveryTotalFree
    public static final int deliveryPrice = 500;

    // Перегруженные методы специально для печати, для различных нужд
    @Override
    // ничего не печатать, просто на на следующую строку
    public void print() {
        System.out.println();
    }

    @Override
    // печатать текст
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    // печатать продукты на складе
    public void print(TreeMap<Integer, IProduct> printerProduct) {
        printerProduct.forEach((k, v) -> System.out.println(k + " - " + v));
        print();

    }

    @Override
    // печатать продукты в корзине пользователя
    public void print(TreeMap<Integer, IProduct> shoppingCart, int count, int currentPrice, int totalPrice) {
        print();
        shoppingCart.forEach((k, v) -> System.out.println(k + " - " + v));

        print("Общая цена: " + totalPrice);
        if (totalPrice >= deliveryTotalFree) {
            print("Ваша сумма заказа превышает " + deliveryTotalFree + " руб. " + " Доставка за наш счёт!!! ");
        } else print("Стоимость вашего заказа с доставкой " + (totalPrice + deliveryPrice) + " руб. ");


    }


}
