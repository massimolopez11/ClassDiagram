package View;

public class SearchPage extends WebPageTemplate{
    private ObserverFactory observerFactory;
    private Observer observer;

    public SearchPage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("SearchPage");
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
