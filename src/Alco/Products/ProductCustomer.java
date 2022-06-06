package Alco.Products;


// Класс расширяет класс Продукт, сделан специально для потребительской корзины клиента
public class ProductCustomer extends Product {
    // атрибуты продукта
    // название
    private String name;
    // цена
    private int price;
    // количество
    private int count;

    public ProductCustomer(String name, int price, int count) {
        super(name, price);
        this.count = count;

    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public int getPrice() {
        return price;
    }


    public int getCount() {
        return count;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {

        return getName() + ", " + " Стоимость за единицу " + getPrice() + ", " + " Количество " + getCount()
                + ", " + " Общая стоимость " + getCount() * getPrice();


    }

}
