package View;

public class FeedbackPage  extends WebPageTemplate{

    private ObserverFactory observerFactory;
    private Observer observer;

    public FeedbackPage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("FeedbackPage");
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
