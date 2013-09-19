/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTest extends org.jooq.impl.TableImpl<org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 2066722469;

	/**
	 * The singleton instance of <code>LIBRARY.T_725_LOB_TEST</code>
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.db2.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>LIBRARY.T_725_LOB_TEST.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_725_LOB_TEST);

	/**
	 * The column <code>LIBRARY.T_725_LOB_TEST.LOB</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB.length(1048576), T_725_LOB_TEST);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("T_725_LOB_TEST", org.jooq.test.db2.generatedclasses.Library.LIBRARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST);
	}
}
