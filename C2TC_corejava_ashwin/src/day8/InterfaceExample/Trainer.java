package day8.InterfaceExample;

public class Trainer implements Coder {
	@Override
	public void rules() {
		System.out.println("Morning wake up at "+wakeupTime);
		System.out.println("And check the student program");
	}

}
