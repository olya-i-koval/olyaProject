package ua.npu.edu.pattern.task03;

public class Wiki implements Cloneable {
    public Wiki clone() throws CloneNotSupportedException {
        return (Wiki) super.clone();
    }
}
class Cash {
    private Wiki wiki;
    public Wiki getWiki() throws CloneNotSupportedException {
        return wiki.clone();
    }

    public void setWiki(Wiki wiki) {
        this.wiki = wiki;
    }
}