package Alco.Products;

// Перечисление алкоголя, удобно брать отсюда при создании какого либо продукта - алкоголя
public enum Alcohol {
    RUMWHITEBACCARDI("Ром Bacardi 'Carta Blanca' - 0.5 литра, Крепость 40%"),
    RUMBLACKBACCARDI("Ром Bacardi 'Carta Negra' - 0.5 литра, Крепость 40%"),
    RUMGOLDBACCARDI("Ром Bacardi 'Carta Oro' - 0.5 литра, Крепость 40%"),
    RUMWHITEBACCARDISUPER("Ром Bacardi 'Superior' - 0.5 литра, Крепость 44.5%%"),
    RUMBLACKBACCARDIOAK("Ром Bacardi 'OakHeart' - 0.5 литра, Крепость 40%"),
    RUMAMBERBACCARDI("Ром Bacardi 'Amber' - 0.5 литра, Крепость 75.5%%"),

    WHISKEYBALLANTIES("Виски Ballantine’s - 0.5 литра, Крепость 40%"),
    WHISKEYOLDMALTCASK("Виски Old Malt Cask - 0.5 литра, Крепость 50%"),
    WHISKEYGLENLIVET("Виски Glenlivet - 0.5 литра, Крепость 60%"),
    WHISKEYJACKDANIELSHONEY("Виски Jack Daniel’s Honey - 0.5 литра, Крепость 35%"),
    WHISKEYJACKDANIELSWHITERABBIT("Виски Jack Daniel’s White Rabbit - 0.5 литра, Крепость 43%"),

    COGNACDVIN("Коньяк 'Двин' - 0.5 литра,n Крепость 50%"),
    COGNACAYAK("Коньяк 'Аяк' - 0.5 литра, Крепость 40%"),
    COGNACGRANDPA("Коньяк 'Прадед' - 0.5 литра, Крепость 42%"),
    COGNACARADIS("Коньяк 'Арадис' - 0.5 литра, Крепость 42%"),

    CHAMPAINSOVIET("Советское шампанское - 0.7 литра, Крепость 12-14%"),

    BEERMOTOR("Пиво 'Мотор' - 0.45 литра, Крепость 9%"),

    KOMBUCHAMUSHROOM("Напиток чайный гриб 'Комбуча' на опохмел - 0.3 литра, Крепость 0%");

    private final String alcohol;

    private Alcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getAlcohol() {
        return alcohol;
    }


}
