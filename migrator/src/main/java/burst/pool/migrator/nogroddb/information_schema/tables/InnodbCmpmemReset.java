/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.information_schema.tables;


import burst.pool.migrator.nogroddb.information_schema.InformationSchema;
import burst.pool.migrator.nogroddb.information_schema.tables.records.InnodbCmpmemResetRecord;

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
public class InnodbCmpmemReset extends TableImpl<InnodbCmpmemResetRecord> {

    private static final long serialVersionUID = 102557303;

    /**
     * The reference instance of <code>information_schema.INNODB_CMPMEM_RESET</code>
     */
    public static final InnodbCmpmemReset INNODB_CMPMEM_RESET = new InnodbCmpmemReset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpmemResetRecord> getRecordType() {
        return InnodbCmpmemResetRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.page_size</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.buffer_pool_instance</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> BUFFER_POOL_INSTANCE = createField("buffer_pool_instance", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_used</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> PAGES_USED = createField("pages_used", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_free</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> PAGES_FREE = createField("pages_free", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_ops</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Long> RELOCATION_OPS = createField("relocation_ops", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_time</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> RELOCATION_TIME = createField("relocation_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    public InnodbCmpmemReset() {
        this(DSL.name("INNODB_CMPMEM_RESET"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    public InnodbCmpmemReset(String alias) {
        this(DSL.name(alias), INNODB_CMPMEM_RESET);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    public InnodbCmpmemReset(Name alias) {
        this(alias, INNODB_CMPMEM_RESET);
    }

    private InnodbCmpmemReset(Name alias, Table<InnodbCmpmemResetRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpmemReset(Name alias, Table<InnodbCmpmemResetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbCmpmemReset(Table<O> child, ForeignKey<O, InnodbCmpmemResetRecord> key) {
        super(child, key, INNODB_CMPMEM_RESET);
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
    public InnodbCmpmemReset as(String alias) {
        return new InnodbCmpmemReset(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmemReset as(Name alias) {
        return new InnodbCmpmemReset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmemReset rename(String name) {
        return new InnodbCmpmemReset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmemReset rename(Name name) {
        return new InnodbCmpmemReset(name, null);
    }
}
