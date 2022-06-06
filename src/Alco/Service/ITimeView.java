package Alco.Service;

import java.time.LocalDateTime;

//интерфейс  вывода времени
public interface ITimeView {
    String getTimeView(LocalDateTime time);

}
