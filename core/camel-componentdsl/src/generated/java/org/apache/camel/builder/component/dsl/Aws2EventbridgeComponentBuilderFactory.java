/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.eventbridge.EventbridgeComponent;

/**
 * Manage AWS Eventbridge cluster instances using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2EventbridgeComponentBuilderFactory {

    /**
     * AWS 2 Eventbridge (camel-aws2-eventbridge)
     * Manage AWS Eventbridge cluster instances using AWS SDK version 2.x.
     * 
     * Category: cloud,management
     * Since: 3.6
     * Maven coordinates: org.apache.camel:camel-aws2-eventbridge
     */
    static Aws2EventbridgeComponentBuilder aws2Eventbridge() {
        return new Aws2EventbridgeComponentBuilderImpl();
    }

    /**
     * Builder for the AWS 2 Eventbridge component.
     */
    interface Aws2EventbridgeComponentBuilder
            extends
                ComponentBuilder<EventbridgeComponent> {
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Aws2EventbridgeComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration</code> type.
         * 
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder configuration(
                org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a existing configured AWS Eventbridge as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.eventbridge.EventBridgeClient</code> type.
         * 
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder eventbridgeClient(
                software.amazon.awssdk.services.eventbridge.EventBridgeClient eventbridgeClient) {
            doSetProperty("eventbridgeClient", eventbridgeClient);
            return this;
        }
        /**
         * EventPattern File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder eventPatternFile(
                java.lang.String eventPatternFile) {
            doSetProperty("eventPatternFile", eventPatternFile);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.eventbridge.EventbridgeOperations</code> type.
         * 
         * Default: putRule
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder operation(
                org.apache.camel.component.aws2.eventbridge.EventbridgeOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Eventbridge client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Eventbridge client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Eventbridge client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Eventbridge client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2EventbridgeComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        @Deprecated
        default Aws2EventbridgeComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2EventbridgeComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2EventbridgeComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2EventbridgeComponentBuilderImpl
            extends
                AbstractComponentBuilder<EventbridgeComponent>
            implements
                Aws2EventbridgeComponentBuilder {
        @Override
        protected EventbridgeComponent buildConcreteComponent() {
            return new EventbridgeComponent();
        }
        private org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws2.eventbridge.EventbridgeComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoDiscoverClient": getOrCreateConfiguration((EventbridgeComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "configuration": ((EventbridgeComponent) component).setConfiguration((org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration) value); return true;
            case "eventbridgeClient": getOrCreateConfiguration((EventbridgeComponent) component).setEventbridgeClient((software.amazon.awssdk.services.eventbridge.EventBridgeClient) value); return true;
            case "eventPatternFile": getOrCreateConfiguration((EventbridgeComponent) component).setEventPatternFile((java.lang.String) value); return true;
            case "lazyStartProducer": ((EventbridgeComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((EventbridgeComponent) component).setOperation((org.apache.camel.component.aws2.eventbridge.EventbridgeOperations) value); return true;
            case "pojoRequest": getOrCreateConfiguration((EventbridgeComponent) component).setPojoRequest((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((EventbridgeComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((EventbridgeComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((EventbridgeComponent) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((EventbridgeComponent) component).setRegion((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((EventbridgeComponent) component).setTrustAllCertificates((boolean) value); return true;
            case "basicPropertyBinding": ((EventbridgeComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((EventbridgeComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((EventbridgeComponent) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}