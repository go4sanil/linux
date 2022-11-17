package missionMarch;

public interface SpaceShip {
    public boolean launch(Rocket rocket);
    public boolean land(Rocket rocket);
    public boolean canCarry(Item item);
    public void carry(Item item);
}