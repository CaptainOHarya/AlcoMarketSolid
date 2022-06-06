package Alco.Service;

public class OrderNumber implements IOrderNumber {

    @Override
    public String getOrderNumber() {
        // Так сфомируем номер нашего заказа
        return (int) (Math.random() * 1000) + " - " + (int) (Math.random() * 100);
    }


}
