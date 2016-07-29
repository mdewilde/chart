package be.ceau.chart;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Filer {

	public static void toBrowser(String type, String json) throws IOException {
		
		File tmp = File.createTempFile("chart_test_", ".html");
		
		PrintWriter out = new PrintWriter(tmp);
		out.write(createWebPage(type, json));
		out.close();
			
		Desktop.getDesktop().browse(tmp.toURI());

	}
	
	public static String createWebPage(String type, String json) {
		String line = System.getProperty("line.separator");
		return new StringBuilder()
				.append("<!DOCTYPE html>")
				.append(line)
				.append("<html lang='en'>")
				.append(line)
				.append("<head>")
				.append(line)
				.append("<meta charset='UTF-8'>")
				.append(line)
				.append("<title>Chart.java test page - ").append(type).append("</title>")
				.append(line)
				.append("<meta name='author' content='Marceau Dewilde'>")
				.append(line)
				.append("<script src='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.1.6/Chart.min.js'></script>")
				.append(line)
				.append("<script>")
				.append("function r(e,t){new Chart(document.getElementById(e).getContext('2d'),t)}")
				.append("</script>")
				.append(line)
				.append("</head>")
				.append(line)
				.append("<body>")
				.append(line)
				.append("<canvas id='c'></canvas>")
				.append(line)
				.append("<div><pre>").append(json).append("</div></pre>")
				.append(line)
				.append("<script>")
				.append(line)
				.append("r('c', ").append(json).append(");")
				.append("</script>")
				.append(line)
				.append("</body>")
				.append(line)
				.append("</html>")
				.toString();
	}

}
