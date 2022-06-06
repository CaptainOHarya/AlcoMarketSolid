package Alco.Products;

public enum Caviar {
    CAVIARCHUMSALMON("Икра кеты - 100 грамм, Категория - красная икра"),
    CAVIARPINKSALMON("Икра горбуши - 100 грамм, Категория - красная икра"),
    CAVIARSOCKEYESALMON("Икра нерки  - 100 грамм, Категория - красная икра"),
    CAVIARTROUT("Икра форели - 100 грамм, Категория - красная икра"),
    CAVIARBELUGA("Икра белуги - 100 грамм, Категория - чёрная икра"),
    CAVIARSTURGEON("Икра осетровая - 100 грамм, Категория - чёрная икра"),
    CAVIARSTERLET("Икра стерляди - 100 грамм, Категория - чёрная икра"),
    CAVIARWILDSHIMP("Икра диких креветок 'Океанский сапфир' - 100 грамм, Категория -  голубая икра"),
    CAVIARPIKE("Икра щуки - 100 грамм, Категория -  белая икра "),
    CAVIARCAPELIN("Икра мойвы - 100 грамм, Категория -  жёлтая икра"),
    CAVIAREGGPLANT("Заморская Икра - Баклажанная - 100 грамм, Категория -  коричневая икра");

    private final String caviar;


    private Caviar(String caviar) {
        this.caviar = caviar;
    }


    public String getCaviar() {
        return caviar;
    }


}