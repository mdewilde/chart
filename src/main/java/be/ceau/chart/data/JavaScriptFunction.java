/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.data;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.googlecode.jslint4java.Issue;
import com.googlecode.jslint4java.JSLint;
import com.googlecode.jslint4java.JSLintBuilder;
import com.googlecode.jslint4java.JSLintResult;
import com.googlecode.jslint4java.Option;
import com.googlecode.jslint4java.StringArray;

@JsonSerialize(using = JavaScriptFunction.Serializer.class)
public class JavaScriptFunction {

	private final String function;

	public JavaScriptFunction(String function) {
		super();
		
		
		this.function = function;
	}

	public String getFunction() {
		return function;
	}

	public static boolean isValid(String function) {
		
		try {
			JSLint jsLint = new JSLintBuilder()
							.timeout(2000, TimeUnit.MILLISECONDS)
							.fromDefault();
			
			jsLint.addOption(Option.ASS, "true");
			jsLint.addOption(Option.BITWISE, "true");
			jsLint.addOption(Option.BROWSER, "false");
			jsLint.addOption(Option.CLOSURE, "true");
			jsLint.addOption(Option.CONTINUE, "true");
			jsLint.addOption(Option.DEBUG, "true");
			jsLint.addOption(Option.DEBUG, "true");
			jsLint.addOption(Option.EQEQ, "true");
			jsLint.addOption(Option.ES5, "true");
			jsLint.addOption(Option.EVIL, "true");
			jsLint.addOption(Option.FORIN, "true");
			jsLint.addOption(Option.INDENT, "2000000000");
			jsLint.addOption(Option.MAXERR, "2000000000");
			jsLint.addOption(Option.MAXLEN, "2000000000");
			jsLint.addOption(Option.NEWCAP, "true");
			jsLint.addOption(Option.NODE, "false");
			jsLint.addOption(Option.NOMEN, "true");
			jsLint.addOption(Option.PASSFAIL, "true");
			jsLint.addOption(Option.PLUSPLUS, "true");
			jsLint.addOption(Option.PROPERTIES, "false");
			jsLint.addOption(Option.REGEXP, "true");
			jsLint.addOption(Option.RHINO, "false");
			jsLint.addOption(Option.SLOPPY, "true");
			jsLint.addOption(Option.STUPID, "true");
			jsLint.addOption(Option.SUB, "true");
		    jsLint.addOption(Option.TODO, "true");
		    jsLint.addOption(Option.UNPARAM, "true");
		    jsLint.addOption(Option.VARS, "true");
		    jsLint.addOption(Option.WARNINGS, "true");
		    jsLint.addOption(Option.WHITE, "true");
		    jsLint.addOption(Option.WINDOWS, "false");
		
			JSLintResult result = jsLint.lint(File.createTempFile("jslint_" + System.currentTimeMillis() + "_", "_result").getAbsolutePath(), function);
			
			for (Issue issue : result.getIssues()) {
				System.out.println(issue);
			}
			
		} catch (IOException e) {
			return false;
		}
		
		return false;
	}
	
	public static class Serializer extends JsonSerializer<JavaScriptFunction> {

		@Override
		public void serialize(JavaScriptFunction value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
			gen.writeRawValue(value.function);
		}

	}

}
