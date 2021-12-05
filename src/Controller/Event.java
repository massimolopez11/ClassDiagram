package Controller;

import View.Observer;

public class Event {
    public Event(Observer observer){
        observer.onUpdate();
    }

    public void onEvent(){

    }
}
