/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.mysql.tables;


import burst.pool.migrator.nogroddb.mysql.Indexes;
import burst.pool.migrator.nogroddb.mysql.Keys;
import burst.pool.migrator.nogroddb.mysql.Mysql;
import burst.pool.migrator.nogroddb.mysql.tables.records.InnodbIndexStatsRecord;

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
public class InnodbIndexStats extends TableImpl<InnodbIndexStatsRecord> {

    private static final long serialVersionUID = -142330172;

    /**
     * The reference instance of <code>mysql.innodb_index_stats</code>
     */
    public static final InnodbIndexStats INNODB_INDEX_STATS = new InnodbIndexStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbIndexStatsRecord> getRecordType() {
        return InnodbIndexStatsRecord.class;
    }

    /**
     * The column <code>mysql.innodb_index_stats.database_name</code>.
     */
    public final TableField<InnodbIndexStatsRecord, String> DATABASE_NAME = createField("database_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_index_stats.table_name</code>.
     */
    public final TableField<InnodbIndexStatsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(199).nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_index_stats.index_name</code>.
     */
    public final TableField<InnodbIndexStatsRecord, String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_index_stats.last_update</code>.
     */
    public final TableField<InnodbIndexStatsRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.innodb_index_stats.stat_name</code>.
     */
    public final TableField<InnodbIndexStatsRecord, String> STAT_NAME = createField("stat_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_index_stats.stat_value</code>.
     */
    public final TableField<InnodbIndexStatsRecord, ULong> STAT_VALUE = createField("stat_value", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_index_stats.sample_size</code>.
     */
    public final TableField<InnodbIndexStatsRecord, ULong> SAMPLE_SIZE = createField("sample_size", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>mysql.innodb_index_stats.stat_description</code>.
     */
    public final TableField<InnodbIndexStatsRecord, String> STAT_DESCRIPTION = createField("stat_description", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * Create a <code>mysql.innodb_index_stats</code> table reference
     */
    public InnodbIndexStats() {
        this(DSL.name("innodb_index_stats"), null);
    }

    /**
     * Create an aliased <code>mysql.innodb_index_stats</code> table reference
     */
    public InnodbIndexStats(String alias) {
        this(DSL.name(alias), INNODB_INDEX_STATS);
    }

    /**
     * Create an aliased <code>mysql.innodb_index_stats</code> table reference
     */
    public InnodbIndexStats(Name alias) {
        this(alias, INNODB_INDEX_STATS);
    }

    private InnodbIndexStats(Name alias, Table<InnodbIndexStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbIndexStats(Name alias, Table<InnodbIndexStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbIndexStats(Table<O> child, ForeignKey<O, InnodbIndexStatsRecord> key) {
        super(child, key, INNODB_INDEX_STATS);
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
        return Arrays.<Index>asList(Indexes.INNODB_INDEX_STATS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InnodbIndexStatsRecord> getPrimaryKey() {
        return Keys.KEY_INNODB_INDEX_STATS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InnodbIndexStatsRecord>> getKeys() {
        return Arrays.<UniqueKey<InnodbIndexStatsRecord>>asList(Keys.KEY_INNODB_INDEX_STATS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStats as(String alias) {
        return new InnodbIndexStats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStats as(Name alias) {
        return new InnodbIndexStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbIndexStats rename(String name) {
        return new InnodbIndexStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbIndexStats rename(Name name) {
        return new InnodbIndexStats(name, null);
    }
}
