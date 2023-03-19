package com.howoo.simplerpc.client;

import com.howoo.simplerpc.Peer;
import com.howoo.simplerpc.codec.Decoder;
import com.howoo.simplerpc.codec.Encoder;
import com.howoo.simplerpc.codec.JSONDecoder;
import com.howoo.simplerpc.codec.JSONEncoder;
import com.howoo.simplerpc.transport.HTTPTransportClient;
import com.howoo.simplerpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1", 3000));
}
