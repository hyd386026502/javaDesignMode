package observerPattern;

public class CartoonObserver implements Observer {

	@Override
	public void update(Subject subject, Object data) {
		// TODO Auto-generated method stub
		System.out.println("I'm "+this.getClass().getSimpleName()+","+data+"别看漫画了");		
	}

}
