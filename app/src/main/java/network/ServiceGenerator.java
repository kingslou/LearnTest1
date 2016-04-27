package network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit请求
 * Created by YiMuTian on 2016/4/27.
 */
public class ServiceGenerator {

    public static final String url = "http://www.tngou.net/";

    private static OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder retorfitBuilder = new Retrofit.Builder().baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> sClass){
        Retrofit retrofit = retorfitBuilder.client(okHttpClient.build()).build();
        return retrofit.create(sClass);
    }
}
