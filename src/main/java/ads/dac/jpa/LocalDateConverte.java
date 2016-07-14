/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.dac.jpa;

import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author Aluísio
 */
@Converter(autoApply = true)
public class LocalDateConverte implements AttributeConverter<LocalDate, String> {

    @Override
    public String convertToDatabaseColumn(LocalDate localData) {
        return (localData == null) ? null : localData.toString();
    }

    @Override
    public LocalDate convertToEntityAttribute(String dataString) {
        return (dataString == null) ? null : LocalDate.parse(dataString);

    }

}
