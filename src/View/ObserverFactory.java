package View;

public class ObserverFactory{
    public Observer createObserver(String observer){
        if(observer.equals("ContactUsPage")){
            return new ContactUsObserver();
        }

        if(observer.equals("CoursePage")){
            return new ExamPageObserver();
        }

        if(observer.equals("ExamPage")){
            return new ExamPageObserver();
        }

        if(observer.equals("FeedbackPage")){
            return new FeedbackPageObserver();
        }

        if(observer.equals("HomePage")){
            return new HomepageObserver();
        }

        if(observer.equals("LoginPage")){
            return new LoginPageObserver();
        }

        if(observer.equals("PaymentPage")){
            return new PaymentPageObserver();
        }

        if(observer.equals("SearchPage")){
            return new SearchPageObserver();
        }

        if(observer.equals("SignupPage")){
            return new SignupPageObserver();
        }
        return null;
    }
}
