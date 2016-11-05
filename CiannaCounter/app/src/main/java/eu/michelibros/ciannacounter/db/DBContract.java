package eu.michelibros.ciannacounter.db;

import android.provider.BaseColumns;

/**
 * Created by mikand on 05/11/16.
 */

public class DBContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private DBContract() {}

    /* Inner class that defines the table contents */
    public static class WorkTimeEntry implements BaseColumns {
        public static final String TABLE_NAME = "WorkTimes";
        public static final String COLUMN_NAME_START = "start";
        public static final String COLUMN_NAME_END = "end";
    }
}
