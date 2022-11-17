package missionMarch;

public class R2 extends Rocket{
    @Override
    public boolean launch(Rocket rocket) {
        double probability = 5*((double)rocket.totalWeight/(double)rocket.maxWeight);
        //System.out.println("Launch Probability" +probability);
        return getRandomBoolean(probability);
    }

    @Override
    public boolean land(Rocket rocket) {
        double probability = 1*((double)rocket.totalWeight/(double)rocket.maxWeight);
       // System.out.println("Land Probability" +probability);
        return getRandomBoolean(probability);
    }

    private static boolean getRandomBoolean(Double probability){
        double randomValue = Math.random()*100;
        
        return randomValue>probability;
    }

 }