package first.common.vo;

public class Danger {
	String lat,longi,sp_time_b,sp_time_f,areaNum;
	int dLevel,id;
	
	public Danger(){	
	}
	
	public Danger(String lat, String longi, String sp_time_b, String sp_time_f, String areaNum, int dLevel, int id) {
		super();
		this.lat = lat;
		this.longi = longi;
		this.sp_time_b = sp_time_b;
		this.sp_time_f = sp_time_f;
		this.areaNum = areaNum;
		this.dLevel = dLevel;
		this.id = id;
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

	public String getSp_time_b() {
		return sp_time_b;
	}

	public void setSp_time_b(String sp_time_b) {
		this.sp_time_b = sp_time_b;
	}

	public String getSp_time_f() {
		return sp_time_f;
	}

	public void setSp_time_f(String sp_time_f) {
		this.sp_time_f = sp_time_f;
	}

	public String getAreaNum() {
		return areaNum;
	}

	public void setAreaNum(String areaNum) {
		this.areaNum = areaNum;
	}

	public int getdLevel() {
		return dLevel;
	}

	public void setdLevel(int dLevel) {
		this.dLevel = dLevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	

	
	

}
