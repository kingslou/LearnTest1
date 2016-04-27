package network;

import java.util.List;

import bean.BaseFeed;
import bean.Infoclass;
import bean.MyTest;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by YiMuTian on 2016/4/27.
 */
public interface ApiService {

    @GET("api/info/classify")
    Call <BaseFeed> getInfoList();




}
