
public class OutsideLightsOn implements State {
	
	OutsideLights outsideLights;

	public OutsideLightsOn(OutsideLights outsideLights) {
		this.outsideLights = outsideLights;
	}
	/*
	public void turnOnLight() {
		System.out.println("Lights already on");
		
	}

	public void turnOffLight() {
		System.out.println("Lights turned off");
		OutsideLights.setState
		
	}
	*/

	public void nighttime() {
		System.out.println("Outside lights are already on");
		
	}

	public void daytime() {
		System.out.println("Outside lights are turned off");
		outsideLights.setState(outsideLights.getOutsideLightsOffState());
		
	}

	public void switchOn() {
		System.out.println("Outside lights are already on");
		
	}


	public void switchOff() {
		System.out.println("Outside Lights are turned off");
		outsideLights.setState(outsideLights.getOutsideLightsOffState());
	}

	
	
}
