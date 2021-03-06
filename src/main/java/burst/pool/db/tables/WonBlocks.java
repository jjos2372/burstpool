/*
 * This file is generated by jOOQ.
 */
package burst.pool.db.tables;


import burst.pool.db.DefaultSchema;
import burst.pool.db.Indexes;
import burst.pool.db.Keys;
import burst.pool.db.tables.records.WonBlocksRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class WonBlocks extends TableImpl<WonBlocksRecord> {

    private static final long serialVersionUID = -673934782;

    /**
     * The reference instance of <code>won_blocks</code>
     */
    public static final WonBlocks WON_BLOCKS = new WonBlocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WonBlocksRecord> getRecordType() {
        return WonBlocksRecord.class;
    }

    /**
     * The column <code>won_blocks.db_id</code>.
     */
    public final TableField<WonBlocksRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>won_blocks.block_height</code>.
     */
    public final TableField<WonBlocksRecord, Long> BLOCK_HEIGHT = createField("block_height", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>won_blocks.block_id</code>.
     */
    public final TableField<WonBlocksRecord, Long> BLOCK_ID = createField("block_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>won_blocks.generator_id</code>.
     */
    public final TableField<WonBlocksRecord, Long> GENERATOR_ID = createField("generator_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>won_blocks.nonce</code>.
     */
    public final TableField<WonBlocksRecord, String> NONCE = createField("nonce", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>won_blocks.full_reward</code>.
     */
    public final TableField<WonBlocksRecord, Long> FULL_REWARD = createField("full_reward", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>won_blocks.pool_share</code>.
     */
    public final TableField<WonBlocksRecord, Long> POOL_SHARE = createField("pool_share", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("-1", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>won_blocks</code> table reference
     */
    public WonBlocks() {
        this(DSL.name("won_blocks"), null);
    }

    /**
     * Create an aliased <code>won_blocks</code> table reference
     */
    public WonBlocks(String alias) {
        this(DSL.name(alias), WON_BLOCKS);
    }

    /**
     * Create an aliased <code>won_blocks</code> table reference
     */
    public WonBlocks(Name alias) {
        this(alias, WON_BLOCKS);
    }

    private WonBlocks(Name alias, Table<WonBlocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private WonBlocks(Name alias, Table<WonBlocksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> WonBlocks(Table<O> child, ForeignKey<O, WonBlocksRecord> key) {
        super(child, key, WON_BLOCKS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WON_BLOCKS_PRIMARY, Indexes.WON_BLOCKS_WON_BLOCKS_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WonBlocksRecord, Long> getIdentity() {
        return Keys.IDENTITY_WON_BLOCKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WonBlocksRecord> getPrimaryKey() {
        return Keys.KEY_WON_BLOCKS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WonBlocksRecord>> getKeys() {
        return Arrays.<UniqueKey<WonBlocksRecord>>asList(Keys.KEY_WON_BLOCKS_PRIMARY, Keys.KEY_WON_BLOCKS_WON_BLOCKS_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonBlocks as(String alias) {
        return new WonBlocks(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonBlocks as(Name alias) {
        return new WonBlocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WonBlocks rename(String name) {
        return new WonBlocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WonBlocks rename(Name name) {
        return new WonBlocks(name, null);
    }
}
