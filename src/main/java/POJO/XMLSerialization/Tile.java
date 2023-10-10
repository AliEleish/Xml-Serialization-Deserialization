package POJO.XMLSerialization;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "tile")
public class Tile {
    private String type;
    private String tileValue;

    public Tile(String type, String typeValue) {
        this.type = type;
        this.tileValue = typeValue;
    }

    public Tile(){
        super();
    }

    @XmlAttribute(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlValue
    public String getTileValue() {
        return tileValue;
    }

    public void setTileValue(String tileValue) {
        this.tileValue = tileValue;
    }
}
