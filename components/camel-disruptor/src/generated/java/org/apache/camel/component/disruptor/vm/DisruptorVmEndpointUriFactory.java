/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.disruptor.vm;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class DisruptorVmEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";
    private static final String[] SCHEMES = new String[]{"disruptor", "disruptor-vm"};

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(15);
        props.add("basicPropertyBinding");
        props.add("synchronous");
        props.add("exchangePattern");
        props.add("waitForTaskToComplete");
        props.add("blockWhenFull");
        props.add("concurrentConsumers");
        props.add("timeout");
        props.add("waitStrategy");
        props.add("producerType");
        props.add("lazyStartProducer");
        props.add("bridgeErrorHandler");
        props.add("size");
        props.add("name");
        props.add("exceptionHandler");
        props.add("multipleConsumers");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        for (String s : SCHEMES) {
            if (s.equals(scheme)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

