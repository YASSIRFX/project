package first_project;

import java.util.Objects;

public class Device implements Comparable<Device> {
	
	protected String brand;
	protected String model;
	protected int year;
	
	public Device(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	}    
	
	
	public String toString() {
	      return "Device [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	        }
	
	 public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Device device = (Device) obj;
	        return Double.compare(device.year, year) == 0 &&
	                Objects.equals(brand, device.brand) &&
	                Objects.equals(model, device.model);
	    }
	 
	 public int compareTo(Device otherDevice) {
	        // Comparing based on price
	        return Double.compare(this.year, otherDevice.year);
	    }

	
}
