package org.kollavarsham.tester;

import java.time.Instant;

import org.kollavarsham.converter.Kollavarsham;
import org.kollavarsham.converter.KollavarshamDate;
import org.kollavarsham.converter.Settings;
import org.kollavarsham.converter.Settings.Builder;

public class App {
    public static void main(final String[] args) {
        final Settings settings = new Builder().latitude(10).longitude(76.2).system("SuryaSiddhanta").build();
        final Kollavarsham kv = new Kollavarsham(settings);
        final KollavarshamDate today = kv.fromGregorianDate(Instant.now());
        System.out.println(today.getYear() + " " + today.getMlMasaName() + " " + today.getDate() + " " + '(' + today.getMlNaksatraName() + ')');
    }
}
