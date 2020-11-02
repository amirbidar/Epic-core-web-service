package ir.it.orbit.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ir.it.orbit.service.dto.Base.FormDTO;
import ir.it.orbit.service.mapper.FormBaseMapper;
import ir.it.orbit.service.mapper.FormMapper;
import ir.it.orbit.service.xml.Base.Form;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class FormService {
    private final Logger log = LoggerFactory.getLogger(FormService.class);


    private final   FormBaseMapper formBaseMapper;
    private final FormMapper formMapper;

    public FormService(FormBaseMapper formBaseMapper, FormMapper formMapper) {
        this.formBaseMapper = formBaseMapper;
        this.formMapper = formMapper;
    }


    public FormDTO findAll(String xml) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        Object poppy = xmlMapper.readValue(xml, Object.class);
        ObjectMapper objectMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String string = objectMapper.writeValueAsString(poppy);
        Form form = objectMapper.readValue(string, Form.class);
        return formMapper.toDto(form);

    }
}
