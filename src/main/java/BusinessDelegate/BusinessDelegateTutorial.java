package BusinessDelegate;

/**
 * Have a client and B.Services
 * and have not to directly invoke B.Service  there is a possibility reduce load by caching
 */
public class BusinessDelegateTutorial {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.toTask("ejb");
    }
}

interface BusinessService{
    void doJob();
}
class EJBService implements BusinessService{

    @Override
    public void doJob() {
        System.out.println("do ejb job");
    }
}
class JMSService implements BusinessService{

    @Override
    public void doJob() {
        System.out.println("do jms ");
    }
}

class LookupService{//create and  gets access to services
    BusinessService getService(String service){
        if(service.equals("ejp"))return new EJBService();
    return null;
    }

}

class BusinessDelegate{
    LookupService lookupService = new LookupService();
    BusinessService businessService;
    void toTask(String serviceType){
        businessService= lookupService.getService(serviceType);
        businessService.doJob();
    }
}