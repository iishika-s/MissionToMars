public class Rocket implements Spaceship{
    protected int rocketWeight;
    protected int maxWeight;
    protected int totalWeight = rocketWeight;
    protected int cost;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return rocketWeight + item.getWeight() <= maxWeight;
    }

    public void carry(Item item) {
        totalWeight += item.getWeight();
    }
}
