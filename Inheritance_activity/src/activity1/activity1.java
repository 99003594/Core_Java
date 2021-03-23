package activity1;


class vehicle
{
	protected String make;
	protected String fuelType;
	protected int fuelCapacity;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	int cc;
	public void displayMake()
	{
		}
	public void displayBasicInfo()
	{
		System.out.println("vehiclenumber:"+make);
		System.out.println("fuelcapacity:"+fuelCapacity);
		System.out.println("fueltype:"+fuelType);
		System.out.println("cc:"+cc);
	}
	public void displayDetailInfo()
	{
		System.out.println(make);
		System.out.println(fuelType);
		System.out.println(fuelCapacity);
	}
}
class TwoWheeler extends vehicle
{
	private Boolean kickStartAvailable;
	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo()
	{
		System.out.println(kickStartAvailable);
	}
}
class FourWheeler extends vehicle
{
	private String audioSystem;
	private int numberOfDoors;
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo()
	{
		System.out.println("Audio System:"+audioSystem);
		System.out.println("Number of Doors:"+numberOfDoors);
	}
}