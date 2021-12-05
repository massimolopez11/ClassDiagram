package View;

public class ExamPage  extends WebPageTemplate{

    private ObserverFactory observerFactory;
    private Observer observer;

    public ExamPage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("ExamPage");
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
