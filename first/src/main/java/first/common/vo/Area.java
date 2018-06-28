package first.common.vo;

public class Area {
	
	int areaNum;
	String lat,longi;
	
	public Area() {
		
	}
	
	public Area(int areaNum, String lat, String longi) {
		super();
		this.areaNum = areaNum;
		this.lat = lat;
		this.longi = longi;
	}

	public int getAreaNum() {
		return areaNum;
	}

	public void setAreaNum(int areaNum) {
		this.areaNum = areaNum;
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
	
	
	
	
	

}
