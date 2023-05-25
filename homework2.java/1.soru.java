public class WaterSeller {
    public static int findMaxProfit(int[] prices) {
        if (prices.length < 2) {
            System.out.println("Alim satim yapmak için yeterli veri yok.");
            return 0;
        }

        int minPrice = prices[0];
        int maxPrice = prices[0];
        int buyDay = 0;
        int sellDay = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                maxPrice = prices[i];
                buyDay = i;
            } else if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                sellDay = i;
            }

            if (maxPrice - minPrice > maxProfit) {
                maxProfit = maxPrice - minPrice;
            }
        }

        if (maxProfit == 0) {
            System.out.println("Alim satim yok.");
        } else {
            System.out.println((buyDay + 1) + ". gün al, " + (sellDay + 1) + ". gün sat");
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {4, 5, 5, 2, 4, 6, 1};
        System.out.print("Input: Su ");
        for (int price : prices1) {
            System.out.print(price + ",");
        }
        System.out.println();
        int maxProfit1 = findMaxProfit(prices1);
        System.out.println("kar = " + maxProfit1);

        int[] prices2 = {6, 5, 4, 3, 2, 1, 1};
        System.out.print("Input: Su ");
        for (int price : prices2) {
            System.out.print(price + ",");
        }
        System.out.println();
        int maxProfit2 = findMaxProfit(prices2);
        System.out.println("kar = " + maxProfit2);
    }
}