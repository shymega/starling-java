package org.shymega.java.starlingbank.j4starling.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

public class StartEndOfWeek {
    private final ZoneId tz = ZoneId.systemDefault();
    private final LocalDateTime now = LocalDate.now(tz).atTime(0, 0);
    private final Locale defaultLocale = Locale.getDefault();
    private final DayOfWeek localeSpecificFirstDayOfWeek = WeekFields.of(defaultLocale).getFirstDayOfWeek();

    public String firstDayOfWeek() {
        String s = now.with(previousOrSame(localeSpecificFirstDayOfWeek))
                .format(DateTimeFormatter.ISO_DATE_TIME);
        return s;
    }

    public String lastDayOfWeek() {
        String s = now.with(nextOrSame(localeSpecificFirstDayOfWeek))
                .format(DateTimeFormatter.ISO_DATE_TIME);
        return s;
    }
}