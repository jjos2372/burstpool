/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.burstpool.tables.records;


import burst.pool.migrator.db.burstpool.tables.Poolstate;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class PoolstateRecord extends UpdatableRecordImpl<PoolstateRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1621012442;

    /**
     * Setter for <code>BURSTPOOL.POOLSTATE.KEY</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>BURSTPOOL.POOLSTATE.KEY</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>BURSTPOOL.POOLSTATE.VALUE</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>BURSTPOOL.POOLSTATE.VALUE</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Poolstate.POOLSTATE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Poolstate.POOLSTATE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoolstateRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoolstateRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoolstateRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PoolstateRecord
     */
    public PoolstateRecord() {
        super(Poolstate.POOLSTATE);
    }

    /**
     * Create a detached, initialised PoolstateRecord
     */
    public PoolstateRecord(String key, String value) {
        super(Poolstate.POOLSTATE);

        set(0, key);
        set(1, value);
    }
}
