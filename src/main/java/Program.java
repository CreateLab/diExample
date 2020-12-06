import com.google.inject.Guice;
import com.google.inject.Injector;

public class Program {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BDSMModule());
        Master master = injector.getInstance(Master.class);
        master.print();
    }

}
