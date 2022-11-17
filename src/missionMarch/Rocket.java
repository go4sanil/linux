package missionMarch;

public class Rocket implements SpaceShip{
    Integer maxWeight;
    Integer totalWeight;
    Integer rocketWeight;

    Integer rocketCost;

    @Override
    public boolean launch(Rocket rocket) {
        return true;
    }

    @Override
    public boolean land(Rocket rocket) {
        return true;
    }

    @Override
    public boolean canCarry(Item item){
        if (this.maxWeight - (this.totalWeight + item.getWeight()) >= 0)
            return true;
        else
            return false;
    }

    @Override
    public void carry(Item item) {
        this.totalWeight += item.getWeight();
    }
}