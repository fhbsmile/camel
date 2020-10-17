/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mustache;

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
public class MustacheComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("allowContextMapAll", boolean.class);
        map.put("allowTemplateFromHeader", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("mustacheFactory", com.github.mustachejava.MustacheFactory.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MustacheComponent target = (MustacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": target.setAllowContextMapAll(property(camelContext, boolean.class, value)); return true;
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": target.setAllowTemplateFromHeader(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mustachefactory":
        case "mustacheFactory": target.setMustacheFactory(property(camelContext, com.github.mustachejava.MustacheFactory.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MustacheComponent target = (MustacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return target.isAllowContextMapAll();
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return target.isAllowTemplateFromHeader();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mustachefactory":
        case "mustacheFactory": return target.getMustacheFactory();
        default: return null;
        }
    }
}

