package br.com.treinaweb.ediaristas.converters;

import javax.persistence.AttributeConverter;

public class CepConverter implements AttributeConverter<String, String>{

    @Override
    public String convertToDatabaseColumn(String cep) {
        return cep.replaceAll("[.-]", "");
    }

    @Override
    public String convertToEntityAttribute(String cep) {
        return cep;
    }
    
}
