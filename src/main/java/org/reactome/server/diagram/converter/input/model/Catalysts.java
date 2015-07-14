
package org.reactome.server.diagram.converter.input.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Catalyst" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "catalyst"
})
@XmlRootElement(name = "Catalysts")
public class Catalysts {

    @XmlElement(name = "Catalyst", required = true)
    protected List<Catalyst> catalyst;

    /**
     * Gets the value of the catalyst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalyst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalyst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catalyst }
     * 
     * 
     */
    public List<Catalyst> getCatalyst() {
        if (catalyst == null) {
            catalyst = new ArrayList<Catalyst>();
        }
        return this.catalyst;
    }

}
