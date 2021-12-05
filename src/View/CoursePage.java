package View;

public class CoursePage  extends WebPageTemplate{

    private ObserverFactory observerFactory;
    private Observer observer;

    public CoursePage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("CoursePage");
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
