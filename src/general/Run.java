package general;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "CleanUp.bat"); File dir
		 * = new File(".//CleanUp.bat"); pb.directory(dir); Process p = pb.start();
		 */
		//Runtime.getRuntime().exec(".//CleanUp.bat");
		//Runtime.getRuntime().exec("cmd /c CleanUp.bat", null, new File("."));
		//Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", "CleanUp.bat" } );
		Process process = Runtime.getRuntime().exec(
				"cmd /c CleanUp.bat", null, new File("D:\\MY_FW\\FrameWork_v1\\"));
	}

}
