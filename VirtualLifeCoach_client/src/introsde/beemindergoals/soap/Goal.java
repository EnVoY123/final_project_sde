
package introsde.beemindergoals.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="slug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goal_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="graph_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="panic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="losedate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="goaldate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "slug",
    "title",
    "goalType",
    "graphUrl",
    "panic",
    "losedate",
    "goaldate",
    "rate",
    "updatedAt"
})
public class Goal {

    protected String slug;
    protected String title;
    @XmlElement(name = "goal_type")
    protected String goalType;
    @XmlElement(name = "graph_url")
    protected String graphUrl;
    protected Long panic;
    protected Long losedate;
    protected String goaldate;
    protected Long rate;
    @XmlElement(name = "updated_at")
    protected Long updatedAt;

    /**
     * Gets the value of the slug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Sets the value of the slug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlug(String value) {
        this.slug = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the goalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalType() {
        return goalType;
    }

    /**
     * Sets the value of the goalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalType(String value) {
        this.goalType = value;
    }

    /**
     * Gets the value of the graphUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphUrl() {
        return graphUrl;
    }

    /**
     * Sets the value of the graphUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphUrl(String value) {
        this.graphUrl = value;
    }

    /**
     * Gets the value of the panic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPanic() {
        return panic;
    }

    /**
     * Sets the value of the panic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPanic(Long value) {
        this.panic = value;
    }

    /**
     * Gets the value of the losedate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLosedate() {
        return losedate;
    }

    /**
     * Sets the value of the losedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLosedate(Long value) {
        this.losedate = value;
    }

    /**
     * Gets the value of the goaldate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public String getGoaldate() {
        return goaldate;
    }

    /**
     * Sets the value of the goaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGoaldate(String value) {
        this.goaldate = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRate(Long value) {
        this.rate = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdatedAt(Long value) {
        this.updatedAt = value;
    }

}
