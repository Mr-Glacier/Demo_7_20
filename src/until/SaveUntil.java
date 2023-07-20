package until;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class SaveUntil {
    public void Method_SaveFile(String path,String Content) {
        try{
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path,true),331074 );//165537
            bufferedOutputStream.write(Content.getBytes());
            //OutputStream.close();
            Thread.sleep(2000);
            bufferedOutputStream.close();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

    }
}
