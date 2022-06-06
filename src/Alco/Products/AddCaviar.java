package Alco.Products;

import java.util.Map;
import java.util.TreeMap;

public class AddCaviar implements IAddProduct {
    Map<Integer, IProduct> caviarProduct = new TreeMap<>();

    @Override
    public TreeMap<Integer, IProduct> add() {
        Product caviarChumSalmon = new Product(Caviar.CAVIARCHUMSALMON.getCaviar(), 700);
        Product caviarPinkSalmon = new Product(Caviar.CAVIARPINKSALMON.getCaviar(), 500);
        Product caviarSockeyeSalmon = new Product(Caviar.CAVIARSOCKEYESALMON.getCaviar(), 600);
        Product caviarTrout = new Product(Caviar.CAVIARTROUT.getCaviar(), 750);

        Product caviarBeluga = new Product(Caviar.CAVIARBELUGA.getCaviar(), 4000);
        Product caviarSturgeon = new Product(Caviar.CAVIARSTURGEON.getCaviar(), 6000);
        Product caviarSterlet = new Product(Caviar.CAVIARSTERLET.getCaviar(), 5000);

        Product caviarWildShrimp = new Product(Caviar.CAVIARWILDSHIMP.getCaviar(), 50000);
        Product caviarPike = new Product(Caviar.CAVIARPIKE.getCaviar(), 200);
        Product caviarCapelin = new Product(Caviar.CAVIARCAPELIN.getCaviar(), 350);

        Product caviarEggplant = new Product(Caviar.CAVIAREGGPLANT.getCaviar(), 100000);

        caviarProduct.put(200001, caviarChumSalmon);
        caviarProduct.put(200002, caviarPinkSalmon);
        caviarProduct.put(200003, caviarSockeyeSalmon);
        caviarProduct.put(200004, caviarTrout);
        caviarProduct.put(200005, caviarBeluga);
        caviarProduct.put(200006, caviarSturgeon);
        caviarProduct.put(200007, caviarSterlet);
        caviarProduct.put(200008, caviarWildShrimp);
        caviarProduct.put(200009, caviarPike);
        caviarProduct.put(200010, caviarCapelin);
        caviarProduct.put(200011, caviarEggplant);

        return (TreeMap<Integer, IProduct>) caviarProduct;

    }
}

