public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    //TakeOff

    @Override
    public void takeOff() {
        System.out.printf("   "+this.getName() +" gonna fly in the sky !   ");
    }


   //Ascend
    @Override
    public int ascend(int meters) {
        System.out.printf("   "+this.getName() +" go more highter in the sky !   "+ this.getAltitude());
        return this.altitude;
    }

    //Descend
    @Override
    public int descend(int meters) {
        System.out.printf("   "+this.getName() +" go more downer in the sky !   "+ this.getAltitude());
        return this.altitude;
    }

    //Land
    @Override
    public void land() {
        System.out.printf("   "+this.getName() + " gonna land ! Be carreful !   ");
    }

    //Glide
    @Override
    public void glide(){};
}
