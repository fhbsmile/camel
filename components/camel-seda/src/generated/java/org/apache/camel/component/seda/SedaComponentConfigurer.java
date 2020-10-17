/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.seda;

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
public class SedaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bridgeErrorHandler", boolean.class);
        map.put("concurrentConsumers", int.class);
        map.put("defaultBlockWhenFull", boolean.class);
        map.put("defaultDiscardWhenFull", boolean.class);
        map.put("defaultOfferTimeout", long.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("defaultQueueFactory", org.apache.camel.component.seda.BlockingQueueFactory.class);
        map.put("queueSize", int.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SedaComponent target = (SedaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "defaultblockwhenfull":
        case "defaultBlockWhenFull": target.setDefaultBlockWhenFull(property(camelContext, boolean.class, value)); return true;
        case "defaultdiscardwhenfull":
        case "defaultDiscardWhenFull": target.setDefaultDiscardWhenFull(property(camelContext, boolean.class, value)); return true;
        case "defaultoffertimeout":
        case "defaultOfferTimeout": target.setDefaultOfferTimeout(property(camelContext, long.class, value)); return true;
        case "defaultqueuefactory":
        case "defaultQueueFactory": target.setDefaultQueueFactory(property(camelContext, org.apache.camel.component.seda.BlockingQueueFactory.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "queuesize":
        case "queueSize": target.setQueueSize(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SedaComponent target = (SedaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "defaultblockwhenfull":
        case "defaultBlockWhenFull": return target.isDefaultBlockWhenFull();
        case "defaultdiscardwhenfull":
        case "defaultDiscardWhenFull": return target.isDefaultDiscardWhenFull();
        case "defaultoffertimeout":
        case "defaultOfferTimeout": return target.getDefaultOfferTimeout();
        case "defaultqueuefactory":
        case "defaultQueueFactory": return target.getDefaultQueueFactory();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "queuesize":
        case "queueSize": return target.getQueueSize();
        default: return null;
        }
    }
}

