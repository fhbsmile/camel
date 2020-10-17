/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mina;

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
public class MinaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("protocol", java.lang.String.class);
        map.put("host", java.lang.String.class);
        map.put("port", int.class);
        map.put("disconnect", boolean.class);
        map.put("minaLogger", boolean.class);
        map.put("sync", boolean.class);
        map.put("timeout", long.class);
        map.put("writeTimeout", long.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("clientMode", boolean.class);
        map.put("disconnectOnNoReply", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("noReplyLogLevel", org.apache.camel.LoggingLevel.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("cachedAddress", boolean.class);
        map.put("lazySessionCreation", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("maximumPoolSize", int.class);
        map.put("orderedThreadPoolExecutor", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("transferExchange", boolean.class);
        map.put("allowDefaultCodec", boolean.class);
        map.put("codec", org.apache.mina.filter.codec.ProtocolCodecFactory.class);
        map.put("decoderMaxLineLength", int.class);
        map.put("encoderMaxLineLength", int.class);
        map.put("encoding", java.lang.String.class);
        map.put("filters", java.util.List.class);
        map.put("textline", boolean.class);
        map.put("textlineDelimiter", org.apache.camel.component.mina.MinaTextLineDelimiter.class);
        map.put("autoStartTls", boolean.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MinaEndpoint target = (MinaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "allowDefaultCodec": target.getConfiguration().setAllowDefaultCodec(property(camelContext, boolean.class, value)); return true;
        case "autostarttls":
        case "autoStartTls": target.getConfiguration().setAutoStartTls(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachedaddress":
        case "cachedAddress": target.getConfiguration().setCachedAddress(property(camelContext, boolean.class, value)); return true;
        case "clientmode":
        case "clientMode": target.getConfiguration().setClientMode(property(camelContext, boolean.class, value)); return true;
        case "codec": target.getConfiguration().setCodec(property(camelContext, org.apache.mina.filter.codec.ProtocolCodecFactory.class, value)); return true;
        case "decodermaxlinelength":
        case "decoderMaxLineLength": target.getConfiguration().setDecoderMaxLineLength(property(camelContext, int.class, value)); return true;
        case "disconnect": target.getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "disconnectonnoreply":
        case "disconnectOnNoReply": target.getConfiguration().setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "encodermaxlinelength":
        case "encoderMaxLineLength": target.getConfiguration().setEncoderMaxLineLength(property(camelContext, int.class, value)); return true;
        case "encoding": target.getConfiguration().setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filters": target.getConfiguration().setFilters(property(camelContext, java.util.List.class, value)); return true;
        case "lazysessioncreation":
        case "lazySessionCreation": target.getConfiguration().setLazySessionCreation(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maximumpoolsize":
        case "maximumPoolSize": target.getConfiguration().setMaximumPoolSize(property(camelContext, int.class, value)); return true;
        case "minalogger":
        case "minaLogger": target.getConfiguration().setMinaLogger(property(camelContext, boolean.class, value)); return true;
        case "noreplyloglevel":
        case "noReplyLogLevel": target.getConfiguration().setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "orderedthreadpoolexecutor":
        case "orderedThreadPoolExecutor": target.getConfiguration().setOrderedThreadPoolExecutor(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sync": target.getConfiguration().setSync(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "textline": target.getConfiguration().setTextline(property(camelContext, boolean.class, value)); return true;
        case "textlinedelimiter":
        case "textlineDelimiter": target.getConfiguration().setTextlineDelimiter(property(camelContext, org.apache.camel.component.mina.MinaTextLineDelimiter.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, long.class, value)); return true;
        case "transferexchange":
        case "transferExchange": target.getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "writetimeout":
        case "writeTimeout": target.getConfiguration().setWriteTimeout(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MinaEndpoint target = (MinaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "allowDefaultCodec": return target.getConfiguration().isAllowDefaultCodec();
        case "autostarttls":
        case "autoStartTls": return target.getConfiguration().isAutoStartTls();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cachedaddress":
        case "cachedAddress": return target.getConfiguration().isCachedAddress();
        case "clientmode":
        case "clientMode": return target.getConfiguration().isClientMode();
        case "codec": return target.getConfiguration().getCodec();
        case "decodermaxlinelength":
        case "decoderMaxLineLength": return target.getConfiguration().getDecoderMaxLineLength();
        case "disconnect": return target.getConfiguration().isDisconnect();
        case "disconnectonnoreply":
        case "disconnectOnNoReply": return target.getConfiguration().isDisconnectOnNoReply();
        case "encodermaxlinelength":
        case "encoderMaxLineLength": return target.getConfiguration().getEncoderMaxLineLength();
        case "encoding": return target.getConfiguration().getEncoding();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filters": return target.getConfiguration().getFilters();
        case "lazysessioncreation":
        case "lazySessionCreation": return target.getConfiguration().isLazySessionCreation();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maximumpoolsize":
        case "maximumPoolSize": return target.getConfiguration().getMaximumPoolSize();
        case "minalogger":
        case "minaLogger": return target.getConfiguration().isMinaLogger();
        case "noreplyloglevel":
        case "noReplyLogLevel": return target.getConfiguration().getNoReplyLogLevel();
        case "orderedthreadpoolexecutor":
        case "orderedThreadPoolExecutor": return target.getConfiguration().isOrderedThreadPoolExecutor();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "sync": return target.getConfiguration().isSync();
        case "synchronous": return target.isSynchronous();
        case "textline": return target.getConfiguration().isTextline();
        case "textlinedelimiter":
        case "textlineDelimiter": return target.getConfiguration().getTextlineDelimiter();
        case "timeout": return target.getConfiguration().getTimeout();
        case "transferexchange":
        case "transferExchange": return target.getConfiguration().isTransferExchange();
        case "writetimeout":
        case "writeTimeout": return target.getConfiguration().getWriteTimeout();
        default: return null;
        }
    }
}

