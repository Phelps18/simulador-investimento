package framework.utils;

import static framework.utils.DriverFactory.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	private static final String PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "report" + File.separator + "screenshots" + File.separator
			+ "%s.png";

	public static String capture() throws WebDriverException {
		Path path = Paths.get("screenshots");

		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				System.out.println("Falha ao criar a pasta 'screenshots'!");
				e.printStackTrace();
			}
		}

		String newPath = String.format(PATH, DateTime.getDateTimeFormat());
		try {
			File source = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File(newPath));

		} catch (IOException ex) {
			System.out.println("Capture error");
		}
		return newPath.replace(PATH, "");
	}
}