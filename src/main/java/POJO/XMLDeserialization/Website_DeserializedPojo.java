package main.java.POJO.XMLDeserialization;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Website")
@XmlType(propOrder = {"URL", "tile", "description", "createdDate"})
public class Website_DeserializedPojo {
    private String Description;
    private String CreatedDate;
    private String Tile;
    private String URL;

    @XmlElement
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @XmlElement
    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    @XmlElement
    public String getTile() {
        return Tile;
    }

    public void setTile(String tile) {
        Tile = tile;
    }

    @XmlElement
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
