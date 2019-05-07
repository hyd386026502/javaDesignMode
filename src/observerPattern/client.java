package observerPattern;

public class client {
	 public static void main(String[] args) {
		 ConcreteSubject concreteSubject = new ConcreteSubject();
		 CartoonObserver cartoonObserver = new CartoonObserver();
		 NBAobserver nbaObserver = new NBAobserver();
	     concreteSubject.addObserver(cartoonObserver);
	     concreteSubject.addObserver(nbaObserver);
	     concreteSubject.notifyAllObserver("老师来了");

	 }
}
