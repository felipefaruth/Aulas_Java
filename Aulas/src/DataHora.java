import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DataHora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		LocalDate d01 = LocalDate.parse("2020-12-01");
		LocalDateTime d02 = LocalDateTime.parse("2020-01-01T10:10");
		Instant d03 = Instant.parse("2025-06-10T12:56:04.32Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		/*System.out.println(d01.format(fmt1));
		System.out.println(d02.format(fmt2));
		System.out.println(fmt3.format(d03));
		System.out.println(fmt4.format(d02));*/
		
		//for (String x : ZoneId.getAvailableZoneIds()) {
		//	System.out.println(x);
		//}
		  
		Instant d05 = Instant.now();
		LocalDate d06 = LocalDate.parse("2025-06-12");
		LocalDateTime d07 = LocalDateTime.now();
		
		LocalDate x = LocalDate.ofInstant(d05, ZoneId.systemDefault());
		LocalDate x1 = LocalDate.ofInstant(d05, ZoneId.of("Portugal"));
		LocalDateTime x2 = LocalDateTime.ofInstant(d05, ZoneId.of("Portugal"));
		
		//System.out.println(x1);
		//System.out.println(x2);
		
		LocalDate pastWeekLocalDate = d06.minusDays(7);
		LocalDate nextWeekLocalDate = d06.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		Instant pastWeekInstant = d05.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d05.plus(1, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(d02, d07);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, nextWeekInstant);
		
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		System.out.println(t3.toDays());
		
		
		
		
		
		

sc.close();
	}

}
