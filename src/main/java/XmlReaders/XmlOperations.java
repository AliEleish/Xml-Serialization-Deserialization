package main.java.XmlReaders;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlOperations {

    private static File file;

    public static <T> Object getPojoFromXml(String xmlFilepath, Class<T>  pojoModel) {

        Object deserializedPojo = null;
        try {

            file = new File(xmlFilepath);
            JAXBContext jaxbContext = JAXBContext.newInstance(pojoModel);
           Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            deserializedPojo = unmarshaller.unmarshal(file);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return deserializedPojo;
    }

    public static void getXmlFromPojo(String OutputXmlFilepath, Object toBeSerializedPojo){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(toBeSerializedPojo.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(toBeSerializedPojo,System.out);
            marshaller.marshal(toBeSerializedPojo, new File(OutputXmlFilepath));
    }catch(Exception e){
          e.printStackTrace();
        }
    }

    public static <T> String convertObjectToJson(String xmlFilePath, Class<T> pojoModel) {
        Object deserializedPojo = getPojoFromXml(xmlFilePath, pojoModel);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.disableHtmlEscaping();
        Gson gson = gsonBuilder.create();
        return gson.toJson(deserializedPojo, deserializedPojo.getClass());
    }
}
