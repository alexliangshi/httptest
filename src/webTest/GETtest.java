package webTest;
import java.io.IOException;
import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebConversation;
//import com.meterware.httpunit.WebForm;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import java.lang.String;
import org.xml.sax.SAXException;
//import junit.framework.TestCase;

class Setup{
	public void setup(){
		WebConversation wc = new WebConversation();
		 try {
		 WebRequest req = new GetMethodWebRequest(
		 "http://10.0.31.46:6080/login/loginAuth.action");
		 req.setParameter("strUserName", "optadmin");
		 req.setParameter("strPassword", "111111");
		 req.setParameter("strUserType", "gridview");
		 WebResponse resp = wc.getResponse(req);
		 System.out.println(resp.getText());
		 } catch (IOException e) {
		 e.printStackTrace();
		 } catch (SAXException e) {
		
		 e.printStackTrace();
		 }
	}
	
}
public class GETtest{

	public static void main(String[] args) {
		
		Setup st = new Setup();
		st.setup();
		 

	}

}
