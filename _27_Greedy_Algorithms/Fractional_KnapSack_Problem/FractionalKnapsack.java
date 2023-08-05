package _27_Greedy_Algorithms.Fractional_KnapSack_Problem;

import java.util.*;

public class FractionalKnapsack {
    public static void fractionalKnapsack(ArrayList<KnapsackItem> items, int capacity){
        // sort items by their weights
        Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if(o1.getRatio() > o2.getRatio()){
                    return -1; // -1 means don't change the positions
                    // as we want descending order
                }
                else {
                    return 1;
                    // 1 means swap the elements
                }
            }
        };

        Collections.sort(items, comparator);

        int usedCapacity = 0; // used weight
        double totalValue = 0; // value added in knapsack till now
        // this is double because later fraction of value needs to be calculated too

        for(KnapsackItem item : items){
            if(usedCapacity + item.getWeight() <= capacity){
                // add full item
                usedCapacity = usedCapacity + item.getWeight();
                System.out.println("Taken: "+ item);
                totalValue = totalValue + item.getValue();
            }
            else {
                // add fractional item
                int remainingCapacity = capacity - usedCapacity;
                double fractionValue = (double) remainingCapacity * item.getRatio();
                System.out.println("Taken Fractional item: " + item.getIndex() + ", Taken fractional value: " + fractionValue + ", used weight =" + remainingCapacity + ", ratio = "+ item.getRatio());

                usedCapacity = usedCapacity + remainingCapacity;
                totalValue = totalValue + fractionValue;
            }
            if(usedCapacity == capacity){
                break; // break out of the loop if capacity of knapsack fills
            }
        }
        System.out.println("Total value added in the knapsack: " + totalValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the knapsack capacity: ");
        int capacity = sc.nextInt();

        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();

        ArrayList<KnapsackItem> items = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            System.out.println("Enter weight of the item " + (i+1) + ": ");
            int weight = sc.nextInt();
            System.out.println("Enter value of the item " + (i+1) + ": ");
            int value = sc.nextInt();

            items.add(new KnapsackItem(i, value, weight));
        }
        sc.close();
        FractionalKnapsack.fractionalKnapsack(items, capacity);
    }
}
//    Weights 	3 	3 	2 	5 	1
//    value 	10 	15 	10 	12 	8
// capacity 10
// correct output = 45.4
