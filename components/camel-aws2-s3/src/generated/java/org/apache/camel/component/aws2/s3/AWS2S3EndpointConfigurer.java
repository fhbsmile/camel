/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.s3;

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
public class AWS2S3EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bucketNameOrArn", java.lang.String.class);
        map.put("amazonS3Client", software.amazon.awssdk.services.s3.S3Client.class);
        map.put("autoCreateBucket", boolean.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("overrideEndpoint", boolean.class);
        map.put("pojoRequest", boolean.class);
        map.put("policy", java.lang.String.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("region", java.lang.String.class);
        map.put("trustAllCertificates", boolean.class);
        map.put("uriEndpointOverride", java.lang.String.class);
        map.put("useIAMCredentials", boolean.class);
        map.put("customerAlgorithm", java.lang.String.class);
        map.put("customerKeyId", java.lang.String.class);
        map.put("customerKeyMD5", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("deleteAfterRead", boolean.class);
        map.put("delimiter", java.lang.String.class);
        map.put("destinationBucket", java.lang.String.class);
        map.put("destinationBucketPrefix", java.lang.String.class);
        map.put("destinationBucketSuffix", java.lang.String.class);
        map.put("fileName", java.lang.String.class);
        map.put("includeBody", boolean.class);
        map.put("includeFolders", boolean.class);
        map.put("maxConnections", int.class);
        map.put("maxMessagesPerPoll", int.class);
        map.put("moveAfterRead", boolean.class);
        map.put("prefix", java.lang.String.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("autocloseBody", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        map.put("deleteAfterWrite", boolean.class);
        map.put("keyName", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("multiPartUpload", boolean.class);
        map.put("operation", org.apache.camel.component.aws2.s3.AWS2S3Operations.class);
        map.put("partSize", long.class);
        map.put("storageClass", java.lang.String.class);
        map.put("awsKMSKeyId", java.lang.String.class);
        map.put("useAwsKMS", boolean.class);
        map.put("useCustomerKey", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("backoffErrorThreshold", int.class);
        map.put("backoffIdleThreshold", int.class);
        map.put("backoffMultiplier", int.class);
        map.put("delay", long.class);
        map.put("greedy", boolean.class);
        map.put("initialDelay", long.class);
        map.put("repeatCount", long.class);
        map.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("scheduler", java.lang.Object.class);
        map.put("schedulerProperties", java.util.Map.class);
        map.put("startScheduler", boolean.class);
        map.put("timeUnit", java.util.concurrent.TimeUnit.class);
        map.put("useFixedDelay", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AWS2S3Endpoint target = (AWS2S3Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazons3client":
        case "amazonS3Client": target.getConfiguration().setAmazonS3Client(property(camelContext, software.amazon.awssdk.services.s3.S3Client.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": target.getConfiguration().setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": target.getConfiguration().setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "autoclosebody":
        case "autocloseBody": target.getConfiguration().setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "awskmskeyid":
        case "awsKMSKeyId": target.getConfiguration().setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "customeralgorithm":
        case "customerAlgorithm": target.getConfiguration().setCustomerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "customerkeyid":
        case "customerKeyId": target.getConfiguration().setCustomerKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "customerkeymd5":
        case "customerKeyMD5": target.getConfiguration().setCustomerKeyMD5(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": target.getConfiguration().setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": target.getConfiguration().setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucket":
        case "destinationBucket": target.getConfiguration().setDestinationBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucketprefix":
        case "destinationBucketPrefix": target.getConfiguration().setDestinationBucketPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucketsuffix":
        case "destinationBucketSuffix": target.getConfiguration().setDestinationBucketSuffix(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filename":
        case "fileName": target.getConfiguration().setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "includebody":
        case "includeBody": target.getConfiguration().setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "includefolders":
        case "includeFolders": target.getConfiguration().setIncludeFolders(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "keyname":
        case "keyName": target.getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxconnections":
        case "maxConnections": target.setMaxConnections(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "moveafterread":
        case "moveAfterRead": target.getConfiguration().setMoveAfterRead(property(camelContext, boolean.class, value)); return true;
        case "multipartupload":
        case "multiPartUpload": target.getConfiguration().setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.s3.AWS2S3Operations.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": target.getConfiguration().setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "partsize":
        case "partSize": target.getConfiguration().setPartSize(property(camelContext, long.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": target.getConfiguration().setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "storageclass":
        case "storageClass": target.getConfiguration().setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": target.getConfiguration().setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": target.getConfiguration().setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "useawskms":
        case "useAwsKMS": target.getConfiguration().setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "usecustomerkey":
        case "useCustomerKey": target.getConfiguration().setUseCustomerKey(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useiamcredentials":
        case "useIAMCredentials": target.getConfiguration().setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AWS2S3Endpoint target = (AWS2S3Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazons3client":
        case "amazonS3Client": return target.getConfiguration().getAmazonS3Client();
        case "autocreatebucket":
        case "autoCreateBucket": return target.getConfiguration().isAutoCreateBucket();
        case "autodiscoverclient":
        case "autoDiscoverClient": return target.getConfiguration().isAutoDiscoverClient();
        case "autoclosebody":
        case "autocloseBody": return target.getConfiguration().isAutocloseBody();
        case "awskmskeyid":
        case "awsKMSKeyId": return target.getConfiguration().getAwsKMSKeyId();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "customeralgorithm":
        case "customerAlgorithm": return target.getConfiguration().getCustomerAlgorithm();
        case "customerkeyid":
        case "customerKeyId": return target.getConfiguration().getCustomerKeyId();
        case "customerkeymd5":
        case "customerKeyMD5": return target.getConfiguration().getCustomerKeyMD5();
        case "delay": return target.getDelay();
        case "deleteafterread":
        case "deleteAfterRead": return target.getConfiguration().isDeleteAfterRead();
        case "deleteafterwrite":
        case "deleteAfterWrite": return target.getConfiguration().isDeleteAfterWrite();
        case "delimiter": return target.getConfiguration().getDelimiter();
        case "destinationbucket":
        case "destinationBucket": return target.getConfiguration().getDestinationBucket();
        case "destinationbucketprefix":
        case "destinationBucketPrefix": return target.getConfiguration().getDestinationBucketPrefix();
        case "destinationbucketsuffix":
        case "destinationBucketSuffix": return target.getConfiguration().getDestinationBucketSuffix();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filename":
        case "fileName": return target.getConfiguration().getFileName();
        case "greedy": return target.isGreedy();
        case "includebody":
        case "includeBody": return target.getConfiguration().isIncludeBody();
        case "includefolders":
        case "includeFolders": return target.getConfiguration().isIncludeFolders();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "keyname":
        case "keyName": return target.getConfiguration().getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxconnections":
        case "maxConnections": return target.getMaxConnections();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "moveafterread":
        case "moveAfterRead": return target.getConfiguration().isMoveAfterRead();
        case "multipartupload":
        case "multiPartUpload": return target.getConfiguration().isMultiPartUpload();
        case "operation": return target.getConfiguration().getOperation();
        case "overrideendpoint":
        case "overrideEndpoint": return target.getConfiguration().isOverrideEndpoint();
        case "partsize":
        case "partSize": return target.getConfiguration().getPartSize();
        case "pojorequest":
        case "pojoRequest": return target.getConfiguration().isPojoRequest();
        case "policy": return target.getConfiguration().getPolicy();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "prefix": return target.getConfiguration().getPrefix();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "region": return target.getConfiguration().getRegion();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "storageclass":
        case "storageClass": return target.getConfiguration().getStorageClass();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "trustallcertificates":
        case "trustAllCertificates": return target.getConfiguration().isTrustAllCertificates();
        case "uriendpointoverride":
        case "uriEndpointOverride": return target.getConfiguration().getUriEndpointOverride();
        case "useawskms":
        case "useAwsKMS": return target.getConfiguration().isUseAwsKMS();
        case "usecustomerkey":
        case "useCustomerKey": return target.getConfiguration().isUseCustomerKey();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "useiamcredentials":
        case "useIAMCredentials": return target.getConfiguration().isUseIAMCredentials();
        default: return null;
        }
    }
}

