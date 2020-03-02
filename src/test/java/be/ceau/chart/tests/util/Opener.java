/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.tests.util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import be.ceau.chart.Chart;

public class Opener {

	/**
	 * Serialize the given chart, create a HTML page for it, open the HTML file
	 * in the default browser
	 * 
	 * @param chart
	 *            a {@link Chart} implementation, not {@code null}
	 * @throws IOException
	 */
	public static void inBrowser(Chart chart) throws IOException {
		
		if (!chart.isDrawable()) {
			throw new IllegalArgumentException("chart is not drawable");
		}
		
		File tmp = File.createTempFile("chart_test_", ".html");
		
		PrintWriter out = new PrintWriter(tmp);
		out.write(createWebPage(chart.getType(), chart.toJson()));
		out.close();

		Desktop.getDesktop().browse(tmp.toURI());

	}

	private static String createWebPage(String type, String json) {
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
				.append("<script src='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.0/Chart.js'></script>")
				.append(line)
				.append("<script>")
				.append("function r(e,t){new Chart(document.getElementById(e).getContext('2d'),t)}")
				.append("</script>")
				.append(line)
				.append("</head>")
				.append(line)
				.append("<body>")
				.append(line)
				.append("<canvas id='c' style='border:1px solid #555;'></canvas>")
				.append(line)
				.append("<div><pre>").append(json).append("</pre></div>")
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
