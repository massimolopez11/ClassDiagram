package View;

public class PaymentPage extends WebPageTemplate{

    private ObserverFactory observerFactory;
    private Observer observer;

    public PaymentPage(){
        observerFactory = new ObserverFactory();
        observer = observerFactory.createObserver("PaymentPage");
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
