package main.java.POJO.XMLSerialization;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import POJO.XMLSerialization.Tile;

@XmlRootElement(name = "Website")
@XmlType(propOrder = {"URL", "tile", "description", "createdDate"})
public class Website_SerializationPojo {
    private String URL;
    private Tile tile;
    private String description;
    private String createdDate;

    public Website_SerializationPojo(String URL, Tile tile, String description, String createdDate) {
        this.URL = URL;
        this.tile = tile;
        this.description = description;
        this.createdDate = createdDate;
    }

    public Website_SerializationPojo(){
        super();
    }

    @XmlElement(name = "URL")
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @XmlElement(name = "tile")
    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
