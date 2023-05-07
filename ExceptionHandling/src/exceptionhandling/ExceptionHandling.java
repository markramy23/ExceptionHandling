/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


/**
 *
 * @author Mark
 */
public class ExceptionHandling {

  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the path of your file");
        String filename=input.nextLine();
        try {
           List<Container> containers=new ArrayList<Container>();
           containers=ParseXml(filename);
           Collections.sort(containers);
            System.out.println(containers);
            writexml(containers,filename);
        } catch (Exception e) {
            System.out.println(e);;
        }
        
        
    }
    public static List<Container> ParseXml(String fileName) throws Exception {
        if(fileName.endsWith(".arxml")==false){
            throw new NotVaildAutosarFileException("wrong format file");
        }
         File f=new File(fileName);
         if(f.length()==0){
             throw new EmptyAutosarFileException("file is empty");
         }
    List<Container> containers = new ArrayList<Container>();
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(new File(fileName));
    document.getDocumentElement().normalize();
    NodeList nList = document.getElementsByTagName("CONTAINER");
    for (int temp = 0; temp < nList.getLength(); temp++) {
      Node node = nList.item(temp);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element eElement = (Element) node;
        Container container = new Container();
        container.setUUID(eElement.getAttribute("UUID"));
        container.setShort_Name(eElement.getElementsByTagName("SHORT-NAME").item(0).getTextContent());
        container.setLong_Name(eElement.getElementsByTagName("LONG-NAME").item(0).getTextContent());
        
        //Add container to list
        containers.add(container);
      }
    }
    return containers;
}
    public static void writexml(List<Container> l,String f) throws ParserConfigurationException, TransformerException{
        StringBuffer s=new StringBuffer(f);
        s.insert(s.length()-6, "_mod");
        
        String filepath=s.toString();
     DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
             
            // root element
            Element root = document.createElement("AUTOSAR");
            document.appendChild(root);
 
            
           
    for(Container c:l){
        
            Element container = document.createElement("Container");
            root.appendChild(container);
            // set an attribute to container element
            Attr attr = document.createAttribute("UUID");
            attr.setValue(c.getUUID());
            container.setAttributeNode(attr);
 
       
 
            // shortname element
            Element shortName = document.createElement("SHORT_NAME");
            shortName.appendChild(document.createTextNode(c.getShort_Name()));
            container.appendChild(shortName);
 
            // longname element
            Element longName = document.createElement("LONG_NAME");
            longName.appendChild(document.createTextNode(c.getLong_Name()));
            container.appendChild(longName);
    }
              TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(filepath));
            transformer.transform(domSource, streamResult);
             
 
}
}

