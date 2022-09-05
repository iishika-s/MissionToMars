public class U1 extends Rocket {

    U1() {
        rocketWeight = 10;
        maxWeight = 18;
        totalWeight = 10;
        cost = 100;
    }

    public double launchExplosionPossibility(){
        return 0.05 * ((totalWeight-rocketWeight)/(maxWeight-rocketWeight));
    }

    public  double landingCrashPossibility(){
        return 0.01 * ((totalWeight-rocketWeight)/(maxWeight-rocketWeight));
    }

    @Override
    public boolean land() {

        return landingCrashPossibility() < Math.random();
    }

    @Override
    public boolean launch(){
        return  launchExplosionPossibility() < Math.random();
    }
}
