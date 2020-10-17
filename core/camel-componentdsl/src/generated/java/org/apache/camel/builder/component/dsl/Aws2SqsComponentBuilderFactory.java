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
import org.apache.camel.component.aws2.sqs.Sqs2Component;

/**
 * Sending and receive messages to/from AWS SQS service using AWS SDK version
 * 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2SqsComponentBuilderFactory {

    /**
     * AWS 2 Simple Queue Service (SQS) (camel-aws2-sqs)
     * Sending and receive messages to/from AWS SQS service using AWS SDK
     * version 2.x.
     * 
     * Category: cloud,messaging
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-sqs
     */
    static Aws2SqsComponentBuilder aws2Sqs() {
        return new Aws2SqsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS 2 Simple Queue Service (SQS) component.
     */
    interface Aws2SqsComponentBuilder extends ComponentBuilder<Sqs2Component> {
        /**
         * The hostname of the Amazon AWS cloud.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: amazonaws.com
         * Group: common
         */
        default Aws2SqsComponentBuilder amazonAWSHost(
                java.lang.String amazonAWSHost) {
            doSetProperty("amazonAWSHost", amazonAWSHost);
            return this;
        }
        /**
         * To use the AmazonSQS as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.sqs.SqsClient</code> type.
         * 
         * Group: common
         */
        default Aws2SqsComponentBuilder amazonSQSClient(
                software.amazon.awssdk.services.sqs.SqsClient amazonSQSClient) {
            doSetProperty("amazonSQSClient", amazonSQSClient);
            return this;
        }
        /**
         * Setting the autocreation of the queue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Aws2SqsComponentBuilder autoCreateQueue(boolean autoCreateQueue) {
            doSetProperty("autoCreateQueue", autoCreateQueue);
            return this;
        }
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
        default Aws2SqsComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * The AWS SQS default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.sqs.Sqs2Configuration</code>
         * type.
         * 
         * Group: common
         */
        default Aws2SqsComponentBuilder configuration(
                org.apache.camel.component.aws2.sqs.Sqs2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The underlying protocol used to communicate with SQS.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: https
         * Group: common
         */
        default Aws2SqsComponentBuilder protocol(java.lang.String protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SQS client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: common
         */
        default Aws2SqsComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Specify the queue owner aws account id when you need to connect the
         * queue with different account owner.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default Aws2SqsComponentBuilder queueOwnerAWSAccountId(
                java.lang.String queueOwnerAWSAccountId) {
            doSetProperty("queueOwnerAWSAccountId", queueOwnerAWSAccountId);
            return this;
        }
        /**
         * The region in which SQS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default Aws2SqsComponentBuilder region(java.lang.String region) {
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
         * Group: common
         */
        default Aws2SqsComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * A list of attribute names to receive when consuming. Multiple names
         * can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2SqsComponentBuilder attributeNames(
                java.lang.String attributeNames) {
            doSetProperty("attributeNames", attributeNames);
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
        default Aws2SqsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows you to use multiple threads to poll the sqs queue to increase
         * throughput.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default Aws2SqsComponentBuilder concurrentConsumers(
                int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The default visibility timeout (in seconds).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default Aws2SqsComponentBuilder defaultVisibilityTimeout(
                java.lang.Integer defaultVisibilityTimeout) {
            doSetProperty("defaultVisibilityTimeout", defaultVisibilityTimeout);
            return this;
        }
        /**
         * Delete message from SQS after it has been read.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default Aws2SqsComponentBuilder deleteAfterRead(boolean deleteAfterRead) {
            doSetProperty("deleteAfterRead", deleteAfterRead);
            return this;
        }
        /**
         * Whether or not to send the DeleteMessage to the SQS queue if an
         * exchange fails to get through a filter. If 'false' and exchange does
         * not make it through a Camel filter upstream in the route, then don't
         * send DeleteMessage.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default Aws2SqsComponentBuilder deleteIfFiltered(
                boolean deleteIfFiltered) {
            doSetProperty("deleteIfFiltered", deleteIfFiltered);
            return this;
        }
        /**
         * If enabled then a scheduled background task will keep extending the
         * message visibility on SQS. This is needed if it takes a long time to
         * process the message. If set to true defaultVisibilityTimeout must be
         * set. See details at Amazon docs.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default Aws2SqsComponentBuilder extendMessageVisibility(
                boolean extendMessageVisibility) {
            doSetProperty("extendMessageVisibility", extendMessageVisibility);
            return this;
        }
        /**
         * The length of time, in seconds, for which Amazon SQS can reuse a data
         * key to encrypt or decrypt messages before calling AWS KMS again. An
         * integer representing seconds, between 60 seconds (1 minute) and
         * 86,400 seconds (24 hours). Default: 300 (5 minutes).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default Aws2SqsComponentBuilder kmsDataKeyReusePeriodSeconds(
                java.lang.Integer kmsDataKeyReusePeriodSeconds) {
            doSetProperty("kmsDataKeyReusePeriodSeconds", kmsDataKeyReusePeriodSeconds);
            return this;
        }
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or
         * a custom CMK.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2SqsComponentBuilder kmsMasterKeyId(
                java.lang.String kmsMasterKeyId) {
            doSetProperty("kmsMasterKeyId", kmsMasterKeyId);
            return this;
        }
        /**
         * A list of message attribute names to receive when consuming. Multiple
         * names can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2SqsComponentBuilder messageAttributeNames(
                java.lang.String messageAttributeNames) {
            doSetProperty("messageAttributeNames", messageAttributeNames);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the queue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default Aws2SqsComponentBuilder serverSideEncryptionEnabled(
                boolean serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * The duration (in seconds) that the received messages are hidden from
         * subsequent retrieve requests after being retrieved by a
         * ReceiveMessage request to set in the
         * com.amazonaws.services.sqs.model.SetQueueAttributesRequest. This only
         * make sense if its different from defaultVisibilityTimeout. It changes
         * the queue visibility timeout attribute permanently.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default Aws2SqsComponentBuilder visibilityTimeout(
                java.lang.Integer visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * Duration in seconds (0 to 20) that the ReceiveMessage action call
         * will wait until a message is in the queue to include in the response.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default Aws2SqsComponentBuilder waitTimeSeconds(
                java.lang.Integer waitTimeSeconds) {
            doSetProperty("waitTimeSeconds", waitTimeSeconds);
            return this;
        }
        /**
         * Delay sending messages for a number of seconds.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Aws2SqsComponentBuilder delaySeconds(
                java.lang.Integer delaySeconds) {
            doSetProperty("delaySeconds", delaySeconds);
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
        default Aws2SqsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Only for FIFO queues. Strategy for setting the messageDeduplicationId
         * on the message. Can be one of the following options: useExchangeId,
         * useContentBasedDeduplication. For the useContentBasedDeduplication
         * option, no messageDeduplicationId will be set on the message.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: useExchangeId
         * Group: producer
         */
        default Aws2SqsComponentBuilder messageDeduplicationIdStrategy(
                java.lang.String messageDeduplicationIdStrategy) {
            doSetProperty("messageDeduplicationIdStrategy", messageDeduplicationIdStrategy);
            return this;
        }
        /**
         * Only for FIFO queues. Strategy for setting the messageGroupId on the
         * message. Can be one of the following options: useConstant,
         * useExchangeId, usePropertyValue. For the usePropertyValue option, the
         * value of property CamelAwsMessageGroupId will be used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2SqsComponentBuilder messageGroupIdStrategy(
                java.lang.String messageGroupIdStrategy) {
            doSetProperty("messageGroupIdStrategy", messageGroupIdStrategy);
            return this;
        }
        /**
         * The operation to do in case the user don't want to send only a
         * message.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.sqs.Sqs2Operations</code> type.
         * 
         * Group: producer
         */
        default Aws2SqsComponentBuilder operation(
                org.apache.camel.component.aws2.sqs.Sqs2Operations operation) {
            doSetProperty("operation", operation);
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
        default Aws2SqsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define if you want to apply delaySeconds option to the queue or on
         * single messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default Aws2SqsComponentBuilder delayQueue(boolean delayQueue) {
            doSetProperty("delayQueue", delayQueue);
            return this;
        }
        /**
         * To define the queueUrl explicitly. All other parameters, which would
         * influence the queueUrl, are ignored. This parameter is intended to be
         * used, to connect to a mock implementation of SQS, for testing
         * purposes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default Aws2SqsComponentBuilder queueUrl(java.lang.String queueUrl) {
            doSetProperty("queueUrl", queueUrl);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SQS client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default Aws2SqsComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SQS client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default Aws2SqsComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The maximumMessageSize (in bytes) an SQS message can contain for this
         * queue.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: queue
         */
        default Aws2SqsComponentBuilder maximumMessageSize(
                java.lang.Integer maximumMessageSize) {
            doSetProperty("maximumMessageSize", maximumMessageSize);
            return this;
        }
        /**
         * The messageRetentionPeriod (in seconds) a message will be retained by
         * SQS for this queue.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: queue
         */
        default Aws2SqsComponentBuilder messageRetentionPeriod(
                java.lang.Integer messageRetentionPeriod) {
            doSetProperty("messageRetentionPeriod", messageRetentionPeriod);
            return this;
        }
        /**
         * The policy for this queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: queue
         */
        default Aws2SqsComponentBuilder policy(java.lang.String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * If you do not specify WaitTimeSeconds in the request, the queue
         * attribute ReceiveMessageWaitTimeSeconds is used to determine how long
         * to wait.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: queue
         */
        default Aws2SqsComponentBuilder receiveMessageWaitTimeSeconds(
                java.lang.Integer receiveMessageWaitTimeSeconds) {
            doSetProperty("receiveMessageWaitTimeSeconds", receiveMessageWaitTimeSeconds);
            return this;
        }
        /**
         * Specify the policy that send message to DeadLetter queue. See detail
         * at Amazon docs.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: queue
         */
        default Aws2SqsComponentBuilder redrivePolicy(
                java.lang.String redrivePolicy) {
            doSetProperty("redrivePolicy", redrivePolicy);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2SqsComponentBuilder accessKey(java.lang.String accessKey) {
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
        default Aws2SqsComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2SqsComponentBuilderImpl
            extends
                AbstractComponentBuilder<Sqs2Component>
            implements
                Aws2SqsComponentBuilder {
        @Override
        protected Sqs2Component buildConcreteComponent() {
            return new Sqs2Component();
        }
        private org.apache.camel.component.aws2.sqs.Sqs2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.sqs.Sqs2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.sqs.Sqs2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonAWSHost": getOrCreateConfiguration((Sqs2Component) component).setAmazonAWSHost((java.lang.String) value); return true;
            case "amazonSQSClient": getOrCreateConfiguration((Sqs2Component) component).setAmazonSQSClient((software.amazon.awssdk.services.sqs.SqsClient) value); return true;
            case "autoCreateQueue": getOrCreateConfiguration((Sqs2Component) component).setAutoCreateQueue((boolean) value); return true;
            case "autoDiscoverClient": getOrCreateConfiguration((Sqs2Component) component).setAutoDiscoverClient((boolean) value); return true;
            case "configuration": ((Sqs2Component) component).setConfiguration((org.apache.camel.component.aws2.sqs.Sqs2Configuration) value); return true;
            case "protocol": getOrCreateConfiguration((Sqs2Component) component).setProtocol((java.lang.String) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Sqs2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "queueOwnerAWSAccountId": getOrCreateConfiguration((Sqs2Component) component).setQueueOwnerAWSAccountId((java.lang.String) value); return true;
            case "region": getOrCreateConfiguration((Sqs2Component) component).setRegion((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((Sqs2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "attributeNames": getOrCreateConfiguration((Sqs2Component) component).setAttributeNames((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((Sqs2Component) component).setBridgeErrorHandler((boolean) value); return true;
            case "concurrentConsumers": getOrCreateConfiguration((Sqs2Component) component).setConcurrentConsumers((int) value); return true;
            case "defaultVisibilityTimeout": getOrCreateConfiguration((Sqs2Component) component).setDefaultVisibilityTimeout((java.lang.Integer) value); return true;
            case "deleteAfterRead": getOrCreateConfiguration((Sqs2Component) component).setDeleteAfterRead((boolean) value); return true;
            case "deleteIfFiltered": getOrCreateConfiguration((Sqs2Component) component).setDeleteIfFiltered((boolean) value); return true;
            case "extendMessageVisibility": getOrCreateConfiguration((Sqs2Component) component).setExtendMessageVisibility((boolean) value); return true;
            case "kmsDataKeyReusePeriodSeconds": getOrCreateConfiguration((Sqs2Component) component).setKmsDataKeyReusePeriodSeconds((java.lang.Integer) value); return true;
            case "kmsMasterKeyId": getOrCreateConfiguration((Sqs2Component) component).setKmsMasterKeyId((java.lang.String) value); return true;
            case "messageAttributeNames": getOrCreateConfiguration((Sqs2Component) component).setMessageAttributeNames((java.lang.String) value); return true;
            case "serverSideEncryptionEnabled": getOrCreateConfiguration((Sqs2Component) component).setServerSideEncryptionEnabled((boolean) value); return true;
            case "visibilityTimeout": getOrCreateConfiguration((Sqs2Component) component).setVisibilityTimeout((java.lang.Integer) value); return true;
            case "waitTimeSeconds": getOrCreateConfiguration((Sqs2Component) component).setWaitTimeSeconds((java.lang.Integer) value); return true;
            case "delaySeconds": getOrCreateConfiguration((Sqs2Component) component).setDelaySeconds((java.lang.Integer) value); return true;
            case "lazyStartProducer": ((Sqs2Component) component).setLazyStartProducer((boolean) value); return true;
            case "messageDeduplicationIdStrategy": getOrCreateConfiguration((Sqs2Component) component).setMessageDeduplicationIdStrategy((java.lang.String) value); return true;
            case "messageGroupIdStrategy": getOrCreateConfiguration((Sqs2Component) component).setMessageGroupIdStrategy((java.lang.String) value); return true;
            case "operation": getOrCreateConfiguration((Sqs2Component) component).setOperation((org.apache.camel.component.aws2.sqs.Sqs2Operations) value); return true;
            case "basicPropertyBinding": ((Sqs2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "delayQueue": getOrCreateConfiguration((Sqs2Component) component).setDelayQueue((boolean) value); return true;
            case "queueUrl": getOrCreateConfiguration((Sqs2Component) component).setQueueUrl((java.lang.String) value); return true;
            case "proxyHost": getOrCreateConfiguration((Sqs2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Sqs2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "maximumMessageSize": getOrCreateConfiguration((Sqs2Component) component).setMaximumMessageSize((java.lang.Integer) value); return true;
            case "messageRetentionPeriod": getOrCreateConfiguration((Sqs2Component) component).setMessageRetentionPeriod((java.lang.Integer) value); return true;
            case "policy": getOrCreateConfiguration((Sqs2Component) component).setPolicy((java.lang.String) value); return true;
            case "receiveMessageWaitTimeSeconds": getOrCreateConfiguration((Sqs2Component) component).setReceiveMessageWaitTimeSeconds((java.lang.Integer) value); return true;
            case "redrivePolicy": getOrCreateConfiguration((Sqs2Component) component).setRedrivePolicy((java.lang.String) value); return true;
            case "accessKey": getOrCreateConfiguration((Sqs2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Sqs2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}