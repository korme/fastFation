package xyz.korme.fastfation.service.timeUtil;

import org.springframework.stereotype.Service;

@Service
public interface TimeUtil {
    String getNowTime();
    String getYearToDay();
}