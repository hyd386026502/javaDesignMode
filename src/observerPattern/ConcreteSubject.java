package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	
	List<Observer> mlist = new ArrayList<>();
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		 // 确保相同的观察者只含有一个
        if (observer == null) {
            throw new NullPointerException("observer == null");
        }
        if (!mlist.contains(observer)) {
        	mlist.add(observer);
        }
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		mlist.remove(observer);
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		mlist.clear();
	}

	@Override
	public void notifyAllObserver(Object data) {
		// TODO Auto-generated method stub
		  for (Observer observer : mlist) {
	            observer.update(this,data);
	        }
	}

	@Override
	public void notify(Observer observer, Object data) {
		// TODO Auto-generated method stub
		 if(observer!=null){
	            observer.update(this, data);
	        }
	}

}
