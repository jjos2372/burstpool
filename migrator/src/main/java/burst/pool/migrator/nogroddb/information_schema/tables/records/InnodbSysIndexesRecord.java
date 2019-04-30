/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.information_schema.tables.records;


import burst.pool.migrator.nogroddb.information_schema.tables.InnodbSysIndexes;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class InnodbSysIndexesRecord extends TableRecordImpl<InnodbSysIndexesRecord> implements Record8<ULong, String, ULong, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -2109588420;

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.INDEX_ID</code>.
     */
    public void setIndexId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.INDEX_ID</code>.
     */
    public ULong getIndexId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.TABLE_ID</code>.
     */
    public void setTableId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.TYPE</code>.
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.TYPE</code>.
     */
    public Integer getType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.N_FIELDS</code>.
     */
    public void setNFields(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.N_FIELDS</code>.
     */
    public Integer getNFields() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.PAGE_NO</code>.
     */
    public void setPageNo(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.PAGE_NO</code>.
     */
    public Integer getPageNo() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.SPACE</code>.
     */
    public void setSpace(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.SPACE</code>.
     */
    public Integer getSpace() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_INDEXES.MERGE_THRESHOLD</code>.
     */
    public void setMergeThreshold(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_INDEXES.MERGE_THRESHOLD</code>.
     */
    public Integer getMergeThreshold() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, ULong, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, ULong, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.INDEX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.TABLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.N_FIELDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.PAGE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.SPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return InnodbSysIndexes.INNODB_SYS_INDEXES.MERGE_THRESHOLD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getIndexId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getNFields();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPageNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getMergeThreshold();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getIndexId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNFields();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPageNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getMergeThreshold();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value1(ULong value) {
        setIndexId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value3(ULong value) {
        setTableId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value4(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value5(Integer value) {
        setNFields(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value6(Integer value) {
        setPageNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value7(Integer value) {
        setSpace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord value8(Integer value) {
        setMergeThreshold(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysIndexesRecord values(ULong value1, String value2, ULong value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysIndexesRecord
     */
    public InnodbSysIndexesRecord() {
        super(InnodbSysIndexes.INNODB_SYS_INDEXES);
    }

    /**
     * Create a detached, initialised InnodbSysIndexesRecord
     */
    public InnodbSysIndexesRecord(ULong indexId, String name, ULong tableId, Integer type, Integer nFields, Integer pageNo, Integer space, Integer mergeThreshold) {
        super(InnodbSysIndexes.INNODB_SYS_INDEXES);

        set(0, indexId);
        set(1, name);
        set(2, tableId);
        set(3, type);
        set(4, nFields);
        set(5, pageNo);
        set(6, space);
        set(7, mergeThreshold);
    }
}
