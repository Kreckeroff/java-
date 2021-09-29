import java.util.Scanner;

public class Loader {
    static int money(int money, char flag){
        String buff;
        Scanner scanner = new Scanner(System.in);
        if (flag == '0')
            System.out.println("Недостаточно GachiCoin");
        System.out.println("хотите пополнить баланс?\nyes?no?");
        buff = scanner.nextLine();
        if (buff.equals("yes")){
            System.out.println("выберите на сколько хотите пополнить счет магазина:");
            System.out.println("1 - 100 GachiCoin");
            System.out.println("2 - 200 GachiCoin");
            System.out.println("3 - 500 GachiCoin");
            System.out.println("4 - 1000 GachiCoin");
            buff = scanner.nextLine();
            switch (buff){
                case "1":{
                    money = money + 100;
                    return money;
                }
                case "2":{
                    money = money + 200;
                    return money;
                }
                case "3":{
                    money = money + 500;
                    return money;
                }
                case "4":{
                    money = money + 1000;
                    return money;
                }
            }

        }
        return (money);
    }

    public static void main(String[] args) {
        int countChair = 2;
        int countSofa = 3;
        int countTable = 4;
        int priceChair = 200;
        int priceSofa = 250;
        int priceTable = 300;
        int purse = 1000;
        boolean bool = true;
        String buff;
        Scanner scanner = new Scanner(System.in);
        Armchair chair1 = new Armchair("derevo", 1,2,20);
        Sofa sofa1 = new Sofa("leather", 10,20,30);
        Table table1 = new Table("derevo",20,20,20);
        FurnitureShop armchair = new FurnitureShop(chair1, countChair, priceChair);
        FurnitureShop sofa = new FurnitureShop(sofa1, countSofa, priceSofa);
        FurnitureShop table = new FurnitureShop(table1, countTable, priceTable);
        while (bool){
            System.out.println("Ваш баланс: " + purse +" Gachicoins.\n");
            if(purse < 300)
                purse = money(purse, '1');
            System.out.println("Желаете что-то купить?");
            System.out.println(armchair.toString());
            System.out.println(sofa.toString());
            System.out.println(table.toString());
            buff = scanner.nextLine();
            if (buff.equals("armchair")){
                if (purse >= priceChair && countChair > 0) {
                    armchair.count = countChair - 1;
                    countChair = countChair - 1;
                    purse = purse - priceChair;
                    System.out.println("Cпасибо за покупку! Хорошего вечера!");
                }
                else if (purse < priceChair)
                    purse = money(purse, '0');
            }
            if (buff.equals("sofa")){
                if (purse >= priceSofa && countSofa > 0) {
                    sofa.count = countSofa - 1;
                    countSofa = countSofa - 1;
                    purse = purse - priceSofa;
                    System.out.println("Cпасибо за покупку! Хорошего вечера!");
                }
                else if (purse < priceSofa)
                    purse = money(purse, '0');
            }
            if (buff.equals("table")){
                if (purse >= priceTable && countTable > 0) {
                    table.count = countTable - 1;
                    countTable = countTable - 1;
                    purse = purse - priceTable;
                    System.out.println("Cпасибо за покупку! Хорошего вечера!");
                }
                else if (purse < priceTable)
                    purse = money(purse, '0');
            }
            System.out.println("Хотите завершить покупки?yes?no?");
            buff = scanner.nextLine();
            if (buff.equals("yes"))
                bool = false;
        }
    }
}