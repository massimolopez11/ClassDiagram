package View;

public class SignupPage extends WebPageTemplate{
    private ObserverFactory observerFactory;
    private Observer observer;

    public SignupPage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("SignupPage");
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
