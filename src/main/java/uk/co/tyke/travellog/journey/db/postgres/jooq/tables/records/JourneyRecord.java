/*
 * This file is generated by jOOQ.
 */
package uk.co.tyke.travellog.journey.db.postgres.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import uk.co.tyke.travellog.journey.data.jooq.tables.Journey;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JourneyRecord extends UpdatableRecordImpl<JourneyRecord> implements Record4<Long, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>travellog_journey_dev_schema.journey.journey_id</code>.
     */
    public void setJourneyId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>travellog_journey_dev_schema.journey.journey_id</code>.
     */
    public Long getJourneyId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>travellog_journey_dev_schema.journey.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>travellog_journey_dev_schema.journey.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>travellog_journey_dev_schema.journey.notes</code>.
     */
    public void setNotes(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>travellog_journey_dev_schema.journey.notes</code>.
     */
    public String getNotes() {
        return (String) get(2);
    }

    /**
     * Setter for <code>travellog_journey_dev_schema.journey.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>travellog_journey_dev_schema.journey.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Journey.JOURNEY.JOURNEY_ID;
    }

    @Override
    public Field<String> field2() {
        return Journey.JOURNEY.NAME;
    }

    @Override
    public Field<String> field3() {
        return Journey.JOURNEY.NOTES;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Journey.JOURNEY.CREATED;
    }

    @Override
    public Long component1() {
        return getJourneyId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getNotes();
    }

    @Override
    public LocalDateTime component4() {
        return getCreated();
    }

    @Override
    public Long value1() {
        return getJourneyId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getNotes();
    }

    @Override
    public LocalDateTime value4() {
        return getCreated();
    }

    @Override
    public JourneyRecord value1(Long value) {
        setJourneyId(value);
        return this;
    }

    @Override
    public JourneyRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public JourneyRecord value3(String value) {
        setNotes(value);
        return this;
    }

    @Override
    public JourneyRecord value4(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyRecord values(Long value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JourneyRecord
     */
    public JourneyRecord() {
        super(Journey.JOURNEY);
    }

    /**
     * Create a detached, initialised JourneyRecord
     */
    public JourneyRecord(Long journeyId, String name, String notes, LocalDateTime created) {
        super(Journey.JOURNEY);

        setJourneyId(journeyId);
        setName(name);
        setNotes(notes);
        setCreated(created);
        resetChangedOnNotNull();
    }
}
