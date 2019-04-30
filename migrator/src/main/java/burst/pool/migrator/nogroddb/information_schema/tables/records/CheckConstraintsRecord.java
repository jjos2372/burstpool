/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.information_schema.tables.records;


import burst.pool.migrator.nogroddb.information_schema.tables.CheckConstraints;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraintsRecord extends TableRecordImpl<CheckConstraintsRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 653409501;

    /**
     * Setter for <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.CHECK_CONSTRAINTS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.CHECK_CONSTRAINTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public void setCheckClause(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public String getCheckClause() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CheckConstraints.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CheckConstraints.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CheckConstraints.CHECK_CONSTRAINTS.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CheckConstraints.CHECK_CONSTRAINTS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CheckConstraints.CHECK_CONSTRAINTS.CHECK_CLAUSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCheckClause();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCheckClause();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintsRecord value4(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintsRecord value5(String value) {
        setCheckClause(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintsRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CheckConstraintsRecord
     */
    public CheckConstraintsRecord() {
        super(CheckConstraints.CHECK_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised CheckConstraintsRecord
     */
    public CheckConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableName, String checkClause) {
        super(CheckConstraints.CHECK_CONSTRAINTS);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, tableName);
        set(4, checkClause);
    }
}
