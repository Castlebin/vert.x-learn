package com.heller.vertx.basic;

import io.vertx.core.Vertx;

/**
 * 一个简单的Vert.x的web服务
 *
 * 启动后访问：http://localhost:8080/
 */
public class HelloWorldEmbedded {
    
    public static void main(String[] args) {
        Vertx.vertx().createHttpServer()
            .requestHandler(req -> req.response().end("Hello World."))
            .listen(8080);
    }
    
}
