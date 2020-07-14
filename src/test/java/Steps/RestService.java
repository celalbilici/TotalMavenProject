package Steps;

import Base.BaseStep;
import cucumber.api.java.tr.Diyelimki;
import cucumber.api.java.tr.Ve;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestService extends BaseStep {


    @Diyelimki("(.*) servisi (.*) metodu ve (.*) body degeri ile calistirilirsa donus degerinin (.*) geldigi gorulur$")
    public void servisiMetoduVeBodyDegeriIleCalistirilirsaDonusDegerininGeldigiGorulur(String link, String method, String jsonBody, Integer responseValue) throws Throwable {
        RestAPI(link, method, jsonBody, responseValue);
    }


    @Ve("^deneme yapalim$")
    public void denemeYapalim() throws Throwable {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://0d75z.mocklab.io/api/books")
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        Integer gelen = response.code();
        String deger = response.body().string();
        System.out.println(deger);
        System.out.println(gelen);
    }


}
