package org.benf.cfr.reader.bytecode.analysis.types;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 14/07/2012
 * Time: 20:44
 */
public interface TypeConstants {
    public final static JavaRefTypeInstance OBJECT = JavaRefTypeInstance.createTypeConstant("java.lang.Object", "Object");
    public final static JavaRefTypeInstance ENUM = JavaRefTypeInstance.createTypeConstant("java.lang.Enum", "Enum", OBJECT);
    public final static JavaRefTypeInstance ASSERTION_ERROR = JavaRefTypeInstance.createTypeConstant("java.lang.AssertionError", "AssertionError", OBJECT);
    public final static JavaRefTypeInstance STRING = JavaRefTypeInstance.createTypeConstant("java.lang.String", "String", OBJECT);

    public final static String boxingNameBoolean = "java.lang.Boolean";
    public final static String boxingNameByte = "java.lang.Byte";
    public final static String boxingNameShort = "java.lang.Short";
    public final static String boxingNameChar = "java.lang.Character";
    public final static String boxingNameInt = "java.lang.Integer";
    public final static String boxingNameLong = "java.lang.Long";
    public final static String boxingNameFloat = "java.lang.Float";
    public final static String boxingNameDouble = "java.lang.Double";
    public final static String boxingNameNumber = "java.lang.Number";

    public final static String throwableName = "java.lang.Throwable";
    public final static String stringName = "java.lang.String";
    public final static String charSequenceName = "java.lang.CharSequence";
    public final static String stringBuilderName = "java.lang.StringBuilder";
    public final static String stringBufferName = "java.lang.StringBuffer";

    public final static String lambdaMetaFactoryName = "java.lang.invoke.LambdaMetafactory";

    // Path, because we actually want to load the class - could we get away with a hardcoded ref type as above?
    public final static String runtimeExceptionPath = "java/lang/RuntimeException.class";

}
