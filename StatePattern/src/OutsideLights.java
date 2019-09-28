
public class OutsideLights {

	State outsideLightsOn;
	State outsideLightsOff;
	
	State state = outsideLightsOff;
	
	public OutsideLights() {
		outsideLightsOn = new OutsideLightsOn(this);
		outsideLightsOff = new OutsideLightsOff(this);
		
		state = outsideLightsOff;
		
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	public void nighttime() {
		state.nighttime();
	}
	
	public void daytime() {
		state.daytime();
	}
	
	public void switchOn() {
		state.switchOn();
	}
	
	public void switchOff() {
		state.switchOff();
	}

	public State getOutsideLightsOnState() {return outsideLightsOn;}
	public State getOutsideLightsOffState() {return outsideLightsOff;}
}
