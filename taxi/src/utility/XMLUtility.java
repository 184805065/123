package utility;

import car.*;
import factory.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtility{
           public static Object getbean(){
                      try{
                               DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
                               DocumentBuilder builder = dFactory.newDocumentBuilder();
                               Document doc = builder.parse(new File("config.xml"));
                               NodeList nl = doc.getElementsByTagName("className");
                               Node classNode = nl.item(0).getFirstChild();
                               String cName = classNode.getNodeValue();
                               Class<?> c = Class.forName(cName);
                               Object obj = c.newInstance();
                               return obj;
                      }
                      catch(Exception e){
                    	  
                    	  System.out.println("++++++++++++++");
                               e.printStackTrace();
                                return null;
                      }
         }
}