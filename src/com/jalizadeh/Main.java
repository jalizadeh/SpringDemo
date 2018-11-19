package com.jalizadeh;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 * @author Javad Alizadeh
 * @see {@link https://www.youtube.com/watch?v=7c6ZTF6cF88&list=PLGibysfsUS7NAbefiaj1V4LbX0glTftDI}
 *
 */
public class Main {

	public static void main(String[] args) {
		//xml must be located in "src" folder
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		

		//video #17
		Shape shape = (Shape) context.getBean("circle");		
		shape.draw();
		
		
		/**
		 * The ApplicationContext class doesn't define either of these methods as a part of 
		 * its interface, but the ConfigurableApplicationContext does define both of these.
		 * From the JavaDoc:
		 *         close() -- Close this application context, destroying all beans in its bean 
		 *         factory.
		 *         registerShutdownHook() -- Register a shutdown hook with the JVM runtime, 
		 *         closing this context on JVM shutdown unless it has already been closed at 
		 *         that time.
		 * Basically, AbstractApplicationContext#close() will close, or shutdown, 
		 * the ApplicationContext at the time it is invoked, while 
		 * AbstractApplicationContext#registerShutdownHook() will close, or shutdown, 
		 * the ApplicationContext at a later time when the JVM is shutting down for whatever reason.
		 * This will be achieved by utilizing the JVM shutdown hook functionality.
		 * In either case, the actual closing is done by the doClose() method.
		 * If you are curious about why your outputs look so similar, it is because they 
		 * are effectively doing the same thing, whether you call #close() 
		 * or #registerShutdownHook() at line 3 of you example. #close will shutdown right away, 
		 * and #registerShutdownHook will shutdown just before the JVM will exit, 
		 * which is pretty much as soon as the method is done being invoked, because it is 
		 * the last line of code!
		 */	
		context.close();		
		context.registerShutdownHook();

	}

}
