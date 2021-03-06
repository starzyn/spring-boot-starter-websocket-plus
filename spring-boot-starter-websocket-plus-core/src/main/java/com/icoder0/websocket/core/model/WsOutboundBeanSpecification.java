package com.icoder0.websocket.core.model;

/**
 * @author bofa1ex
 * @since 2020/9/4
 */
public interface WsOutboundBeanSpecification {

    Long sequence();

    WsOutboundBeanSpecification setSequence(Long sequence);

    String topic();

    WsOutboundBeanSpecification setTopic(String topic);
}
