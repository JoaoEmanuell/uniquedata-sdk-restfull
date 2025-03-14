package br.com.uniquedata.sdk.restfull.annotation.simple;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * Annotation indicates that you can create an object with the map atribute form data.
 * 
 * <p>Supported for annotated handler methods.
 * 
 * <p> Example:
 *
 * <pre>
Map<String, Object> atributeFormData = ...;
atributeFormData.put("fist","JADER");
atributeFormData.put("last","BERTI");

"@UniqueDataRestPost(endpoint = "/",accept = RestFullMediaType.APPLICATION_X_WWW_FORM_URLENCODED)
public TestResponseBodyDto save(@RestFullMapToFormData final Map<String, Object> formaDataMa);"	
 </pre>
 * 
 * @author Jaderson Berti
 * @author Unique Data Inovatation (company)
 * @since 1.0
 * @see RestFullBody
 * @see RestFullObjectToParam
 * @see RestFullMapToParam
 * @see RestFullFormData
 * @see RestFullObjectToFormData
 *
 */
@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestFullMapToFormData {

}
