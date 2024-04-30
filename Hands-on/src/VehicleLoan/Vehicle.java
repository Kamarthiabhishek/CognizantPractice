package VehicleLoan;

public class Vehicle implements Loan, Insurance{
	private String vehicleNumber, modelName, vehicleType;
	private double price;
	double loanAmount, InsuranceAmt;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle(String vehicleNumber, String modelName, String vehicltype, double price) {
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicltype;
		this.price = price;
	}
	@Override
	public double issueloan() {
		if(vehicleType.equalsIgnoreCase("4 	")) {
			loanAmount = price * 0.8;
		}else if(vehicleType.equalsIgnoreCase("3 wheeler")) {
			loanAmount = price * 0.75;
		}else if(vehicleType.equalsIgnoreCase("2 wheeler")) {
			loanAmount = price * 0.5;
		}
		return loanAmount;
	}
	
	@Override
	public double takeInsurance() {
		if(price <= 150000) {
			InsuranceAmt = 3500;
		}else if(price > 150000 && price <= 300000) {
			InsuranceAmt = 4000;
		}else if(price > 300000) {
			InsuranceAmt = 5000;
		}
		return InsuranceAmt;
	}
}
