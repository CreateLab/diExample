import com.google.inject.AbstractModule;

public class BDSMModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Slave.class).to(SlaveImpl.class);
        bind(Master.class).to(MasterImpl.class);
    }
}
