package JF_Work;

import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import until.SaveUntil;

import java.util.ArrayList;

//F:\A_解放  存储地址
public class Down_JSON {
    public static void main(String[] args) {
        SaveUntil saveUntil = new SaveUntil();
        Dispose_VIN dispose_vin = new Dispose_VIN();
        String url = "http://jfepc.fawtc.com.cn:8080/QMERP/RemoteCallManager?fromClient=QMBS&ModuleName=epc&service=SMP1320Service";
        ArrayList<String> VINList = dispose_vin.Dispose_Vin("F:/A_解放/vin50_0720.txt");

        for (int i = 0; i < VINList.size(); i++) {
            String VIN = VINList.get(i);
            String Content = JieFang_Analysis_html(url,VIN);
            saveUntil.Method_SaveFile("F:/A_解放/50VIN_0720/"+VIN+".text",Content);
        }
    }
    public static String JieFang_Analysis_html(String url,String VIN) {
        String content = null;
        try {
            //String VIN = "GAC00915";
            String JsonConn = "{\"serviceName\": \"SMP1320Service\",\"methodName\": \"doSearchForVehicle\",\"client\": \"800\",\"userName\": \"BZD030\",\"tran\": \"smp1000\",\"language\": \"CN\",\"sessionID\": \"f37f2bfd-9a20-4780-9a67-6e332d0c2faa\",\"loginTime\": 1689832913447,\"backendVersion\": \"\",\"actionID\": \"f5830466-14b7-4e3b-99c5-12eb26b4945e\",\"guid\": \"f5830466-14b7-4e3b-99c5-12eb26b4945e\",\"paraValues\": {\"vkeywork\": " + VIN + ",\"optionValue\": \"KEY01\",\"selectLevel\": 100}}";
            Connection.Response res = Jsoup.connect(url).method(Connection.Method.POST)
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")
                    .requestBody(JsonConn).ignoreContentType(true).execute();
            System.out.println(res.body());
            content = res.body();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return content;
    }
}
