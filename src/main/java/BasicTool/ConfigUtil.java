package BasicTool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	private static ConfigUtil configUtil = new ConfigUtil();

	private ConfigUtil() {

	}

	public static ConfigUtil getConfigUtil() {
		if (configUtil == null)
			return configUtil = new ConfigUtil();
		else
			return configUtil;
	}

	public String getConfigFileContent(String key) {
		Properties properties = new Properties();
		String path = Thread.currentThread().getContextClassLoader()
				.getResource("test_config.properties").getPath();
		try {
			properties.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

}
