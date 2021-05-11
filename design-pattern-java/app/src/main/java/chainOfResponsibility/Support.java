package chainOfResponsibility;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }


    @Override
    public String toString() {
        return "[ " + this.name + " ]";
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (this.next != null) {
            this.next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);   // 解决问题的方法

    protected void done(Trouble trouble) {  // 已解决
        System.out.printf("%s is resolved by %s.%n", trouble, this);
    }

    protected void fail(Trouble trouble) { // 未解决
        System.out.println(trouble + " cannot be resolved.");
    }

}
