package com.parameta.wssoap.mapper;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;

public class DateMapper {

    public static LocalDate toLocalDate(XMLGregorianCalendar xmlDate) {
        if (xmlDate == null) {
            return null;
        }

        return xmlDate.toGregorianCalendar()
                .toZonedDateTime()
                .toLocalDate();
    }
}