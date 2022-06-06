package Alco.Products;

public enum Bread {
    BATONKOLOM("Батон Коломенский"),
    BATONCHERYOM("Батон Черёмушкинский"),
    FRENCHBAGUETTE("Багет Французский"),
    BREADDARNITSKY("Хлеб Дарницкий"),
    BREADPEASANT("Хлеб Крестьянский"),
    BREADWHEAT("Хлеб Harry's American Sandwich пшеничный"),
    LAVASHARMEAN("Лаваш Армянский"),
    BREADCRISPY("Хлебцы Просто Столовые хрустящие"),
    BREADCRISPYFINN("Хлебцы Finn Crisp Original ржаные"),
    BREADBORODINSKY("Хлеб Бородинский");

    private final String bread;

    private Bread(String bread) {
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }
}
