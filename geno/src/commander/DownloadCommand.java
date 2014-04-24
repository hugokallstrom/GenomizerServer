package commander;

public class DownloadCommand extends Command {

	String filepath;
	
	public DownloadCommand(String filepath) {
		this.filepath = filepath;
	}
}
