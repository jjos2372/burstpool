/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.information_schema.tables;


import burst.pool.migrator.db.information_schema.InformationSchema;
import burst.pool.migrator.db.information_schema.tables.records.SessionStateRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

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
public class SessionState extends TableImpl<SessionStateRecord> {

    private static final long serialVersionUID = -1986414625;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SESSION_STATE</code>
     */
    public static final SessionState SESSION_STATE = new SessionState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionStateRecord> getRecordType() {
        return SessionStateRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SESSION_STATE.KEY</code>.
     */
    public final TableField<SessionStateRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSION_STATE.SQL</code>.
     */
    public final TableField<SessionStateRecord, String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.SESSION_STATE</code> table reference
     */
    public SessionState() {
        this(DSL.name("SESSION_STATE"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSION_STATE</code> table reference
     */
    public SessionState(String alias) {
        this(DSL.name(alias), SESSION_STATE);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSION_STATE</code> table reference
     */
    public SessionState(Name alias) {
        this(alias, SESSION_STATE);
    }

    private SessionState(Name alias, Table<SessionStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionState(Name alias, Table<SessionStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SessionState(Table<O> child, ForeignKey<O, SessionStateRecord> key) {
        super(child, key, SESSION_STATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionState as(String alias) {
        return new SessionState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionState as(Name alias) {
        return new SessionState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionState rename(String name) {
        return new SessionState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionState rename(Name name) {
        return new SessionState(name, null);
    }
}
