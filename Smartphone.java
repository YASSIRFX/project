package first_project;

public class Smartphone extends Device {
	
	private String operatingSystem;
    private int cameraMegapixels;
    
    public Smartphone(String brand, String model, int year, String operatingSystem, int cameraMegapixels) {
        super(brand, model,year );
        this.operatingSystem = operatingSystem;
        this.cameraMegapixels = cameraMegapixels;
    }


    public String toString() {
        return "Smartphone [brand=" + brand + ", model=" + model + ", Year=" + year +
                ", operatingSystem=" + operatingSystem + ", cameraMegapixels=" + cameraMegapixels + "]";
    }
}
