package View;

import Model.User;

import java.util.Map;

public abstract class WebPageTemplate implements WebPage{
    private String pageName;
    private String pageType;
    private boolean visibility;
    private Enum State;
    private Map<User,Boolean> userPermission;
    private Observer observer;

    @Override
    public void createPage() {

    }

    @Override
    public void readPage() {

    }

    @Override
    public void updatePage() {

    }

    @Override
    public void deletePage() {

    }

}
