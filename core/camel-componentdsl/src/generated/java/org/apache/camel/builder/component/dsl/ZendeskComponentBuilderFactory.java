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
import org.apache.camel.component.zendesk.ZendeskComponent;

/**
 * Manage Zendesk tickets, users, organizations, etc.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ZendeskComponentBuilderFactory {

    /**
     * Zendesk (camel-zendesk)
     * Manage Zendesk tickets, users, organizations, etc.
     * 
     * Category: cloud,api,support
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-zendesk
     */
    static ZendeskComponentBuilder zendesk() {
        return new ZendeskComponentBuilderImpl();
    }

    /**
     * Builder for the Zendesk component.
     */
    interface ZendeskComponentBuilder
            extends
                ComponentBuilder<ZendeskComponent> {
        /**
         * The server URL to connect.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default ZendeskComponentBuilder serverUrl(java.lang.String serverUrl) {
            doSetProperty("serverUrl", serverUrl);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ZendeskComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default ZendeskComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default ZendeskComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.zendesk.ZendeskConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default ZendeskComponentBuilder configuration(
                org.apache.camel.component.zendesk.ZendeskConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a shared Zendesk instance.
         * 
         * The option is a: <code>org.zendesk.client.v2.Zendesk</code> type.
         * 
         * Group: advanced
         */
        default ZendeskComponentBuilder zendesk(
                org.zendesk.client.v2.Zendesk zendesk) {
            doSetProperty("zendesk", zendesk);
            return this;
        }
        /**
         * The OAuth token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ZendeskComponentBuilder oauthToken(java.lang.String oauthToken) {
            doSetProperty("oauthToken", oauthToken);
            return this;
        }
        /**
         * The password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ZendeskComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The security token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ZendeskComponentBuilder token(java.lang.String token) {
            doSetProperty("token", token);
            return this;
        }
        /**
         * The user name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ZendeskComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class ZendeskComponentBuilderImpl
            extends
                AbstractComponentBuilder<ZendeskComponent>
            implements
                ZendeskComponentBuilder {
        @Override
        protected ZendeskComponent buildConcreteComponent() {
            return new ZendeskComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "serverUrl": ((ZendeskComponent) component).setServerUrl((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((ZendeskComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((ZendeskComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((ZendeskComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((ZendeskComponent) component).setConfiguration((org.apache.camel.component.zendesk.ZendeskConfiguration) value); return true;
            case "zendesk": ((ZendeskComponent) component).setZendesk((org.zendesk.client.v2.Zendesk) value); return true;
            case "oauthToken": ((ZendeskComponent) component).setOauthToken((java.lang.String) value); return true;
            case "password": ((ZendeskComponent) component).setPassword((java.lang.String) value); return true;
            case "token": ((ZendeskComponent) component).setToken((java.lang.String) value); return true;
            case "username": ((ZendeskComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}