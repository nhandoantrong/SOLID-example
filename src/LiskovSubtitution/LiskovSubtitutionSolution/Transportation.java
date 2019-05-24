package LiskovSubtitution.LiskovSubtitutionSolution;

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
}
