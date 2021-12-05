package View;

public class HomePage extends WebPageTemplate{

    private ObserverFactory observerFactory;
    private Observer observer;

    public HomePage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("HomePage");
    }
    @Override
    public void createPage() {
        super.createPage();
    }

    @Override
    public void readPage() {
        super.readPage();
    }

    @Override
    public void updatePage() {
        super.updatePage();
    }

    @Override
    public void deletePage() {
        super.deletePage();
    }
}
