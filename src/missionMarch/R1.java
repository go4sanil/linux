package missionMarch;

public class R1 extends Rocket{
    @Override
    public boolean launch(Rocket rocket) {
        double probability = 5* ((double)rocket.totalWeight/(double)rocket.maxWeight);
        return getRandomBoolean(probability);
    }

    @Override
    public boolean land(Rocket rocket) {
        double probability = 1*((double)rocket.totalWeight/(double)rocket.maxWeight);
        return getRandomBoolean(probability);
    }

    private static boolean getRandomBoolean(double probability){
        double randonValue = Math.random()*100;
        return randonValue>probability;
    }
    
 }