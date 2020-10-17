/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmlsecurity;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XmlVerifierEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("name", java.lang.String.class);
        map.put("baseUri", java.lang.String.class);
        map.put("clearHeaders", java.lang.Boolean.class);
        map.put("cryptoContextProperties", java.util.Map.class);
        map.put("disallowDoctypeDecl", java.lang.Boolean.class);
        map.put("keySelector", javax.xml.crypto.KeySelector.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("omitXmlDeclaration", java.lang.Boolean.class);
        map.put("outputNodeSearch", java.lang.Object.class);
        map.put("outputNodeSearchType", java.lang.String.class);
        map.put("outputXmlEncoding", java.lang.String.class);
        map.put("removeSignatureElements", java.lang.Boolean.class);
        map.put("schemaResourceUri", java.lang.String.class);
        map.put("secureValidation", java.lang.Boolean.class);
        map.put("validationFailedHandler", org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class);
        map.put("xmlSignature2Message", org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class);
        map.put("xmlSignatureChecker", org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("uriDereferencer", javax.xml.crypto.URIDereferencer.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XmlVerifierEndpoint target = (XmlVerifierEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "baseuri":
        case "baseUri": target.getConfiguration().setBaseUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clearheaders":
        case "clearHeaders": target.getConfiguration().setClearHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "cryptocontextproperties":
        case "cryptoContextProperties": target.getConfiguration().setCryptoContextProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": target.getConfiguration().setDisallowDoctypeDecl(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "keyselector":
        case "keySelector": target.getConfiguration().setKeySelector(property(camelContext, javax.xml.crypto.KeySelector.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "omitxmldeclaration":
        case "omitXmlDeclaration": target.getConfiguration().setOmitXmlDeclaration(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "outputnodesearch":
        case "outputNodeSearch": target.getConfiguration().setOutputNodeSearch(property(camelContext, java.lang.Object.class, value)); return true;
        case "outputnodesearchtype":
        case "outputNodeSearchType": target.getConfiguration().setOutputNodeSearchType(property(camelContext, java.lang.String.class, value)); return true;
        case "outputxmlencoding":
        case "outputXmlEncoding": target.getConfiguration().setOutputXmlEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "removesignatureelements":
        case "removeSignatureElements": target.getConfiguration().setRemoveSignatureElements(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "schemaresourceuri":
        case "schemaResourceUri": target.getConfiguration().setSchemaResourceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "securevalidation":
        case "secureValidation": target.getConfiguration().setSecureValidation(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "uridereferencer":
        case "uriDereferencer": target.getConfiguration().setUriDereferencer(property(camelContext, javax.xml.crypto.URIDereferencer.class, value)); return true;
        case "validationfailedhandler":
        case "validationFailedHandler": target.getConfiguration().setValidationFailedHandler(property(camelContext, org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class, value)); return true;
        case "xmlsignature2message":
        case "xmlSignature2Message": target.getConfiguration().setXmlSignature2Message(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class, value)); return true;
        case "xmlsignaturechecker":
        case "xmlSignatureChecker": target.getConfiguration().setXmlSignatureChecker(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XmlVerifierEndpoint target = (XmlVerifierEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "baseuri":
        case "baseUri": return target.getConfiguration().getBaseUri();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clearheaders":
        case "clearHeaders": return target.getConfiguration().getClearHeaders();
        case "cryptocontextproperties":
        case "cryptoContextProperties": return target.getConfiguration().getCryptoContextProperties();
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": return target.getConfiguration().getDisallowDoctypeDecl();
        case "keyselector":
        case "keySelector": return target.getConfiguration().getKeySelector();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "omitxmldeclaration":
        case "omitXmlDeclaration": return target.getConfiguration().getOmitXmlDeclaration();
        case "outputnodesearch":
        case "outputNodeSearch": return target.getConfiguration().getOutputNodeSearch();
        case "outputnodesearchtype":
        case "outputNodeSearchType": return target.getConfiguration().getOutputNodeSearchType();
        case "outputxmlencoding":
        case "outputXmlEncoding": return target.getConfiguration().getOutputXmlEncoding();
        case "removesignatureelements":
        case "removeSignatureElements": return target.getConfiguration().getRemoveSignatureElements();
        case "schemaresourceuri":
        case "schemaResourceUri": return target.getConfiguration().getSchemaResourceUri();
        case "securevalidation":
        case "secureValidation": return target.getConfiguration().getSecureValidation();
        case "synchronous": return target.isSynchronous();
        case "uridereferencer":
        case "uriDereferencer": return target.getConfiguration().getUriDereferencer();
        case "validationfailedhandler":
        case "validationFailedHandler": return target.getConfiguration().getValidationFailedHandler();
        case "xmlsignature2message":
        case "xmlSignature2Message": return target.getConfiguration().getXmlSignature2Message();
        case "xmlsignaturechecker":
        case "xmlSignatureChecker": return target.getConfiguration().getXmlSignatureChecker();
        default: return null;
        }
    }
}

