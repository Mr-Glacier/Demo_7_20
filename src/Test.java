import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class Test {
        private static void initApiParamAAA(String url){
            // playload
            String connJson = "{\"serviceName\": \"SMP1320Service\",\"methodName\": \"doSearchForVehicle\",\"client\": \"800\",\"userName\": \"BZD030\",\"tran\": \"smp1000\",\"language\": \"CN\",\"sessionID\": \"523722ba-0105-4e2d-9f15-01e7ca05dd80\",\"loginTime\": 1689831216597,\"backendVersion\": \"\",\"actionID\": \"11f0747f-0b62-4a37-b31e-e1029f54064e\",\"guid\": \"a9dd9f5a-2dcf-4fa4-a93f-33b9ed008f03\",\"paraValues\": {\"vkeywork\": \"FAC80016\",\"optionValue\": \"KEY01\",\"selectLevel\": 100}}";
            String connJson1 = "{\"serviceName\": \"SMP1320Service\",\"methodName\": \"doSearchForVehicle\",\"client\": \"800\",\"userName\": \"BZD030\",\"tran\": \"smp1000\",\"language\": \"CN\",\"sessionID\": \"f37f2bfd-9a20-4780-9a67-6e332d0c2faa\",\"loginTime\": 1689832913447,\"backendVersion\": \"\",\"actionID\": \"71fdaa3a-6a9e-49a3-bc0e-c54bec790ef6\",\"guid\": \"e6dbde60-0ff3-4366-a847-3fda874f9939\",\"paraValues\": {\"vkeywork\": \"FAC00621\",\"optionValue\": \"KEY01\",\"selectLevel\": 100}}";
            try {
                Connection.Response res = Jsoup.connect(url).method(Connection.Method.POST)
                        .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")
                        .requestBody(connJson).ignoreContentType(true).execute();
                System.out.println(res.body());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        public static void main (String[]args){
            String url = "http://jfepc.fawtc.com.cn:8080/QMERP/RemoteCallManager?fromClient=QMBS&ModuleName=epc&service=SMP1320Service";
            initApiParamAAA(url);
        }

}
