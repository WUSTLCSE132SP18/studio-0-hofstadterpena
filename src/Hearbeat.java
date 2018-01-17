
public class Hearbeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time = 0;
		
		while(time < 40) {
			try {
				Thread.sleep(1000);
				time = time + 1;
				System.out.println("Seconds elapsed: " + time);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		

	}

}
