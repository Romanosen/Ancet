package ua.kiev.prog;

import java.util.concurrent.atomic.AtomicInteger;

public class AncetStatistic {
    public AncetStatistic() {

        setQ1yes(new AtomicInteger(0));
        setQ1no(new AtomicInteger(0));
        setQ2yes(new AtomicInteger(0));
        setQ2no(new AtomicInteger(0));
        setQ3yes(new AtomicInteger(0));
        setQ3no(new AtomicInteger(0));
        setQ4yes(new AtomicInteger(0));
        setQ4no(new AtomicInteger(0));

    }
    private AtomicInteger q1yes;
    private AtomicInteger q1no;
    private AtomicInteger q2yes;
    private AtomicInteger q2no;
    private AtomicInteger q3yes;
    private AtomicInteger q3no;
    private AtomicInteger q4yes;
    private AtomicInteger q4no;

    public AtomicInteger getQ1yes() {
        return q1yes;
    }

    public void setQ1yes(AtomicInteger q1yes) {
        this.q1yes = q1yes;
    }

    public AtomicInteger getQ1no() {
        return q1no;
    }

    public void setQ1no(AtomicInteger q1no) {
        this.q1no = q1no;
    }

    public AtomicInteger getQ2yes() {
        return q2yes;
    }

    public void setQ2yes(AtomicInteger q2yes) {
        this.q2yes = q2yes;
    }

    public AtomicInteger getQ2no() {
        return q2no;
    }

    public void setQ2no(AtomicInteger q2no) {
        this.q2no = q2no;
    }

    public AtomicInteger getQ3yes() {
        return q3yes;
    }

    public void setQ3yes(AtomicInteger q3yes) {
        this.q3yes = q3yes;
    }

    public AtomicInteger getQ3no() {
        return q3no;
    }

    public void setQ3no(AtomicInteger q3no) {
        this.q3no = q3no;
    }

    public AtomicInteger getQ4yes() {
        return q4yes;
    }

    public void setQ4yes(AtomicInteger q4yes) {
        this.q4yes = q4yes;
    }

    public AtomicInteger getQ4no() {
        return q4no;
    }

    public void setQ4no(AtomicInteger q4no) {
        this.q4no = q4no;
    }

    @Override
    public String toString() {
        return "AncetStatistic{" +
                "q1yes=" + q1yes +
                ", q1no=" + q1no +
                ", q2yes=" + q2yes +
                ", q2no=" + q2no +
                ", q3yes=" + q3yes +
                ", q3no=" + q3no +
                ", q4yes=" + q4yes +
                ", q4no=" + q4no +
                '}';
    }
}
