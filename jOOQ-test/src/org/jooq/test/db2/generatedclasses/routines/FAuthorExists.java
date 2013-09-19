/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1910151586;

	/**
	 * The parameter <code>LIBRARY.F_AUTHOR_EXISTS.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>LIBRARY.F_AUTHOR_EXISTS.AUTHOR_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50));

	/**
	 * Create a new routine call instance
	 */
	public FAuthorExists() {
		super("F_AUTHOR_EXISTS", org.jooq.test.db2.generatedclasses.Library.LIBRARY, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(AUTHOR_NAME);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter IN value to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.FAuthorExists.AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setAuthorName(org.jooq.Field<java.lang.String> field) {
		setField(AUTHOR_NAME, field);
	}
}
