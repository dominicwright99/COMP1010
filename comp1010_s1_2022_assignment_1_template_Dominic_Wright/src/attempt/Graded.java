/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* []: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
//DO NOT MODIFY

package attempt;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Graded {
	String description();
	int marks();
}
