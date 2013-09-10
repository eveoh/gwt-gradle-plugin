package de.richsource.gradle.plugins.gwt;


public class GwtDev extends AbstractGwtActionTask {
	
	public static final String NAME = "compileGwt";
	
//	private Boolean noserver;
//	private Integer port;
//	private String whitelist;

	@Override
	protected String getClassName() {
		return "com.google.gwt.dev.DevMode";
	}
	
	@Override
	protected void addArgs() {
		
//		  -noserver        Prevents the embedded web server from running
//		  -port            Specifies the TCP port for the embedded web server (defaults to 8888)
//		  -whitelist       Allows the user to browse URLs that match the specified regexes (comma or space separated)
//		  -blacklist       Prevents the user browsing URLs that match the specified regexes (comma or space separated)
//		  -logdir          Logs to a file in the given directory, as well as graphically
//		  -logLevel        The level of logging detail: ERROR, WARN, INFO, TRACE, DEBUG, SPAM, or ALL
//		  -gen             Debugging: causes normally-transient generated types to be saved in the specified directory
//		  -bindAddress     Specifies the bind address for the code server and web server (defaults to 127.0.0.1)
//		  -codeServerPort  Specifies the TCP port for the code server (defaults to 9997)
//		  -server          Specify a different embedded web server to run (must implement ServletContainerLauncher)
//		  -startupUrl      Automatically launches the specified URL
//		  -war             The directory into which deployable output files will be written (defaults to 'war')
//		  -deploy          The directory into which deployable but not servable output files will be written (defaults to 'WEB-INF/deploy' under the -war directory/jar, and may be the same as the -extra directory/jar)
//		  -extra           The directory into which extra files, not intended for deployment, will be written
//		  -workDir         The compiler's working directory for internal use (must be writeable; defaults to a system temp dir)
		
	}

}
