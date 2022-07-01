package assessment.task02;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Task02 
{
    public static void main( String[] args ) throws Exception {

        String host = "task02.chuklee.com";
        int port = 80;
        Socket s = new Socket(host, port);

        //ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        //ObjectInputStream is = new ObjectInputStream(s.getInputStream());

        os.close();

        DataOutputStream  outputStream = new DataOutputStream(s.getOutputStream());  
        System.out.println("Output Stream: "+ outputStream);
    }
}
