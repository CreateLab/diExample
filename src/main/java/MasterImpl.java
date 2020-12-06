import com.google.inject.Inject;

public class MasterImpl implements Master {
    private Slave _s;
    @Inject
    public MasterImpl(Slave s){
        _s = s;
    }
    public void print(){
        _s.print();
    }
}
