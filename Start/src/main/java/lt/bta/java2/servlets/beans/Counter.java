package lt.bta.java2.servlets.beans;

public class Counter {
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private  int count;

    public  Counter(){}; //reikia tureti default konstruktoriu

    public Counter(int count) {
        this.count = count;
    }
}
