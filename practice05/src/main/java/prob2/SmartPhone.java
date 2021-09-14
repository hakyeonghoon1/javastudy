package prob2;

public class SmartPhone extends MusicPhone{

	public void execute(String function) {
		if(function.equals("앱")) {
			runApp();
			return;
		}
		super.execute(function);
	}
	
	private void runApp() {
		System.out.println("App실행");
	}
}
