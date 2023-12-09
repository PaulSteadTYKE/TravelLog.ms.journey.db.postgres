package uk.co.tyke.travellog.journey.db.postgres.jooq;/*
 * This file is generated by jOOQ.
 */


import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import uk.co.tyke.travellog.journey.data.jooq.tables.Journey;
import uk.co.tyke.travellog.journey.data.jooq.tables.Trip;
import uk.co.tyke.travellog.journey.data.jooq.tables.TripPoint;
import uk.co.tyke.travellog.journey.db.postgres.jooq.tables.Journey;
import uk.co.tyke.travellog.journey.db.postgres.jooq.tables.Trip;
import uk.co.tyke.travellog.journey.db.postgres.jooq.tables.TripPoint;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TravellogJourneyDevSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>travellog_journey_dev_schema</code>
     */
    public static final TravellogJourneyDevSchema TRAVELLOG_JOURNEY_DEV_SCHEMA = new TravellogJourneyDevSchema();

    /**
     * The table <code>travellog_journey_dev_schema.journey</code>.
     */
    public final Journey JOURNEY = Journey.JOURNEY;

    /**
     * The table <code>travellog_journey_dev_schema.trip</code>.
     */
    public final Trip TRIP = Trip.TRIP;

    /**
     * The table <code>travellog_journey_dev_schema.trip_point</code>.
     */
    public final TripPoint TRIP_POINT = TripPoint.TRIP_POINT;

    /**
     * No further instances allowed
     */
    private TravellogJourneyDevSchema() {
        super("travellog_journey_dev_schema", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Journey.JOURNEY,
            Trip.TRIP,
            TripPoint.TRIP_POINT
        );
    }
}
