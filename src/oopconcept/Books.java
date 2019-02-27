package oopconcept;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Books {
	String Author;
	String Title;
	String Genre;
	Integer Price;
	String Date;
	String Description;
	
	public Books(String author, String title, String genre, Integer price, String date, String description) {
		super();
		Author = author;
		Title = title;
		Genre = genre;
		Price = price;
		Date = date;
		Description = description;
	}
	
	
	public static void main(String[] args) {
		//Books obj= new Books(Author, Title, Genre, Price, Date, Description);
		try {
	         File inputFile = new File("Sample_books.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         
	         doc.getDocumentElement().normalize();
	         
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         
	         NodeList nList = doc.getElementsByTagName("book");
	         
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if(nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element)nNode;
	               System.out.println("ID : "+eElement.getAttribute("id"));
	               System.out.println("Author : "+ eElement.getElementsByTagName("author").item(0).getTextContent());
	               System.out.println("Title : "+ eElement.getElementsByTagName("title").item(0).getTextContent());
	               System.out.println("Genre : " + eElement.getElementsByTagName("genre").item(0).getTextContent());
	               System.out.println("Price : "+ eElement.getElementsByTagName("price").item(0).getTextContent());
	               System.out.println("Date : "+ eElement.getElementsByTagName("publish_date").item(0).getTextContent());
	               System.out.println("Description : "+ eElement.getElementsByTagName("description").item(0).getTextContent());
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	}

}
