/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ee.ria.libdigidocpp;

public class digidoc {
  public static String appInfo() {
    return digidocJNI.appInfo();
  }

  public static void terminate() {
    digidocJNI.terminate();
  }

  public static String version() {
    return digidocJNI.version();
  }

  public static void initializeLib(String appName, String path) {
    digidocJNI.initializeLib(appName, path);
  }

}
