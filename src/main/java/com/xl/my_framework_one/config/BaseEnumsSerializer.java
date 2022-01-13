package com.xl.my_framework_one.config;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xl.my_framework_one.enums.BaseEnum;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class BaseEnumsSerializer {


    @Bean
    public Jackson2ObjectMapperBuilderCustomizer enumCustomizer(){
        return jacksonObjectMapperBuilder -> jacksonObjectMapperBuilder.serializerByType(BaseEnum.class, new JsonSerializer<BaseEnum>() {
            @Override
            public void serialize(BaseEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeStartObject();
                gen.writeStringField("name",value.name());
                gen.writeStringField("label",value.getLabel());
                gen.writeEndObject();
            }
        });
    }
}
