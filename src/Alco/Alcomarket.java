package Alco;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.TreeMap;

import Alco.Customer.CustomerShoppingCart;
import Alco.Products.AddAlcohol;
import Alco.Products.AddBread;
import Alco.Products.AddCaviar;
import Alco.Products.IAddProduct;
import Alco.Products.IProduct;
import Alco.Service.IOrderNumber;
import Alco.Service.ITimeView;
import Alco.Service.OrderNumber;
import Alco.Service.TimeView;
import Alco.io.IPrinter;
import Alco.io.IReader;
import Alco.io.PrinterProduct;
import Alco.io.ReaderConsole;


public class Alcomarket {
    // Класс клиента
    static CustomerShoppingCart customerShoppingCart = new CustomerShoppingCart();
    // Корзина клиента
    static TreeMap<Integer, IProduct> customerCart = new TreeMap<>();


    public static void main(String[] args) {
        // переменная номера операции
        int cod;
        Scanner scanner = new Scanner(System.in);
        // наш ввод данных
        IReader reader = new ReaderConsole(scanner);

        // наш вывод
        IPrinter printer = new PrinterProduct();

        // Создаём объекты наших товаров, инициализируем их
        IAddProduct addAlcohol = new AddAlcohol();
        IAddProduct addCaviar = new AddCaviar();
        IAddProduct addBread = new AddBread();

        // TreeMap наших товаров на складе
        TreeMap<Integer, IProduct> alcoholStorage;
        TreeMap<Integer, IProduct> cavaiarStorage;
        TreeMap<Integer, IProduct> breadStorage;

        // И добавлям все товары, существующие на данный момент времени на складе
        alcoholStorage = addAlcohol.add();
        cavaiarStorage = addCaviar.add();
        breadStorage = addBread.add();

        // TreeMap где будет храниться наш заказ
        TreeMap<Integer, IProduct> shoppingCart = new TreeMap<>();

        // Время и номер заказа
        ITimeView timeView = new TimeView();
        IOrderNumber orderNumber = new OrderNumber();


        printer.print("Вас приветствует наш Алкомаркет, у нас всегда богатый выбор для Вашего застолья");

        while (true) {
            printer.print("Выберете действие: ");
            printer.print("1. Вывести список алкогольных напитков. ");
            printer.print("2. Вывести список икры. ");
            printer.print("3. Вывести список хлеба. ");
            printer.print("4. Оформить заказ. ");
            printer.print("5. Очистить корзину. Начну всё сначало!!! ");
            printer.print("0. Я передумал, пойду заниматься спортом, пусть другой празднует!!! (Выход). ");

            // считываем номер задачи из консоли
            cod = reader.read();
            // если пользователь ввёл 0, то выходим из цикла
            if (cod == 0) {
                break;
            } else if (cod == 4) {
                printer.print("Ваш заказ оформлен под номером: " + orderNumber.getOrderNumber());
                printer.print("Текущее время заказа: " + timeView.getTimeView(LocalDateTime.now()));
                break;

            }

            switch (cod) {
                case 1:
                    shoppingCart = act(alcoholStorage, printer, reader);
                    break;

                case 2:
                    shoppingCart = act(cavaiarStorage, printer, reader);
                    break;
                case 3:
                    shoppingCart = act(breadStorage, printer, reader);
                    break;

                case 5:
                    // Очистить корзину
                    shoppingCart.clear();
                    printer.print("В Вашей корзине ничего нет!!!");
                    break;

                default:
                    printer.print("Вы ввели неправильное число, попробуйте ещё раз");

            }

        }

    }

    // Это метод 'действие'  призван упростить код оператора switch
    public static TreeMap<Integer, IProduct> act(TreeMap<Integer, IProduct> storage, IPrinter printer, IReader reader) {

        // Код нашего товара
        int vendorCode;
        // количество заказанного товара
        int count;

        printer.print(storage);
        printer.print();
        printer.print("Введите цифровой код товара, который добавляете в корзину или 0 для выхода из подменю");
        vendorCode = reader.read();

        // проверяем, входит ли такой ключ в наш объект TreeMap
        if (!storage.containsKey(vendorCode)) {
            printer.print("Такого товара на складе нет ");
        } else {
            printer.print("Введите количество товара: ");
            count = reader.read();

            customerCart = customerShoppingCart.addProductToCart(vendorCode, storage.get(vendorCode), count);
            printer.print();
        }
        return customerCart;
    }

}

