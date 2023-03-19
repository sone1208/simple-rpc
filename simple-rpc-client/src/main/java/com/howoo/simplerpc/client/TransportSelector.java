package com.howoo.simplerpc.client;

import com.howoo.simplerpc.Peer;
import com.howoo.simplerpc.transport.TransportClient;

import java.util.List;

//表示选择哪个server去连接
public interface TransportSelector {

    //初始化selector
    //peers：可以连接的server端点信息
    //count：client和server建立多少个连接
    //clazz：client实现class
    void init(List<Peer> peers,
              int count,
              Class<? extends TransportClient> clazz);

    //选择一个transport与server做交互
    TransportClient select();

    //释放用完的client
    void release(TransportClient client);

    void close();
}
