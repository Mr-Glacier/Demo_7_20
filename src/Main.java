import JF_Work.Dispose_VIN;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dispose_VIN dispose_vin = new Dispose_VIN();
        ArrayList<String> VinList = dispose_vin.Dispose_Vin("F:/A_解放/vin50_0720.txt");
        for (int i = 0; i < VinList.size(); i++) {
            System.out.println(VinList.get(i));
        }
       // System.out.println(VinList.size());
        System.out.println("Hello world!");
    }
}

//{"serviceName": "SMP1320Service","methodName": "doSearchForVehicle","client": "800","userName": "BZD030","tran": "smp1000","language": "CN","sessionID": "f37f2bfd-9a20-4780-9a67-6e332d0c2faa","loginTime": 1689832913447,"backendVersion": "","actionID": "71fdaa3a-6a9e-49a3-bc0e-c54bec790ef6","guid": "e6dbde60-0ff3-4366-a847-3fda874f9939","paraValues": {"vkeywork": "FAC00621","optionValue": "KEY01","selectLevel": 100}}