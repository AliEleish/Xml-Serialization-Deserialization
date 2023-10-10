package test.java.XmlOperationsTests;

import main.java.POJO.XMLDeserialization.Website_DeserializedPojo;
import POJO.XMLSerialization.Tile;
import main.java.POJO.XMLSerialization.Website_SerializationPojo;
import main.java.XmlReaders.XmlOperations;
import org.testng.annotations.Test;

public class WebsitesXmlOperations_Tests {


    @Test
    public void deserializeWebsitesXmlFile(){
        Website_DeserializedPojo website = (Website_DeserializedPojo) XmlOperations.getPojoFromXml(
                "src/main/java/InputDataFiles/WebsitesInputFile.xml", Website_DeserializedPojo.class);
        System.out.println("Website 1:");
        System.out.println("URL: "+website.getURL());
        System.out.println("Tile: " + website.getTile());
        System.out.println("Description: " + website.getDescription());
        System.out.println("Created Date: "+ website.getCreatedDate());

    }

    @Test
    public void addAttributeToWebsitesXmlFile(){
        Website_SerializationPojo websiteToBeSerialized = new Website_SerializationPojo("https://www.sephora.sg/",
                new Tile("store", "Sephora Singapore")
                ,"Sephora, where beauty beats. Discover the best in makeup, skin care, and more from a wide selection of beauty brands. Free shipping for orders above S$40."
        ,"10/30/2019 6:41:56 AM");
        XmlOperations.getXmlFromPojo("src/main/java/OutputDataFiles/WebsitesOutputFile.xml",websiteToBeSerialized);

    }

    @Test
    public void convertWebsitesXmlFileToJson(){
        System.out.println(XmlOperations.convertObjectToJson("src/main/java/InputDataFiles/WebsitesInputFile.xml"
                , Website_DeserializedPojo.class));
    }
}
