
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for userAdvDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userAdvDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="advTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateUp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="onemonth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seLLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seLLId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sixmonths" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="threemonths" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userAdvDetails", propOrder = {
    "advId",
    "advTitle",
    "agentAccount",
    "agentId",
    "dateUp",
    "expDate",
    "onemonth",
    "orderId",
    "seLLAccount",
    "seLLId",
    "sixmonths",
    "subTotal",
    "threemonths",
    "userId"
})
public class UserAdvDetails {

    protected Integer advId;
    protected String advTitle;
    protected String agentAccount;
    protected Integer agentId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected double onemonth;
    protected Integer orderId;
    protected String seLLAccount;
    protected Integer seLLId;
    protected double sixmonths;
    protected Double subTotal;
    protected double threemonths;
    protected Integer userId;

    /**
     * Gets the value of the advId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdvId() {
        return advId;
    }

    /**
     * Sets the value of the advId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdvId(Integer value) {
        this.advId = value;
    }

    /**
     * Gets the value of the advTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvTitle() {
        return advTitle;
    }

    /**
     * Sets the value of the advTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvTitle(String value) {
        this.advTitle = value;
    }

    /**
     * Gets the value of the agentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentAccount() {
        return agentAccount;
    }

    /**
     * Sets the value of the agentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentAccount(String value) {
        this.agentAccount = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgentId(Integer value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the dateUp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUp() {
        return dateUp;
    }

    /**
     * Sets the value of the dateUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUp(XMLGregorianCalendar value) {
        this.dateUp = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the onemonth property.
     * 
     */
    public double getOnemonth() {
        return onemonth;
    }

    /**
     * Sets the value of the onemonth property.
     * 
     */
    public void setOnemonth(double value) {
        this.onemonth = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the seLLAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeLLAccount() {
        return seLLAccount;
    }

    /**
     * Sets the value of the seLLAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeLLAccount(String value) {
        this.seLLAccount = value;
    }

    /**
     * Gets the value of the seLLId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeLLId() {
        return seLLId;
    }

    /**
     * Sets the value of the seLLId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeLLId(Integer value) {
        this.seLLId = value;
    }

    /**
     * Gets the value of the sixmonths property.
     * 
     */
    public double getSixmonths() {
        return sixmonths;
    }

    /**
     * Sets the value of the sixmonths property.
     * 
     */
    public void setSixmonths(double value) {
        this.sixmonths = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubTotal(Double value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the threemonths property.
     * 
     */
    public double getThreemonths() {
        return threemonths;
    }

    /**
     * Sets the value of the threemonths property.
     * 
     */
    public void setThreemonths(double value) {
        this.threemonths = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

}
