/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.performance_schema.tables;


import burst.pool.migrator.nogroddb.performance_schema.PerformanceSchema;
import burst.pool.migrator.nogroddb.performance_schema.tables.records.EventsStatementsSummaryByDigestRecord;

import java.sql.Timestamp;

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
public class EventsStatementsSummaryByDigest extends TableImpl<EventsStatementsSummaryByDigestRecord> {

    private static final long serialVersionUID = 797826158;

    /**
     * The reference instance of <code>performance_schema.events_statements_summary_by_digest</code>
     */
    public static final EventsStatementsSummaryByDigest EVENTS_STATEMENTS_SUMMARY_BY_DIGEST = new EventsStatementsSummaryByDigest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsSummaryByDigestRecord> getRecordType() {
        return EventsStatementsSummaryByDigestRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SCHEMA_NAME</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.DIGEST</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, String> DIGEST = createField("DIGEST", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.DIGEST_TEXT</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, String> DIGEST_TEXT = createField("DIGEST_TEXT", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.COUNT_STAR</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_LOCK_TIME = createField("SUM_LOCK_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_ERRORS</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_ERRORS = createField("SUM_ERRORS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_WARNINGS</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_WARNINGS = createField("SUM_WARNINGS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_ROWS_AFFECTED = createField("SUM_ROWS_AFFECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_ROWS_SENT = createField("SUM_ROWS_SENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_ROWS_EXAMINED = createField("SUM_ROWS_EXAMINED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_CREATED_TMP_DISK_TABLES = createField("SUM_CREATED_TMP_DISK_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_CREATED_TMP_TABLES = createField("SUM_CREATED_TMP_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SELECT_FULL_JOIN = createField("SUM_SELECT_FULL_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SELECT_FULL_RANGE_JOIN = createField("SUM_SELECT_FULL_RANGE_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SELECT_RANGE = createField("SUM_SELECT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SELECT_RANGE_CHECK = createField("SUM_SELECT_RANGE_CHECK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SELECT_SCAN = createField("SUM_SELECT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SORT_MERGE_PASSES = createField("SUM_SORT_MERGE_PASSES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SORT_RANGE = createField("SUM_SORT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SORT_ROWS = createField("SUM_SORT_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_SORT_SCAN = createField("SUM_SORT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_NO_INDEX_USED = createField("SUM_NO_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, ULong> SUM_NO_GOOD_INDEX_USED = createField("SUM_NO_GOOD_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.FIRST_SEEN</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, Timestamp> FIRST_SEEN = createField("FIRST_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("'0000-00-00 00:00:00'", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_by_digest.LAST_SEEN</code>.
     */
    public final TableField<EventsStatementsSummaryByDigestRecord, Timestamp> LAST_SEEN = createField("LAST_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("'0000-00-00 00:00:00'", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>performance_schema.events_statements_summary_by_digest</code> table reference
     */
    public EventsStatementsSummaryByDigest() {
        this(DSL.name("events_statements_summary_by_digest"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_summary_by_digest</code> table reference
     */
    public EventsStatementsSummaryByDigest(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_SUMMARY_BY_DIGEST);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_summary_by_digest</code> table reference
     */
    public EventsStatementsSummaryByDigest(Name alias) {
        this(alias, EVENTS_STATEMENTS_SUMMARY_BY_DIGEST);
    }

    private EventsStatementsSummaryByDigest(Name alias, Table<EventsStatementsSummaryByDigestRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsSummaryByDigest(Name alias, Table<EventsStatementsSummaryByDigestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsStatementsSummaryByDigest(Table<O> child, ForeignKey<O, EventsStatementsSummaryByDigestRecord> key) {
        super(child, key, EVENTS_STATEMENTS_SUMMARY_BY_DIGEST);
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
    public EventsStatementsSummaryByDigest as(String alias) {
        return new EventsStatementsSummaryByDigest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStatementsSummaryByDigest as(Name alias) {
        return new EventsStatementsSummaryByDigest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryByDigest rename(String name) {
        return new EventsStatementsSummaryByDigest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryByDigest rename(Name name) {
        return new EventsStatementsSummaryByDigest(name, null);
    }
}
