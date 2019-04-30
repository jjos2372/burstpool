/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb.performance_schema;


import burst.pool.migrator.nogroddb.performance_schema.tables.Accounts;
import burst.pool.migrator.nogroddb.performance_schema.tables.CondInstances;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesCurrent;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesHistory;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesHistoryLong;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByAccountByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByHostByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByThreadByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByUserByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryGlobalByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsCurrent;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsHistory;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsHistoryLong;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByAccountByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByDigest;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByHostByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByThreadByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByUserByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryGlobalByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsCurrent;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsHistory;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsHistoryLong;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByAccountByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByHostByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByInstance;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByThreadByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByUserByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryGlobalByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.FileInstances;
import burst.pool.migrator.nogroddb.performance_schema.tables.FileSummaryByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.FileSummaryByInstance;
import burst.pool.migrator.nogroddb.performance_schema.tables.HostCache;
import burst.pool.migrator.nogroddb.performance_schema.tables.Hosts;
import burst.pool.migrator.nogroddb.performance_schema.tables.MutexInstances;
import burst.pool.migrator.nogroddb.performance_schema.tables.ObjectsSummaryGlobalByType;
import burst.pool.migrator.nogroddb.performance_schema.tables.PerformanceTimers;
import burst.pool.migrator.nogroddb.performance_schema.tables.RwlockInstances;
import burst.pool.migrator.nogroddb.performance_schema.tables.SessionAccountConnectAttrs;
import burst.pool.migrator.nogroddb.performance_schema.tables.SessionConnectAttrs;
import burst.pool.migrator.nogroddb.performance_schema.tables.SetupActors;
import burst.pool.migrator.nogroddb.performance_schema.tables.SetupConsumers;
import burst.pool.migrator.nogroddb.performance_schema.tables.SetupInstruments;
import burst.pool.migrator.nogroddb.performance_schema.tables.SetupObjects;
import burst.pool.migrator.nogroddb.performance_schema.tables.SetupTimers;
import burst.pool.migrator.nogroddb.performance_schema.tables.SocketInstances;
import burst.pool.migrator.nogroddb.performance_schema.tables.SocketSummaryByEventName;
import burst.pool.migrator.nogroddb.performance_schema.tables.SocketSummaryByInstance;
import burst.pool.migrator.nogroddb.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;
import burst.pool.migrator.nogroddb.performance_schema.tables.TableIoWaitsSummaryByTable;
import burst.pool.migrator.nogroddb.performance_schema.tables.TableLockWaitsSummaryByTable;
import burst.pool.migrator.nogroddb.performance_schema.tables.Threads;
import burst.pool.migrator.nogroddb.performance_schema.tables.Users;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in performance_schema
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
     * The table <code>performance_schema.accounts</code>.
     */
    public static final Accounts ACCOUNTS = burst.pool.migrator.nogroddb.performance_schema.tables.Accounts.ACCOUNTS;

    /**
     * The table <code>performance_schema.cond_instances</code>.
     */
    public static final CondInstances COND_INSTANCES = burst.pool.migrator.nogroddb.performance_schema.tables.CondInstances.COND_INSTANCES;

    /**
     * The table <code>performance_schema.events_stages_current</code>.
     */
    public static final EventsStagesCurrent EVENTS_STAGES_CURRENT = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesCurrent.EVENTS_STAGES_CURRENT;

    /**
     * The table <code>performance_schema.events_stages_history</code>.
     */
    public static final EventsStagesHistory EVENTS_STAGES_HISTORY = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesHistory.EVENTS_STAGES_HISTORY;

    /**
     * The table <code>performance_schema.events_stages_history_long</code>.
     */
    public static final EventsStagesHistoryLong EVENTS_STAGES_HISTORY_LONG = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_stages_summary_by_account_by_event_name</code>.
     */
    public static final EventsStagesSummaryByAccountByEventName EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_host_by_event_name</code>.
     */
    public static final EventsStagesSummaryByHostByEventName EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>.
     */
    public static final EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_user_by_event_name</code>.
     */
    public static final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_global_by_event_name</code>.
     */
    public static final EventsStagesSummaryGlobalByEventName EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_current</code>.
     */
    public static final EventsStatementsCurrent EVENTS_STATEMENTS_CURRENT = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT;

    /**
     * The table <code>performance_schema.events_statements_history</code>.
     */
    public static final EventsStatementsHistory EVENTS_STATEMENTS_HISTORY = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY;

    /**
     * The table <code>performance_schema.events_statements_history_long</code>.
     */
    public static final EventsStatementsHistoryLong EVENTS_STATEMENTS_HISTORY_LONG = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_statements_summary_by_account_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByAccountByEventName EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_digest</code>.
     */
    public static final EventsStatementsSummaryByDigest EVENTS_STATEMENTS_SUMMARY_BY_DIGEST = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST;

    /**
     * The table <code>performance_schema.events_statements_summary_by_host_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByHostByEventName EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_thread_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByThreadByEventName EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_user_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByUserByEventName EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_global_by_event_name</code>.
     */
    public static final EventsStatementsSummaryGlobalByEventName EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_current</code>.
     */
    public static final EventsWaitsCurrent EVENTS_WAITS_CURRENT = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT;

    /**
     * The table <code>performance_schema.events_waits_history</code>.
     */
    public static final EventsWaitsHistory EVENTS_WAITS_HISTORY = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsHistory.EVENTS_WAITS_HISTORY;

    /**
     * The table <code>performance_schema.events_waits_history_long</code>.
     */
    public static final EventsWaitsHistoryLong EVENTS_WAITS_HISTORY_LONG = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_waits_summary_by_account_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByAccountByEventName EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_host_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByHostByEventName EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_instance</code>.
     */
    public static final EventsWaitsSummaryByInstance EVENTS_WAITS_SUMMARY_BY_INSTANCE = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_user_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByUserByEventName EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_global_by_event_name</code>.
     */
    public static final EventsWaitsSummaryGlobalByEventName EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_instances</code>.
     */
    public static final FileInstances FILE_INSTANCES = burst.pool.migrator.nogroddb.performance_schema.tables.FileInstances.FILE_INSTANCES;

    /**
     * The table <code>performance_schema.file_summary_by_event_name</code>.
     */
    public static final FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_summary_by_instance</code>.
     */
    public static final FileSummaryByInstance FILE_SUMMARY_BY_INSTANCE = burst.pool.migrator.nogroddb.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.hosts</code>.
     */
    public static final Hosts HOSTS = burst.pool.migrator.nogroddb.performance_schema.tables.Hosts.HOSTS;

    /**
     * The table <code>performance_schema.host_cache</code>.
     */
    public static final HostCache HOST_CACHE = burst.pool.migrator.nogroddb.performance_schema.tables.HostCache.HOST_CACHE;

    /**
     * The table <code>performance_schema.mutex_instances</code>.
     */
    public static final MutexInstances MUTEX_INSTANCES = burst.pool.migrator.nogroddb.performance_schema.tables.MutexInstances.MUTEX_INSTANCES;

    /**
     * The table <code>performance_schema.objects_summary_global_by_type</code>.
     */
    public static final ObjectsSummaryGlobalByType OBJECTS_SUMMARY_GLOBAL_BY_TYPE = burst.pool.migrator.nogroddb.performance_schema.tables.ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE;

    /**
     * The table <code>performance_schema.performance_timers</code>.
     */
    public static final PerformanceTimers PERFORMANCE_TIMERS = burst.pool.migrator.nogroddb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS;

    /**
     * The table <code>performance_schema.rwlock_instances</code>.
     */
    public static final RwlockInstances RWLOCK_INSTANCES = burst.pool.migrator.nogroddb.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES;

    /**
     * The table <code>performance_schema.session_account_connect_attrs</code>.
     */
    public static final SessionAccountConnectAttrs SESSION_ACCOUNT_CONNECT_ATTRS = burst.pool.migrator.nogroddb.performance_schema.tables.SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_connect_attrs</code>.
     */
    public static final SessionConnectAttrs SESSION_CONNECT_ATTRS = burst.pool.migrator.nogroddb.performance_schema.tables.SessionConnectAttrs.SESSION_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.setup_actors</code>.
     */
    public static final SetupActors SETUP_ACTORS = burst.pool.migrator.nogroddb.performance_schema.tables.SetupActors.SETUP_ACTORS;

    /**
     * The table <code>performance_schema.setup_consumers</code>.
     */
    public static final SetupConsumers SETUP_CONSUMERS = burst.pool.migrator.nogroddb.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS;

    /**
     * The table <code>performance_schema.setup_instruments</code>.
     */
    public static final SetupInstruments SETUP_INSTRUMENTS = burst.pool.migrator.nogroddb.performance_schema.tables.SetupInstruments.SETUP_INSTRUMENTS;

    /**
     * The table <code>performance_schema.setup_objects</code>.
     */
    public static final SetupObjects SETUP_OBJECTS = burst.pool.migrator.nogroddb.performance_schema.tables.SetupObjects.SETUP_OBJECTS;

    /**
     * The table <code>performance_schema.setup_timers</code>.
     */
    public static final SetupTimers SETUP_TIMERS = burst.pool.migrator.nogroddb.performance_schema.tables.SetupTimers.SETUP_TIMERS;

    /**
     * The table <code>performance_schema.socket_instances</code>.
     */
    public static final SocketInstances SOCKET_INSTANCES = burst.pool.migrator.nogroddb.performance_schema.tables.SocketInstances.SOCKET_INSTANCES;

    /**
     * The table <code>performance_schema.socket_summary_by_event_name</code>.
     */
    public static final SocketSummaryByEventName SOCKET_SUMMARY_BY_EVENT_NAME = burst.pool.migrator.nogroddb.performance_schema.tables.SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.socket_summary_by_instance</code>.
     */
    public static final SocketSummaryByInstance SOCKET_SUMMARY_BY_INSTANCE = burst.pool.migrator.nogroddb.performance_schema.tables.SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_index_usage</code>.
     */
    public static final TableIoWaitsSummaryByIndexUsage TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE = burst.pool.migrator.nogroddb.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_table</code>.
     */
    public static final TableIoWaitsSummaryByTable TABLE_IO_WAITS_SUMMARY_BY_TABLE = burst.pool.migrator.nogroddb.performance_schema.tables.TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.table_lock_waits_summary_by_table</code>.
     */
    public static final TableLockWaitsSummaryByTable TABLE_LOCK_WAITS_SUMMARY_BY_TABLE = burst.pool.migrator.nogroddb.performance_schema.tables.TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.threads</code>.
     */
    public static final Threads THREADS = burst.pool.migrator.nogroddb.performance_schema.tables.Threads.THREADS;

    /**
     * The table <code>performance_schema.users</code>.
     */
    public static final Users USERS = burst.pool.migrator.nogroddb.performance_schema.tables.Users.USERS;
}
