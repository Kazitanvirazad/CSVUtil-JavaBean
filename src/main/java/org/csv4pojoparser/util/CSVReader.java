package org.csv4pojoparser.util;

import java.io.InputStream;
import java.util.List;

/**
 * @author Kazi Tanvir Azad
 */
public interface CSVReader {

    <T> List<T> createPojoListFromCSVInputStream(Class<T> clazz, InputStream inputStream);
}