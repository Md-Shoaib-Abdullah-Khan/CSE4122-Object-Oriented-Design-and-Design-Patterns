public class CarBuilderPatternDemo {
    public static void main(String[] args) {
        Car defaultCar = new CarBuilder()
                .setModelName("Default Model")
                .setEngineType("Petrol")
                .setColor("White")
                .setTransmission("Manual")
                .setSunroof(false)
                .setInfotainment(false)
                .build();
        System.out.println(defaultCar);
        
    }
}
