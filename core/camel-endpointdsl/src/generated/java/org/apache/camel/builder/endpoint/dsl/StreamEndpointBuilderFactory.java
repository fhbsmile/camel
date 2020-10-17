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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Read from system-in and write to system-out and system-err streams.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StreamEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Stream component.
     */
    public interface StreamEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedStreamEndpointConsumerBuilder advanced() {
            return (AdvancedStreamEndpointConsumerBuilder) this;
        }
        /**
         * You can configure the encoding (is a charset name) to use text-based
         * streams (for example, message body is a String object). If not
         * provided, Camel uses the JVM default Charset.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StreamEndpointConsumerBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * When using the stream:file URI format, this option specifies the
         * filename to stream to/from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StreamEndpointConsumerBuilder fileName(String fileName) {
            doSetProperty("fileName", fileName);
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
        default StreamEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To use JVM file watcher to listen for file change events to support
         * re-loading files that may be overwritten, somewhat like tail --retry.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder fileWatcher(boolean fileWatcher) {
            doSetProperty("fileWatcher", fileWatcher);
            return this;
        }
        /**
         * To use JVM file watcher to listen for file change events to support
         * re-loading files that may be overwritten, somewhat like tail --retry.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder fileWatcher(String fileWatcher) {
            doSetProperty("fileWatcher", fileWatcher);
            return this;
        }
        /**
         * To group X number of lines in the consumer. For example to group 10
         * lines and therefore only spit out an Exchange with 10 lines, instead
         * of 1 Exchange per line.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder groupLines(int groupLines) {
            doSetProperty("groupLines", groupLines);
            return this;
        }
        /**
         * To group X number of lines in the consumer. For example to group 10
         * lines and therefore only spit out an Exchange with 10 lines, instead
         * of 1 Exchange per line.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder groupLines(String groupLines) {
            doSetProperty("groupLines", groupLines);
            return this;
        }
        /**
         * Allows to use a custom GroupStrategy to control how to group lines.
         * 
         * The option is a:
         * <code>org.apache.camel.component.stream.GroupStrategy</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder groupStrategy(Object groupStrategy) {
            doSetProperty("groupStrategy", groupStrategy);
            return this;
        }
        /**
         * Allows to use a custom GroupStrategy to control how to group lines.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.stream.GroupStrategy</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder groupStrategy(String groupStrategy) {
            doSetProperty("groupStrategy", groupStrategy);
            return this;
        }
        /**
         * Initial delay in milliseconds before showing the message prompt. This
         * delay occurs only once. Can be used during system startup to avoid
         * message prompts being written while other logging is done to the
         * system out.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 2000
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder initialPromptDelay(
                long initialPromptDelay) {
            doSetProperty("initialPromptDelay", initialPromptDelay);
            return this;
        }
        /**
         * Initial delay in milliseconds before showing the message prompt. This
         * delay occurs only once. Can be used during system startup to avoid
         * message prompts being written while other logging is done to the
         * system out.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 2000
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder initialPromptDelay(
                String initialPromptDelay) {
            doSetProperty("initialPromptDelay", initialPromptDelay);
            return this;
        }
        /**
         * Optional delay in milliseconds before showing the message prompt.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder promptDelay(long promptDelay) {
            doSetProperty("promptDelay", promptDelay);
            return this;
        }
        /**
         * Optional delay in milliseconds before showing the message prompt.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder promptDelay(String promptDelay) {
            doSetProperty("promptDelay", promptDelay);
            return this;
        }
        /**
         * Message prompt to use when reading from stream:in; for example, you
         * could set this to Enter a command:.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder promptMessage(String promptMessage) {
            doSetProperty("promptMessage", promptMessage);
            return this;
        }
        /**
         * Will retry opening the stream if it's overwritten, somewhat like tail
         * --retry If reading from files then you should also enable the
         * fileWatcher option, to make it work reliable.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder retry(boolean retry) {
            doSetProperty("retry", retry);
            return this;
        }
        /**
         * Will retry opening the stream if it's overwritten, somewhat like tail
         * --retry If reading from files then you should also enable the
         * fileWatcher option, to make it work reliable.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder retry(String retry) {
            doSetProperty("retry", retry);
            return this;
        }
        /**
         * To be used for continuously reading a stream such as the unix tail
         * command.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder scanStream(boolean scanStream) {
            doSetProperty("scanStream", scanStream);
            return this;
        }
        /**
         * To be used for continuously reading a stream such as the unix tail
         * command.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder scanStream(String scanStream) {
            doSetProperty("scanStream", scanStream);
            return this;
        }
        /**
         * Delay in milliseconds between read attempts when using scanStream.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder scanStreamDelay(
                long scanStreamDelay) {
            doSetProperty("scanStreamDelay", scanStreamDelay);
            return this;
        }
        /**
         * Delay in milliseconds between read attempts when using scanStream.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default StreamEndpointConsumerBuilder scanStreamDelay(
                String scanStreamDelay) {
            doSetProperty("scanStreamDelay", scanStreamDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Stream component.
     */
    public interface AdvancedStreamEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default StreamEndpointConsumerBuilder basic() {
            return (StreamEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedStreamEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedStreamEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedStreamEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedStreamEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
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
        default AdvancedStreamEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedStreamEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets the read timeout to a specified timeout, in milliseconds. A
         * non-zero value specifies the timeout when reading from Input stream
         * when a connection is established to a resource. If the timeout
         * expires before there is data available for read, a
         * java.net.SocketTimeoutException is raised. A timeout of zero is
         * interpreted as an infinite timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedStreamEndpointConsumerBuilder readTimeout(
                int readTimeout) {
            doSetProperty("readTimeout", readTimeout);
            return this;
        }
        /**
         * Sets the read timeout to a specified timeout, in milliseconds. A
         * non-zero value specifies the timeout when reading from Input stream
         * when a connection is established to a resource. If the timeout
         * expires before there is data available for read, a
         * java.net.SocketTimeoutException is raised. A timeout of zero is
         * interpreted as an infinite timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedStreamEndpointConsumerBuilder readTimeout(
                String readTimeout) {
            doSetProperty("readTimeout", readTimeout);
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
        default AdvancedStreamEndpointConsumerBuilder synchronous(
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
        default AdvancedStreamEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Stream component.
     */
    public interface StreamEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedStreamEndpointProducerBuilder advanced() {
            return (AdvancedStreamEndpointProducerBuilder) this;
        }
        /**
         * You can configure the encoding (is a charset name) to use text-based
         * streams (for example, message body is a String object). If not
         * provided, Camel uses the JVM default Charset.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StreamEndpointProducerBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * When using the stream:file URI format, this option specifies the
         * filename to stream to/from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StreamEndpointProducerBuilder fileName(String fileName) {
            doSetProperty("fileName", fileName);
            return this;
        }
        /**
         * Number of messages to process before closing stream on Producer side.
         * Never close stream by default (only when Producer is stopped). If
         * more messages are sent, the stream is reopened for another
         * autoCloseCount batch.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default StreamEndpointProducerBuilder autoCloseCount(int autoCloseCount) {
            doSetProperty("autoCloseCount", autoCloseCount);
            return this;
        }
        /**
         * Number of messages to process before closing stream on Producer side.
         * Never close stream by default (only when Producer is stopped). If
         * more messages are sent, the stream is reopened for another
         * autoCloseCount batch.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default StreamEndpointProducerBuilder autoCloseCount(
                String autoCloseCount) {
            doSetProperty("autoCloseCount", autoCloseCount);
            return this;
        }
        /**
         * This option is used in combination with Splitter and streaming to the
         * same file. The idea is to keep the stream open and only close when
         * the Splitter is done, to improve performance. Mind this requires that
         * you only stream to the same file, and not 2 or more files.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default StreamEndpointProducerBuilder closeOnDone(boolean closeOnDone) {
            doSetProperty("closeOnDone", closeOnDone);
            return this;
        }
        /**
         * This option is used in combination with Splitter and streaming to the
         * same file. The idea is to keep the stream open and only close when
         * the Splitter is done, to improve performance. Mind this requires that
         * you only stream to the same file, and not 2 or more files.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default StreamEndpointProducerBuilder closeOnDone(String closeOnDone) {
            doSetProperty("closeOnDone", closeOnDone);
            return this;
        }
        /**
         * Initial delay in milliseconds before producing the stream.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default StreamEndpointProducerBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Initial delay in milliseconds before producing the stream.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default StreamEndpointProducerBuilder delay(String delay) {
            doSetProperty("delay", delay);
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
        default StreamEndpointProducerBuilder lazyStartProducer(
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
        default StreamEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Stream component.
     */
    public interface AdvancedStreamEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default StreamEndpointProducerBuilder basic() {
            return (StreamEndpointProducerBuilder) this;
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
        default AdvancedStreamEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedStreamEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets the read timeout to a specified timeout, in milliseconds. A
         * non-zero value specifies the timeout when reading from Input stream
         * when a connection is established to a resource. If the timeout
         * expires before there is data available for read, a
         * java.net.SocketTimeoutException is raised. A timeout of zero is
         * interpreted as an infinite timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedStreamEndpointProducerBuilder readTimeout(
                int readTimeout) {
            doSetProperty("readTimeout", readTimeout);
            return this;
        }
        /**
         * Sets the read timeout to a specified timeout, in milliseconds. A
         * non-zero value specifies the timeout when reading from Input stream
         * when a connection is established to a resource. If the timeout
         * expires before there is data available for read, a
         * java.net.SocketTimeoutException is raised. A timeout of zero is
         * interpreted as an infinite timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedStreamEndpointProducerBuilder readTimeout(
                String readTimeout) {
            doSetProperty("readTimeout", readTimeout);
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
        default AdvancedStreamEndpointProducerBuilder synchronous(
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
        default AdvancedStreamEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Stream component.
     */
    public interface StreamEndpointBuilder
            extends
                StreamEndpointConsumerBuilder,
                StreamEndpointProducerBuilder {
        default AdvancedStreamEndpointBuilder advanced() {
            return (AdvancedStreamEndpointBuilder) this;
        }
        /**
         * You can configure the encoding (is a charset name) to use text-based
         * streams (for example, message body is a String object). If not
         * provided, Camel uses the JVM default Charset.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StreamEndpointBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * When using the stream:file URI format, this option specifies the
         * filename to stream to/from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default StreamEndpointBuilder fileName(String fileName) {
            doSetProperty("fileName", fileName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Stream component.
     */
    public interface AdvancedStreamEndpointBuilder
            extends
                AdvancedStreamEndpointConsumerBuilder,
                AdvancedStreamEndpointProducerBuilder {
        default StreamEndpointBuilder basic() {
            return (StreamEndpointBuilder) this;
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
        default AdvancedStreamEndpointBuilder basicPropertyBinding(
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
        default AdvancedStreamEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets the read timeout to a specified timeout, in milliseconds. A
         * non-zero value specifies the timeout when reading from Input stream
         * when a connection is established to a resource. If the timeout
         * expires before there is data available for read, a
         * java.net.SocketTimeoutException is raised. A timeout of zero is
         * interpreted as an infinite timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedStreamEndpointBuilder readTimeout(int readTimeout) {
            doSetProperty("readTimeout", readTimeout);
            return this;
        }
        /**
         * Sets the read timeout to a specified timeout, in milliseconds. A
         * non-zero value specifies the timeout when reading from Input stream
         * when a connection is established to a resource. If the timeout
         * expires before there is data available for read, a
         * java.net.SocketTimeoutException is raised. A timeout of zero is
         * interpreted as an infinite timeout.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedStreamEndpointBuilder readTimeout(String readTimeout) {
            doSetProperty("readTimeout", readTimeout);
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
        default AdvancedStreamEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedStreamEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface StreamBuilders {
        /**
         * Stream (camel-stream)
         * Read from system-in and write to system-out and system-err streams.
         * 
         * Category: file,system
         * Since: 1.3
         * Maven coordinates: org.apache.camel:camel-stream
         * 
         * Syntax: <code>stream:kind</code>
         * 
         * Path parameter: kind (required)
         * Kind of stream to use such as System.in or System.out.
         * There are 5 enums and the value can be one of: in, out, err, header,
         * file
         * 
         * @param path kind
         */
        default StreamEndpointBuilder stream(String path) {
            return StreamEndpointBuilderFactory.endpointBuilder("stream", path);
        }
        /**
         * Stream (camel-stream)
         * Read from system-in and write to system-out and system-err streams.
         * 
         * Category: file,system
         * Since: 1.3
         * Maven coordinates: org.apache.camel:camel-stream
         * 
         * Syntax: <code>stream:kind</code>
         * 
         * Path parameter: kind (required)
         * Kind of stream to use such as System.in or System.out.
         * There are 5 enums and the value can be one of: in, out, err, header,
         * file
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path kind
         */
        default StreamEndpointBuilder stream(String componentName, String path) {
            return StreamEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static StreamEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class StreamEndpointBuilderImpl extends AbstractEndpointBuilder implements StreamEndpointBuilder, AdvancedStreamEndpointBuilder {
            public StreamEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new StreamEndpointBuilderImpl(path);
    }
}