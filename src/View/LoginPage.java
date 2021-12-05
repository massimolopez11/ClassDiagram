package View;

public class LoginPage extends WebPageTemplate{
    private ObserverFactory observerFactory;
    private Observer observer;

    public LoginPage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("LoginPage");
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
