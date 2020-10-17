/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.sns;

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
public class SnsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topicNameOrArn";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(22);
        props.add("basicPropertyBinding");
        props.add("autoDiscoverClient");
        props.add("serverSideEncryptionEnabled");
        props.add("autoCreateTopic");
        props.add("proxyProtocol");
        props.add("secretKey");
        props.add("subject");
        props.add("synchronous");
        props.add("subscribeSNStoSQS");
        props.add("queueUrl");
        props.add("messageStructure");
        props.add("proxyHost");
        props.add("proxyPort");
        props.add("lazyStartProducer");
        props.add("headerFilterStrategy");
        props.add("accessKey");
        props.add("topicNameOrArn");
        props.add("amazonSQSClient");
        props.add("kmsMasterKeyId");
        props.add("region");
        props.add("amazonSNSClient");
        props.add("policy");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("secretKey");
        secretProps.add("accessKey");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws-sns".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topicNameOrArn", null, true, copy);
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

