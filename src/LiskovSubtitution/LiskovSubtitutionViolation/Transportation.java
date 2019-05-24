package LiskovSubtitution.LiskovSubtitutionViolation;

public class Transportation {
	String name;
	String getName() {
		return this.name;
	}
	void setName(String n) {
		this.name=n;
	}
	
	double speed;
	double getSpeed() { 
		return this.speed;
	}
	void setSpeed(double d) { 
		this.speed=d;
	}

	Engine engine;
	void setEngine(Engine e) {
		this.engine=e;
	}

	void startEngine() { 
		//Logic implementation here
	}
}
