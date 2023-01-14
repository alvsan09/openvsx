/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables;


import java.util.Arrays;
import java.util.List;

import org.eclipse.openvsx.jooq.Keys;
import org.eclipse.openvsx.jooq.Public;
import org.eclipse.openvsx.jooq.tables.records.JobrunrRecurringJobsRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobrunrRecurringJobs extends TableImpl<JobrunrRecurringJobsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.jobrunr_recurring_jobs</code>
     */
    public static final JobrunrRecurringJobs JOBRUNR_RECURRING_JOBS = new JobrunrRecurringJobs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobrunrRecurringJobsRecord> getRecordType() {
        return JobrunrRecurringJobsRecord.class;
    }

    /**
     * The column <code>public.jobrunr_recurring_jobs.id</code>.
     */
    public final TableField<JobrunrRecurringJobsRecord, String> ID = createField(DSL.name("id"), SQLDataType.CHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_recurring_jobs.version</code>.
     */
    public final TableField<JobrunrRecurringJobsRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_recurring_jobs.jobasjson</code>.
     */
    public final TableField<JobrunrRecurringJobsRecord, String> JOBASJSON = createField(DSL.name("jobasjson"), SQLDataType.CLOB.nullable(false), this, "");

    private JobrunrRecurringJobs(Name alias, Table<JobrunrRecurringJobsRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobrunrRecurringJobs(Name alias, Table<JobrunrRecurringJobsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.jobrunr_recurring_jobs</code> table reference
     */
    public JobrunrRecurringJobs(String alias) {
        this(DSL.name(alias), JOBRUNR_RECURRING_JOBS);
    }

    /**
     * Create an aliased <code>public.jobrunr_recurring_jobs</code> table reference
     */
    public JobrunrRecurringJobs(Name alias) {
        this(alias, JOBRUNR_RECURRING_JOBS);
    }

    /**
     * Create a <code>public.jobrunr_recurring_jobs</code> table reference
     */
    public JobrunrRecurringJobs() {
        this(DSL.name("jobrunr_recurring_jobs"), null);
    }

    public <O extends Record> JobrunrRecurringJobs(Table<O> child, ForeignKey<O, JobrunrRecurringJobsRecord> key) {
        super(child, key, JOBRUNR_RECURRING_JOBS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<JobrunrRecurringJobsRecord> getPrimaryKey() {
        return Keys.JOBRUNR_RECURRING_JOBS_PKEY;
    }

    @Override
    public List<UniqueKey<JobrunrRecurringJobsRecord>> getKeys() {
        return Arrays.<UniqueKey<JobrunrRecurringJobsRecord>>asList(Keys.JOBRUNR_RECURRING_JOBS_PKEY);
    }

    @Override
    public JobrunrRecurringJobs as(String alias) {
        return new JobrunrRecurringJobs(DSL.name(alias), this);
    }

    @Override
    public JobrunrRecurringJobs as(Name alias) {
        return new JobrunrRecurringJobs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobrunrRecurringJobs rename(String name) {
        return new JobrunrRecurringJobs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JobrunrRecurringJobs rename(Name name) {
        return new JobrunrRecurringJobs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}