package _27_Greedy_Algorithms.Fractional_KnapSack_Problem;

public class KnapsackItem {
    private int index;
    private int value;
    private int weight;
    private double ratio; // value per weight

    public KnapsackItem(int index, int value, int weight){
        this.index = index;
        this.value = value;
        this.weight = weight;
        ratio = (double) value / weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "KnapsackItem{" +
                "index=" + index +
                ", value=" + value +
                ", weight=" + weight +
                ", ratio=" + ratio +
                '}';
    }
}
