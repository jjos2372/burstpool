/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.information_schema.tables;


import burst.pool.migrator.nogroddb.information_schema.InformationSchema;
import burst.pool.migrator.nogroddb.information_schema.tables.records.CollationCharacterSetApplicabilityRecord;

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
public class CollationCharacterSetApplicability extends TableImpl<CollationCharacterSetApplicabilityRecord> {

    private static final long serialVersionUID = 1306541156;

    /**
     * The reference instance of <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = new CollationCharacterSetApplicability();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollationCharacterSetApplicabilityRecord> getRecordType() {
        return CollationCharacterSetApplicabilityRecord.class;
    }

    /**
     * The column <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code> table reference
     */
    public CollationCharacterSetApplicability() {
        this(DSL.name("COLLATION_CHARACTER_SET_APPLICABILITY"), null);
    }

    /**
     * Create an aliased <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code> table reference
     */
    public CollationCharacterSetApplicability(String alias) {
        this(DSL.name(alias), COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create an aliased <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code> table reference
     */
    public CollationCharacterSetApplicability(Name alias) {
        this(alias, COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    private CollationCharacterSetApplicability(Name alias, Table<CollationCharacterSetApplicabilityRecord> aliased) {
        this(alias, aliased, null);
    }

    private CollationCharacterSetApplicability(Name alias, Table<CollationCharacterSetApplicabilityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CollationCharacterSetApplicability(Table<O> child, ForeignKey<O, CollationCharacterSetApplicabilityRecord> key) {
        super(child, key, COLLATION_CHARACTER_SET_APPLICABILITY);
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
    public CollationCharacterSetApplicability as(String alias) {
        return new CollationCharacterSetApplicability(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicability as(Name alias) {
        return new CollationCharacterSetApplicability(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CollationCharacterSetApplicability rename(String name) {
        return new CollationCharacterSetApplicability(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CollationCharacterSetApplicability rename(Name name) {
        return new CollationCharacterSetApplicability(name, null);
    }
}
