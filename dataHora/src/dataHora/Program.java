package dataHora;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-06-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-06-20T21:56");
		
		LocalDate d06 = LocalDate.parse("20/07/2022", fm1);
		LocalDateTime d07 = LocalDateTime.parse("20/07/2022 21:12", fm2);
		
		LocalDate d08 = LocalDate.of(2022, 6, 20);
		LocalDateTime d09 = LocalDateTime.of(2022, 6, 20, 22, 28);
		
		
		System.out.println(d01 +"\n" + d02 +"\n" + d03 +"\n" + d04 +"\n" + d05 +"\n" + d06 +"\n" + d07.toString());
		System.out.println(d08);
		System.out.println(d09);

	}

}
