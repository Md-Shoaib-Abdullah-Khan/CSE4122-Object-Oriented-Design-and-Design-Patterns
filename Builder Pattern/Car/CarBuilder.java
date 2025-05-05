public class CarBuilder {
     String model;
     String engine;
     String color;
     String transmission;
     Boolean sunroof;
     Boolean infainment;
     public String wheels;

    public CarBuilder setModelName(String model){
        this.model = model;
        return this;
    }
    public CarBuilder setEngineType(String engine){
        this.engine = engine;
        return this;
    }
    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }
    public CarBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }
    public CarBuilder setSunroof(Boolean sunroof){
        this.sunroof = sunroof;
        return this;
    }
    public CarBuilder setInfotainment(Boolean infainment){
        this.infainment = infainment;
        return this;
    }
    public Car build(){
        return new Car(this);
    }
}
