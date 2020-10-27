package cmps252.HW4_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
	public static List<Customer> getCustomers(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		
		List<Customer> customers = new ArrayList<Customer>();
		
		scanner.nextLine();	// to ignore first line
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			
			// remove quotations:
			for (int i = 0; i < fields.length; i++) {
				fields[i] = fields[i].replace("\"", "");
			}
			
			Customer customer = new Customer(
					fields[0], 
					fields[1], 
					fields[2], 
					fields[3], 
					fields[4], 
					fields[5], 
					fields[6], 
					fields[7], 
					fields[8], 
					fields[9], 
					fields[10], 
					fields[11]
			);
			customers.add(customer);
		}
		
		return customers;
	}
}
