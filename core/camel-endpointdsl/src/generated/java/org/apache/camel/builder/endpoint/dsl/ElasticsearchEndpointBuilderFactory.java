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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send requests to with an ElasticSearch via REST API.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ElasticsearchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Elasticsearch Rest component.
     */
    public interface ElasticsearchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedElasticsearchEndpointBuilder advanced() {
            return (AdvancedElasticsearchEndpointBuilder) this;
        }
        /**
         * The time in ms to wait before connection will timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder connectionTimeout(
                int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * The time in ms to wait before connection will timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder connectionTimeout(
                String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Disconnect after it finish calling the producer.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder disconnect(boolean disconnect) {
            doSetProperty("disconnect", disconnect);
            return this;
        }
        /**
         * Disconnect after it finish calling the producer.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder disconnect(String disconnect) {
            doSetProperty("disconnect", disconnect);
            return this;
        }
        /**
         * Enable automatically discover nodes from a running Elasticsearch
         * cluster.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder enableSniffer(boolean enableSniffer) {
            doSetProperty("enableSniffer", enableSniffer);
            return this;
        }
        /**
         * Enable automatically discover nodes from a running Elasticsearch
         * cluster.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder enableSniffer(String enableSniffer) {
            doSetProperty("enableSniffer", enableSniffer);
            return this;
        }
        /**
         * Enable SSL.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder enableSSL(boolean enableSSL) {
            doSetProperty("enableSSL", enableSSL);
            return this;
        }
        /**
         * Enable SSL.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder enableSSL(String enableSSL) {
            doSetProperty("enableSSL", enableSSL);
            return this;
        }
        /**
         * Starting index of the response.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default ElasticsearchEndpointBuilder from(Integer from) {
            doSetProperty("from", from);
            return this;
        }
        /**
         * Starting index of the response.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default ElasticsearchEndpointBuilder from(String from) {
            doSetProperty("from", from);
            return this;
        }
        /**
         * Comma separated list with ip:port formatted remote transport
         * addresses to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default ElasticsearchEndpointBuilder hostAddresses(String hostAddresses) {
            doSetProperty("hostAddresses", hostAddresses);
            return this;
        }
        /**
         * The name of the index to act against.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ElasticsearchEndpointBuilder indexName(String indexName) {
            doSetProperty("indexName", indexName);
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
        default ElasticsearchEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The time in ms before retry.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder maxRetryTimeout(int maxRetryTimeout) {
            doSetProperty("maxRetryTimeout", maxRetryTimeout);
            return this;
        }
        /**
         * The time in ms before retry.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder maxRetryTimeout(
                String maxRetryTimeout) {
            doSetProperty("maxRetryTimeout", maxRetryTimeout);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> type.
         * 
         * Group: producer
         */
        default ElasticsearchEndpointBuilder operation(
                ElasticsearchOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> type.
         * 
         * Group: producer
         */
        default ElasticsearchEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Time in ms during which elasticsearch will keep search context alive.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder scrollKeepAliveMs(
                int scrollKeepAliveMs) {
            doSetProperty("scrollKeepAliveMs", scrollKeepAliveMs);
            return this;
        }
        /**
         * Time in ms during which elasticsearch will keep search context alive.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 60000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder scrollKeepAliveMs(
                String scrollKeepAliveMs) {
            doSetProperty("scrollKeepAliveMs", scrollKeepAliveMs);
            return this;
        }
        /**
         * Size of the response.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default ElasticsearchEndpointBuilder size(Integer size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * Size of the response.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default ElasticsearchEndpointBuilder size(String size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * The delay of a sniff execution scheduled after a failure (in
         * milliseconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder sniffAfterFailureDelay(
                int sniffAfterFailureDelay) {
            doSetProperty("sniffAfterFailureDelay", sniffAfterFailureDelay);
            return this;
        }
        /**
         * The delay of a sniff execution scheduled after a failure (in
         * milliseconds).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 60000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder sniffAfterFailureDelay(
                String sniffAfterFailureDelay) {
            doSetProperty("sniffAfterFailureDelay", sniffAfterFailureDelay);
            return this;
        }
        /**
         * The interval between consecutive ordinary sniff executions in
         * milliseconds. Will be honoured when sniffOnFailure is disabled or
         * when there are no failures between consecutive sniff executions.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder snifferInterval(int snifferInterval) {
            doSetProperty("snifferInterval", snifferInterval);
            return this;
        }
        /**
         * The interval between consecutive ordinary sniff executions in
         * milliseconds. Will be honoured when sniffOnFailure is disabled or
         * when there are no failures between consecutive sniff executions.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 300000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder snifferInterval(
                String snifferInterval) {
            doSetProperty("snifferInterval", snifferInterval);
            return this;
        }
        /**
         * The timeout in ms to wait before the socket will timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder socketTimeout(int socketTimeout) {
            doSetProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * The timeout in ms to wait before the socket will timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 30000
         * Group: producer
         */
        default ElasticsearchEndpointBuilder socketTimeout(String socketTimeout) {
            doSetProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * Enable scroll usage.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder useScroll(boolean useScroll) {
            doSetProperty("useScroll", useScroll);
            return this;
        }
        /**
         * Enable scroll usage.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ElasticsearchEndpointBuilder useScroll(String useScroll) {
            doSetProperty("useScroll", useScroll);
            return this;
        }
        /**
         * Index creation waits for the write consistency number of shards to be
         * available.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: producer
         */
        default ElasticsearchEndpointBuilder waitForActiveShards(
                int waitForActiveShards) {
            doSetProperty("waitForActiveShards", waitForActiveShards);
            return this;
        }
        /**
         * Index creation waits for the write consistency number of shards to be
         * available.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1
         * Group: producer
         */
        default ElasticsearchEndpointBuilder waitForActiveShards(
                String waitForActiveShards) {
            doSetProperty("waitForActiveShards", waitForActiveShards);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Elasticsearch Rest component.
     */
    public interface AdvancedElasticsearchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ElasticsearchEndpointBuilder basic() {
            return (ElasticsearchEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedElasticsearchEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedElasticsearchEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedElasticsearchEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedElasticsearchEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> enum.
     */
    enum ElasticsearchOperation {
        Index,
        Update,
        Bulk,
        BulkIndex,
        GetById,
        MultiGet,
        MultiSearch,
        Delete,
        DeleteIndex,
        Search,
        Exists,
        Ping;
    }

    public interface ElasticsearchBuilders {
        /**
         * Elasticsearch Rest (camel-elasticsearch-rest)
         * Send requests to with an ElasticSearch via REST API.
         * 
         * Category: search,monitoring
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-elasticsearch-rest
         * 
         * Syntax: <code>elasticsearch-rest:clusterName</code>
         * 
         * Path parameter: clusterName (required)
         * Name of the cluster
         * 
         * @param path clusterName
         */
        default ElasticsearchEndpointBuilder elasticsearchRest(String path) {
            return ElasticsearchEndpointBuilderFactory.endpointBuilder("elasticsearch-rest", path);
        }
        /**
         * Elasticsearch Rest (camel-elasticsearch-rest)
         * Send requests to with an ElasticSearch via REST API.
         * 
         * Category: search,monitoring
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-elasticsearch-rest
         * 
         * Syntax: <code>elasticsearch-rest:clusterName</code>
         * 
         * Path parameter: clusterName (required)
         * Name of the cluster
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path clusterName
         */
        default ElasticsearchEndpointBuilder elasticsearchRest(
                String componentName,
                String path) {
            return ElasticsearchEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ElasticsearchEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ElasticsearchEndpointBuilderImpl extends AbstractEndpointBuilder implements ElasticsearchEndpointBuilder, AdvancedElasticsearchEndpointBuilder {
            public ElasticsearchEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ElasticsearchEndpointBuilderImpl(path);
    }
}