package com.howoo.simplerpc.codec;

//序列化
public interface Encoder {
    byte[] encode(Object object);
}
