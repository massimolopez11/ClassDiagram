package View;

import Controller.Event;

import java.util.List;

public class WebsiteHandler {
    List<Observer> viewObservers;
    List<WebPage> webPages;
    public void updateView(Event event){
    }
    public void initializePages(){

    }
    public void loadPage(){

    }

    public Observer getCurrentViewObserver(){

        return new ObserverFactory().createObserver("");
    }

    public Observer getViewObserver(){
        return new ObserverFactory().createObserver("");
    }
}
