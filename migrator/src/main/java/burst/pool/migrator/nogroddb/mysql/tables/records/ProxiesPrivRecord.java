/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.mysql.tables.records;


import burst.pool.migrator.nogroddb.mysql.tables.ProxiesPriv;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * User proxy privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProxiesPrivRecord extends UpdatableRecordImpl<ProxiesPrivRecord> implements Record7<String, String, String, String, Byte, String, Timestamp> {

    private static final long serialVersionUID = 872934746;

    /**
     * Setter for <code>mysql.proxies_priv.Host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.proxies_priv.Host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.proxies_priv.User</code>.
     */
    public void setUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.proxies_priv.User</code>.
     */
    public String getUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.proxies_priv.Proxied_host</code>.
     */
    public void setProxiedHost(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.proxies_priv.Proxied_host</code>.
     */
    public String getProxiedHost() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.proxies_priv.Proxied_user</code>.
     */
    public void setProxiedUser(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.proxies_priv.Proxied_user</code>.
     */
    public String getProxiedUser() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.proxies_priv.With_grant</code>.
     */
    public void setWithGrant(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.proxies_priv.With_grant</code>.
     */
    public Byte getWithGrant() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mysql.proxies_priv.Grantor</code>.
     */
    public void setGrantor(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.proxies_priv.Grantor</code>.
     */
    public String getGrantor() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mysql.proxies_priv.Timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.proxies_priv.Timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Byte, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Byte, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ProxiesPriv.PROXIES_PRIV.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ProxiesPriv.PROXIES_PRIV.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ProxiesPriv.PROXIES_PRIV.PROXIED_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ProxiesPriv.PROXIES_PRIV.PROXIED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return ProxiesPriv.PROXIES_PRIV.WITH_GRANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ProxiesPriv.PROXIES_PRIV.GRANTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ProxiesPriv.PROXIES_PRIV.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProxiedHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProxiedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getWithGrant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProxiedHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProxiedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getWithGrant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord value2(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord value3(String value) {
        setProxiedHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord value4(String value) {
        setProxiedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord value5(Byte value) {
        setWithGrant(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord value6(String value) {
        setGrantor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord value7(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProxiesPrivRecord values(String value1, String value2, String value3, String value4, Byte value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProxiesPrivRecord
     */
    public ProxiesPrivRecord() {
        super(ProxiesPriv.PROXIES_PRIV);
    }

    /**
     * Create a detached, initialised ProxiesPrivRecord
     */
    public ProxiesPrivRecord(String host, String user, String proxiedHost, String proxiedUser, Byte withGrant, String grantor, Timestamp timestamp) {
        super(ProxiesPriv.PROXIES_PRIV);

        set(0, host);
        set(1, user);
        set(2, proxiedHost);
        set(3, proxiedUser);
        set(4, withGrant);
        set(5, grantor);
        set(6, timestamp);
    }
}
