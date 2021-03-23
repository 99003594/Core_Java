package activity2;

class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	boolean hasTV;
	boolean hasWifi;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasTV() {
		return hasTV;
	}
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	public int CalculateTariff(int rpsf) {
		return numberOfSqFeet*rpsf;
	}
	}
class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;

	//public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		//super(hotelName, numberOfSqFeet, hasTV, hasWifi);
//		this.ratePerSqFeet = ratePerSqFeet;
	//}

	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
}
class DeluxeACRoom extends DeluxeRoom
{
	protected int ratePerSqFeet;

	//public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet,
		//	int ratePerSqFeet2) {
//		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
	//	ratePerSqFeet = ratePerSqFeet2;
	//}

	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
}
class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;

	//public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		//super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		//this.ratePerSqFeet = ratePerSqFeet;
//	}

	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
}