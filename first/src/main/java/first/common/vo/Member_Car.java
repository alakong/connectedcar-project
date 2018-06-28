package first.common.vo;

public class Member_Car {
	String id, carId;
	
	
	public Member_Car() {
	
	}


	public Member_Car(String id, String carId) {
		super();
		this.id = id;
		this.carId = carId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}
	
	


}
