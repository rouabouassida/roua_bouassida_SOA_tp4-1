package serveur;
import javax.xml.ws.Endpoint;
import service.CalculatriceWS;
public class ServeurJWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:8686/";
		Endpoint.publish(url, new CalculatriceWS());
		System.out.println(url);

	}

}
