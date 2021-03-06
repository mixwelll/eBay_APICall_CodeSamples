//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReviseReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReviseReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ProStores"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReviseReasonCodeType")
@XmlEnum
public enum ReviseReasonCodeType {


    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						The Item is revised in prostores.
     * 					
     * 
     */
    @XmlEnumValue("ProStores")
    PRO_STORES("ProStores");
    private final String value;

    ReviseReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReviseReasonCodeType fromValue(String v) {
        for (ReviseReasonCodeType c: ReviseReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
