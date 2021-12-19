package com.mkhldvdv.bdr.backend.common;

public class Constants {

    // items
    public static final String USER = "User";
    public static final String DATA = "Data";
    public static final String CATEGORY = "Category";

    public static final String ITEM_ID_TEMPLATE = "%s-%s";

    public static final int TTL = 31536000; // seconds, 1 year, 365 days

    // logs
    public static final String LOG_ITEM_TEMPLATE = "Item: {}";
    public static final String LOG_ITEM_LIST_TEMPLATE = "Item list: {}";
    public static final String LOG_ITEM_ID_TEMPLATE = "ItemId: {}";
    public static final String LOG_ITEM_ID_LIST_TEMPLATE = "ItemId list: {}";

    public static final String LOG_FIND_ITEM_TEMPLATE = "Find item: {}";
    public static final String LOG_FIND_ITEM_ID_TEMPLATE = "Find item by ID: {}";
    public static final String LOG_FIND_ITEM_ID_LIST_TEMPLATE = "Find item list by IDs: {}";

    public static final String LOG_SAVE_ITEM_TEMPLATE = "Save item: {}";
    public static final String LOG_SAVE_ITEM_LIST_TEMPLATE = "Save item list: {}";

    public static final String LOG_DELETE_ITEM_ID_TEMPLATE = "Delete item by ID: {}";
    public static final String LOG_DELETE_ITEM_ID_LIST_TEMPLATE = "Delete item list by IDs: {}";

    public static final String LOG_NO_ITEM_ID_TEMPLATE = "No item with ID: {}";
    public static final String LOG_NO_ITEM_ID_LIST_TEMPLATE = "No item list IDs: {}";

    public static final String LOG_API_VERSION_TEMPLATE = "API Version: {}";

    public static final String LOG_HANDLE_EXCEPTION_TEMPLATE = "{}";

}
