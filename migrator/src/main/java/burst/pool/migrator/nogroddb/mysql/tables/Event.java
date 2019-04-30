/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.mysql.tables;


import burst.pool.migrator.nogroddb.mysql.Indexes;
import burst.pool.migrator.nogroddb.mysql.Keys;
import burst.pool.migrator.nogroddb.mysql.Mysql;
import burst.pool.migrator.nogroddb.mysql.enums.EventIntervalField;
import burst.pool.migrator.nogroddb.mysql.enums.EventOnCompletion;
import burst.pool.migrator.nogroddb.mysql.enums.EventStatus;
import burst.pool.migrator.nogroddb.mysql.tables.records.EventRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * Events
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Event extends TableImpl<EventRecord> {

    private static final long serialVersionUID = -1341164479;

    /**
     * The reference instance of <code>mysql.event</code>
     */
    public static final Event EVENT = new Event();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventRecord> getRecordType() {
        return EventRecord.class;
    }

    /**
     * The column <code>mysql.event.db</code>.
     */
    public final TableField<EventRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.name</code>.
     */
    public final TableField<EventRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.body</code>.
     */
    public final TableField<EventRecord, byte[]> BODY = createField("body", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.event.definer</code>.
     */
    public final TableField<EventRecord, String> DEFINER = createField("definer", org.jooq.impl.SQLDataType.CHAR(141).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.execute_at</code>.
     */
    public final TableField<EventRecord, Timestamp> EXECUTE_AT = createField("execute_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.event.interval_value</code>.
     */
    public final TableField<EventRecord, Integer> INTERVAL_VALUE = createField("interval_value", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mysql.event.interval_field</code>.
     */
    public final TableField<EventRecord, EventIntervalField> INTERVAL_FIELD = createField("interval_field", org.jooq.impl.SQLDataType.VARCHAR(18).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(burst.pool.migrator.nogroddb.mysql.enums.EventIntervalField.class), this, "");

    /**
     * The column <code>mysql.event.created</code>.
     */
    public final TableField<EventRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.event.modified</code>.
     */
    public final TableField<EventRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("'0000-00-00 00:00:00'", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.event.last_executed</code>.
     */
    public final TableField<EventRecord, Timestamp> LAST_EXECUTED = createField("last_executed", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.event.starts</code>.
     */
    public final TableField<EventRecord, Timestamp> STARTS = createField("starts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.event.ends</code>.
     */
    public final TableField<EventRecord, Timestamp> ENDS = createField("ends", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.event.status</code>.
     */
    public final TableField<EventRecord, EventStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false).defaultValue(org.jooq.impl.DSL.field("'ENABLED'", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(burst.pool.migrator.nogroddb.mysql.enums.EventStatus.class), this, "");

    /**
     * The column <code>mysql.event.on_completion</code>.
     */
    public final TableField<EventRecord, EventOnCompletion> ON_COMPLETION = createField("on_completion", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.field("'DROP'", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(burst.pool.migrator.nogroddb.mysql.enums.EventOnCompletion.class), this, "");

    /**
     * The column <code>mysql.event.sql_mode</code>.
     */
    public final TableField<EventRecord, String> SQL_MODE = createField("sql_mode", org.jooq.impl.SQLDataType.VARCHAR(539).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.event.comment</code>.
     */
    public final TableField<EventRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.originator</code>.
     */
    public final TableField<EventRecord, UInteger> ORIGINATOR = createField("originator", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.event.time_zone</code>.
     */
    public final TableField<EventRecord, String> TIME_ZONE = createField("time_zone", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'SYSTEM'", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.character_set_client</code>.
     */
    public final TableField<EventRecord, String> CHARACTER_SET_CLIENT = createField("character_set_client", org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.collation_connection</code>.
     */
    public final TableField<EventRecord, String> COLLATION_CONNECTION = createField("collation_connection", org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.db_collation</code>.
     */
    public final TableField<EventRecord, String> DB_COLLATION = createField("db_collation", org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.body_utf8</code>.
     */
    public final TableField<EventRecord, byte[]> BODY_UTF8 = createField("body_utf8", org.jooq.impl.SQLDataType.BLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BLOB)), this, "");

    /**
     * Create a <code>mysql.event</code> table reference
     */
    public Event() {
        this(DSL.name("event"), null);
    }

    /**
     * Create an aliased <code>mysql.event</code> table reference
     */
    public Event(String alias) {
        this(DSL.name(alias), EVENT);
    }

    /**
     * Create an aliased <code>mysql.event</code> table reference
     */
    public Event(Name alias) {
        this(alias, EVENT);
    }

    private Event(Name alias, Table<EventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Event(Name alias, Table<EventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Events"));
    }

    public <O extends Record> Event(Table<O> child, ForeignKey<O, EventRecord> key) {
        super(child, key, EVENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EventRecord> getPrimaryKey() {
        return Keys.KEY_EVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventRecord>> getKeys() {
        return Arrays.<UniqueKey<EventRecord>>asList(Keys.KEY_EVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Event as(String alias) {
        return new Event(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Event as(Name alias) {
        return new Event(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Event rename(String name) {
        return new Event(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Event rename(Name name) {
        return new Event(name, null);
    }
}
