package Alco.Products;

import java.util.Map;
import java.util.TreeMap;

public class AddAlcohol implements IAddProduct {
    Map<Integer, IProduct> alcoholProduct = new TreeMap<>();

    @Override
    public TreeMap<Integer, IProduct> add() {
        Product rumWhiteBakardi = new Product(Alcohol.RUMWHITEBACCARDI.getAlcohol(), 1000);
        Product rumBlackBakardi = new Product(Alcohol.RUMBLACKBACCARDI.getAlcohol(), 1050);
        Product rumGoldBakardi = new Product(Alcohol.RUMGOLDBACCARDI.getAlcohol(), 1150);
        Product rumWhiteBakardiSuper = new Product(Alcohol.RUMWHITEBACCARDISUPER.getAlcohol(), 2100);
        Product rumBlackBakardiOak = new Product(Alcohol.RUMBLACKBACCARDIOAK.getAlcohol(), 2150);
        Product rumAmberBakardi = new Product(Alcohol.RUMAMBERBACCARDI.getAlcohol(), 4450);

        Product whiskeyBallantines = new Product(Alcohol.WHISKEYBALLANTIES.getAlcohol(), 1050);
        Product whiskeyOldMaltCask = new Product(Alcohol.WHISKEYOLDMALTCASK.getAlcohol(), 1750);
        Product whiskeyGlenlivet = new Product(Alcohol.WHISKEYGLENLIVET.getAlcohol(), 2750);
        Product whiskeyJackDanielsHoney = new Product(Alcohol.WHISKEYJACKDANIELSHONEY.getAlcohol(), 4350);
        Product whiskeyJackDanielsWhiteRabbit = new Product(Alcohol.WHISKEYJACKDANIELSWHITERABBIT.getAlcohol(), 4000);

        Product cognacDvin = new Product(Alcohol.COGNACDVIN.getAlcohol(), 5000);
        Product cognacAyak = new Product(Alcohol.COGNACAYAK.getAlcohol(), 600);
        Product cognacGrandPa = new Product(Alcohol.COGNACGRANDPA.getAlcohol(), 830);
        Product cognacAradis = new Product(Alcohol.COGNACARADIS.getAlcohol(), 1500);

        Product champainSoviet = new Product(Alcohol.CHAMPAINSOVIET.getAlcohol(), 350);

        Product beerMotor = new Product(Alcohol.BEERMOTOR.getAlcohol(), 50);

        Product kombucha = new Product(Alcohol.KOMBUCHAMUSHROOM.getAlcohol(), 300);

        // И  добавим это всё в TreeMap по коду
        alcoholProduct.put(100001, rumWhiteBakardi);
        alcoholProduct.put(100002, rumBlackBakardi);
        alcoholProduct.put(100003, rumGoldBakardi);
        alcoholProduct.put(100004, rumWhiteBakardiSuper);
        alcoholProduct.put(100005, rumBlackBakardiOak);
        alcoholProduct.put(100006, rumAmberBakardi);
        alcoholProduct.put(100007, whiskeyBallantines);
        alcoholProduct.put(100008, whiskeyOldMaltCask);
        alcoholProduct.put(100009, whiskeyGlenlivet);
        alcoholProduct.put(100010, whiskeyJackDanielsHoney);
        alcoholProduct.put(100011, whiskeyJackDanielsWhiteRabbit);
        alcoholProduct.put(100012, cognacDvin);
        alcoholProduct.put(100013, cognacAyak);
        alcoholProduct.put(100014, cognacGrandPa);
        alcoholProduct.put(100014, cognacAradis);
        alcoholProduct.put(100016, champainSoviet);
        alcoholProduct.put(100017, beerMotor);
        alcoholProduct.put(100018, kombucha);

        return (TreeMap<Integer, IProduct>) alcoholProduct;


    }


}



