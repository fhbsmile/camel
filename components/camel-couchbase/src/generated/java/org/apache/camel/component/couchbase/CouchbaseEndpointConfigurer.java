/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.couchbase;

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
public class CouchbaseEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("protocol", java.lang.String.class);
        map.put("hostname", java.lang.String.class);
        map.put("port", int.class);
        map.put("bucket", java.lang.String.class);
        map.put("collection", java.lang.String.class);
        map.put("key", java.lang.String.class);
        map.put("scope", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("consumerProcessedStrategy", java.lang.String.class);
        map.put("descending", boolean.class);
        map.put("designDocumentName", java.lang.String.class);
        map.put("limit", int.class);
        map.put("rangeEndKey", java.lang.String.class);
        map.put("rangeStartKey", java.lang.String.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("skip", int.class);
        map.put("viewName", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        map.put("autoStartIdForInserts", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("operation", java.lang.String.class);
        map.put("persistTo", int.class);
        map.put("producerRetryAttempts", int.class);
        map.put("producerRetryPause", int.class);
        map.put("replicateTo", int.class);
        map.put("startingIdForInsertsFrom", long.class);
        map.put("additionalHosts", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("queryTimeout", long.class);
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
        map.put("password", java.lang.String.class);
        map.put("username", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CouchbaseEndpoint target = (CouchbaseEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalhosts":
        case "additionalHosts": target.setAdditionalHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "autostartidforinserts":
        case "autoStartIdForInserts": target.setAutoStartIdForInserts(property(camelContext, boolean.class, value)); return true;
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
        case "bucket": target.setBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "collection": target.setCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerprocessedstrategy":
        case "consumerProcessedStrategy": target.setConsumerProcessedStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "descending": target.setDescending(property(camelContext, boolean.class, value)); return true;
        case "designdocumentname":
        case "designDocumentName": target.setDesignDocumentName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "key": target.setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "limit": target.setLimit(property(camelContext, int.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "persistto":
        case "persistTo": target.setPersistTo(property(camelContext, int.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "producerretryattempts":
        case "producerRetryAttempts": target.setProducerRetryAttempts(property(camelContext, int.class, value)); return true;
        case "producerretrypause":
        case "producerRetryPause": target.setProducerRetryPause(property(camelContext, int.class, value)); return true;
        case "querytimeout":
        case "queryTimeout": target.setQueryTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "rangeendkey":
        case "rangeEndKey": target.setRangeEndKey(property(camelContext, java.lang.String.class, value)); return true;
        case "rangestartkey":
        case "rangeStartKey": target.setRangeStartKey(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "replicateto":
        case "replicateTo": target.setReplicateTo(property(camelContext, int.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "scope": target.setScope(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "skip": target.setSkip(property(camelContext, int.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "startingidforinsertsfrom":
        case "startingIdForInsertsFrom": target.setStartingIdForInsertsFrom(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "viewname":
        case "viewName": target.setViewName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CouchbaseEndpoint target = (CouchbaseEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalhosts":
        case "additionalHosts": return target.getAdditionalHosts();
        case "autostartidforinserts":
        case "autoStartIdForInserts": return target.isAutoStartIdForInserts();
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
        case "bucket": return target.getBucket();
        case "collection": return target.getCollection();
        case "consumerprocessedstrategy":
        case "consumerProcessedStrategy": return target.getConsumerProcessedStrategy();
        case "delay": return target.getDelay();
        case "descending": return target.isDescending();
        case "designdocumentname":
        case "designDocumentName": return target.getDesignDocumentName();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "key": return target.getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "limit": return target.getLimit();
        case "operation": return target.getOperation();
        case "password": return target.getPassword();
        case "persistto":
        case "persistTo": return target.getPersistTo();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "producerretryattempts":
        case "producerRetryAttempts": return target.getProducerRetryAttempts();
        case "producerretrypause":
        case "producerRetryPause": return target.getProducerRetryPause();
        case "querytimeout":
        case "queryTimeout": return target.getQueryTimeout();
        case "rangeendkey":
        case "rangeEndKey": return target.getRangeEndKey();
        case "rangestartkey":
        case "rangeStartKey": return target.getRangeStartKey();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "replicateto":
        case "replicateTo": return target.getReplicateTo();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "scope": return target.getScope();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "skip": return target.getSkip();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "startingidforinsertsfrom":
        case "startingIdForInsertsFrom": return target.getStartingIdForInsertsFrom();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "username": return target.getUsername();
        case "viewname":
        case "viewName": return target.getViewName();
        default: return null;
        }
    }
}

