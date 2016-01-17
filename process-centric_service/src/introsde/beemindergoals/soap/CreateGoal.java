
package introsde.beemindergoals.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="access_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goal_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goaldate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createGoal", propOrder = {
    "accessToken",
    "slug",
    "title",
    "goalType",
    "goaldate",
    "rate",
    "goalval",
    "initval"
})
public class CreateGoal {

    @XmlElement(name = "access_token")
    protected String accessToken;
    protected String slug;
    protected String title;
    @XmlElement(name = "goal_type")
    protected String goalType;
    protected String goaldate;
    protected String rate;
    protected String goalval;
    protected String initval;

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

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
     * Gets the value of the goaldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the goalval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalval() {
        return goalval;
    }

    /**
     * Sets the value of the goalval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalval(String value) {
        this.goalval = value;
    }

    /**
     * Gets the value of the initval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitval() {
        return initval;
    }

    /**
     * Sets the value of the initval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitval(String value) {
        this.initval = value;
    }

}
