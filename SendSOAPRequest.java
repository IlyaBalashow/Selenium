package pur_eb.emc_test.lib;
 
import javax.xml.soap.*;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.file.Paths;
 
public class SendSOAPRequest {
 
    public static void sendSOAPRequest(String url, String filePath) throws Exception {
        //Создаем подключение
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
 
        //Открываем запрос из файла
        SOAPMessage requestMessage = messageFactory.createMessage(new MimeHeaders(), new FileInputStream(Paths.get(filePath).toFile()));
 
        //Отправляем запрос
        URL endpoint = new URL(url);
        SOAPConnection connection = soapConnectionFactory.createConnection();
        SOAPMessage responseMessage = connection.call(requestMessage, endpoint);
    }
}
