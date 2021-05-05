package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("------FIND THE INDEX OF 'GLOVES' IN ITEMS ARRAY-----------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Index of " + items[i] + " - " + i);
                break;
            }
        }


        System.out.println("------Set boolean to true if first iPad is found-----------");
        boolean iPadExists = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExits = " + iPadExists);

        System.out.println("------Print a report of each shopping item-----------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "\t-\t$" + prices[i] + "\t- #" + itemIDs[i]);
        }

        System.out.println("------Look for Jacket and print all details--------");
        boolean jacketExist = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Jacket")) {
                iPadExists = true;
                System.out.println(items[i] + "\t-\t$" + prices[i] + "\t- #" + itemIDs[i]);
                break;//stop searching after jacket is found

            }
        }
    }
}