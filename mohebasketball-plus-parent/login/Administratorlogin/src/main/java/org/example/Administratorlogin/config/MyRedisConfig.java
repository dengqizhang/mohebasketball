//package org.example.Administratorlogin.config;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonTypeInfo;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.MapperFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import java.text.SimpleDateFormat;
//import java.util.TimeZone;
//
//import static java.awt.ComponentOrientation.UNKNOWN;
//import static java.awt.image.ImageObserver.PROPERTIES;
//import static java.sql.JDBCType.NULL;
//import static javax.swing.DropMode.ON;
//
///*
//* 此配置类的作用是连接redis，针对存入的键值对做序列号处理。
// */
//@Configuration
//public class MyRedisConfig {
//    @Autowired
//    private RedisConnectionFactory factory;
//    @Bean
//    public RedisTemplate redisTemplate(){
//        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
//        //设置连接工厂
//        redisTemplate.setConnectionFactory(factory);
//        //对存入redis的键值对做序列号处理
//        //对键的处理
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        //对值的处理
//        Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<>(Object.class);//把值转成json格式
//        redisTemplate.setValueSerializer(serializer);
//
//        //自定义复杂信息序列化
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.setVisibility(PropertyAccessor.ALL,JsonAutoDetect.Visibility.ANY);mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//        mapper.setTimeZone(TimeZone.getDefault());
//        mapper.configure(MapperFeature.USE_ANNOTATIONS,false);
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
////        mapper.configure(SerialzationFeature.FAIL_ON_EMPTY_BEANS, false);
//        mapper.activateDefaultTyping(LaissezFaireSubTypeValidator.instance,ObjectMapper.DefaultTyping.NON_FINAL,JsonTypeInfo.As.PROPERTY);
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        serializer.setObjectMapper(mapper);
//
//        return redisTemplate;
//    }
//}
