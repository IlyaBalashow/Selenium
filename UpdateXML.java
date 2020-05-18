package pur_eb.emc_test.lib;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
 
public class UpdateXML {
 
    public static void updateXML(String filePath, String xmlTag, String tagValue) {
 
        File xmlFile = new File(filePath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
 
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();
 
            //обновляем значения
            updateXMLTag(doc, xmlTag, tagValue);
 
            //запишем отредактированный элемент в файл
            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
 
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
 
    private static void updateXMLTag(Document doc, String xmlTag, String tagValue) {
        NodeList nodeList = doc.getElementsByTagName("transferDocumentRequest");
        Element lang = null;
        //проходим по каждому элементу
        for(int i= 0; i < nodeList.getLength(); i++) {
            lang = (Element) nodeList.item(i);
            Node name = lang.getElementsByTagName(xmlTag).item(0).getFirstChild();
            name.setNodeValue(tagValue);
        }
    }
}
