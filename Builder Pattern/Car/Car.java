
public class Car{
    private String model;
    private String engine;
    private String color;
    private String transmission;
    private Boolean sunroof;
    private Boolean infainment;

    public Car(CarBuilder carBuilder) {
        this.model = carBuilder.model;
        this.engine = carBuilder.engine;
        this.color = carBuilder.color;
        this.transmission = carBuilder.transmission;
        this.sunroof = carBuilder.sunroof;
        this.infainment = carBuilder.infainment;

    }

    @Override
    public String toString(){
        return "Car Configuration:\n" +
            "Model Name: " + model + "\n" +
            "Engine Type: " + engine + "\n" +
            "Color: " + color + "\n" +
            "Transmission: " + transmission + "\n" +
            "Sunroof: " + (sunroof ? "Yes" : "No") + "\n" +
            "Infotainment System: " + (infainment ? "Yes" : "No");
    }
    
}