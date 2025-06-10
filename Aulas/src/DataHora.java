import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataHora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();*/
		
		LocalDate d01 = LocalDate.parse("2020-12-01");
		LocalDateTime d02 = LocalDateTime.parse("2020-01-01T10:10");
		Instant d03 = Instant.parse("2025-06-10T12:56:04.32Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println(d01.format(fmt1));
		System.out.println(d02.format(fmt2));
		System.out.println(fmt3.format(d03));
		System.out.println(fmt4.format(d02));

		
sc.close();
	}

}
