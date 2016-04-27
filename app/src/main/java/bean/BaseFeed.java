package bean;

import java.util.List;

/**
 * Created by YiMuTian on 2016/4/27.
 */
public class BaseFeed<T> {

    private String status;
    private List<T> tngou;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<T> getTngou() {
        return tngou;
    }

    public void setTngou(List<T> tngou) {
        this.tngou = tngou;
    }
}
