package Alco.Products;

import java.util.Map;
import java.util.TreeMap;

public class AddBread implements IAddProduct {
    Map<Integer, IProduct> breadProduct = new TreeMap<>();

    @Override
    public TreeMap<Integer, IProduct> add() {
        Product batonKolom = new Product(Bread.BATONKOLOM.getBread(), 50);
        Product batonCheryom = new Product(Bread.BATONCHERYOM.getBread(), 45);
        Product frenchBaguette = new Product(Bread.FRENCHBAGUETTE.getBread(), 120);
        Product breadDarnitsky = new Product(Bread.BREADDARNITSKY.getBread(), 70);
        Product breadPeasant = new Product(Bread.BREADPEASANT.getBread(), 65);
        Product breadWheat = new Product(Bread.BREADWHEAT.getBread(), 90);
        Product lavashArmean = new Product(Bread.LAVASHARMEAN.getBread(), 120);
        Product breadCrispy = new Product(Bread.BREADCRISPY.getBread(), 45);
        Product breadCrispyFinn = new Product(Bread.BREADCRISPYFINN.getBread(), 45);
        Product breadBorodinsky = new Product(Bread.BREADBORODINSKY.getBread(), 78);


        breadProduct.put(300001, batonKolom);
        breadProduct.put(300002, batonCheryom);
        breadProduct.put(300003, frenchBaguette);
        breadProduct.put(300004, breadDarnitsky);
        breadProduct.put(300005, breadPeasant);
        breadProduct.put(300006, breadWheat);
        breadProduct.put(300007, lavashArmean);
        breadProduct.put(300008, breadCrispy);
        breadProduct.put(300009, breadCrispyFinn);
        breadProduct.put(300010, breadBorodinsky);

        return (TreeMap<Integer, IProduct>) breadProduct;

    }


}

