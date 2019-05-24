package LiskovSubtitution.LiskovSubtitutionViolation;

public class Bicycle extends Transportation {

	 @Override
	   void startEngine() {
		 //cannot implement since bicycles do not have engines
	 };
}
