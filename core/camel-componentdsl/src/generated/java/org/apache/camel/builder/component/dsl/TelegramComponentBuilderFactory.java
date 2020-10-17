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
import org.apache.camel.component.telegram.TelegramComponent;

/**
 * Send and receive messages acting as a Telegram Bot Telegram Bot API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface TelegramComponentBuilderFactory {

    /**
     * Telegram (camel-telegram)
     * Send and receive messages acting as a Telegram Bot Telegram Bot API.
     * 
     * Category: cloud,api,chat
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-telegram
     */
    static TelegramComponentBuilder telegram() {
        return new TelegramComponentBuilderImpl();
    }

    /**
     * Builder for the Telegram component.
     */
    interface TelegramComponentBuilder
            extends
                ComponentBuilder<TelegramComponent> {
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
        default TelegramComponentBuilder bridgeErrorHandler(
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
        default TelegramComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Can be used to set an alternative base URI, e.g. when you want to
         * test the component against a mock Telegram API.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: https://api.telegram.org
         * Group: advanced
         */
        default TelegramComponentBuilder baseUri(java.lang.String baseUri) {
            doSetProperty("baseUri", baseUri);
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
        default TelegramComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom AsyncHttpClient.
         * 
         * The option is a: <code>org.asynchttpclient.AsyncHttpClient</code>
         * type.
         * 
         * Group: advanced
         */
        default TelegramComponentBuilder client(
                org.asynchttpclient.AsyncHttpClient client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To configure the AsyncHttpClient to use a custom
         * com.ning.http.client.AsyncHttpClientConfig instance.
         * 
         * The option is a:
         * <code>org.asynchttpclient.AsyncHttpClientConfig</code> type.
         * 
         * Group: advanced
         */
        default TelegramComponentBuilder clientConfig(
                org.asynchttpclient.AsyncHttpClientConfig clientConfig) {
            doSetProperty("clientConfig", clientConfig);
            return this;
        }
        /**
         * The default Telegram authorization token to be used when the
         * information is not provided in the endpoints.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default TelegramComponentBuilder authorizationToken(
                java.lang.String authorizationToken) {
            doSetProperty("authorizationToken", authorizationToken);
            return this;
        }
    }

    class TelegramComponentBuilderImpl
            extends
                AbstractComponentBuilder<TelegramComponent>
            implements
                TelegramComponentBuilder {
        @Override
        protected TelegramComponent buildConcreteComponent() {
            return new TelegramComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((TelegramComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((TelegramComponent) component).setLazyStartProducer((boolean) value); return true;
            case "baseUri": ((TelegramComponent) component).setBaseUri((java.lang.String) value); return true;
            case "basicPropertyBinding": ((TelegramComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "client": ((TelegramComponent) component).setClient((org.asynchttpclient.AsyncHttpClient) value); return true;
            case "clientConfig": ((TelegramComponent) component).setClientConfig((org.asynchttpclient.AsyncHttpClientConfig) value); return true;
            case "authorizationToken": ((TelegramComponent) component).setAuthorizationToken((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}