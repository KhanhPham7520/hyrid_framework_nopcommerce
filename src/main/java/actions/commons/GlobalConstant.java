package actions.commons;

import java.io.File;

public class GlobalConstant {

    // System info
    public static final String PROJECT_PATH = System.getProperty("user.dir");

    public static final String OS_NAME = System.getProperty("os.name");

    public static final String SEPARATOR = "File.separator";

    // App Info User
    public static final String DEV_USER = "https://demo.nopcommerce.com/";

    // Download Upload File
    public static final String UPLOAD_PATH = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;

    public static final String DOWNLOAD_PATH = PROJECT_PATH + File.separator + "downloadFiles" + File.separator;

    // Wait info
    public static final long SHORT_TIMEOUT = 10;
    public static final long LONG_TIMEOUT = 30;

    // Retry Case Failed
    public static final int RETRY_NUMBER = 3;

    //HTML Report Folder
    public static final String EXTENT_PATH = PROJECT_PATH + SEPARATOR + "htmlExtent" + SEPARATOR;
    public static final String ALLURE_PATH = PROJECT_PATH + SEPARATOR + "htmlAllure" + SEPARATOR;
}
