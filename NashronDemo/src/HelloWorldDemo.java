import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class HelloWorldDemo {

	public static void main(String[] args) throws ScriptException, NoSuchMethodException, FileNotFoundException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("print('Hello World!');");
		// Execute a Function
		
		String filePath = "E:\\workspace\\springboot\\NashronDemo\\src\\fun.js";
		
		engine.eval(new FileReader(filePath));

		Invocable invocable = (Invocable) engine;
		

		Object result = invocable.invokeFunction("fun1", "Test it buddy");
		System.out.println(result);
		System.out.println(result.getClass());
		
		List<String> al;
		
	}

}
