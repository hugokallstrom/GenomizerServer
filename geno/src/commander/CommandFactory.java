package commander;

public class CommandFactory {

	public static DownloadCommand createDownloadCommand(String filepath) {
		
		return new DownloadCommand(filepath);
	}
}
