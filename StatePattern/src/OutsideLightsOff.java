
public class OutsideLightsOff implements State{

	OutsideLights outsideLights;
	
	public OutsideLightsOff(OutsideLights outsideLights) {
		this.outsideLights = outsideLights;
	}


	public void nighttime() {
		System.out.println("Outside lights are turned on");
		OustideLights.setState
	}


	public void daytime() {
		System.out.println("Outside lights are already off");
		
	}


	public void switchOn() {
		System.out.println("Outside lights are turned on");
		
	}


	public void switchOff() {
		System.out.println("Outside lights are already off");
		
	}

}
