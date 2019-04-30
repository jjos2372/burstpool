/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.performance_schema.tables;


import burst.pool.migrator.nogroddb.performance_schema.PerformanceSchema;
import burst.pool.migrator.nogroddb.performance_schema.tables.records.SessionConnectAttrsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SessionConnectAttrs extends TableImpl<SessionConnectAttrsRecord> {

    private static final long serialVersionUID = -315976380;

    /**
     * The reference instance of <code>performance_schema.session_connect_attrs</code>
     */
    public static final SessionConnectAttrs SESSION_CONNECT_ATTRS = new SessionConnectAttrs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionConnectAttrsRecord> getRecordType() {
        return SessionConnectAttrsRecord.class;
    }

    /**
     * The column <code>performance_schema.session_connect_attrs.PROCESSLIST_ID</code>.
     */
    public final TableField<SessionConnectAttrsRecord, Integer> PROCESSLIST_ID = createField("PROCESSLIST_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performance_schema.session_connect_attrs.ATTR_NAME</code>.
     */
    public final TableField<SessionConnectAttrsRecord, String> ATTR_NAME = createField("ATTR_NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.session_connect_attrs.ATTR_VALUE</code>.
     */
    public final TableField<SessionConnectAttrsRecord, String> ATTR_VALUE = createField("ATTR_VALUE", org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.session_connect_attrs.ORDINAL_POSITION</code>.
     */
    public final TableField<SessionConnectAttrsRecord, Integer> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>performance_schema.session_connect_attrs</code> table reference
     */
    public SessionConnectAttrs() {
        this(DSL.name("session_connect_attrs"), null);
    }

    /**
     * Create an aliased <code>performance_schema.session_connect_attrs</code> table reference
     */
    public SessionConnectAttrs(String alias) {
        this(DSL.name(alias), SESSION_CONNECT_ATTRS);
    }

    /**
     * Create an aliased <code>performance_schema.session_connect_attrs</code> table reference
     */
    public SessionConnectAttrs(Name alias) {
        this(alias, SESSION_CONNECT_ATTRS);
    }

    private SessionConnectAttrs(Name alias, Table<SessionConnectAttrsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionConnectAttrs(Name alias, Table<SessionConnectAttrsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SessionConnectAttrs(Table<O> child, ForeignKey<O, SessionConnectAttrsRecord> key) {
        super(child, key, SESSION_CONNECT_ATTRS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionConnectAttrs as(String alias) {
        return new SessionConnectAttrs(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionConnectAttrs as(Name alias) {
        return new SessionConnectAttrs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionConnectAttrs rename(String name) {
        return new SessionConnectAttrs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionConnectAttrs rename(Name name) {
        return new SessionConnectAttrs(name, null);
    }
}
