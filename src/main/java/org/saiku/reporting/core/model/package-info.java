@XmlSchema(namespace = "saiku",  
    xmlns = {   
        @XmlNs(namespaceURI = "http://example.com/namespaces/bar", prefix = "bar"),  
        @XmlNs(namespaceURI = "urn:example.com:foo", prefix = "dynamic-prpt")  
    },  
    elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)  

package org.saiku.reporting.core.model;  
  
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;
