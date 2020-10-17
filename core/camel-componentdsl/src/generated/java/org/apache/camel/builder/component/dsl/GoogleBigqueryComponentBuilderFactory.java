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
import org.apache.camel.component.google.bigquery.GoogleBigQueryComponent;

/**
 * Google BigQuery data warehouse for analytics.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleBigqueryComponentBuilderFactory {

    /**
     * Google BigQuery (camel-google-bigquery)
     * Google BigQuery data warehouse for analytics.
     * 
     * Category: cloud,bigdata
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-google-bigquery
     */
    static GoogleBigqueryComponentBuilder googleBigquery() {
        return new GoogleBigqueryComponentBuilderImpl();
    }

    /**
     * Builder for the Google BigQuery component.
     */
    interface GoogleBigqueryComponentBuilder
            extends
                ComponentBuilder<GoogleBigQueryComponent> {
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If non
         * provided the default one will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory</code> type.
         * 
         * Group: producer
         */
        default GoogleBigqueryComponentBuilder connectionFactory(
                org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * BigQuery Dataset Id.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GoogleBigqueryComponentBuilder datasetId(
                java.lang.String datasetId) {
            doSetProperty("datasetId", datasetId);
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
        default GoogleBigqueryComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Google Cloud Project Id.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GoogleBigqueryComponentBuilder projectId(
                java.lang.String projectId) {
            doSetProperty("projectId", projectId);
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
        default GoogleBigqueryComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class GoogleBigqueryComponentBuilderImpl
            extends
                AbstractComponentBuilder<GoogleBigQueryComponent>
            implements
                GoogleBigqueryComponentBuilder {
        @Override
        protected GoogleBigQueryComponent buildConcreteComponent() {
            return new GoogleBigQueryComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "connectionFactory": ((GoogleBigQueryComponent) component).setConnectionFactory((org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory) value); return true;
            case "datasetId": ((GoogleBigQueryComponent) component).setDatasetId((java.lang.String) value); return true;
            case "lazyStartProducer": ((GoogleBigQueryComponent) component).setLazyStartProducer((boolean) value); return true;
            case "projectId": ((GoogleBigQueryComponent) component).setProjectId((java.lang.String) value); return true;
            case "basicPropertyBinding": ((GoogleBigQueryComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}