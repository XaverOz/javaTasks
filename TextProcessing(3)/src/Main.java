import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter text");
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
		String text = reader.readLine();
		reader.close();
		String[] splitedText = text.replaceAll("[.!,]","").replaceAll(" +", " ").split(" ");
		Map<String, Integer> wordCounter = Arrays.asList(splitedText).stream()
				.collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
		System.out.println(wordCounter.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)));
		
	}
}
