public class U2 extends Rocket{

    //hbkjenjenk
    U2() {
        rocketWeight = 18;
        maxWeight = 29;
        totalWeight = 18;
        cost = 120;
    }

    public double launchExplosionPossibility(){
        return 0.04 * ((totalWeight-rocketWeight)/(maxWeight-rocketWeight));
    }

    public  double landingCrashPossibility(){
        return 0.08 * ((totalWeight-rocketWeight)/(maxWeight-rocketWeight));
    }

    @Override
    public boolean land() {

        return landingCrashPossibility() < Math.random();
    }
//wugw
    @Override
    public boolean launch(){
        return  launchExplosionPossibility() < Math.random();
    }
}
