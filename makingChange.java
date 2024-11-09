import java.util.Scanner;

public class makingChange {

    public static void findMinCoin(int[] denomination, int amount) {
        for (int i = 0; i < denomination.length - 1; i++) {
            for (int j = i + 1; j < denomination.length; j++) {
                if (denomination[i] < denomination[j]) {
                    int temp = denomination[i];
                    denomination[i] = denomination[j];
                    denomination[j] = temp;
                }
            }
        }

        int coinCount = 0;
        System.out.println("Coins used to make the amount:");

        for (int i = 0; i < denomination.length; i++) {
            if (amount >= denomination[i]) {
                int numCoins = amount / denomination[i];
                amount = amount % denomination[i];
                coinCount += numCoins;

                System.out.println(denomination[i] + " X " + numCoins);
            }
        }

        if (amount != 0) {
            System.out.println("The amount cannot be made with the given denominations.");
        } else {
            System.out.println("Minimum number of coins required: " + coinCount);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denomination = {1000, 500, 100, 50, 25, 10, 5, 1};
        System.out.print("Enter the amount in Rupees: ");
        int amount = scanner.nextInt();
        findMinCoin(denomination, amount);
        scanner.close();
    }
}
