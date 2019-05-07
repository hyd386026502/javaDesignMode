package observerPattern;

public class NBAobserver implements Observer {

	@Override
	public void update(Subject subject, Object data) {
		// TODO Auto-generated method stub
		System.out.println("I'm "+this.getClass().getSimpleName()+","+data+"别看NBA了");		
	}

}
