package Alco.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Класс вывода времени, на основе интерфейса, добавляет время текущее время заказа
//в соответствии с текущей датой, в определённом формате, который можно менять
public class TimeView implements ITimeView {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    @Override
    public String getTimeView(LocalDateTime time) {
        return time.format(DATE_TIME_FORMATTER);

    }
}
