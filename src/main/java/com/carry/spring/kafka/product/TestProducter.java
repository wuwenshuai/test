package com.carry.spring.kafka.product;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.Future;

public class TestProducter {

    public static void main(String[] args) throws  Exception{
        Properties properties = new Properties();
        //指定kafka服务器地址 如果是集群可以指定多个  但是就算只指定一个他也会去集群环境下寻找其他的节点地 址 
        properties.setProperty("bootstrap.servers","127.0.0.1:9092");
        //key序列化器 
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        //value序列化器 
        properties.setProperty("value.serializer",StringSerializer.class.getName());
        KafkaProducer<String,String> kafkaProducer = new KafkaProducer<String, String>(properties);
        ProducerRecord<String, String> stringStringProducerRecord = new ProducerRecord<String, String>("my-topic",1,"testKey","hello");
        Future<RecordMetadata> send = kafkaProducer.send(stringStringProducerRecord);
        RecordMetadata recordMetadata1 = send.get();
        System.out.println(recordMetadata1.offset()+":"+recordMetadata1.topic());
        RecordMetadata recordMetadata = send.get();
        System.out.println(recordMetadata);
    }

} 
