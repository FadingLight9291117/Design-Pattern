package chainOfResponsibility;

public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {    // 解决问题的方法
        return trouble.getNumber() < limit;
    }
}
