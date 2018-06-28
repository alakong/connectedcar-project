package first.common.vo;

public class CarState {
	
	
	String carId;
	String accel;
	String lat,longi;
	String carTemp,engTemp,tire,gas,regDate;
	
	
	public CarState() {
	}


	public CarState(String carId, String accel, String lat, String longi, String carTemp, String engTemp, String tire,
			String gas, String regDate) {
		super();
		this.carId = carId;
		this.accel = accel;
		this.lat = lat;
		this.longi = longi;
		this.carTemp = carTemp;
		this.engTemp = engTemp;
		this.tire = tire;
		this.gas = gas;
		this.regDate = regDate;
	}


	public String getCarId() {
		return carId;
	}


	public void setCarId(String carId) {
		this.carId = carId;
	}


	public String getAccel() {
		return accel;
	}


	public void setAccel(String accel) {
		this.accel = accel;
	}


	public String getLat() {
		return lat;
	}


	public void setLat(String lat) {
		this.lat = lat;
	}


	public String getLongi() {
		return longi;
	}


	public void setLongi(String longi) {
		this.longi = longi;
	}


	public String getCarTemp() {
		return carTemp;
	}


	public void setCarTemp(String carTemp) {
		this.carTemp = carTemp;
	}


	public String getEngTemp() {
		return engTemp;
	}


	public void setEngTemp(String engTemp) {
		this.engTemp = engTemp;
	}


	public String getTire() {
		return tire;
	}


	public void setTire(String tire) {
		this.tire = tire;
	}


	public String getGas() {
		return gas;
	}


	public void setGas(String gas) {
		this.gas = gas;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}




}
