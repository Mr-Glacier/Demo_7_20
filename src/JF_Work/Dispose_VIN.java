package JF_Work;

import until.ReadUntil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Dispose_VIN {
    public ArrayList<String> Dispose_Vin(String path) {
//"F:/A_解放/vin50_0720.txt"
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                String FinStr = str.substring(9,str.length());
                arrayList.add(FinStr);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

}

