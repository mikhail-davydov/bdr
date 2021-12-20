package com.mkhldvdv.bdr.backend.common;

public class Constants {

    // items
    public static final String USER = "User";
    public static final String DATA = "Data";
    public static final String CATEGORY = "Category";

    public static final String ITEM_ID_TEMPLATE = "%s-%s";

    public static final int TTL = 31536000; // seconds, 1 year, 365 days
    public static final long ONE_DAY_SECONDS = 86400000; // milliseconds, 1 day, 24 hours
    public static final boolean NOT_DELETED = false;

    // logs
    public static final String LOG_ITEM_TEMPLATE = "Item: {}";
    public static final String LOG_ITEM_LIST_TEMPLATE = "Item list: {}";
    public static final String LOG_ITEM_ID_TEMPLATE = "ItemId: {}";
    public static final String LOG_ITEM_ID_LIST_TEMPLATE = "ItemId list: {}";

    public static final String LOG_FIND_ITEM_ID_TEMPLATE = "Find item by ID: {}";
    public static final String LOG_FIND_ITEM_ID_LIST_TEMPLATE = "Find item list by IDs: {}";
    public static final String LOG_FIND_ALL_DATA_BY_DATE_TEMPLATE = "Get all data for date. UserId: {}, date: {}";
    public static final String LOG_FIND_ALL_DATA_BY_PERIOD_TEMPLATE = "Get all data for period. UserId: {}, startDate: {}, endDate: {}";
    public static final String LOG_FIND_ALL_DATA_BY_CATEGORY_TEMPLATE = "Get all data for date. UserId: {}, categoryId: {}";
    public static final String LOG_FIND_ALL_DATA_BY_CATEGORY_AND_DATE_TEMPLATE = "Get all data for date. UserId: {}, categoryId: {}, date: {}";
    public static final String LOG_FIND_ALL_DATA_BY_CATEGORY_AND_PERIOD_TEMPLATE = "Get all data for period. UserId: {}, categoryId: {}, startDate: {}, endDate: {}";

    public static final String LOG_SAVE_ITEM_TEMPLATE = "Save item: {}";
    public static final String LOG_SAVE_ITEM_LIST_TEMPLATE = "Save item list: {}";

    public static final String LOG_DELETE_ITEM_ID_TEMPLATE = "Delete item by ID: {}";
    public static final String LOG_DELETE_ITEM_ID_LIST_TEMPLATE = "Delete item list by IDs: {}";

    public static final String LOG_NO_ITEM_ID_TEMPLATE = "No item with ID: {}";
    public static final String LOG_NO_ITEM_ID_LIST_TEMPLATE = "No item list IDs: {}";

    public static final String LOG_API_VERSION_TEMPLATE = "API Version: {}";

    public static final String LOG_HANDLE_EXCEPTION_TEMPLATE = "{}";

}
