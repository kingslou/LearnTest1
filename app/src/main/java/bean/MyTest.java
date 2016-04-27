package bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by YiMuTian on 2016/4/27.
 */
public class MyTest extends BaseFeed implements Serializable {
    private List<Infoclass> infoclassList;

    public List<Infoclass> getInfoclassList() {
        return infoclassList;
    }

    public void setInfoclassList(List<Infoclass> infoclassList) {
        this.infoclassList = infoclassList;
    }
}
