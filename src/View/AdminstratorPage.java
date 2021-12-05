package View;

public class AdminstratorPage extends WebPageTemplate{
    private ObserverFactory observerFactory;
    private Observer observer;

    public AdminstratorPage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("AdministratorPage");
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
