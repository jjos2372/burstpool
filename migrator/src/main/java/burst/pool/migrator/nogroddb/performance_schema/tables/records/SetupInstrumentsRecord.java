/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.performance_schema.tables.records;


import burst.pool.migrator.nogroddb.performance_schema.enums.SetupInstrumentsEnabled;
import burst.pool.migrator.nogroddb.performance_schema.enums.SetupInstrumentsTimed;
import burst.pool.migrator.nogroddb.performance_schema.tables.SetupInstruments;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class SetupInstrumentsRecord extends TableRecordImpl<SetupInstrumentsRecord> implements Record3<String, SetupInstrumentsEnabled, SetupInstrumentsTimed> {

    private static final long serialVersionUID = 29546941;

    /**
     * Setter for <code>performance_schema.setup_instruments.NAME</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.setup_instruments.ENABLED</code>.
     */
    public void setEnabled(SetupInstrumentsEnabled value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.ENABLED</code>.
     */
    public SetupInstrumentsEnabled getEnabled() {
        return (SetupInstrumentsEnabled) get(1);
    }

    /**
     * Setter for <code>performance_schema.setup_instruments.TIMED</code>.
     */
    public void setTimed(SetupInstrumentsTimed value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.TIMED</code>.
     */
    public SetupInstrumentsTimed getTimed() {
        return (SetupInstrumentsTimed) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, SetupInstrumentsEnabled, SetupInstrumentsTimed> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, SetupInstrumentsEnabled, SetupInstrumentsTimed> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SetupInstruments.SETUP_INSTRUMENTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupInstrumentsEnabled> field2() {
        return SetupInstruments.SETUP_INSTRUMENTS.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupInstrumentsTimed> field3() {
        return SetupInstruments.SETUP_INSTRUMENTS.TIMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsEnabled component2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsTimed component3() {
        return getTimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsEnabled value2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsTimed value3() {
        return getTimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value2(SetupInstrumentsEnabled value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value3(SetupInstrumentsTimed value) {
        setTimed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord values(String value1, SetupInstrumentsEnabled value2, SetupInstrumentsTimed value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SetupInstrumentsRecord
     */
    public SetupInstrumentsRecord() {
        super(SetupInstruments.SETUP_INSTRUMENTS);
    }

    /**
     * Create a detached, initialised SetupInstrumentsRecord
     */
    public SetupInstrumentsRecord(String name, SetupInstrumentsEnabled enabled, SetupInstrumentsTimed timed) {
        super(SetupInstruments.SETUP_INSTRUMENTS);

        set(0, name);
        set(1, enabled);
        set(2, timed);
    }
}
