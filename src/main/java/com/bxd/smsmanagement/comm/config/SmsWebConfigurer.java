package com.bxd.smsmanagement.comm.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Description: 配置CORS和返回JSON
 * Package: com.bxd.smsmanagement.comm.config
 *
 * @author Leeves
 * @date 2018-03-28
 */
@Configuration
public class SmsWebConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //请求路径配置
                .allowedOrigins("*")          //请求origin配置
                .allowedMethods("POST","GET")   //方法配置
                .allowCredentials(false)        //证书支持配置
                .maxAge(3600);                  //缓存请求保持时间
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(fastConverter());
    }


    /**
     * 配置FastJsonHttpMessageConverter转换
     * @return FastJsonHttpMessageConverter
     */
    private FastJsonHttpMessageConverter fastConverter(){
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                //禁止循环引用
                SerializerFeature.DisableCircularReferenceDetect,
                //boolean 如果为null，则为false
                SerializerFeature.WriteNullBooleanAsFalse,
                //string 如果为null，则为空
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullNumberAsZero
        );
        //设置时间格式
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");

        fastConverter.setFastJsonConfig(fastJsonConfig);
        return fastConverter;
    }
}
