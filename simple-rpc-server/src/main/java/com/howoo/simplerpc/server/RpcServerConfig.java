package com.howoo.simplerpc.server;

import com.howoo.simplerpc.codec.Decoder;
import com.howoo.simplerpc.codec.Encoder;
import com.howoo.simplerpc.codec.JSONDecoder;
import com.howoo.simplerpc.codec.JSONEncoder;
import com.howoo.simplerpc.transport.HTTPTransportServer;
import com.howoo.simplerpc.transport.TransportServer;
import lombok.Data;

//server配置
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
}
