
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHelloWorld complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHelloWorld">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestData" type="{http://ws.mkyong.com/}requestData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHelloWorld", propOrder = {
    "requestData"
})
public class GetHelloWorld {

    protected RequestData requestData;

    /**
     * Gets the value of the requestData property.
     * 
     * @return
     *     possible object is
     *     {@link RequestData }
     *     
     */
    public RequestData getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestData }
     *     
     */
    public void setRequestData(RequestData value) {
        this.requestData = value;
    }

}
