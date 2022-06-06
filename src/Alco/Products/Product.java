package Alco.Products;

// Класс продукта, для продуктов без доп параметров, только название и цена, для продуктов на складе
public class Product implements IProduct {
    // атрибуты продукта
    // название
    private String name;
    // цена
    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String getName() {
        return name;

    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", " + " Стоимость за единицу " + getPrice();
    }


}
