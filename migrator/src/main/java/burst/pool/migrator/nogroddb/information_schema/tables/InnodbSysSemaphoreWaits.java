/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.information_schema.tables;


import burst.pool.migrator.nogroddb.information_schema.InformationSchema;
import burst.pool.migrator.nogroddb.information_schema.tables.records.InnodbSysSemaphoreWaitsRecord;

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
import org.jooq.types.UInteger;
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
public class InnodbSysSemaphoreWaits extends TableImpl<InnodbSysSemaphoreWaitsRecord> {

    private static final long serialVersionUID = 395641276;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS</code>
     */
    public static final InnodbSysSemaphoreWaits INNODB_SYS_SEMAPHORE_WAITS = new InnodbSysSemaphoreWaits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysSemaphoreWaitsRecord> getRecordType() {
        return InnodbSysSemaphoreWaitsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.THREAD_ID</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.OBJECT_NAME</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(4000).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.FILE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, String> FILE = createField("FILE", org.jooq.impl.SQLDataType.VARCHAR(4000).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.LINE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, UInteger> LINE = createField("LINE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.WAIT_TIME</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, ULong> WAIT_TIME = createField("WAIT_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.WAIT_OBJECT</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, ULong> WAIT_OBJECT = createField("WAIT_OBJECT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.WAIT_TYPE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, String> WAIT_TYPE = createField("WAIT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.HOLDER_THREAD_ID</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, ULong> HOLDER_THREAD_ID = createField("HOLDER_THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.HOLDER_FILE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, String> HOLDER_FILE = createField("HOLDER_FILE", org.jooq.impl.SQLDataType.VARCHAR(4000).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.HOLDER_LINE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, UInteger> HOLDER_LINE = createField("HOLDER_LINE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.CREATED_FILE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, String> CREATED_FILE = createField("CREATED_FILE", org.jooq.impl.SQLDataType.VARCHAR(4000).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.CREATED_LINE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, UInteger> CREATED_LINE = createField("CREATED_LINE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.WRITER_THREAD</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, ULong> WRITER_THREAD = createField("WRITER_THREAD", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.RESERVATION_MODE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, String> RESERVATION_MODE = createField("RESERVATION_MODE", org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.READERS</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, UInteger> READERS = createField("READERS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.WAITERS_FLAG</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, ULong> WAITERS_FLAG = createField("WAITERS_FLAG", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.LOCK_WORD</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, ULong> LOCK_WORD = createField("LOCK_WORD", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.LAST_WRITER_FILE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, String> LAST_WRITER_FILE = createField("LAST_WRITER_FILE", org.jooq.impl.SQLDataType.VARCHAR(4000).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.LAST_WRITER_LINE</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, UInteger> LAST_WRITER_LINE = createField("LAST_WRITER_LINE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS.OS_WAIT_COUNT</code>.
     */
    public final TableField<InnodbSysSemaphoreWaitsRecord, UInteger> OS_WAIT_COUNT = createField("OS_WAIT_COUNT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS</code> table reference
     */
    public InnodbSysSemaphoreWaits() {
        this(DSL.name("INNODB_SYS_SEMAPHORE_WAITS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS</code> table reference
     */
    public InnodbSysSemaphoreWaits(String alias) {
        this(DSL.name(alias), INNODB_SYS_SEMAPHORE_WAITS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_SEMAPHORE_WAITS</code> table reference
     */
    public InnodbSysSemaphoreWaits(Name alias) {
        this(alias, INNODB_SYS_SEMAPHORE_WAITS);
    }

    private InnodbSysSemaphoreWaits(Name alias, Table<InnodbSysSemaphoreWaitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysSemaphoreWaits(Name alias, Table<InnodbSysSemaphoreWaitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbSysSemaphoreWaits(Table<O> child, ForeignKey<O, InnodbSysSemaphoreWaitsRecord> key) {
        super(child, key, INNODB_SYS_SEMAPHORE_WAITS);
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
    public InnodbSysSemaphoreWaits as(String alias) {
        return new InnodbSysSemaphoreWaits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysSemaphoreWaits as(Name alias) {
        return new InnodbSysSemaphoreWaits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysSemaphoreWaits rename(String name) {
        return new InnodbSysSemaphoreWaits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysSemaphoreWaits rename(Name name) {
        return new InnodbSysSemaphoreWaits(name, null);
    }
}
