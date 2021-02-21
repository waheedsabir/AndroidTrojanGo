// Code generated by gobind. DO NOT EDIT.

// Java class util.Util is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/trojan-gfw/igniter-go-libs/util
package util;

import go.Seq;

public abstract class Util {
	static {
		Seq.touch(); // for loading the native library
		_init();
	}
	
	private Util() {} // uninstantiable
	
	// touch is called from other bound packages to initialize this package
	public static void touch() {}
	
	private static native void _init();
	
	
	/**
	 * logcat is line-buffered
	 */
	public static final long LogLineBufLen = 1024;
	public static final long MaxLogBufLen = 16777216;
	
	/**
	 * LogGoRoutineCount log goroutine count to logcat on android
	 */
	public static native void logGoRoutineCount();
	/**
	 * LogGoroutineStackTrace log goroutine stack trace to logcat on android
	 */
	public static native void logGoroutineStackTrace();
}