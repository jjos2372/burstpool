/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.nogrod;


import burst.pool.migrator.nogroddb.nogrod.tables.Account;
import burst.pool.migrator.nogroddb.nogrod.tables.Block;
import burst.pool.migrator.nogroddb.nogrod.tables.Miner;
import burst.pool.migrator.nogroddb.nogrod.tables.NonceSubmission;
import burst.pool.migrator.nogroddb.nogrod.tables.Transaction;
import burst.pool.migrator.nogroddb.nogrod.tables.TransactionRecipient;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in nogrod
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>nogrod.account</code>.
     */
    public static final Account ACCOUNT = burst.pool.migrator.nogroddb.nogrod.tables.Account.ACCOUNT;

    /**
     * The table <code>nogrod.block</code>.
     */
    public static final Block BLOCK = burst.pool.migrator.nogroddb.nogrod.tables.Block.BLOCK;

    /**
     * The table <code>nogrod.miner</code>.
     */
    public static final Miner MINER = burst.pool.migrator.nogroddb.nogrod.tables.Miner.MINER;

    /**
     * The table <code>nogrod.nonce_submission</code>.
     */
    public static final NonceSubmission NONCE_SUBMISSION = burst.pool.migrator.nogroddb.nogrod.tables.NonceSubmission.NONCE_SUBMISSION;

    /**
     * The table <code>nogrod.transaction</code>.
     */
    public static final Transaction TRANSACTION = burst.pool.migrator.nogroddb.nogrod.tables.Transaction.TRANSACTION;

    /**
     * The table <code>nogrod.transaction_recipient</code>.
     */
    public static final TransactionRecipient TRANSACTION_RECIPIENT = burst.pool.migrator.nogroddb.nogrod.tables.TransactionRecipient.TRANSACTION_RECIPIENT;
}
