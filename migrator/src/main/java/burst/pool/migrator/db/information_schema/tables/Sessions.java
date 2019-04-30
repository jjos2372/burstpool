/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.information_schema.tables;


import burst.pool.migrator.db.information_schema.InformationSchema;
import burst.pool.migrator.db.information_schema.tables.records.SessionsRecord;
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
public class Sessions extends TableImpl<SessionsRecord> {

    private static final long serialVersionUID = 790507827;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SESSIONS</code>
     */
    public static final Sessions SESSIONS = new Sessions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionsRecord> getRecordType() {
        return SessionsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.ID</code>.
     */
    public final TableField<SessionsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.USER_NAME</code>.
     */
    public final TableField<SessionsRecord, String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.SESSION_START</code>.
     */
    public final TableField<SessionsRecord, String> SESSION_START = createField("SESSION_START", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT</code>.
     */
    public final TableField<SessionsRecord, String> STATEMENT = createField("STATEMENT", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT_START</code>.
     */
    public final TableField<SessionsRecord, String> STATEMENT_START = createField("STATEMENT_START", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.CONTAINS_UNCOMMITTED</code>.
     */
    public final TableField<SessionsRecord, String> CONTAINS_UNCOMMITTED = createField("CONTAINS_UNCOMMITTED", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
     */
    public Sessions() {
        this(DSL.name("SESSIONS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
     */
    public Sessions(String alias) {
        this(DSL.name(alias), SESSIONS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
     */
    public Sessions(Name alias) {
        this(alias, SESSIONS);
    }

    private Sessions(Name alias, Table<SessionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sessions(Name alias, Table<SessionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sessions(Table<O> child, ForeignKey<O, SessionsRecord> key) {
        super(child, key, SESSIONS);
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
    public Sessions as(String alias) {
        return new Sessions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sessions as(Name alias) {
        return new Sessions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessions rename(String name) {
        return new Sessions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessions rename(Name name) {
        return new Sessions(name, null);
    }
}
